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

var ExpanderPanel = function (_Component) {
    (0, _inherits3.default)(ExpanderPanel, _Component);

    /* istanbul ignore next */
    function ExpanderPanel() {
        var _ref;

        (0, _classCallCheck3.default)(this, ExpanderPanel);

        for (var _len = arguments.length, args = Array(_len), _key = 0; _key < _len; _key++) {
            args[_key] = arguments[_key];
        }

        var _this = (0, _possibleConstructorReturn3.default)(this, (_ref = ExpanderPanel.__proto__ || Object.getPrototypeOf(ExpanderPanel)).call.apply(_ref, [this].concat(args)));

        _this.state = {
            open: _this.props.open
        };
        return _this;
    }

    (0, _createClass3.default)(ExpanderPanel, [{
        key: 'render',
        value: function render() {
            var _this2 = this;

            var bsStyle = this.props.bsStyle ? 'panel-' + this.props.bsStyle : 'panel-blank';

            var wrapperClassNames = (0, _classnames2.default)('expander-panel panel', bsStyle, this.props.className);

            var iconClassNames = (0, _classnames2.default)('expander-icon', 'rioglyph', 'rioglyph-chevron-down');

            var headerClassNames = (0, _classnames2.default)('panel-heading', this.state.open && 'open', this.props.iconLeft && 'icon-left', this.props.headerClassName && this.props.headerClassName);

            var bodyClassNames = (0, _classnames2.default)('panel-body', this.props.bodyClassName && this.props.bodyClassName);

            return _react2.default.createElement(
                'div',
                { className: wrapperClassNames },
                _react2.default.createElement(
                    'div',
                    { className: headerClassNames,
                        onClick: function onClick() {
                            return _this2.setState({ open: !_this2.state.open });
                        } },
                    _react2.default.createElement(
                        'span',
                        { className: 'title' },
                        this.props.title
                    ),
                    _react2.default.createElement('span', { className: iconClassNames })
                ),
                _react2.default.createElement(
                    _reactBootstrap.Collapse,
                    { 'in': this.state.open,
                        mountOnEnter: this.props.mountOnEnter,
                        unmountOnExit: this.props.unmountOnExit },
                    _react2.default.createElement(
                        'div',
                        null,
                        _react2.default.createElement(
                            'div',
                            { className: bodyClassNames },
                            this.props.children
                        )
                    )
                )
            );
        }
    }]);
    return ExpanderPanel;
}(_react.Component);

exports.default = ExpanderPanel;


ExpanderPanel.defaultProps = {
    mountOnEnter: true,
    unmountOnExit: true
};

ExpanderPanel.propTypes = {
    className: _propTypes2.default.string,
    headerClassName: _propTypes2.default.string,
    bodyClassName: _propTypes2.default.string,
    title: _propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.node]).isRequired,
    bsStyle: _propTypes2.default.string,
    iconLeft: _propTypes2.default.bool,
    open: _propTypes2.default.bool,
    mountOnEnter: _propTypes2.default.bool,
    unmountOnExit: _propTypes2.default.bool
};