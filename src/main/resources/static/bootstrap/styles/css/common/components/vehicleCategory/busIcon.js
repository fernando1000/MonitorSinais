'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var busIcon = function busIcon(props) {
    return _react2.default.createElement(
        'svg',
        { className: props.className + ' icon icoBus', id: 'Ebene_1', xmlns: 'http://www.w3.org/2000/svg',
            viewBox: '0 0 100 100' },
        _react2.default.createElement(
            'g',
            { fillRule: 'evenodd', clipRule: 'evenodd' },
            _react2.default.createElement('circle', { cx: '72.9', cy: '67.5', r: '6.7' }),
            _react2.default.createElement('path', { d: 'M19.1,60.1c-3.9,0-7,3.1-7,7c0,3.9,3.1,7,7,7c3.9,0,7-3.1,7-7 C26.1,63.2,22.9,60.1,19.1,60.1z'
            }),
            _react2.default.createElement('path', { d: 'M92,23.5H-0.1v44h4h5.8c0,0,0-0.3,0-0.4c0-5.1,4.1-9.2,9.2-9.2S28,62,28,67.1 c0,0.1,0,0.4,0, 0.4h35.8c0-5,4.1-9.1,9.2-9.1c5,0,9.1,4.1,9.2,9.1h0.2h4.6h1h12V29.6C99.9,29.6,100.2,23.5,92,23.5z M83.9, 29.4v16 l-25,0.1v-16L83.9,29.4z M55.9,29.5v16l-25-0.1v-16L55.9,29.5z M2.9,45.5v-16h25v16H2.9z M96.9, 61.5h-10v-6v-26h10V61.5z'
            })
        )
    );
};

exports.default = busIcon;