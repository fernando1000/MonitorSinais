'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.Footer = exports.Body = exports.Header = undefined;

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _reactBootstrap = require('react-bootstrap');

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

/*
 * Dialog component to create a bootstrap modal dialog
 */
var Header = exports.Header = function Header(props) {
    var header = props.header,
        showCloseButton = props.showCloseButton;


    var title = header ? _react2.default.createElement(
        _reactBootstrap.Modal.Title,
        null,
        header
    ) : undefined;

    return _react2.default.createElement(
        _reactBootstrap.Modal.Header,
        { closeButton: showCloseButton },
        title
    );
};

var Body = exports.Body = function Body(props) {
    return _react2.default.createElement(
        _reactBootstrap.Modal.Body,
        null,
        props.body
    );
};

var Footer = exports.Footer = function Footer(props) {
    return _react2.default.createElement(
        _reactBootstrap.Modal.Footer,
        null,
        props.footer
    );
};

var Dialog = function Dialog(props) {
    var show = props.show,
        onHide = props.onHide,
        className = props.className,
        header = props.header,
        body = props.body,
        footer = props.footer,
        showCloseButton = props.showCloseButton,
        bsSize = props.bsSize;


    var showHeader = header || showCloseButton;
    var classes = (0, _classnames2.default)(className, bsSize === 'sm' && 'modal-sm', bsSize === 'lg' && 'modal-lg', bsSize === 'xl' && 'modal-xl', bsSize === 'full' && 'modal-full');
    return _react2.default.createElement(
        _reactBootstrap.Modal,
        { show: show, onHide: onHide, dialogClassName: classes, backdrop: 'static' },
        showHeader && _react2.default.createElement(Header, props),
        body && _react2.default.createElement(Body, props),
        footer && _react2.default.createElement(Footer, props)
    );
};

Dialog.propTypes = {
    show: _propTypes2.default.bool,
    header: _propTypes2.default.node,
    body: _propTypes2.default.node,
    footer: _propTypes2.default.node,
    onHide: _propTypes2.default.func,
    className: _propTypes2.default.string,
    showCloseButton: _propTypes2.default.bool,
    bsSize: _propTypes2.default.string
};

Dialog.defaultProps = {
    show: false,
    onHide: function onHide() {/* ignore */},
    className: '',
    showCloseButton: true
};

exports.default = Dialog;