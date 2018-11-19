'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _reactBootstrap = require('react-bootstrap');

var _Dialog = require('./Dialog');

var _Dialog2 = _interopRequireDefault(_Dialog);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

/*
 * Confirmation dialog component to confirm or cancel an action
 */
var ConfirmationDialog = function ConfirmationDialog(props) {
    var show = props.show,
        title = props.title,
        content = props.content,
        onClickCancel = props.onClickCancel,
        cancelButtonText = props.cancelButtonText,
        onClickConfirm = props.onClickConfirm,
        confirmButtonText = props.confirmButtonText,
        disableConfirm = props.disableConfirm,
        bsSize = props.bsSize;


    var footer = _react2.default.createElement(
        'div',
        null,
        _react2.default.createElement(
            _reactBootstrap.Button,
            { 'data-component': 'CancelButton', onClick: onClickCancel },
            cancelButtonText
        ),
        _react2.default.createElement(
            _reactBootstrap.Button,
            { 'data-component': 'ConfirmationButton',
                onClick: onClickConfirm, disabled: disableConfirm, bsStyle: 'primary' },
            confirmButtonText
        )
    );

    return _react2.default.createElement(_Dialog2.default, {
        show: show,
        header: title,
        body: content,
        footer: footer,
        onHide: onClickCancel,
        showCloseButton: false,
        bsSize: bsSize,
        className: 'confirmation-dialog'
    });
};

ConfirmationDialog.propTypes = {
    show: _propTypes2.default.bool.isRequired,
    title: _propTypes2.default.node.isRequired,
    content: _propTypes2.default.node,
    onClickCancel: _propTypes2.default.func.isRequired,
    onClickConfirm: _propTypes2.default.func.isRequired,
    cancelButtonText: _propTypes2.default.node.isRequired,
    confirmButtonText: _propTypes2.default.node.isRequired,
    disableConfirm: _propTypes2.default.bool,
    bsSize: _propTypes2.default.string
};

exports.default = ConfirmationDialog;