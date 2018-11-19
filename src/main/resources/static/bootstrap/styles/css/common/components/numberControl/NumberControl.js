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

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

var _NumberInput = require('../numberInput/NumberInput');

var _NumberInput2 = _interopRequireDefault(_NumberInput);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var INITIAL_TICK = 200;
var TICK_TIME = 50;

var NumberControl = function (_Component) {
    (0, _inherits3.default)(NumberControl, _Component);

    function NumberControl() {
        (0, _classCallCheck3.default)(this, NumberControl);

        /* istanbul ignore next */
        var _this = (0, _possibleConstructorReturn3.default)(this, (NumberControl.__proto__ || Object.getPrototypeOf(NumberControl)).call(this));

        _this.isHolding = false;
        return _this;
    }

    (0, _createClass3.default)(NumberControl, [{
        key: 'increment',
        value: function increment() {
            var _this2 = this;

            /* istanbul ignore next */
            if (this.isHolding && !this.props.disabled) {
                this.numberInput.incrementValue();
                setTimeout(function () {
                    _this2.increment();
                }, TICK_TIME);
            }
        }
    }, {
        key: 'decrement',
        value: function decrement() {
            var _this3 = this;

            /* istanbul ignore next */
            if (this.isHolding && !this.props.disabled) {
                this.numberInput.decrementValue();
                setTimeout(function () {
                    _this3.decrement();
                }, TICK_TIME);
            }
        }
    }, {
        key: 'onIncrement',
        value: function onIncrement() {
            var _this4 = this;

            if (!this.props.disabled) {
                this.isHolding = true;
                this.numberInput.incrementValue();

                // initial waiting time to avoid holding on click
                setTimeout(function () {
                    _this4.increment();
                }, INITIAL_TICK);
            }
        }
    }, {
        key: 'onDecrement',
        value: function onDecrement() {
            var _this5 = this;

            if (!this.props.disabled) {
                this.isHolding = true;
                this.numberInput.decrementValue();

                // initial waiting time to avoid holding on click
                setTimeout(function () {
                    _this5.decrement();
                }, INITIAL_TICK);
            }
        }
    }, {
        key: 'stopHolding',
        value: function stopHolding() {
            this.isHolding = false;
        }
    }, {
        key: 'render',
        value: function render() {
            var _this6 = this;

            var _props = this.props,
                min = _props.min,
                max = _props.max,
                value = _props.value,
                step = _props.step,
                onValueChanged = _props.onValueChanged,
                disabled = _props.disabled,
                size = _props.size,
                bsSize = _props.bsSize,
                className = _props.className;


            if (size) {
                /* eslint-disable no-console */
                console.warn('Prop "size" is deprecated on NumberControl. Please use "bsSize" instead.');
            }

            var classNames = (0, _classnames2.default)('NumberControl', 'form-group', className);
            var inputGroupClassNames = (0, _classnames2.default)('input-group', size === 'small' && 'input-group-sm', size === 'large' && 'input-group-lg', bsSize === 'sm' && 'input-group-sm', bsSize === 'lg' && 'input-group-lg');
            return _react2.default.createElement(
                'div',
                { className: classNames },
                _react2.default.createElement(
                    'span',
                    { className: inputGroupClassNames },
                    _react2.default.createElement(
                        'span',
                        { className: 'input-group-btn' },
                        _react2.default.createElement(
                            'button',
                            { type: 'button',
                                className: (0, _classnames2.default)('decrementButton', 'btn', 'btn-default', 'btn-icon-only', disabled && 'disabled'),
                                onMouseDown: function onMouseDown() {
                                    return _this6.onDecrement();
                                }, onMouseUp: function onMouseUp() {
                                    return _this6.stopHolding();
                                } },
                            _react2.default.createElement('span', { className: 'rioglyph rioglyph-minus', 'aria-hidden': 'true' })
                        )
                    ),
                    _react2.default.createElement(_NumberInput2.default, { min: min, max: max, value: value, step: step, disabled: disabled,
                        onValueChanged: onValueChanged, ref: function ref(child) {
                            _this6.numberInput = child;
                        } }),
                    _react2.default.createElement(
                        'span',
                        { className: 'input-group-btn' },
                        _react2.default.createElement(
                            'button',
                            { type: 'button',
                                className: (0, _classnames2.default)('incrementButton', 'btn', 'btn-default', 'btn-icon-only', disabled && 'disabled'),
                                onMouseDown: function onMouseDown() {
                                    return _this6.onIncrement();
                                }, onMouseUp: function onMouseUp() {
                                    return _this6.stopHolding();
                                } },
                            _react2.default.createElement('span', { className: 'rioglyph rioglyph-plus', 'aria-hidden': 'true' })
                        )
                    )
                )
            );
        }
    }]);
    return NumberControl;
}(_react.Component);

exports.default = NumberControl;


NumberControl.propTypes = {
    min: _propTypes2.default.number,
    max: _propTypes2.default.number,
    value: _propTypes2.default.number,
    step: _propTypes2.default.number,
    disabled: _propTypes2.default.bool,
    onValueChanged: _propTypes2.default.func,
    size: _propTypes2.default.string,
    bsSize: _propTypes2.default.string,
    className: _propTypes2.default.string
};