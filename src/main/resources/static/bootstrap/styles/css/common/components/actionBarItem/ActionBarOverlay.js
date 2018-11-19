'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.ActionBarOverlay = undefined;

var _objectWithoutProperties2 = require('babel-runtime/helpers/objectWithoutProperties');

var _objectWithoutProperties3 = _interopRequireDefault(_objectWithoutProperties2);

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _reactBootstrap = require('react-bootstrap');

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var ActionBarOverlay = function ActionBarOverlay(_ref) {
    var children = _ref.children,
        id = _ref.id,
        title = _ref.title,
        props = (0, _objectWithoutProperties3.default)(_ref, ['children', 'id', 'title']);

    return _react2.default.createElement(
        _reactBootstrap.Overlay,
        props,
        _react2.default.createElement(
            _reactBootstrap.Popover,
            { id: id, title: title },
            children
        )
    );
};

exports.ActionBarOverlay = ActionBarOverlay;
ActionBarOverlay.defaultProps = {
    placement: 'bottom',
    rootClose: true
};

ActionBarOverlay.propTypes = {
    id: _propTypes2.default.string.isRequired,
    placement: _propTypes2.default.string,
    rootClose: _propTypes2.default.bool,
    title: _propTypes2.default.oneOfType([_propTypes2.default.node, _propTypes2.default.string]),
    onHide: _propTypes2.default.func
};

exports.default = ActionBarOverlay;