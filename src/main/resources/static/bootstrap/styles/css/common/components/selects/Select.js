'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

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

var _reactOnclickoutside = require('react-onclickoutside');

var _reactOnclickoutside2 = _interopRequireDefault(_reactOnclickoutside);

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var Select = function (_Component) {
    (0, _inherits3.default)(Select, _Component);

    /* istanbul ignore next */
    function Select() {
        (0, _classCallCheck3.default)(this, Select);

        var _this = (0, _possibleConstructorReturn3.default)(this, (Select.__proto__ || Object.getPrototypeOf(Select)).call(this));

        _this.state = {
            isOpen: false,
            selectedItem: ''
        };

        //necessary for using the uikit as submodule
        _this.onToggleClick = _this.onToggleClick.bind(_this);
        _this.handleClickOutside = _this.handleClickOutside.bind(_this);
        _this.onOptionChange = _this.onOptionChange.bind(_this);
        return _this;
    }

    (0, _createClass3.default)(Select, [{
        key: 'componentWillMount',
        value: function componentWillMount() {
            this.updateSelectedItem(this.props.options, this.props.value);
        }
    }, {
        key: 'componentWillReceiveProps',
        value: function componentWillReceiveProps(nextProps) {
            this.updateSelectedItem(nextProps.options, nextProps.value);
        }
    }, {
        key: 'updateSelectedItem',
        value: function updateSelectedItem(options, value) {
            if (value) {
                this.setState({
                    selectedItem: options.find(function (item) {
                        return item.id === value[0];
                    })
                });
            } else if (options) {
                this.setState({
                    selectedItem: options.find(function (item) {
                        return item.selected;
                    })
                });
            }
        }
    }, {
        key: 'render',
        value: function render() {
            var _this2 = this;

            var classes = (0, _classnames2.default)('select', 'dropdown', this.state.isOpen && 'open', this.props.className && this.props.className);

            return _react2.default.createElement(
                'div',
                { className: classes, tabIndex: '0',
                    ref: function ref(selectWrapper) {
                        _this2.selectWrapper = selectWrapper;
                    } },
                this.renderHead(),
                this.renderList()
            );
        }
    }, {
        key: 'getSeletedItemLabel',
        value: function getSeletedItemLabel() {
            if (!this.props.options) {
                return '';
            }

            if (!this.state.selectedItem) {
                return this.props.placeholder ? _react2.default.createElement(
                    'span',
                    { className: 'placeholder' },
                    this.props.placeholder
                ) : '';
            }

            return this.state.selectedItem.label;
        }
    }, {
        key: 'renderHead',
        value: function renderHead() {
            var classnames = (0, _classnames2.default)('dropdown-toggle form-control text-left', this.props.bsSize === 'large' && 'input-lg', this.props.bsSize === 'small' && 'input-sm');

            return _react2.default.createElement(
                'button',
                { type: 'button', className: classnames, 'data-toggle': 'dropdown',
                    'aria-haspopup': 'true', 'aria-expanded': this.state.isOpen, onClick: this.onToggleClick },
                _react2.default.createElement(
                    'span',
                    null,
                    this.getSeletedItemLabel()
                ),
                _react2.default.createElement('span', { className: 'caret' })
            );
        }
    }, {
        key: 'renderList',
        value: function renderList() {
            var _this3 = this;

            var options = this.props.options;
            if (options) {
                return _react2.default.createElement(
                    'ul',
                    { className: 'dropdown-menu' },
                    options.map(function (option) {
                        return _this3.renderMenuItem(option);
                    })
                );
            }
        }
    }, {
        key: 'renderMenuItem',
        value: function renderMenuItem(option) {
            if (option.header) {
                return _react2.default.createElement(
                    'li',
                    { className: 'select-header', key: option.id },
                    _react2.default.createElement(
                        'span',
                        null,
                        option.label
                    )
                );
            }

            var icon = option.icon || '';
            var onOptionChange = !option.disabled && this.onOptionChange;

            return _react2.default.createElement(
                'li',
                { key: option.id, className: option.disabled && 'disabled' },
                _react2.default.createElement(
                    'a',
                    { role: 'button', onClick: onOptionChange },
                    _react2.default.createElement(
                        'span',
                        null,
                        icon,
                        option.label
                    ),
                    _react2.default.createElement('input', { type: 'hidden', value: option.id })
                )
            );
        }
    }, {
        key: 'onOptionChange',
        value: function onOptionChange(event) {
            event.preventDefault();

            var optionId = event.currentTarget.getElementsByTagName('input')[0].value;
            var selectedItem = this.props.options.find(function (option) {
                return option.id === optionId;
            });

            this.setState((0, _extends3.default)({}, this.state, {
                selectedItem: selectedItem,
                isOpen: false
            }));

            event.target.value = this.state.selectedItem;

            this.props.onChange(selectedItem);
        }
    }, {
        key: 'onToggleClick',
        value: function onToggleClick() {
            if (!this.props.disabled) {
                this.setState((0, _extends3.default)({}, this.state, {
                    isOpen: !this.state.isOpen
                }));
            }
        }
    }, {
        key: 'handleClickOutside',
        value: function handleClickOutside() {
            this.setState((0, _extends3.default)({}, this.state, {
                isOpen: false
            }));
        }
    }]);
    return Select;
}(_react.Component);

Select.defaultProps = {
    onChange: function onChange() {/* ignore */},
    disabled: false
};

Select.propTypes = {
    options: _propTypes2.default.arrayOf(_propTypes2.default.shape({
        id: _propTypes2.default.string.isRequired, /* Identify an option */
        label: _propTypes2.default.any.isRequired, /* A label to show in body */
        icon: _propTypes2.default.object, /* An icon to show in body */
        selected: _propTypes2.default.bool,
        disabled: _propTypes2.default.bool,
        header: _propTypes2.default.bool
    })),
    onChange: _propTypes2.default.func, /* Params: option to change */
    placeholder: _propTypes2.default.oneOfType([/* Text to display when no menu item is selected */
    _propTypes2.default.string, _propTypes2.default.node]),
    value: _propTypes2.default.array,
    bsSize: _propTypes2.default.string,
    disabled: _propTypes2.default.bool,
    className: _propTypes2.default.string
};

exports.default = (0, _reactOnclickoutside2.default)(Select);