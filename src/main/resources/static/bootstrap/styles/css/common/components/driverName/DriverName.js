'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.DriverName = exports.formatDriverName = undefined;

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

/**
 * @fileOverview: Presentational component for a formatted driver name.
 */

var formatDriverName = exports.formatDriverName = function formatDriverName(_ref) {
    var firstName = _ref.firstName,
        lastName = _ref.lastName;

    return lastName && firstName ? [lastName, firstName].join(', ') : lastName;
};

/**
 * Presentational component for a formatted driver name.
 */

var DriverName = exports.DriverName = function DriverName(_ref2) {
    var driver = _ref2.driver;
    return _react2.default.createElement(
        'span',
        { className: 'DriverName' },
        formatDriverName(driver)
    );
};

DriverName.propTypes = {
    driver: _propTypes2.default.shape({
        firstName: _propTypes2.default.string,
        lastName: _propTypes2.default.string.isRequired
    })
};

exports.default = DriverName;