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

var _getMenuItems = require('../menuItems/getMenuItems');

var _getMenuItems2 = _interopRequireDefault(_getMenuItems);

var _menuItemsPropTypes = require('./menuItemsPropTypes');

var _menuItemsPropTypes2 = _interopRequireDefault(_menuItemsPropTypes);

var _getDropDirection = require('./getDropDirection');

var _getDropDirection2 = _interopRequireDefault(_getDropDirection);

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

var _reactOnclickoutside = require('react-onclickoutside');

var _reactOnclickoutside2 = _interopRequireDefault(_reactOnclickoutside);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var ButtonDropdown = function (_Component) {
    (0, _inherits3.default)(ButtonDropdown, _Component);

    function ButtonDropdown(props) {
        (0, _classCallCheck3.default)(this, ButtonDropdown);

        var _this = (0, _possibleConstructorReturn3.default)(this, (ButtonDropdown.__proto__ || Object.getPrototypeOf(ButtonDropdown)).call(this, props));

        _this.state = {
            open: props.open,
            dropup: props.dropup,
            pullRight: props.pullRight
        };

        _this.toggleOpen = _this.toggleOpen.bind(_this);
        _this.onSplitLabelButtonClick = _this.onSplitLabelButtonClick.bind(_this);
        return _this;
    }

    (0, _createClass3.default)(ButtonDropdown, [{
        key: 'isAutoDropActive',
        value: function isAutoDropActive() {
            return !(!this.props.autoDropDirection || this.props.dropup || this.props.pullRight);
        }
    }, {
        key: 'toggleOpen',
        value: function toggleOpen(event) {
            var dropDirection = this.isAutoDropActive() ? (0, _getDropDirection2.default)(event) : {};

            this.setState((0, _extends3.default)({
                open: !this.state.open
            }, dropDirection));
        }
    }, {
        key: 'closeMenu',
        value: function closeMenu() {
            this.setState({
                open: false
            });
        }
    }, {
        key: 'handleClickOutside',
        value: function handleClickOutside() {
            this.closeMenu();
        }
    }, {
        key: 'onSplitLabelButtonClick',
        value: function onSplitLabelButtonClick() {
            this.closeMenu();

            if (this.props.onLabelButtonClick) {
                this.props.onLabelButtonClick();
            }
        }
    }, {
        key: 'render',
        value: function render() {
            var _props = this.props,
                id = _props.id,
                bsSize = _props.bsSize,
                bsStyle = _props.bsStyle,
                disabled = _props.disabled,
                items = _props.items,
                iconOnly = _props.iconOnly,
                title = _props.title,
                noCaret = _props.noCaret,
                splitButton = _props.splitButton,
                className = _props.className,
                toggleClassName = _props.toggleClassName;
            var open = this.state.open;


            var dropup = this.isAutoDropActive() ? this.state.dropup : this.props.dropup;
            var pullRight = this.isAutoDropActive() ? this.state.pullRight : this.props.pullRight;

            var classes = (0, _classnames2.default)('dropdown', 'btn-group', 'btn-group-' + bsStyle, open && 'open', dropup && 'dropup', disabled && 'open', className && className);

            var labelButtonClasses = (0, _classnames2.default)(!splitButton && 'dropdown-toggle', 'btn', 'btn-' + bsStyle, iconOnly && 'btn-icon-only', toggleClassName && !splitButton && toggleClassName, bsSize === 'sm' && 'btn-sm', bsSize === 'lg' && 'btn-lg');

            var dropdownMenuClasses = (0, _classnames2.default)('dropdown-menu', pullRight && 'pull-right');

            var splitCaretButtonClasses = (0, _classnames2.default)('dropdown-toggle', 'btn', 'btn-' + bsStyle, toggleClassName && toggleClassName);

            var caret = _react2.default.createElement('span', { className: 'caret' });
            var splitCaretButton = _react2.default.createElement(
                'button',
                { id: id, role: 'button', type: 'button', className: splitCaretButtonClasses, onClick: this.toggleOpen },
                caret
            );

            var labelButtonId = splitButton ? 'button-' + id : id;
            var onDropdownButtonClick = splitButton ? this.onSplitLabelButtonClick : this.toggleOpen;

            return _react2.default.createElement(
                'div',
                { className: classes },
                _react2.default.createElement(
                    'button',
                    { id: labelButtonId, role: 'button', type: 'button', className: labelButtonClasses,
                        onClick: onDropdownButtonClick },
                    title,
                    !noCaret && !splitButton && !iconOnly && caret
                ),
                splitButton && splitCaretButton,
                _react2.default.createElement(
                    'ul',
                    { role: 'menu', className: dropdownMenuClasses },
                    (0, _getMenuItems2.default)(items, this.toggleOpen)
                )
            );
        }
    }]);
    return ButtonDropdown;
}(_react.Component);

ButtonDropdown.defaultProps = {
    id: Math.random().toString(36).substr(2, 16),
    items: [],
    iconOnly: false,
    noCaret: false,
    pullRight: false,
    splitButton: false,
    autoDropDirection: true,
    bsStyle: 'default'
};

ButtonDropdown.propTypes = {
    id: _propTypes2.default.string,
    title: _propTypes2.default.oneOfType([_propTypes2.default.node, _propTypes2.default.string]).isRequired,
    dropup: _propTypes2.default.bool,
    pullRight: _propTypes2.default.bool,
    bsSize: _propTypes2.default.string,
    bsStyle: _propTypes2.default.string,
    iconOnly: _propTypes2.default.bool,
    noCaret: _propTypes2.default.bool,
    splitButton: _propTypes2.default.bool,
    autoDropDirection: _propTypes2.default.bool,
    items: _menuItemsPropTypes2.default.isRequired,
    className: _propTypes2.default.string,
    toggleClassName: _propTypes2.default.string,
    onLabelButtonClick: _propTypes2.default.func
};

exports.default = (0, _reactOnclickoutside2.default)(ButtonDropdown);