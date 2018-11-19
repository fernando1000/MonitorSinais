'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.SortDirection = undefined;
exports.sortByProperty = sortByProperty;

var _lodash = require('lodash');

var _lodash2 = _interopRequireDefault(_lodash);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var SortDirection = exports.SortDirection = {
    ASCENDING: 'asc',
    DESCENDING: 'desc'
};

function sortByProperty(array, property) {
    var sortDirection = arguments.length > 2 && arguments[2] !== undefined ? arguments[2] : SortDirection.ASCENDING;
    var isCaseSensitiv = arguments[3];


    if (!isCaseSensitiv) {
        return _lodash2.default.orderBy(array, function (element) {

            if (typeof element[property] === 'string') {
                return element[property].toLowerCase();
            }

            return element[property];
        }, sortDirection);
    }

    return _lodash2.default.orderBy(array, property, sortDirection);
}