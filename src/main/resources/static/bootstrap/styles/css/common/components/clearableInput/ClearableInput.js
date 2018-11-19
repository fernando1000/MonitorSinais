'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.SUPPORTED_TYPES = exports.DEFAULT_TYPE = undefined;

var _extends2 = require('babel-runtime/helpers/extends');

var _extends3 = _interopRequireDefault(_extends2);

var _objectWithoutProperties2 = require('babel-runtime/helpers/objectWithoutProperties');

var _objectWithoutProperties3 = _interopRequireDefault(_objectWithoutProperties2);

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

var _fp = require('lodash/fp');

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var DEFAULT_TYPE = exports.DEFAULT_TYPE = 'text';
var SUPPORTED_TYPES = exports.SUPPORTED_TYPES = ['text', 'password'];

var ClearableInput = function (_React$Component) {
    (0, _inherits3.default)(ClearableInput, _React$Component);

    /* istanbul ignore next */
    function ClearableInput(props) {
        (0, _classCallCheck3.default)(this, ClearableInput);

        var _this = (0, _possibleConstructorReturn3.default)(this, (ClearableInput.__proto__ || Object.getPrototypeOf(ClearableInput)).call(this, props));

        var initialValue = props.value || props.defaultValue || '';
        _this.state = {
            inputValue: initialValue,
            showClear: initialValue.length > 0
        };
        return _this;
    }

    // only gets triggered on user interaction.


    (0, _createClass3.default)(ClearableInput, [{
        key: 'onChange',
        value: function onChange(event) {
            this.changeValue(event.target.value);
        }

        // Will be triggered on every key press but also when pressing 'Enter' for example

    }, {
        key: 'onKeyPress',
        value: function onKeyPress(event) {
            this.props.onKeyPress(event);
        }

        // important for when used as a controlled component (value from outside).

    }, {
        key: 'componentWillReceiveProps',
        value: function componentWillReceiveProps(nextProps) {
            if (this.props.value !== nextProps.value) {
                this.changeValue(nextProps.value);
            }
        }

        // handles new input value and saves it in the state.
        // the value stored in the state is used for rendering.

    }, {
        key: 'changeValue',
        value: function changeValue() {
            var _this2 = this;

            var newValue = arguments.length > 0 && arguments[0] !== undefined ? arguments[0] : '';


            // this is there to prevent that
            // onChange and componentWillReceiveProps set state at the same time
            if (this.state.inputValue === newValue) {
                return;
            }

            this.setState({
                inputValue: newValue,
                showClear: newValue.length > 0
            }, function () {
                return _this2.props.onChange(_this2.state.inputValue);
            });
        }
    }, {
        key: 'clearInputValue',
        value: function clearInputValue(event) {
            this.changeValue();
            this.props.onClear(event);
        }

        // it is always the value from the state which is used for rendering.
        // reason: make it possible to use the component as a controlled or uncontrolled component.
        // https://facebook.github.io/react/docs/uncontrolled-components.html

    }, {
        key: 'render',
        value: function render() {
            var _this3 = this;

            var filteredProps = (0, _fp.omit)(['value', 'onClear']);

            var _props = this.props,
                className = _props.className,
                inputClassName = _props.inputClassName,
                type = _props.type,
                maxLength = _props.maxLength,
                placeholder = _props.placeholder,
                customProps = (0, _objectWithoutProperties3.default)(_props, ['className', 'inputClassName', 'type', 'maxLength', 'placeholder']);
            var _state = this.state,
                showClear = _state.showClear,
                inputValue = _state.inputValue;


            var classes = (0, _classnames2.default)('ClearableInput', 'input-group', className);

            var inputClassNames = (0, _classnames2.default)('form-control', inputClassName);

            var clearButtonClassNames = (0, _classnames2.default)('clearButton', !showClear && 'hide');

            var convertedType = type && type.toLowerCase();
            var inputType = SUPPORTED_TYPES.indexOf(convertedType) !== -1 ? convertedType : DEFAULT_TYPE;

            return _react2.default.createElement(
                'div',
                { className: classes },
                _react2.default.createElement('input', (0, _extends3.default)({}, filteredProps(customProps), {
                    className: inputClassNames,
                    type: inputType,
                    value: inputValue,
                    placeholder: placeholder,
                    maxLength: maxLength,
                    onChange: function onChange(event) {
                        return _this3.onChange(event);
                    },
                    onKeyPress: function onKeyPress(event) {
                        return _this3.onKeyPress(event);
                    } })),
                _react2.default.createElement(
                    'span',
                    { className: clearButtonClassNames, onClick: function onClick(event) {
                            return _this3.clearInputValue(event);
                        } },
                    _react2.default.createElement('span', { className: 'clearButtonIcon rioglyph rioglyph-remove-sign' })
                )
            );
        }
    }]);
    return ClearableInput;
}(_react2.default.Component);

ClearableInput.defaultProps = {
    type: DEFAULT_TYPE,
    className: '',
    inputClassName: '',
    onChange: function onChange() {/* ignore */},
    onBlur: function onBlur() {/* ignore */},
    onClear: function onClear() {/* ignore */},
    onKeyPress: function onKeyPress() {/* ignore */}
};

ClearableInput.propTypes = {
    className: _propTypes2.default.string,
    inputClassName: _propTypes2.default.string,
    onChange: _propTypes2.default.func,
    onBlur: _propTypes2.default.func,
    onClear: _propTypes2.default.func,
    onKeyPress: _propTypes2.default.func,
    placeholder: _propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.node]),
    type: _propTypes2.default.string,
    defaultValue: _propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.node]),
    value: _propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.node]),
    maxLength: _propTypes2.default.number
};

exports.default = ClearableInput;