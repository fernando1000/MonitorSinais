'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.ApplicationLayoutSidebar = undefined;

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var ApplicationLayoutSidebar = exports.ApplicationLayoutSidebar = function ApplicationLayoutSidebar(_ref) {
    var className = _ref.className,
        children = _ref.children;

    var classes = (0, _classnames2.default)('ApplicationLayoutSidebar', className);

    return _react2.default.createElement(
        'div',
        { className: classes },
        children
    );
};

ApplicationLayoutSidebar.propTypes = {
    className: _propTypes2.default.string
};

exports.default = ApplicationLayoutSidebar;