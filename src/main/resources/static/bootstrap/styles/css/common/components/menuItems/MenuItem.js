'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _DropdownSubmenu = require('../dropdown/DropdownSubmenu');

var _DropdownSubmenu2 = _interopRequireDefault(_DropdownSubmenu);

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var MenuItem = function MenuItem(props) {
    var value = props.value,
        divider = props.divider,
        disabled = props.disabled,
        onSelect = props.onSelect,
        tabIndex = props.tabIndex,
        header = props.header,
        index = props.index,
        closeMenu = props.closeMenu;


    if (value && value.type === _DropdownSubmenu2.default) {
        return value;
    }

    var role = divider ? 'separator' : 'presentation';
    if (header) {
        role = 'heading';
    }

    var classes = (0, _classnames2.default)(divider && 'divider', disabled && 'disabled', header && 'dropdown-header');

    var menuLink = _react2.default.createElement(
        'a',
        { role: 'menuitem', tabIndex: tabIndex ? tabIndex : '-1', href: '#' },
        value
    );

    var onSelectItem = function onSelectItem() {
        onSelect(index);

        if (closeMenu) {
            closeMenu();
        }
    };

    return _react2.default.createElement(
        'li',
        { role: role, className: classes, onClick: onSelectItem },
        header ? value : menuLink
    );
};

MenuItem.propTypes = {
    value: _propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.node]),
    disabled: _propTypes2.default.bool,
    divider: _propTypes2.default.bool,
    header: _propTypes2.default.bool,
    onSelect: _propTypes2.default.func,
    index: _propTypes2.default.number,
    closeMenu: _propTypes2.default.func
};

exports.default = MenuItem;