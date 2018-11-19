'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _classCallCheck2 = require('babel-runtime/helpers/classCallCheck');

var _classCallCheck3 = _interopRequireDefault(_classCallCheck2);

var _createClass2 = require('babel-runtime/helpers/createClass');

var _createClass3 = _interopRequireDefault(_createClass2);

var _possibleConstructorReturn2 = require('babel-runtime/helpers/possibleConstructorReturn');

var _possibleConstructorReturn3 = _interopRequireDefault(_possibleConstructorReturn2);

var _inherits2 = require('babel-runtime/helpers/inherits');

var _inherits3 = _interopRequireDefault(_inherits2);

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _reactDom = require('react-dom');

var _reactDom2 = _interopRequireDefault(_reactDom);

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var Checkbox = function (_Component) {
    (0, _inherits3.default)(Checkbox, _Component);

    function Checkbox() {
        (0, _classCallCheck3.default)(this, Checkbox);
        return (0, _possibleConstructorReturn3.default)(this, (Checkbox.__proto__ || Object.getPrototypeOf(Checkbox)).apply(this, arguments));
    }

    (0, _createClass3.default)(Checkbox, [{
        key: 'componentDidMount',
        value: function componentDidMount() {
            this.update(this.props.indeterminate);
        }
    }, {
        key: 'componentWillReceiveProps',
        value: function componentWillReceiveProps(nextProps) {
            this.update(nextProps.indeterminate);
        }
    }, {
        key: 'update',
        value: function update(indeterminate) {
            _reactDom2.default.findDOMNode(this).children[0].indeterminate = indeterminate;
        }
    }, {
        key: 'render',
        value: function render() {
            var _props = this.props,
                checked = _props.checked,
                defaultChecked = _props.defaultChecked,
                disabled = _props.disabled,
                inline = _props.inline,
                onClick = _props.onClick,
                onChange = _props.onChange,
                label = _props.label,
                children = _props.children,
                error = _props.error,
                size = _props.size,
                inputRef = _props.inputRef,
                className = _props.className,
                indeterminate = _props.indeterminate;


            var text = label || children;
            var classnames = (0, _classnames2.default)(className, error && 'error', size === 'large' && 'large', indeterminate && 'indeterminate');

            return _react2.default.createElement(
                'label',
                { className: inline ? 'checkbox-inline' : '' },
                _react2.default.createElement('input', { type: 'checkbox', checked: checked, defaultChecked: defaultChecked, disabled: disabled,
                    className: classnames, onClick: onClick, ref: inputRef, onChange: onChange }),
                _react2.default.createElement(
                    'span',
                    { className: 'checkbox-text' },
                    text
                )
            );
        }
    }]);
    return Checkbox;
}(_react.Component);

exports.default = Checkbox;


Checkbox.propTypes = {
    label: _propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.node]),
    onClick: _propTypes2.default.func.isRequired,
    onChange: _propTypes2.default.func,
    checked: _propTypes2.default.oneOfType([_propTypes2.default.bool, _propTypes2.default.string]),
    defaultChecked: _propTypes2.default.bool,
    disabled: _propTypes2.default.bool,
    indeterminate: _propTypes2.default.bool,
    className: _propTypes2.default.string,
    inline: _propTypes2.default.bool,
    error: _propTypes2.default.bool,
    size: _propTypes2.default.string,
    inputRef: _propTypes2.default.func
};

Checkbox.defaultProps = {
    inline: false,
    disabled: false
};