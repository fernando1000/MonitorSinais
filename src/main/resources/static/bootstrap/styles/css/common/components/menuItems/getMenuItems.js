'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _extends2 = require('babel-runtime/helpers/extends');

var _extends3 = _interopRequireDefault(_extends2);

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _MenuItem = require('./MenuItem');

var _MenuItem2 = _interopRequireDefault(_MenuItem);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var getMenuItems = function getMenuItems(items, closeMenu) {
    return items.map(function (item, index) {
        return _react2.default.createElement(_MenuItem2.default, (0, _extends3.default)({ key: index }, item, { index: index, closeMenu: closeMenu }));
    });
};

exports.default = getMenuItems;