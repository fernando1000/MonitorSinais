'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.ApplicationLayout = undefined;

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

var _ApplicationLayoutHeader = require('./ApplicationLayoutHeader');

var _ApplicationLayoutHeader2 = _interopRequireDefault(_ApplicationLayoutHeader);

var _ApplicationLayoutSidebar = require('./ApplicationLayoutSidebar');

var _ApplicationLayoutSidebar2 = _interopRequireDefault(_ApplicationLayoutSidebar);

var _ApplicationLayoutBody = require('./ApplicationLayoutBody');

var _ApplicationLayoutBody2 = _interopRequireDefault(_ApplicationLayoutBody);

var _ApplicationLayoutFooter = require('./ApplicationLayoutFooter');

var _ApplicationLayoutFooter2 = _interopRequireDefault(_ApplicationLayoutFooter);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var ApplicationLayout = exports.ApplicationLayout = function ApplicationLayout(_ref) {
    var className = _ref.className,
        children = _ref.children;

    var classes = (0, _classnames2.default)('ApplicationLayout', className);

    return _react2.default.createElement(
        'div',
        { className: classes },
        children
    );
};

ApplicationLayout.Header = _ApplicationLayoutHeader2.default;
ApplicationLayout.Sidebar = _ApplicationLayoutSidebar2.default;
ApplicationLayout.Body = _ApplicationLayoutBody2.default;
ApplicationLayout.Footer = _ApplicationLayoutFooter2.default;

ApplicationLayout.propTypes = {
    className: _propTypes2.default.string
};

exports.default = ApplicationLayout;