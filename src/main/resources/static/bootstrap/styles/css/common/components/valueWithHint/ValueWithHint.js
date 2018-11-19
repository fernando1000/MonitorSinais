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

var FONTSIZES = ['small', 'medium', 'large'];
var COLORS = ['mutes', 'primary', 'success', 'warning', 'info', 'danger'];

var ValueWithHint = function ValueWithHint(props) {
    var value = props.value,
        valueColor = props.valueColor,
        valueSize = props.valueSize,
        hint = props.hint,
        hintColor = props.hintColor,
        hintSize = props.hintSize,
        unit = props.unit,
        unitSize = props.unitSize,
        className = props.className;


    var wrapperClass = (0, _classnames2.default)(className, 'text-bold');

    var unitSizeClass = (0, _classnames2.default)('unit', FONTSIZES.indexOf(unitSize) !== -1 && 'size-' + unitSize);

    var valueClasses = (0, _classnames2.default)('value', COLORS.indexOf(valueColor) !== -1 && 'text-' + valueColor, FONTSIZES.indexOf(valueSize) !== -1 && 'size-' + valueSize);

    var hintClasses = (0, _classnames2.default)('hint', COLORS.indexOf(hintColor) !== -1 && 'text-' + hintColor, FONTSIZES.indexOf(hintSize) !== -1 && 'size-' + hintSize);

    return _react2.default.createElement(
        'div',
        { className: (0, _classnames2.default)('ValueWithHint', wrapperClass) },
        _react2.default.createElement(
            'div',
            { className: valueClasses },
            value && _react2.default.createElement(
                'span',
                { className: 'value' },
                value,
                ' '
            ),
            unit && _react2.default.createElement(
                'span',
                { className: unitSizeClass },
                unit
            )
        ),
        hint && _react2.default.createElement(
            'div',
            { className: hintClasses },
            hint
        )
    );
};

ValueWithHint.propTypes = {
    value: _propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.node]),
    valueColor: _propTypes2.default.string,
    valueSize: _propTypes2.default.string,
    hint: _propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.node]),
    hintColor: _propTypes2.default.string,
    hintSize: _propTypes2.default.string,
    unit: _propTypes2.default.string,
    unitSize: _propTypes2.default.string,
    className: _propTypes2.default.string
};

ValueWithHint.defaultProps = {
    value: 'ValueWithHint',
    valueColor: 'default',
    valueSize: 'large',
    hint: '',
    hintColor: 'default',
    hintSize: 'small',
    unit: '',
    unitSize: 'medium',
    className: ''
};

exports.default = ValueWithHint;