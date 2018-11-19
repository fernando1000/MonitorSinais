'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var vanIcon = function vanIcon(props) {
    return _react2.default.createElement(
        'svg',
        { className: props.className + ' icon icoVan', id: 'Ebene_1', xmlns: 'http://www.w3.org/2000/svg',
            viewBox: '0 0 100 100' },
        _react2.default.createElement('circle', { fillRule: 'evenodd', clipRule: 'evenodd', cx: '76.5', cy: '63.2', r: '6.7'
        }),
        _react2.default.createElement('path', { fillRule: 'evenodd', clipRule: 'evenodd', d: 'M15.7,62.8c0-3.9,3.1-7,7-7c3.9,0,7,3.1,7,7c0,3.9-3.1,7-7,7 C18.8,69.8,15.7,66.7,15.7,62.8z'
        }),
        _react2.default.createElement('path', { fillRule: 'evenodd', clipRule: 'evenodd', d: 'M90.7,60.5V48L75.4,32.5c0,0-2.2-2.4-5.1-2.4L7.7,30.3v33.1h5.6c0, 0,0-0.4,0-0.5 c0-5.1,4.1-9.2,9.2-9.2c5.1,0,9.2,4.2,9.2,9.3c0,0.1,0,0.5,0,0.5h35.8c0-5,4.1-9.1,9.2-9.1c5,0,9.1, 4.1,9.2,9.1h0.2h5.9l0,0v-3 H90.7z M68.7,47.9V33.5h3.7l14.7,14.6L68.7,47.9z'
        })
    );
};

exports.default = vanIcon;