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

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var Slider = function (_Component) {
    (0, _inherits3.default)(Slider, _Component);

    /* istanbul ignore next */
    function Slider(props) {
        (0, _classCallCheck3.default)(this, Slider);

        var _this = (0, _possibleConstructorReturn3.default)(this, (Slider.__proto__ || Object.getPrototypeOf(Slider)).call(this, props));

        _this.state = {
            value: props.value ? props.value : props.minValue,
            changing: false
        };

        _this.handleChange = _this.handleChange.bind(_this);
        _this.onMouseUp = _this.onMouseUp.bind(_this);
        _this.onMouseDown = _this.onMouseDown.bind(_this);
        return _this;
    }

    (0, _createClass3.default)(Slider, [{
        key: 'handleChange',
        value: function handleChange(event) {
            var newValue = parseInt(event.target.value, 10);
            this.setState({
                value: newValue,
                changing: true
            });

            this.props.onChange(newValue);
        }
    }, {
        key: 'onMouseUp',
        value: function onMouseUp() {
            document.removeEventListener('mouseup', this.onMouseUp);
            document.getElementsByTagName('body')[0].style.cursor = '';

            this.setState({
                changing: false
            });

            this.props.onDragEnd(this.state.value);
        }
    }, {
        key: 'onMouseDown',
        value: function onMouseDown() {
            this.setState({ changing: true });
            this.listenToMouseUp();
        }
    }, {
        key: 'listenToMouseUp',
        value: function listenToMouseUp() {
            document.addEventListener('mouseup', this.onMouseUp);
            document.getElementsByTagName('body')[0].style.cursor = 'pointer';
        }
    }, {
        key: 'componentWillReceiveProps',
        value: function componentWillReceiveProps(nextProps) {
            if (nextProps.value >= nextProps.minValue && nextProps.value <= nextProps.maxValue) {

                this.setState({ value: nextProps.value });
            }
        }
    }, {
        key: 'render',
        value: function render() {
            var _state = this.state,
                value = _state.value,
                changing = _state.changing;
            var _props = this.props,
                minValue = _props.minValue,
                maxValue = _props.maxValue,
                step = _props.step,
                className = _props.className;

            var classNames = 'range-slider ' + (className ? className : '');

            var trackWidth = 100 * (value - minValue) / (maxValue - minValue);

            return _react2.default.createElement(
                'div',
                { className: classNames },
                _react2.default.createElement('div', { className: 'range-whole-track' }),
                _react2.default.createElement('div', { className: 'range-track', style: { width: trackWidth + '%' } }),
                _react2.default.createElement('input', {
                    className: '' + (changing ? 'changing' : ''),
                    value: value,
                    min: minValue,
                    max: maxValue,
                    step: step,
                    type: 'range',
                    onChange: this.handleChange,
                    onMouseDown: this.onMouseDown
                })
            );
        }
    }]);
    return Slider;
}(_react.Component);

Slider.defaultProps = {
    step: 1,
    onChange: function onChange() {},
    onDragEnd: function onDragEnd() {}
};

Slider.propTypes = {
    value: _propTypes2.default.number,
    minValue: _propTypes2.default.number.isRequired,
    maxValue: _propTypes2.default.number.isRequired,
    step: _propTypes2.default.number,
    onChange: _propTypes2.default.func,
    onDragEnd: _propTypes2.default.func,
    className: _propTypes2.default.string
};

exports.default = Slider;