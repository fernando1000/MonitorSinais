'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var Switch = function Switch(props) {
    return _react2.default.createElement(
        'div',
        { className: 'uikit-switch' },
        _react2.default.createElement('input', {
            onChange: function onChange(event) {
                props.onChange(event.target.checked);
            },
            checked: props.checked,
            type: 'checkbox',
            id: props.keyName,
            key: props.keyName,
            className: 'switch-input'
        }),
        _react2.default.createElement('label', { htmlFor: props.keyName, key: props.keyName + '-label', className: 'switch-label' })
    );
};

Switch.propTypes = {
    onChange: _propTypes2.default.func.isRequired,
    checked: _propTypes2.default.bool.isRequired,
    keyName: _propTypes2.default.string.isRequired
};

exports.default = Switch;