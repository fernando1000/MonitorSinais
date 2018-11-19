'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.getNewGroupedSelected = getNewGroupedSelected;

var _lodash = require('lodash');

function getIndexOfCompareItem(array, compareItem) {
    return (0, _lodash.findIndex)(array, function (item) {
        return (0, _lodash.isEqual)(item, compareItem);
    });
}

function getSelectedArrays(selected) {
    var selectedArrays = [];
    selected.forEach(function (item) {
        if (Array.isArray(item)) {
            selectedArrays.push(item);
        }
    });

    return selectedArrays;
}

function getShownIds(compactData, openRows, extendedData, keyField, groupHeadKeyField) {
    var shownIds = [];
    compactData.forEach(function (item) {
        var entityReference = item[groupHeadKeyField];

        if (getIndexOfCompareItem(openRows, entityReference) !== -1) {
            extendedData[entityReference].forEach(function (extendedItem) {
                shownIds.push(extendedItem[keyField]);
            });
        }
        shownIds.push(item[keyField]);
    });

    return shownIds;
}

function getDeSelectedItems(selected, selectedOld, compactData, openRows, extendedData, keyField, groupHeadKeyField) {
    var deSelectedIds = selectedOld.filter(function (item) {
        return getIndexOfCompareItem(selected, item) === -1;
    });

    var fullDeSelected = [];
    var selectedArrays = getSelectedArrays(selected);
    var shownIds = getShownIds(compactData, openRows, extendedData, keyField, groupHeadKeyField);

    deSelectedIds.forEach(function (id) {
        if (Array.isArray(id)) {
            id.forEach(function (oneId) {
                return fullDeSelected.push(oneId);
            });
            fullDeSelected.push(id);
        } else if (shownIds.indexOf(id) !== -1) {
            selectedArrays.forEach(function (array) {
                if (array.indexOf(id) !== -1) {
                    fullDeSelected.push(array);
                }
            });

            fullDeSelected.push(id);
        }
    });

    return fullDeSelected;
}

function getCompactArrays(compactData, keyField) {
    return compactData.map(function (item) {
        return item[keyField];
    });
}

function getNewGroupedSelected(selected, selectedOld, compactData, openRows, extendedData, keyField, groupHeadKeyField) {
    if ((0, _lodash.isEmpty)(selected)) {
        return selected;
    }

    var fullSelected = [];
    var deSelected = getDeSelectedItems(selected, selectedOld, compactData, extendedData, openRows, keyField, groupHeadKeyField);

    selected.forEach(function (item) {
        if (getIndexOfCompareItem(deSelected, item) === -1 && getIndexOfCompareItem(fullSelected, item) === -1) {
            if (Array.isArray(item)) {
                item.forEach(function (id) {
                    if (fullSelected.indexOf(id) === -1) {
                        fullSelected.push(id);
                    }
                });
            }

            fullSelected.push(item);
        }
    });

    if ((0, _lodash.isEmpty)(deSelected)) {
        getCompactArrays(compactData, keyField).forEach(function (fileIds) {
            if (!fileIds.some(function (id) {
                return fullSelected.indexOf(id) === -1;
            }) && getIndexOfCompareItem(fullSelected, fileIds) === -1) {
                fullSelected.push(fileIds);
            }
        });
    }

    return fullSelected;
}