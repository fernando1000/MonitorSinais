'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var RadioButton = function RadioButton(props) {
    var defaultChecked = props.defaultChecked,
        disabled = props.disabled,
        inline = props.inline,
        onClick = props.onClick,
        label = props.label,
        children = props.children,
        right = props.right,
        inputRef = props.inputRef,
        className = props.className,
        name = props.name,
        value = props.value;


    var text = label || children;
    var classnames = (0, _classnames2.default)(className, right && 'icon-right');

    return _react2.default.createElement(
        'div',
        { className: inline ? 'radio-inline' : 'radio' },
        _react2.default.createElement(
            'label',
            null,
            _react2.default.createElement('input', { type: 'radio', defaultChecked: defaultChecked, disabled: disabled,
                className: classnames, ref: inputRef, onClick: onClick,
                name: name, value: value }),
            _react2.default.createElement(
                'span',
                { className: 'radio-text' },
                text
            )
        )
    );
};

RadioButton.propTypes = {
    label: _propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.node]),
    onClick: _propTypes2.default.func,
    defaultChecked: _propTypes2.default.bool,
    disabled: _propTypes2.default.bool,
    className: _propTypes2.default.string,
    inline: _propTypes2.default.bool,
    right: _propTypes2.default.bool,
    inputRef: _propTypes2.default.func
};

RadioButton.defaultProps = {
    inline: false,
    disabled: false
};

exports.default = RadioButton;