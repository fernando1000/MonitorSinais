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

var _reactBootstrap = require('react-bootstrap');

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var SteppedProgressBar = function (_Component) {
    (0, _inherits3.default)(SteppedProgressBar, _Component);

    /* istanbul ignore next */
    function SteppedProgressBar(props) {
        (0, _classCallCheck3.default)(this, SteppedProgressBar);

        var _this = (0, _possibleConstructorReturn3.default)(this, (SteppedProgressBar.__proto__ || Object.getPrototypeOf(SteppedProgressBar)).call(this, props));

        _this.state = {
            disableFollowingPages: props.disableFollowingPages ? props.disableFollowingPages : _this.props.selectedStepNumber
        };
        return _this;
    }

    (0, _createClass3.default)(SteppedProgressBar, [{
        key: 'componentWillReceiveProps',
        value: function componentWillReceiveProps(nextProps) {
            if (nextProps.disableFollowingPages !== undefined) {
                if (nextProps.disableFollowingPages < nextProps.selectedStepNumber) {
                    throw Error('disabledFollowingPages has to be lager than selectedStepNumber');
                }
                this.setState({
                    disableFollowingPages: nextProps.disableFollowingPages
                });
            } else if (nextProps.selectedStepNumber > this.state.disableFollowingPages) {
                this.setState({
                    disableFollowingPages: nextProps.selectedStepNumber
                });
            }
        }
    }, {
        key: 'handleSelect',
        value: function handleSelect(selectedKey) {
            this.props.onSelectedChanged(selectedKey);
        }
    }, {
        key: 'getItems',
        value: function getItems(labels) {
            var _this2 = this;

            return labels.map(function (labelObject, index) {
                return _react2.default.createElement(
                    _reactBootstrap.NavItem,
                    { key: index, eventKey: index, className: 'step-tab',
                        disabled: index > _this2.state.disableFollowingPages },
                    _react2.default.createElement(
                        'div',
                        { className: 'item-icon' },
                        labelObject.icon
                    ),
                    _react2.default.createElement(
                        'div',
                        { className: 'item-label' },
                        labelObject.label
                    )
                );
            });
        }
    }, {
        key: 'render',
        value: function render() {
            var _this3 = this;

            var selectedStepNumber = this.props.selectedStepNumber;
            return _react2.default.createElement(
                _reactBootstrap.Nav,
                { className: (0, _classnames2.default)('stepped-progress-bar', this.props.className), activeKey: selectedStepNumber,
                    onSelect: function onSelect(selectedKey) {
                        return _this3.handleSelect(selectedKey);
                    } },
                this.getItems(this.props.labels)
            );
        }
    }]);
    return SteppedProgressBar;
}(_react.Component);

exports.default = SteppedProgressBar;


SteppedProgressBar.propTypes = {
    disableFollowingPages: _propTypes2.default.number,
    onSelectedChanged: _propTypes2.default.func.isRequired,
    labels: _propTypes2.default.array.isRequired,
    selectedStepNumber: _propTypes2.default.number.isRequired,
    className: _propTypes2.default.string
};