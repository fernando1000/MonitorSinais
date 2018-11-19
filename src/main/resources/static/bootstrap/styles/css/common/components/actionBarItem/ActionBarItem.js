'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.ActionBarItem = undefined;

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

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

var _ActionBarOverlay = require('./ActionBarOverlay');

var _ActionBarItemPopover = require('./ActionBarItemPopover');

var _ActionBarItemIcon = require('./ActionBarItemIcon');

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var ActionBarItem = exports.ActionBarItem = function (_Component) {
    (0, _inherits3.default)(ActionBarItem, _Component);

    /* istanbul ignore next */
    function ActionBarItem(props) {
        (0, _classCallCheck3.default)(this, ActionBarItem);

        var _this = (0, _possibleConstructorReturn3.default)(this, (ActionBarItem.__proto__ || Object.getPrototypeOf(ActionBarItem)).call(this, props));

        _this.state = {
            show: false
        };
        return _this;
    }

    (0, _createClass3.default)(ActionBarItem, [{
        key: 'handleClick',
        value: function handleClick() /*event*/{
            this.setState((0, _extends3.default)({}, this.state, {
                show: !this.state.show
            }));
        }
    }, {
        key: 'hide',
        value: function hide() {
            this.setState((0, _extends3.default)({}, this.state, {
                show: false
            }));
        }
    }, {
        key: 'renderBodyComponent',
        value: function renderBodyComponent(component) {
            var _this2 = this;

            return _react2.default.createElement(
                _ActionBarOverlay.ActionBarOverlay,
                {
                    id: this.props.id,
                    title: component.props.title,
                    show: this.state.show,
                    target: this,
                    container: this,
                    onHide: function onHide() {
                        return _this2.hide();
                    } },
                component
            );
        }
    }, {
        key: 'render',
        value: function render() {
            var _this3 = this;

            var classes = (0, _classnames2.default)('ActionBarItem', this.props.className);

            var children = _react2.default.Children.map(this.props.children, function (child) {
                if (child.type.displayName === 'ActionBarItemPopover') {
                    return _this3.renderBodyComponent(child);
                }

                // Inject the click handler for the icon component itself and as we have just the
                // child, we need to clone it in order to extend it with new props
                return _react2.default.cloneElement(child, { onClick: function onClick() {
                        return (/*event*/_this3.handleClick()
                        );
                    } });
            });

            return _react2.default.createElement(
                'div',
                { className: classes },
                children
            );
        }
    }]);
    return ActionBarItem;
}(_react.Component);

ActionBarItem.Icon = _ActionBarItemIcon.ActionBarItemIcon;
ActionBarItem.Popover = _ActionBarItemPopover.ActionBarItemPopover;

ActionBarItem.defaultProps = {};

ActionBarItem.propTypes = {
    className: _propTypes2.default.string,
    id: _propTypes2.default.string.isRequired,
    title: _propTypes2.default.oneOfType([_propTypes2.default.node, _propTypes2.default.string])
};

exports.default = ActionBarItem;