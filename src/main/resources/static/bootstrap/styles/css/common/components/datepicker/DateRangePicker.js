'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.DateRangePickerPure = undefined;

var _extends2 = require('babel-runtime/helpers/extends');

var _extends3 = _interopRequireDefault(_extends2);

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

var _DatePicker = require('./DatePicker');

var _DatePicker2 = _interopRequireDefault(_DatePicker);

var _reactOnclickoutside = require('react-onclickoutside');

var _reactOnclickoutside2 = _interopRequireDefault(_reactOnclickoutside);

var _moment = require('moment');

var _moment2 = _interopRequireDefault(_moment);

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

var _lodash = require('lodash');

var _lodash2 = _interopRequireDefault(_lodash);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

/**
 * The DateRangePicker
 */

var propTypes = {
    startValue: _propTypes2.default.object,
    endValue: _propTypes2.default.object,
    defaultStartValue: _propTypes2.default.object,
    defaultEndValue: _propTypes2.default.object,
    minValue: _propTypes2.default.object,
    maxValue: _propTypes2.default.object,
    onRangeChange: _propTypes2.default.func,
    locale: _propTypes2.default.string,
    textDefault: _propTypes2.default.string,
    textToday: _propTypes2.default.string,
    textLastWeek: _propTypes2.default.string,
    textLastMonth: _propTypes2.default.string,
    textLastYear: _propTypes2.default.string,
    textCustom: _propTypes2.default.string,
    textApply: _propTypes2.default.string,
    textCancel: _propTypes2.default.string,
    textFrom: _propTypes2.default.string,
    textTo: _propTypes2.default.string,
    className: _propTypes2.default.string,
    dropdownClass: _propTypes2.default.string,
    dropdownMenuClass: _propTypes2.default.string,
    hasTimePicker: _propTypes2.default.bool,
    customRangeOnly: _propTypes2.default.bool,
    customPresets: _propTypes2.default.arrayOf(_propTypes2.default.shape({
        startValue: _propTypes2.default.object.isRequired,
        endValue: _propTypes2.default.object.isRequired,
        text: _propTypes2.default.string.isRequired,
        onSelect: _propTypes2.default.func
    }))
}; /**
    * @fileOverview: Wrapper component for React-Datetime.
    */

var defaultProps = {
    defaultStartValue: (0, _moment2.default)().startOf('day'),
    defaultEndValue: (0, _moment2.default)().endOf('day'),
    minValue: null,
    maxValue: null,
    locale: 'en-GB',
    textDefault: 'Select date range ...',
    textToday: 'Today',
    textLastWeek: 'Last week',
    textLastMonth: 'Last month',
    textCustom: 'Custom',
    textFrom: 'From',
    textTo: 'To',
    textApply: 'Apply',
    textCancel: 'Cancel',
    dropdownClass: '',
    dropdownMenuClass: '',
    hasTimePicker: false,
    customRangeOnly: false,
    customPresets: [{
        text: 'Today',
        startValue: (0, _moment2.default)().startOf('day'),
        endValue: (0, _moment2.default)().endOf('day')
    }, {
        text: 'Last week',
        startValue: (0, _moment2.default)().subtract(1, 'weeks').startOf('isoWeek'),
        endValue: (0, _moment2.default)().subtract(1, 'weeks').endOf('isoWeek')
    }, {
        text: 'Last Month',
        startValue: (0, _moment2.default)().subtract(1, 'months').startOf('month'),
        endValue: (0, _moment2.default)().subtract(1, 'months').endOf('month')
    }],
    onRangeChange: function onRangeChange() {
        // function when range changes
    }
};

var LOCAL_DATE_FORMAT = 'dd L LT';
var LOCAL_DATE_FORMAT_NO_TIME = 'dd L';

var DROPDOWN_WIDTH = 600;

var DateRangePicker = function (_Component) {
    (0, _inherits3.default)(DateRangePicker, _Component);

    /* istanbul ignore next */
    function DateRangePicker(props) {
        (0, _classCallCheck3.default)(this, DateRangePicker);

        var _this = (0, _possibleConstructorReturn3.default)(this, (DateRangePicker.__proto__ || Object.getPrototypeOf(DateRangePicker)).call(this, props));

        var customRangeStartValue = props.startValue ? props.startValue : props.defaultStartValue;
        var customRangeEndValue = props.endValue ? props.endValue : props.defaultEndValue;

        _this.state = {
            internalStartValue: props.startValue,
            internalEndValue: props.endValue,
            isMounted: false,
            isCustomVisible: props.customRangeOnly,
            isDropdownOpen: false,
            customRangeStartValue: (0, _moment2.default)(customRangeStartValue), // default value for individual datepickers
            customRangeEndValue: (0, _moment2.default)(customRangeEndValue), // default value for individual datepickers
            isStartValid: true,
            isEndValid: true,
            dropdownBtnText: props.textDefault
        };
        return _this;
    }

    (0, _createClass3.default)(DateRangePicker, [{
        key: 'componentDidMount',
        value: function componentDidMount() {
            var _props = this.props,
                startValue = _props.startValue,
                endValue = _props.endValue,
                locale = _props.locale;

            if (!this.state.isMounted) {
                this.setState({
                    isMounted: true
                });
            }

            // initial mount value
            if (startValue && endValue) {
                this.update(startValue, endValue, locale);
            }
        }

        /**
         * Responsible for handling start/end values given from outside (controlled component context).
         * @param {object} nextProps - The next props.
         * @returns {undefined}
         */

    }, {
        key: 'componentWillReceiveProps',
        value: function componentWillReceiveProps(nextProps) {
            var startValue = nextProps.startValue,
                endValue = nextProps.endValue,
                textDefault = nextProps.textDefault,
                customRangeOnly = nextProps.customRangeOnly,
                locale = nextProps.locale,
                defaultStartValue = nextProps.defaultStartValue,
                defaultEndValue = nextProps.defaultEndValue;
            var _state = this.state,
                internalStartValue = _state.internalStartValue,
                internalEndValue = _state.internalEndValue;

            // handle reset:
            // reset condition 1 is for uncontrolled components,
            // making sure that when a time is selected, and then the locale changed, that the selection remains

            var resetCondition1 = _lodash2.default.isNil(startValue) && _lodash2.default.isNil(endValue) && _lodash2.default.isNil(internalStartValue) && _lodash2.default.isNil(internalEndValue);

            // reset condition 2 is for controlled components,
            // when a time is set / defined, and the controlling component wants a hard reset
            var resetCondition2 = _lodash2.default.isNull(startValue) && _lodash2.default.isNull(endValue);

            // reset to original state
            if (resetCondition1 || resetCondition2) {
                this.setState({
                    internalStartValue: undefined,
                    internalEndValue: undefined,
                    customRangeStartValue: defaultStartValue,
                    customRangeEndValue: defaultEndValue,
                    dropdownBtnText: textDefault,
                    isCustomVisible: customRangeOnly,
                    isDropdownOpen: false,
                    isStartValid: true,
                    isEndValid: true,
                    dropLeft: false
                });
            } else if (startValue !== this.props.startValue || endValue !== this.props.endValue) {
                this.update(startValue, endValue, locale);
            } else {
                this.update(internalStartValue, internalEndValue, locale);
            }
        }

        /**
         * Converts start/end values to moments, makes them readable,
         * crafts a dropdownBtnText and updates state.
         * @param {object} startValue - the start date (date or moment).
         * @param {object} endValue - the start date (date or moment).
         * @param {object} locale - the locale to use.
         * @param {object} extras - additional state, which needs to update.
         * @param {object} callback - callback to be called, after state has changed.
         * @returns {undefined}
         */

    }, {
        key: 'update',
        value: function update(startValue, endValue, locale, extras, callback) {
            var hasTimePicker = this.props.hasTimePicker;

            var format = hasTimePicker ? LOCAL_DATE_FORMAT : LOCAL_DATE_FORMAT_NO_TIME;

            // necessary to set start to startOf / end day to endOf, when selecting "without time"
            var finalStartValue = hasTimePicker ? (0, _moment2.default)(startValue) : (0, _moment2.default)(startValue).startOf('day');
            var finalEndValue = hasTimePicker ? (0, _moment2.default)(endValue) : (0, _moment2.default)(endValue).endOf('day');

            // composition of dropdownBtnText
            var startValueText = '' + finalStartValue.locale(locale).format(format);
            var endValueText = '' + finalEndValue.locale(locale).format(format);
            var dropdownBtnText = startValueText === endValueText ? startValueText : startValueText + ' \u2192 ' + endValueText;

            // set state, and call callback
            this.setState((0, _extends3.default)({
                internalStartValue: finalStartValue,
                internalEndValue: finalEndValue,
                customRangeStartValue: finalStartValue,
                customRangeEndValue: finalEndValue,
                dropdownBtnText: dropdownBtnText,
                isStartValid: true,
                isEndValid: !finalEndValue.isBefore(finalStartValue)
            }, extras), function () {
                callback && callback(finalStartValue, finalEndValue);
            });
        }

        /**
         * Gets called by wrapper component "onClickOutside".
         * Responsible for closing the dropdown when a click occured outside.
         * @returns {undefined}
         */

    }, {
        key: 'handleClickOutside',
        value: function handleClickOutside() {
            if (this.state.isMounted) {
                this.setState({
                    isDropdownOpen: false
                });
            }
        }

        /**
         * Toggles dropdown open status and visibility of custom range area.
         * @param {object} event - mouse event on toggle dropdown
         * @returns {undefined}
         */

    }, {
        key: 'toggleDropdownOpen',
        value: function toggleDropdownOpen(event) {
            var _this2 = this;

            var left = event.currentTarget.getBoundingClientRect().left;

            this.setState(function (prevState) {
                return {
                    isDropdownOpen: !prevState.isDropdownOpen,
                    isCustomVisible: _this2.props.customRangeOnly,
                    dropLeft: left + DROPDOWN_WIDTH > document.body.clientWidth
                };
            });
        }

        /**
         * Only gets called on manual change of datePicker (user interaction).
         * Has influence the validity of the end date.
         *
         * Important to note that the start date is not limited,
         * whereas the end date is limited by the start date (see 'getValidEndDates').
         *
         * @param {object} startValue - the start date (date or moment).
         * @param {object} isValidDate - if the date is valid or not.
         * @returns {undefined}
         */

    }, {
        key: 'onStartChange',
        value: function onStartChange(startValue, isValidDate) {
            var newState = {};
            var _props2 = this.props,
                hasTimePicker = _props2.hasTimePicker,
                minValue = _props2.minValue,
                maxValue = _props2.maxValue;
            var customRangeEndValue = this.state.customRangeEndValue;

            // necessary to set start to startOf / end day to endOf, when selecting "without time"

            var finalStartValue = hasTimePicker ? startValue : (0, _moment2.default)(startValue).startOf('day');

            // check validity of input (min/max)
            var passesMin = minValue ? finalStartValue.isSameOrAfter((0, _moment2.default)(minValue)) : true;
            var passesMax = maxValue ? finalStartValue.isSameOrBefore((0, _moment2.default)(maxValue)) : true;
            var isValidInput = isValidDate && passesMin && passesMax;

            if (isValidInput) {
                newState.customRangeStartValue = finalStartValue;
                newState.isEndValid = !customRangeEndValue.isBefore(finalStartValue);
            }
            newState.isStartValid = isValidInput;
            this.setState(newState);
        }

        /**
         * Only gets called on manual change of datePicker (user interaction)
         * @param {object} endValue - the start date (date or moment).
         * @param {object} isValidDate - if the date is valid or not.
         * @returns {undefined}
         */

    }, {
        key: 'onEndChange',
        value: function onEndChange(endValue, isValidDate) {
            var newState = {};
            var _props3 = this.props,
                hasTimePicker = _props3.hasTimePicker,
                minValue = _props3.minValue,
                maxValue = _props3.maxValue;
            var customRangeStartValue = this.state.customRangeStartValue;

            // necessary to set start to startOf / end day to endOf, when selecting "without time"

            var finalEndValue = hasTimePicker ? endValue : (0, _moment2.default)(endValue).endOf('day');

            // check validity of input (min/max)
            var passesMin = minValue ? finalEndValue.isSameOrAfter((0, _moment2.default)(minValue)) : true;
            var passesMax = maxValue ? finalEndValue.isSameOrBefore((0, _moment2.default)(maxValue)) : true;
            var isValidInput = isValidDate && passesMin && passesMax && finalEndValue.isAfter(customRangeStartValue);

            if (isValidInput) {
                newState.customRangeEndValue = finalEndValue;
            }
            newState.isEndValid = isValidInput;
            this.setState(newState);
        }

        /**
         * Callback method for DatePicker to limit selection in DatePicker.
         * @param {object} current - Current date in the loop.
         * @returns {undefined}
         */

    }, {
        key: 'getValidStartDates',
        value: function getValidStartDates(current) {
            var _props4 = this.props,
                minValue = _props4.minValue,
                maxValue = _props4.maxValue;

            var customRangeEndValue = (0, _moment2.default)(this.state.customRangeEndValue);

            if (current.isSame(customRangeEndValue, 'day')) {
                return true;
            }

            var passesMin = minValue ? current.isSameOrAfter((0, _moment2.default)(minValue)) : true;
            var passesMax = maxValue ? current.isSameOrBefore((0, _moment2.default)(maxValue)) : true;

            return passesMin && passesMax;
        }

        /**
         * Callback method for DatePicker to limit selection in DatePicker.
         * End date has to be after start date.
         * @param {object} current - Current date in the loop.
         * @returns {undefined}
         */

    }, {
        key: 'getValidEndDates',
        value: function getValidEndDates(current) {
            var _props5 = this.props,
                minValue = _props5.minValue,
                maxValue = _props5.maxValue;

            var customRangeStartValue = (0, _moment2.default)(this.state.customRangeStartValue);

            if (current.isSame(customRangeStartValue, 'day')) {
                return true;
            }

            var passesMin = minValue ? current.isSameOrAfter((0, _moment2.default)(minValue)) : true;
            var passesMax = maxValue ? current.isSameOrBefore((0, _moment2.default)(maxValue)) : true;
            var isAfterStart = current.isAfter(customRangeStartValue);

            return passesMin && passesMax && isAfterStart;
        }

        /**
         * Gets called when "custom ..." has been selected.
         * @returns {undefined}
         */

    }, {
        key: 'handleCustomToggle',
        value: function handleCustomToggle() {
            this.setState(function (prevState) {
                return {
                    isCustomVisible: !prevState.isCustomVisible
                };
            });
        }
    }, {
        key: 'handleCustomPresetSelect',
        value: function handleCustomPresetSelect(preset) {
            if (typeof preset.onSelect === 'function') {
                preset.onSelect();
            }
            this.handleSelect(preset.startValue, preset.endValue);
        }

        /**
         * Gets called when a preset has been selected.
         * @param {object} startValue - the start date (date or moment).
         * @param {object} endValue - the start date (date or moment).
         * @returns {undefined}
         */

    }, {
        key: 'handleSelect',
        value: function handleSelect(startValue, endValue) {
            var _props6 = this.props,
                onRangeChange = _props6.onRangeChange,
                locale = _props6.locale;


            var extras = { isDropdownOpen: false };
            this.update(startValue, endValue, locale, extras, onRangeChange);
        }

        /**
         * Gets called user clicks the apply button.
         * @returns {undefined}
         */

    }, {
        key: 'handleCustomApply',
        value: function handleCustomApply() {
            var _state2 = this.state,
                customRangeStartValue = _state2.customRangeStartValue,
                customRangeEndValue = _state2.customRangeEndValue,
                isStartValid = _state2.isStartValid,
                isEndValid = _state2.isEndValid;
            var _props7 = this.props,
                onRangeChange = _props7.onRangeChange,
                locale = _props7.locale;


            if (isStartValid && isEndValid) {
                var extras = { isDropdownOpen: false };
                this.update(customRangeStartValue, customRangeEndValue, locale, extras, onRangeChange);
            }
        }
    }, {
        key: 'getDropdownBtn',
        value: function getDropdownBtn(dropdownBtnText) {
            return _react2.default.createElement(
                'button',
                {
                    type: 'button',
                    className: 'form-control dropdown-toggle text-left',
                    'aria-haspopup': 'true',
                    'aria-expanded': 'true',
                    onClick: this.toggleDropdownOpen.bind(this) },
                _react2.default.createElement(
                    'span',
                    null,
                    dropdownBtnText
                ),
                _react2.default.createElement('span', { className: 'caret' })
            );
        }
    }, {
        key: 'getCustomPanelToggle',
        value: function getCustomPanelToggle(isCustomVisible, textCustom) {
            return _react2.default.createElement(
                'li',
                { className: (0, _classnames2.default)('custom-panel-toggle', isCustomVisible && 'hidden') },
                _react2.default.createElement(
                    'a',
                    { role: 'button', onClick: this.handleCustomToggle.bind(this) },
                    textCustom,
                    ' ...'
                )
            );
        }
    }, {
        key: 'getCustomPanelButtons',
        value: function getCustomPanelButtons(isCustomVisible, isStartValid, isEndValid, textApply, textCancel) {
            return _react2.default.createElement(
                'li',
                { className: (0, _classnames2.default)('custom-panel-buttons', !isCustomVisible && 'hidden') },
                _react2.default.createElement(
                    'div',
                    { className: 'btn-toolbar' },
                    _react2.default.createElement(
                        'button',
                        {
                            type: 'button',
                            disabled: !isStartValid || !isEndValid,
                            onClick: this.handleCustomApply.bind(this),
                            className: 'btn btn-primary pull-right' },
                        textApply
                    ),
                    _react2.default.createElement(
                        'button',
                        {
                            type: 'button',
                            onClick: this.toggleDropdownOpen.bind(this),
                            className: 'btn btn-default pull-right' },
                        textCancel
                    )
                )
            );
        }
    }, {
        key: 'render',
        value: function render() {
            var _this3 = this;

            var _props8 = this.props,
                locale = _props8.locale,
                textCustom = _props8.textCustom,
                textApply = _props8.textApply,
                textCancel = _props8.textCancel,
                textFrom = _props8.textFrom,
                textTo = _props8.textTo,
                textToday = _props8.textToday,
                textLastWeek = _props8.textLastWeek,
                textLastMonth = _props8.textLastMonth,
                className = _props8.className,
                dropdownClass = _props8.dropdownClass,
                dropdownMenuClass = _props8.dropdownMenuClass,
                customPresets = _props8.customPresets,
                hasTimePicker = _props8.hasTimePicker;
            var _state3 = this.state,
                customRangeStartValue = _state3.customRangeStartValue,
                customRangeEndValue = _state3.customRangeEndValue,
                isStartValid = _state3.isStartValid,
                isEndValid = _state3.isEndValid,
                isCustomVisible = _state3.isCustomVisible,
                isDropdownOpen = _state3.isDropdownOpen,
                dropdownBtnText = _state3.dropdownBtnText,
                dropLeft = _state3.dropLeft;


            if (customPresets && _lodash2.default.isEqual(customPresets, defaultProps.customPresets)) {
                // support backward compatibility to override default drop down text values
                customPresets[0].text = textToday;
                customPresets[1].text = textLastWeek;
                customPresets[2].text = textLastMonth;
            }

            var classes = (0, _classnames2.default)('DateRangePicker', dropLeft && 'dropLeft', className && className);

            return _react2.default.createElement(
                'div',
                { className: classes },
                _react2.default.createElement(
                    'div',
                    { className: (0, _classnames2.default)('select', 'dropdown', dropdownClass, isDropdownOpen && 'open') },
                    this.getDropdownBtn(dropdownBtnText),
                    _react2.default.createElement(
                        'ul',
                        { className: (0, _classnames2.default)('dropdown-menu', dropdownMenuClass) },
                        customPresets.map(function (preset, i) {
                            return _react2.default.createElement(
                                'li',
                                { key: 'preset-' + i, title: preset.disabled && preset.disabledText || null,
                                    className: (0, _classnames2.default)(preset.disabled && 'disabled') },
                                _react2.default.createElement(
                                    'a',
                                    { role: 'button', className: (0, _classnames2.default)(isCustomVisible && 'hidden'),
                                        onClick: !preset.disabled && _this3.handleCustomPresetSelect.bind(_this3, preset) },
                                    preset.text
                                )
                            );
                        }),
                        _react2.default.createElement('li', { role: 'separator', className: (0, _classnames2.default)('divider', isCustomVisible && 'hidden') }),
                        this.getCustomPanelToggle(isCustomVisible, textCustom),
                        _react2.default.createElement(
                            'li',
                            { className: (0, _classnames2.default)('custom-panel', !isCustomVisible && 'hidden') },
                            _react2.default.createElement(
                                'div',
                                { className: 'form-group' },
                                _react2.default.createElement(
                                    'div',
                                    { className: 'row' },
                                    _react2.default.createElement(
                                        'div',
                                        { className: 'col-md-6' },
                                        _react2.default.createElement(
                                            'label',
                                            null,
                                            textFrom
                                        ),
                                        _react2.default.createElement(_DatePicker2.default, {
                                            locale: locale,
                                            dateFormat: true,
                                            timeFormat: hasTimePicker,
                                            value: customRangeStartValue,
                                            onChange: this.onStartChange.bind(this),
                                            closeOnSelect: true,
                                            isValidDate: this.getValidStartDates.bind(this),
                                            className: (0, _classnames2.default)('DatePicker', !isStartValid && 'has-error')
                                        })
                                    ),
                                    _react2.default.createElement(
                                        'div',
                                        { className: 'col-md-6' },
                                        _react2.default.createElement(
                                            'label',
                                            null,
                                            textTo
                                        ),
                                        _react2.default.createElement(_DatePicker2.default, {
                                            locale: locale,
                                            dateFormat: true,
                                            timeFormat: hasTimePicker,
                                            value: customRangeEndValue,
                                            onChange: this.onEndChange.bind(this),
                                            closeOnSelect: true,
                                            isValidDate: this.getValidEndDates.bind(this),
                                            className: (0, _classnames2.default)('DatePicker', !isEndValid && 'has-error')
                                        })
                                    )
                                )
                            )
                        ),
                        this.getCustomPanelButtons(isCustomVisible, isStartValid, isEndValid, textApply, textCancel)
                    )
                )
            );
        }
    }]);
    return DateRangePicker;
}(_react.Component);

DateRangePicker.propTypes = propTypes;
DateRangePicker.defaultProps = defaultProps;

exports.default = (0, _reactOnclickoutside2.default)(DateRangePicker);
exports.DateRangePickerPure = DateRangePicker;