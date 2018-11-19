'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var Sidebar = function Sidebar(props) {

    var classes = (0, _classnames2.default)('Sidebar', props.className, props.closed && 'closed', props.unresponsive ? 'unresponsive' : '', props.fly ? 'fly' : 'fluid');

    var titleClassNames = (0, _classnames2.default)('SidebarTitle', props.titleClassName && props.titleClassName);

    return _react2.default.createElement(
        'div',
        { className: classes, style: { width: props.width } },
        _react2.default.createElement(
            'div',
            { className: 'SidebarContent' },
            _react2.default.createElement(
                'div',
                { className: 'SidebarHeader' },
                _react2.default.createElement(
                    'div',
                    { className: titleClassNames },
                    props.title ? props.title : ''
                ),
                _react2.default.createElement('span', { className: 'rioglyph rioglyph-remove close', onClick: props.onClose })
            ),
            _react2.default.createElement(
                'div',
                { className: 'SidebarBody' },
                props.children
            )
        )
    );
};

Sidebar.defaultProps = {
    closed: false,
    width: '350px',
    unresponsive: false,
    fly: false
};

Sidebar.propTypes = {
    closed: _propTypes2.default.bool,
    fly: _propTypes2.default.bool,
    unresponsive: _propTypes2.default.bool,
    width: _propTypes2.default.string,
    className: _propTypes2.default.string,
    titleClassName: _propTypes2.default.string,
    title: _propTypes2.default.oneOfType([_propTypes2.default.node, _propTypes2.default.string]),
    onClose: _propTypes2.default.func
};

exports.default = Sidebar;