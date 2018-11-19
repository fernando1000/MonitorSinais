'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _extends2 = require('babel-runtime/helpers/extends');

var _extends3 = _interopRequireDefault(_extends2);

var _objectWithoutProperties2 = require('babel-runtime/helpers/objectWithoutProperties');

var _objectWithoutProperties3 = _interopRequireDefault(_objectWithoutProperties2);

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var Tag = function Tag(props) {
    var icon = props.icon,
        active = props.active,
        disabled = props.disabled,
        clickable = props.clickable,
        selectable = props.selectable,
        deletable = props.deletable,
        remainingProps = (0, _objectWithoutProperties3.default)(props, ['icon', 'active', 'disabled', 'clickable', 'selectable', 'deletable']);


    return _react2.default.createElement('div', (0, _extends3.default)({}, remainingProps, {
        className: (0, _classnames2.default)('tag', props.size === 'small' && 'tag-small', icon && 'rioglyph ' + icon, active && 'active clickable rioglyph rioglyph-ok', disabled && 'disabled', clickable && 'clickable', selectable && 'selectable clickable rioglyph rioglyph-plus', deletable && 'deletable clickable rioglyph rioglyph-remove', props.className)
    }));
};

Tag.propTypes = {
    className: _propTypes2.default.string,
    size: _propTypes2.default.string,
    icon: _propTypes2.default.string,
    active: _propTypes2.default.bool,
    disabled: _propTypes2.default.bool,
    clickable: _propTypes2.default.bool,
    selectable: _propTypes2.default.bool,
    deletable: _propTypes2.default.bool
};

exports.default = Tag;