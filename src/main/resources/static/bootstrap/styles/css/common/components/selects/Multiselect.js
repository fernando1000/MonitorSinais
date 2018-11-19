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

var _reactOnclickoutside = require('react-onclickoutside');

var _reactOnclickoutside2 = _interopRequireDefault(_reactOnclickoutside);

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var Multiselect = function (_Component) {
    (0, _inherits3.default)(Multiselect, _Component);

    /* istanbul ignore next */
    function Multiselect(props) {
        (0, _classCallCheck3.default)(this, Multiselect);

        var _this = (0, _possibleConstructorReturn3.default)(this, (Multiselect.__proto__ || Object.getPrototypeOf(Multiselect)).call(this, props));

        _this.state = {
            isOpen: false,
            selectedItems: props.value ? [].concat(props.value) : []
        };

        //necessary for using the uikit as submodule
        _this.onToggleClick = _this.onToggleClick.bind(_this);
        _this.handleClickOutside = _this.handleClickOutside.bind(_this);
        _this.onOptionChange = _this.onOptionChange.bind(_this);
        return _this;
    }

    (0, _createClass3.default)(Multiselect, [{
        key: 'componentWillReceiveProps',
        value: function componentWillReceiveProps(nextProps) {
            if (nextProps.value) {
                this.setState({
                    selectedItems: nextProps.value
                });
            }
        }
    }, {
        key: 'componentWillMount',
        value: function componentWillMount() {
            var selectedItems = this.state.selectedItems;
            if (this.props.options) {
                this.props.options.forEach(function (option) {
                    if (option.selected) {
                        selectedItems.push(option.id);
                    }
                });

                this.setState({
                    selectedItems: selectedItems
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
                    ref: function ref(multiselectWrapper) {
                        _this2.multiselectWrapper = multiselectWrapper;
                    } },
                this.renderHead(),
                this.renderList()
            );
        }
    }, {
        key: 'buildSelectionRepresentation',
        value: function buildSelectionRepresentation(options) {
            var _this3 = this;

            if (!options) {
                return '';
            }

            var selectionText = options.filter(function (option) {
                return _this3.state.selectedItems.indexOf(option.id) !== -1;
            }).reduce(function (selection, option) {
                return selection + ', ' + option.label;
            }, '').slice(2);

            if (!selectionText.trim()) {
                return this.props.placeholder ? _react2.default.createElement(
                    'span',
                    { className: 'placeholder' },
                    this.props.placeholder
                ) : '';
            }

            return selectionText;
        }
    }, {
        key: 'renderHead',
        value: function renderHead() {
            var renderSelection = this.buildSelectionRepresentation(this.props.options);
            var classnames = (0, _classnames2.default)('dropdown-toggle form-control text-left', this.props.bsSize === 'large' && 'input-lg', this.props.bsSize === 'small' && 'input-sm');

            return _react2.default.createElement(
                'button',
                { type: 'button', className: classnames,
                    'data-toggle': 'dropdown',
                    'aria-haspopup': 'true',
                    'aria-expanded': this.state.isOpen,
                    onClick: this.onToggleClick },
                _react2.default.createElement(
                    'span',
                    null,
                    renderSelection
                ),
                _react2.default.createElement('span', { className: 'caret' })
            );
        }
    }, {
        key: 'renderList',
        value: function renderList() {
            var _this4 = this;

            var options = this.props.options;
            if (options) {
                return _react2.default.createElement(
                    'ul',
                    { className: 'dropdown-menu' },
                    options.map(function (option) {
                        return _this4.renderMenuItem(option);
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

            var isSelected = this.state.selectedItems.indexOf(option.id) !== -1;
            var onOptionChange = !option.disabled && this.onOptionChange;

            return _react2.default.createElement(
                'li',
                { className: (0, _classnames2.default)(isSelected && 'active', option.disabled && 'disabled'), key: option.id },
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
            this.onSelection(event);
            event.target.value = this.state.selectedItems;

            if (this.props.onChange) {
                this.props.onChange(this.state.selectedItems);
            }
        }
    }, {
        key: 'onSelection',
        value: function onSelection(event) {
            var optionId = event.currentTarget.getElementsByTagName('input')[0].value;
            var selectedItems = this.state.selectedItems;
            var itemIndex = this.state.selectedItems.indexOf(optionId);

            if (itemIndex !== -1) {
                selectedItems.splice(itemIndex, 1);
            } else {
                selectedItems.push(optionId);
            }

            this.setState({
                selectedItems: selectedItems
            });
        }
    }, {
        key: 'onToggleClick',
        value: function onToggleClick() {
            if (!this.props.disabled) {
                this.setState({
                    isOpen: !this.state.isOpen
                });
            }
        }
    }, {
        key: 'handleClickOutside',
        value: function handleClickOutside() {
            this.setState({
                isOpen: false
            });
        }
    }]);
    return Multiselect;
}(_react.Component);

Multiselect.defaultProps = {
    disabled: false
};

Multiselect.propTypes = {
    options: _propTypes2.default.arrayOf(_propTypes2.default.shape({
        id: _propTypes2.default.string.isRequired, /* Identify an option */
        label: _propTypes2.default.oneOfType([/* A label to show in body */
        _propTypes2.default.string, _propTypes2.default.node]).isRequired,
        icon: _propTypes2.default.object, /* An icon to show in body */
        selected: _propTypes2.default.bool, /* Mark option as selected */
        disabled: _propTypes2.default.bool, /* Mark option as disabled */
        header: _propTypes2.default.bool /* Mark option as groupHeader */
    })),
    onChange: _propTypes2.default.func, /* Params: option to change */
    placeholder: _propTypes2.default.oneOfType([/* Text to display when no menu item is selected */
    _propTypes2.default.string, _propTypes2.default.node]),
    value: _propTypes2.default.array,
    bsSize: _propTypes2.default.string,
    disabled: _propTypes2.default.bool,
    className: _propTypes2.default.string
};

exports.default = (0, _reactOnclickoutside2.default)(Multiselect);