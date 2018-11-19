'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.ActionBarItemPopover = undefined;

var _extends2 = require('babel-runtime/helpers/extends');

var _extends3 = _interopRequireDefault(_extends2);

var _objectWithoutProperties2 = require('babel-runtime/helpers/objectWithoutProperties');

var _objectWithoutProperties3 = _interopRequireDefault(_objectWithoutProperties2);

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

var _fp = require('lodash/fp');

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var ActionBarItemPopover = function ActionBarItemPopover(_ref) {
    var className = _ref.className,
        children = _ref.children,
        remainingProps = (0, _objectWithoutProperties3.default)(_ref, ['className', 'children']);

    var classes = (0, _classnames2.default)('ActionBarItemPopover', className);
    var filterProps = (0, _fp.omit)(['title']);

    return _react2.default.createElement(
        'div',
        (0, _extends3.default)({}, filterProps(remainingProps), { className: classes }),
        children
    );
};

exports.ActionBarItemPopover = ActionBarItemPopover;
ActionBarItemPopover.displayName = 'ActionBarItemPopover';

ActionBarItemPopover.propTypes = {
    className: _propTypes2.default.string
};

exports.default = ActionBarItemPopover;