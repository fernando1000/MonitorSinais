'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.STATE_EXCEPTION = exports.STATE_WARNING = undefined;
exports.default = VehicleMarker;

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

/**
 * @fileOverview: Presentational component for a rated marker on dashboard map.
 */

var STATE_WARNING = exports.STATE_WARNING = 'STATE_WARNING';
var STATE_EXCEPTION = exports.STATE_EXCEPTION = 'STATE_EXCEPTION';

function getCssClassByRating(vehicleState) {
    switch (vehicleState) {
        case STATE_WARNING:
            return 'rating-warning';
        case STATE_EXCEPTION:
            return 'rating-exception';
        default:
            return 'rating-ok';
    }
}

function renderArrow(bearing, cssClass) {
    if (!bearing && bearing !== 0) {
        return '';
    }

    var angle = bearing % 360;
    return _react2.default.createElement(
        'g',
        { transform: 'translate(50.5,23.5)' },
        _react2.default.createElement('polygon', { transform: 'rotate(' + angle + ')',
            className: cssClass + ' arrow',
            points: '10.04,12.12 0,-12.12 -10.04,12.12 0,3.86' })
    );
}

function renderArrowRect() {
    return _react2.default.createElement('rect', { className: 'innerBox', x: '33', y: '6', width: '35', height: '35' });
}

/*
 * Presentational component for a rated marker on dashboard map.
 */
function VehicleMarker(props) {

    var cssClass = getCssClassByRating(props.vehicleState);

    var className = 'VehicleMarker M' + props.vehicleId + (props.clicked ? ' selected' : '');

    var path = !props.clicked ? 'M27,0V48H75V0ZM33,6H69V41H33V6Z' : 'M27,0V48H75V0Z';

    return _react2.default.createElement(
        'svg',
        { className: className, viewBox: '0 0 100 100' },
        props.clicked ? _react2.default.createElement('circle', { className: cssClass + ' circle', cx: '50', cy: '76.11', r: '23.08' }) : '',
        _react2.default.createElement('circle', { className: cssClass + ' innerCircle', cx: '50',
            cy: '76.11', r: '5.38' }),
        _react2.default.createElement('polygon', { className: '' + cssClass,
            points: '50 69.5 63.85 43.35 36.15 43.35 50 69.5' }),
        _react2.default.createElement('path', { className: '' + cssClass, d: path }),
        !props.clicked ? renderArrowRect() : null,
        renderArrow(props.bearing, cssClass)
    );
}

VehicleMarker.propTypes = {
    bearing: _propTypes2.default.number,
    clicked: _propTypes2.default.bool,
    vehicleId: _propTypes2.default.number,
    vehicleState: _propTypes2.default.oneOf([STATE_EXCEPTION, STATE_WARNING])
};