'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _Spinner = require('./Spinner');

var _Spinner2 = _interopRequireDefault(_Spinner);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var SpinnerInfoBox = function SpinnerInfoBox(props) {
    var text = props.text,
        isInverse = props.isInverse;


    return _react2.default.createElement(
        'div',
        { className: 'spinnerInfoBox' + (isInverse ? ' inverse' : '') },
        _react2.default.createElement(
            'div',
            { className: 'spinnerIcon' },
            _react2.default.createElement(_Spinner2.default, { isInverse: isInverse })
        ),
        _react2.default.createElement(
            'div',
            { className: 'spinnerText' },
            text
        )
    );
};

SpinnerInfoBox.defaultProps = {
    isInverse: false
};

SpinnerInfoBox.propTypes = {
    text: _propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.node]),
    isInverse: _propTypes2.default.bool
};

exports.default = SpinnerInfoBox;