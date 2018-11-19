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

var _reactBootstrap = require('react-bootstrap');

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var NumberInput = function (_Component) {
    (0, _inherits3.default)(NumberInput, _Component);

    /* istanbul ignore next */
    function NumberInput(props) {
        (0, _classCallCheck3.default)(this, NumberInput);

        var _this = (0, _possibleConstructorReturn3.default)(this, (NumberInput.__proto__ || Object.getPrototypeOf(NumberInput)).call(this, props));

        _this.state = _this.propsToState(props);
        return _this;
    }

    (0, _createClass3.default)(NumberInput, [{
        key: 'propsToState',
        value: function propsToState(props) {
            var defaultProps = this.getDefaultState();
            var min = Number.isInteger(props.min) ? props.min : defaultProps.min;
            var max = Number.isInteger(props.max) ? props.max : defaultProps.max;

            var value = this.getValueFromProps(props.value, defaultProps.value, max, min);

            var step = this.getStepFromProps(props.step, defaultProps.step, max, min);

            var inputValue = value;
            var isValid = true;

            var type = props.type === 'number' ? 'number' : 'text';

            var size = props.size || defaultProps.size;
            var bsSize = props.bsSize || defaultProps.bsSize;
            if (props.size) {
                console.warn('Prop size is deprecated on NumberInput. Please refactor it to bsSize to remove this message.');
            }

            var disabled = props.disabled || defaultProps.disabled;

            return {
                min: min,
                max: max,
                value: value,
                inputValue: inputValue,
                isValid: isValid,
                step: step,
                type: type,
                size: size,
                bsSize: bsSize,
                disabled: disabled
            };
        }
    }, {
        key: 'getDefaultState',
        value: function getDefaultState() {
            return {
                min: 0,
                max: Number.MAX_VALUE,
                value: 0,
                step: 1,
                size: undefined,
                bsSize: undefined,
                disabled: false
            };
        }
    }, {
        key: 'getValueFromProps',
        value: function getValueFromProps(propValue, defaultValue, max, min) {
            return Number.isInteger(propValue) && propValue <= max && propValue >= min ? propValue : defaultValue;
        }
    }, {
        key: 'getStepFromProps',
        value: function getStepFromProps(propStep, defaultStep, max, min) {
            return Number.isInteger(propStep) && propStep < Math.abs(max - min) ? propStep : defaultStep;
        }
    }, {
        key: 'componentWillReceiveProps',
        value: function componentWillReceiveProps(nextProps) {
            var isEqual = this.isEqual(nextProps, this.props);
            if (!isEqual) {
                this.setState(this.propsToState(nextProps));
            }
        }
    }, {
        key: 'componentWillUpdate',
        value: function componentWillUpdate(nextProps, nextState) {
            var isEqual = this.isEqual(nextState, this.state);
            if (!isEqual && nextState.isValid && typeof nextState.value === 'number' && typeof nextProps.onValueChanged === 'function') {
                nextProps.onValueChanged(nextState.value);
            }
        }
    }, {
        key: 'isEqual',
        value: function isEqual(nextValue, value) {

            var isValuesEqual = nextValue.value === value.value && nextValue.inputValue === value.inputValue;

            var isIntervalAndStepEqual = nextValue.min === value.min && nextValue.max === value.max && nextValue.step === value.step;

            var isTypeAndDisabledEqual = nextValue.type === value.type && nextValue.disabled === value.disabled;

            return isValuesEqual && isIntervalAndStepEqual && isTypeAndDisabledEqual;
        }
    }, {
        key: 'toValidNumber',
        value: function toValidNumber(number) {
            if (number < this.state.min) {
                return this.state.min;
            } else if (number > this.state.max) {
                return this.state.max;
            }
            return number;
        }
    }, {
        key: 'isFormatted',
        value: function isFormatted(number) {
            return (/^(-)?([1-9]\d*)?$/.test(number) || number === '0'
            );
        }
    }, {
        key: 'incrementValue',
        value: function incrementValue() {
            var currentValue = this.convertNonIntegerToDefault(this.state.value);
            var newValue = currentValue + this.state.step;
            if (newValue <= this.state.max) {
                this.setState({
                    value: newValue,
                    inputValue: newValue,
                    isValid: true
                });
                return true;
            }
            return false;
        }
    }, {
        key: 'decrementValue',
        value: function decrementValue() {
            var currentValue = this.convertNonIntegerToDefault(this.state.value);
            var newValue = currentValue - this.state.step;
            if (newValue >= this.state.min) {
                this.setState({
                    value: newValue,
                    inputValue: newValue,
                    isValid: true
                });
                return true;
            }
            return false;
        }
    }, {
        key: 'handleOnChange',
        value: function handleOnChange(event) {
            var newValue = event.target.value;
            this.applyValue(newValue);
        }
    }, {
        key: 'applyValue',
        value: function applyValue(newValue) {
            if (this.isFormatted(newValue)) {
                if (newValue === '-' || newValue === '') {
                    this.setState({
                        value: newValue,
                        inputValue: newValue,
                        isValid: true
                    });
                } else {
                    var inputValue = Number(newValue);
                    var isValid = inputValue >= this.state.min && inputValue <= this.state.max;
                    this.setState({
                        value: this.toValidNumber(inputValue),
                        inputValue: inputValue,
                        isValid: isValid
                    });
                }
            }
        }
    }, {
        key: 'convertNonIntegerToDefault',
        value: function convertNonIntegerToDefault(value) {
            var currentValue = value;
            if (!Number.isInteger(currentValue)) {
                currentValue = this.state.min;
            }
            return currentValue;
        }
    }, {
        key: 'handleBlur',
        value: function handleBlur() {
            var inputValue = this.convertNonIntegerToDefault(Number(this.state.inputValue));
            var validValue = this.toValidNumber(inputValue);
            this.applyValue(validValue);
        }
    }, {
        key: 'render',
        value: function render() {
            var _this2 = this;

            var _state = this.state,
                type = _state.type,
                step = _state.step,
                isValid = _state.isValid,
                value = _state.value,
                inputValue = _state.inputValue,
                disabled = _state.disabled,
                size = _state.size,
                bsSize = _state.bsSize;
            var className = this.props.className;

            var classNames = (0, _classnames2.default)(className, size === 'small' && 'input-sm', size === 'large' && 'input-lg', bsSize === 'sm' && 'input-sm', bsSize === 'lg' && 'input-lg');
            return _react2.default.createElement(_reactBootstrap.FormControl, { className: classNames, type: type, step: step,
                value: isValid ? value : inputValue, disabled: disabled,
                onBlur: function onBlur() {
                    return _this2.handleBlur();
                }, onChange: function onChange(event) {
                    return _this2.handleOnChange(event);
                } });
        }
    }]);
    return NumberInput;
}(_react.Component);

exports.default = NumberInput;