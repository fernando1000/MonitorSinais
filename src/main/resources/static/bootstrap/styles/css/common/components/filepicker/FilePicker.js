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

var _reactDropzone = require('react-dropzone');

var _reactDropzone2 = _interopRequireDefault(_reactDropzone);

var _Button = require('../button/Button');

var _Button2 = _interopRequireDefault(_Button);

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var FilePicker = function (_Component) {
    (0, _inherits3.default)(FilePicker, _Component);

    function FilePicker() {
        (0, _classCallCheck3.default)(this, FilePicker);
        return (0, _possibleConstructorReturn3.default)(this, (FilePicker.__proto__ || Object.getPrototypeOf(FilePicker)).apply(this, arguments));
    }

    (0, _createClass3.default)(FilePicker, [{
        key: 'render',
        value: function render() {
            var _this2 = this;

            var dropzoneProps = {
                accept: this.props.accept,
                multiple: this.props.multiple,
                ref: function ref(thisDropzone) {
                    _this2.thisDropzone = thisDropzone;
                },
                onDrop: this.onPick.bind(this),
                maxSize: this.props.maxSize
            };

            //let content;
            // TODO Reactivate once the dropzone is available
            // if (this.props.displayMode === 'dropzone') {
            //     //Dropzone
            //     // TODO className and activeClassName/rejectClassName are deprecated.
            //     // TODO They will have to be replaced respectively with parent div styling and
            //     // TODO child div styling with function.
            //     // TODO This is not possible yet because this Dropzone version still contains a default styling.
            //     dropzoneProps = {
            //         className: classNames('react-dropzone', this.props.className),
            //         activeClassName: 'react-dropzone-active',
            //         rejectClassName: 'react-dropzone-rejected',
            //         ...dropzoneProps,
            //     };
            //     content = <Dropzone {...dropzoneProps} />;
            // } else {
            // Button
            // TODO className will be deprecated in the following major release.
            // TODO It will have to be replaced with parent div styling,
            // TODO This is not possible yet because this Dropzone version still contains a default styling.
            dropzoneProps = (0, _extends3.default)({
                className: (0, _classnames2.default)('invisible')
            }, dropzoneProps);
            var content = _react2.default.createElement(
                'div',
                null,
                _react2.default.createElement(_reactDropzone2.default, dropzoneProps),
                _react2.default.createElement(
                    _Button2.default,
                    { onClick: this.onOpenClick.bind(this), className: this.props.className },
                    this.props.label
                )
            );
            // }

            return _react2.default.createElement(
                'div',
                { className: 'FilePicker' },
                content
            );
        }
    }, {
        key: 'onPick',
        value: function onPick(acceptedFiles, rejectedFiles) {
            if (this.props.onPick) {
                this.props.onPick(acceptedFiles, rejectedFiles);
            }
        }
    }, {
        key: 'onOpenClick',
        value: function onOpenClick() {
            this.thisDropzone.open();
        }
    }]);
    return FilePicker;
}(_react.Component);

exports.default = FilePicker;


FilePicker.defaultProps = {
    displayMode: 'button',
    multiple: true,
    label: 'Select file(s)',
    accept: '',
    className: ''
};

FilePicker.propTypes = {
    onPick: _propTypes2.default.func, /* Pick callback */
    displayMode: _propTypes2.default.string, /* Display mode: 'dropzone' / 'button' */
    multiple: _propTypes2.default.bool, /* Allow multiple file selections or not */
    label: _propTypes2.default.oneOfType([/* Text to display on Button */
    _propTypes2.default.string, _propTypes2.default.node]),
    accept: _propTypes2.default.string, /* List of accepted Mime Types */
    className: _propTypes2.default.string, /* Custom className for the displayed component (dropzone/button) */
    maxSize: _propTypes2.default.number /* Maximum File Size */
};