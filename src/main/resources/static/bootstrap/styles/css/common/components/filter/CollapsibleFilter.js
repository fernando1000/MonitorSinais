'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _reactBootstrap = require('react-bootstrap');

var _SelectedFilterTag = require('./SelectedFilterTag');

var _SelectedFilterTag2 = _interopRequireDefault(_SelectedFilterTag);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var CollapsibleFilter = function CollapsibleFilter(props) {
    var showFilters = props.showFilters,
        selectedFilters = props.selectedFilters,
        children = props.children,
        closeFilter = props.closeFilter,
        onDeleteAll = props.onDeleteAll,
        deleteAllCaption = props.deleteAllCaption,
        className = props.className;


    var selectedFiltersCount = 0;

    var selectedFilterText = selectedFilters.map(function (activeFilter, index) {
        if (activeFilter.chosenOptions.length) {
            selectedFiltersCount += activeFilter.chosenOptions.length;
            return _react2.default.createElement(_SelectedFilterTag2.default, {
                key: 'selectedFilter' + index,
                keyName: 'selectedFilter' + index,
                title: activeFilter.title,
                onDelete: activeFilter.onDelete,
                labels: activeFilter.chosenOptions });
        }
    });

    var deleteAllFilters = '';
    if (selectedFiltersCount > 1) {
        deleteAllFilters = _react2.default.createElement(
            'li',
            { className: 'SelectedFilterTag' },
            _react2.default.createElement(
                'div',
                { className: 'removeFilterButton btn btn-default btn-xs', onClick: onDeleteAll },
                _react2.default.createElement('span', { className: 'rioglyph rioglyph-trash text-size-small' }),
                deleteAllCaption
            )
        );
    }

    var selectedFilterBar = '';
    if (selectedFiltersCount > 0) {
        selectedFilterBar = _react2.default.createElement(
            'div',
            { className: 'row SelectedFilterBar form-group' },
            _react2.default.createElement(
                'div',
                { className: 'col-md-12' },
                _react2.default.createElement(
                    'ul',
                    { className: 'list-inline' },
                    selectedFilterText,
                    deleteAllFilters
                )
            )
        );
    }

    // required 1 empty div in Collapse to animate the well-margin-closing
    return _react2.default.createElement(
        'div',
        { className: 'CollapsibleFilter ' + (className && className) },
        _react2.default.createElement(
            _reactBootstrap.Collapse,
            { 'in': showFilters },
            _react2.default.createElement(
                'div',
                null,
                _react2.default.createElement(
                    'div',
                    { className: 'well FilterContainer form-group' },
                    _react2.default.createElement(
                        'a',
                        { onClick: closeFilter },
                        _react2.default.createElement('span', { className: 'rioglyph rioglyph-remove toggle-icon close' })
                    ),
                    _react2.default.createElement(
                        'div',
                        { className: 'row' },
                        children
                    )
                )
            )
        ),
        selectedFilterBar
    );
};

CollapsibleFilter.defaultProps = {
    selectedFilters: [{
        chosenOptions: []
    }],
    closeFilter: function closeFilter() {/* ignore */}
};

CollapsibleFilter.propTypes = {
    showFilters: _propTypes2.default.bool,
    selectedFilters: _propTypes2.default.arrayOf(_propTypes2.default.shape({
        title: _propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.node]),
        chosenOptions: _propTypes2.default.arrayOf(_propTypes2.default.string),
        onDelete: _propTypes2.default.func
    })),
    closeFilter: _propTypes2.default.func.isRequired,
    onDeleteAll: _propTypes2.default.func,
    deleteAllCaption: _propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.node]),
    className: _propTypes2.default.string
};

exports.default = CollapsibleFilter;