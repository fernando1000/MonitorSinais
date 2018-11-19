'use strict';

Object.defineProperty(exports, "__esModule", {
  value: true
});

var _extends2 = require('babel-runtime/helpers/extends');

var _extends3 = _interopRequireDefault(_extends2);

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _ButtonDropdown = require('./ButtonDropdown');

var _ButtonDropdown2 = _interopRequireDefault(_ButtonDropdown);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var SplitButtonDropdown = function SplitButtonDropdown(props) {
  return _react2.default.createElement(_ButtonDropdown2.default, (0, _extends3.default)({}, props, { splitButton: true }));
};

exports.default = SplitButtonDropdown;