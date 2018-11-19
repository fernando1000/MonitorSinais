'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _extends2 = require('babel-runtime/helpers/extends');

var _extends3 = _interopRequireDefault(_extends2);

var _typeof2 = require('babel-runtime/helpers/typeof');

var _typeof3 = _interopRequireDefault(_typeof2);

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

var _reactDatetime = require('react-datetime');

var _reactDatetime2 = _interopRequireDefault(_reactDatetime);

var _moment = require('moment');

var _moment2 = _interopRequireDefault(_moment);

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var DatePicker = function (_React$Component) {
    (0, _inherits3.default)(DatePicker, _React$Component);

    /* istanbul ignore next */
    function DatePicker(props) {
        (0, _classCallCheck3.default)(this, DatePicker);

        var _this = (0, _possibleConstructorReturn3.default)(this, (DatePicker.__proto__ || Object.getPrototypeOf(DatePicker)).call(this, props));

        _this.state = {
            hasError: false
        };
        return _this;
    }

    (0, _createClass3.default)(DatePicker, [{
        key: 'isValidDate',
        value: function isValidDate(date) {
            return (typeof date === 'undefined' ? 'undefined' : (0, _typeof3.default)(date)) === 'object';
        }
    }, {
        key: 'onChange',
        value: function onChange(date) {
            var isValid = this.isValidDate(date);
            this.setState({ hasError: !isValid });
            this.props.onChange(date, isValid);
        }
    }, {
        key: 'render',
        value: function render() {
            var className = this.props.className;
            var hasError = this.state.hasError;


            return _react2.default.createElement(_reactDatetime2.default, (0, _extends3.default)({}, this.props, {
                onChange: this.onChange.bind(this),
                className: (0, _classnames2.default)(className, hasError && 'has-error')
            }));
        }
    }]);
    return DatePicker;
}(_react2.default.Component);

DatePicker.defaultProps = {
    className: 'DatePicker',
    closeOnSelect: true,
    defaultValue: (0, _moment2.default)(),
    locale: 'en',
    onChange: function onChange() {/* ignore */}
};

DatePicker.propTypes = {
    className: _propTypes2.default.string,
    closeOnSelect: _propTypes2.default.bool,
    defaultValue: _propTypes2.default.object,
    locale: _propTypes2.default.string,
    onChange: _propTypes2.default.func
};

exports.default = DatePicker;