'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var FilterListItem = function FilterListItem(props) {
    var title = props.title,
        titleClass = props.titleClass,
        children = props.children,
        gridWidth = props.gridWidth,
        className = props.className;


    return _react2.default.createElement(
        'div',
        { className: 'FilterListItem form-group ' + gridWidth + ' ' + (className && className) },
        _react2.default.createElement(
            'div',
            null,
            _react2.default.createElement(
                'label',
                { className: titleClass },
                title
            )
        ),
        children
    );
};

FilterListItem.defaultProps = {
    title: '',
    titleClass: '',
    gridWidth: 'col-md-3'
};

FilterListItem.propTypes = {
    title: _propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.node]).isRequired,
    titleClass: _propTypes2.default.string,
    children: _propTypes2.default.node,
    gridWidth: _propTypes2.default.string,
    className: _propTypes2.default.string
};

exports.default = FilterListItem;