'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

function formatDegrees(degrees, positivePrefix, negativePrefix) {
    var prefix = degrees >= 0 ? positivePrefix : negativePrefix;
    var absDegrees = Math.abs(degrees);
    var flooredDegrees = Math.floor(absDegrees);
    var minutes = (absDegrees - flooredDegrees) * 60;
    return '' + prefix + flooredDegrees + '\xB0 ' + minutes.toFixed(3) + '\u2032';
}

/*
 * Presentational component for a formatted coordinate.
 */
var Position = function Position(props) {
    var vehicleState = props.vehicleState;

    var lat = vehicleState.latitude;
    var lon = vehicleState.longitude;
    var address = vehicleState.address;

    var formattedAddress = void 0;
    if (typeof address === 'undefined') {
        formattedAddress = formatDegrees(lat, 'N', 'S') + ' ' + formatDegrees(lon, 'E', 'W');
    } else {
        formattedAddress = address;
    }

    return _react2.default.createElement(
        'span',
        { className: 'vehiclePositionInfo' },
        formattedAddress
    );
};

Position.propTypes = {
    vehicleState: _propTypes2.default.shape({
        latitude: _propTypes2.default.number.isRequired,
        longitude: _propTypes2.default.number.isRequired,
        address: _propTypes2.default.string
    })
};

exports.default = Position;