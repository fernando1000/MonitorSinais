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

var RangeSlider = function (_Component) {
    (0, _inherits3.default)(RangeSlider, _Component);

    /* istanbul ignore next */
    function RangeSlider(props) {
        (0, _classCallCheck3.default)(this, RangeSlider);

        var _this = (0, _possibleConstructorReturn3.default)(this, (RangeSlider.__proto__ || Object.getPrototypeOf(RangeSlider)).call(this, props));

        _this.state = {
            active1: false,
            active2: true,
            value1: props.leftValue ? props.leftValue : props.minValue,
            value2: props.rightValue ? props.rightValue : props.maxValue,
            changing1: false,
            changing2: false
        };

        _this.handleChangeValue1 = _this.handleChangeValue1.bind(_this);
        _this.handleChangeValue2 = _this.handleChangeValue2.bind(_this);
        _this.onMouseUp = _this.onMouseUp.bind(_this);
        _this.onMouseDown1 = _this.onMouseDown1.bind(_this);
        _this.onMouseDown2 = _this.onMouseDown2.bind(_this);
        _this.onMouseMove1 = _this.onMouseMove1.bind(_this);
        _this.onMouseMove2 = _this.onMouseMove2.bind(_this);
        return _this;
    }

    (0, _createClass3.default)(RangeSlider, [{
        key: 'changeValues',
        value: function changeValues(newValues) {
            var newValue1 = newValues.value1 ? newValues.value1 : this.state.value1;
            var newValue2 = newValues.value2 ? newValues.value2 : this.state.value2;

            this.setState({
                value1: newValue1,
                changing1: !!newValues.value1,
                value2: newValue2,
                changing2: !!newValues.value2
            });

            var rightValue = newValue1 >= newValue2 ? newValue1 : newValue2;
            var leftValue = newValue2 <= newValue1 ? newValue2 : newValue1;

            this.props.onChange(leftValue, rightValue);
        }
    }, {
        key: 'handleChangeValue1',
        value: function handleChangeValue1(event) {
            var newValue1 = parseInt(event.target.value, 10);
            this.changeValues({ value1: newValue1 });
        }
    }, {
        key: 'handleChangeValue2',
        value: function handleChangeValue2(event) {
            var newValue2 = parseInt(event.target.value, 10);
            this.changeValues({ value2: newValue2 });
        }
    }, {
        key: 'onMouseDown1',
        value: function onMouseDown1() {
            this.setState({
                changing1: true,
                changing2: false
            });

            this.listenToMouseUp();
        }
    }, {
        key: 'onMouseDown2',
        value: function onMouseDown2() {
            this.setState({
                changing1: false,
                changing2: true
            });

            this.listenToMouseUp();
        }
    }, {
        key: 'getTrackMiddlePosition',
        value: function getTrackMiddlePosition(targetWidth) {
            var _state = this.state,
                value1 = _state.value1,
                value2 = _state.value2;
            var _props = this.props,
                minValue = _props.minValue,
                maxValue = _props.maxValue;


            var trackValue1Relative = (value1 - minValue) / (maxValue - minValue);
            var trackValue2Relative = (value2 - minValue) / (maxValue - minValue);
            var trackMiddleRelative = (trackValue1Relative + trackValue2Relative) / 2;

            return trackMiddleRelative * targetWidth;
        }
    }, {
        key: 'onMouseMove1',
        value: function onMouseMove1(event) {
            if (!this.state.changing1) {
                var target = event.target.getBoundingClientRect();
                var mouseHover = event.clientX - target.left;
                var targetWidth = event.target.offsetWidth;

                var value1 = this.state.value1;
                var value2 = this.state.value2;

                var trackMiddlePosition = this.getTrackMiddlePosition(targetWidth);

                if (value2 > value1 && mouseHover > trackMiddlePosition) {
                    this.setState({
                        active1: false,
                        active2: true
                    });
                }

                if (value2 < value1 && mouseHover < trackMiddlePosition) {
                    this.setState({
                        active1: false,
                        active2: true
                    });
                }
            }
        }
    }, {
        key: 'onMouseMove2',
        value: function onMouseMove2(event) {
            if (!this.state.changing2) {
                var target = event.target.getBoundingClientRect();
                var mouseHover = event.clientX - target.left;
                var targetWidth = event.target.offsetWidth;

                var value1 = this.state.value1;
                var value2 = this.state.value2;

                var trackMiddlePosition = this.getTrackMiddlePosition(targetWidth);

                if (value2 > value1 && mouseHover < trackMiddlePosition) {
                    this.setState({
                        active1: true,
                        active2: false
                    });
                }

                if (value2 < value1 && mouseHover > trackMiddlePosition) {
                    this.setState({
                        active1: true,
                        active2: false
                    });
                }
            }
        }
    }, {
        key: 'onMouseUp',
        value: function onMouseUp() {
            document.removeEventListener('mouseup', this.onMouseUp);
            document.getElementsByTagName('body')[0].style.cursor = '';

            this.setState({
                changing1: false,
                changing2: false
            });

            var _state2 = this.state,
                value1 = _state2.value1,
                value2 = _state2.value2;


            var rightValue = value1 >= value2 ? value1 : value2;
            var leftValue = value2 <= value1 ? value2 : value1;

            this.props.onDragEnd(leftValue, rightValue);
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
            if (nextProps.value1 >= nextProps.minValue && nextProps.value1 <= nextProps.maxValue && nextProps.value2 >= nextProps.minValue && nextProps.value2 <= nextProps.maxValue) {

                this.setState({
                    value1: nextProps.value1,
                    value2: nextProps.value2
                });
            }
        }
    }, {
        key: 'render',
        value: function render() {
            var _state3 = this.state,
                value1 = _state3.value1,
                value2 = _state3.value2,
                changing1 = _state3.changing1,
                changing2 = _state3.changing2;
            var _props2 = this.props,
                minValue = _props2.minValue,
                maxValue = _props2.maxValue,
                step = _props2.step,
                className = _props2.className;

            var classNames = 'range-slider ' + (className ? className : '');

            var rightValue = value1 >= value2 ? value1 : value2;
            var leftValue = value2 <= value1 ? value2 : value1;

            var trackWidth = 100 * (rightValue - leftValue) / (maxValue - minValue);
            var trackLeft = 100 * (leftValue - minValue) / (maxValue - minValue);

            return _react2.default.createElement(
                'div',
                { className: classNames },
                _react2.default.createElement('div', { className: 'range-whole-track' }),
                _react2.default.createElement('div', { className: 'range-track', style: { width: trackWidth + '%', left: trackLeft + '%' } }),
                _react2.default.createElement('input', {
                    className: '' + (changing1 ? 'changing' : ''),
                    style: { zIndex: this.state.active1 ? '6' : '5' },
                    value: value1,
                    min: minValue,
                    max: maxValue,
                    step: step,
                    type: 'range',
                    onChange: this.handleChangeValue1,
                    onMouseDown: this.onMouseDown1,
                    onMouseMove: this.onMouseMove1
                }),
                _react2.default.createElement('input', {
                    className: '' + (changing2 ? 'changing' : ''),
                    style: { zIndex: this.state.active2 ? '6' : '5' },
                    value: value2,
                    min: minValue,
                    max: maxValue,
                    step: step,
                    type: 'range',
                    onChange: this.handleChangeValue2,
                    onMouseDown: this.onMouseDown2,
                    onMouseMove: this.onMouseMove2
                })
            );
        }
    }]);
    return RangeSlider;
}(_react.Component);

RangeSlider.defaultProps = {
    step: 1,
    onChange: function onChange() {},
    onDragEnd: function onDragEnd() {}
};

RangeSlider.propTypes = {
    leftValue: _propTypes2.default.number,
    rightValue: _propTypes2.default.number,
    minValue: _propTypes2.default.number.isRequired,
    maxValue: _propTypes2.default.number.isRequired,
    step: _propTypes2.default.number,
    onChange: _propTypes2.default.func,
    onDragEnd: _propTypes2.default.func,
    className: _propTypes2.default.string
};

exports.default = RangeSlider;