'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _getMenuItems = require('../menuItems/getMenuItems');

var _getMenuItems2 = _interopRequireDefault(_getMenuItems);

var _menuItemsPropTypes = require('./menuItemsPropTypes');

var _menuItemsPropTypes2 = _interopRequireDefault(_menuItemsPropTypes);

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var DropdownSubmenu = function DropdownSubmenu(props) {
    var title = props.title,
        items = props.items,
        disabled = props.disabled,
        className = props.className;


    var classes = (0, _classnames2.default)('dropdown-submenu', disabled && 'disabled', className && className);

    return _react2.default.createElement(
        'li',
        { className: classes },
        _react2.default.createElement(
            'a',
            { className: 'submenu-title' },
            _react2.default.createElement(
                'span',
                { className: 'submenu-title-text' },
                title
            ),
            _react2.default.createElement('span', { className: 'rioglyph rioglyph-menu-right' })
        ),
        _react2.default.createElement(
            'ul',
            { className: 'dropdown-menu' },
            (0, _getMenuItems2.default)(items)
        )
    );
};

DropdownSubmenu.defaultProps = {
    title: '',
    items: []
};

DropdownSubmenu.propTypes = {
    title: _propTypes2.default.node,
    items: _menuItemsPropTypes2.default,
    disabled: _propTypes2.default.bool,
    className: _propTypes2.default.string
};

exports.default = DropdownSubmenu;