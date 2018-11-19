'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var truckIcon = function truckIcon(props) {
    return _react2.default.createElement(
        'svg',
        { className: props.className + ' icon icoTruck', id: 'Ebene_1', xmlns: 'http://www.w3.org/2000/svg',
            viewBox: '0 0 100 100' },
        _react2.default.createElement('circle', { cx: '73.3', cy: '77.8', r: '7.8' }),
        _react2.default.createElement('path', { d: 'M27.1,69.3c-4.5,0-8.1,3.6-8.1,8.1c0,4.5,3.6,8.1,8.1,8.1c4.5,0,8.1-3.6,8.1-8.1C35.2,72.9,31.6, 69.3,27.1,69.3z'
        }),
        _react2.default.createElement('path', { d: 'M89.5,48.9c0-4.8-0.6-8.5-0.6-8.5l-4.7-15C79.4,11.1,51,14,51,14v44.9l-42,0V64v1.2V78h7.2c0,0,0-0.4, 0-0.5 c0-5.9,4.8-10.7,10.6-10.7s10.6,4.8,10.6,10.7c0,0.2,0,0.5,0,0.5h25.2c0-6,4.8-10.6,10.6-10.6c5.8,0,10.6, 4.6,10.6,10.6h0.3 l5.3-0.2 M58,25h17.4l5,16.4l-22.4,0V25z'
        })
    );
};

exports.default = truckIcon;