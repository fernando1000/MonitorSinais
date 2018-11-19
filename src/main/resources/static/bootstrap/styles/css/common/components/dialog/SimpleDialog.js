'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _Dialog = require('./Dialog');

var _Dialog2 = _interopRequireDefault(_Dialog);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

/*
 * Component to show a modal popup containing a title, a content and a close handler.
 */
var SimpleDialog = function SimpleDialog(props) {
    var show = props.show,
        title = props.title,
        content = props.content,
        onClose = props.onClose,
        className = props.className,
        bsSize = props.bsSize;


    var dialogClassName = (className ? className : '') + ' simple-dialog';

    return _react2.default.createElement(_Dialog2.default, {
        show: show,
        header: title,
        body: content,
        onHide: onClose,
        className: dialogClassName,
        showCloseButton: true,
        bsSize: bsSize
    });
};

SimpleDialog.propTypes = {
    show: _propTypes2.default.bool.isRequired,
    title: _propTypes2.default.node,
    content: _propTypes2.default.node,
    onClose: _propTypes2.default.func.isRequired,
    className: _propTypes2.default.string,
    bsSize: _propTypes2.default.string
};

exports.default = SimpleDialog;