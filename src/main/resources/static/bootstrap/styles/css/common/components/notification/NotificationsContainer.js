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

var _reactNotifications = require('react-notifications');

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var NotificationsContainer = function (_Component) {
    (0, _inherits3.default)(NotificationsContainer, _Component);

    function NotificationsContainer() {
        (0, _classCallCheck3.default)(this, NotificationsContainer);
        return (0, _possibleConstructorReturn3.default)(this, (NotificationsContainer.__proto__ || Object.getPrototypeOf(NotificationsContainer)).apply(this, arguments));
    }

    (0, _createClass3.default)(NotificationsContainer, [{
        key: 'render',
        value: function render() {
            return _react2.default.createElement(_reactNotifications.NotificationContainer, null);
        }
    }]);
    return NotificationsContainer;
}(_react.Component);

exports.default = NotificationsContainer;