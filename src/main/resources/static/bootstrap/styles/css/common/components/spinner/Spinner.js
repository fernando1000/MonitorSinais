'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var Spinner = function Spinner(props) {
    var isInverse = props.isInverse,
        isDoubleSized = props.isDoubleSized;

    var classNames = 'spinner' + (isInverse ? ' inverse' : '') + (isDoubleSized ? ' double' : '');

    return _react2.default.createElement('div', { className: classNames });
};

Spinner.propTypes = {
    isInverse: _propTypes2.default.bool,
    isDoubleSized: _propTypes2.default.bool
};

exports.default = Spinner;