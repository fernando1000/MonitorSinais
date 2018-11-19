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

var _reactBootstrap = require('react-bootstrap');

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var ToggleButton = function (_Component) {
    (0, _inherits3.default)(ToggleButton, _Component);

    /* istanbul ignore next */
    function ToggleButton(props) {
        (0, _classCallCheck3.default)(this, ToggleButton);

        var _this = (0, _possibleConstructorReturn3.default)(this, (ToggleButton.__proto__ || Object.getPrototypeOf(ToggleButton)).call(this, props));

        _this.state = {
            toggled: props.active
        };
        return _this;
    }

    (0, _createClass3.default)(ToggleButton, [{
        key: 'componentWillReceiveProps',
        value: function componentWillReceiveProps(nextProps) {
            this.setState({
                toggled: nextProps.active
            });
        }
    }, {
        key: 'handleClick',
        value: function handleClick() {
            var isToggled = !this.state.toggled;

            this.setState({
                toggled: isToggled
            });

            if (this.props.onClick) {
                this.props.onClick(isToggled);
            }
        }
    }, {
        key: 'render',
        value: function render() {
            var _this2 = this;

            var props = (0, _extends3.default)({}, this.props);

            props.className = 'ToggleButton ' + (props.className || '');
            props.active = this.state.toggled;

            return _react2.default.createElement(
                _reactBootstrap.Button,
                (0, _extends3.default)({}, props, { onClick: function onClick() {
                        return _this2.handleClick();
                    } }),
                this.props.children
            );
        }
    }]);
    return ToggleButton;
}(_react.Component);

exports.default = ToggleButton;


ToggleButton.propTypes = {
    active: _propTypes2.default.bool,
    className: _propTypes2.default.string
};

ToggleButton.defaultProps = {
    active: false
};