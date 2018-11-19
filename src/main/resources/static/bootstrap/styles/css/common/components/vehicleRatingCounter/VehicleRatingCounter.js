'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.VehicleRatingCounter = exports.RATING_EXCEPTION = exports.RATING_WARNING = exports.RATING_OK = undefined;
exports.getVehicleRatingClassName = getVehicleRatingClassName;

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var RATING_OK = exports.RATING_OK = 'HIGH';
var RATING_WARNING = exports.RATING_WARNING = 'MEDIUM';
var RATING_EXCEPTION = exports.RATING_EXCEPTION = 'LOW';

function getVehicleRatingClassName(ratingType) {
    switch (ratingType) {
        case RATING_EXCEPTION:
            return 'VehicleRatingCounterLow';
        case RATING_WARNING:
            return 'VehicleRatingCounterMedium';
        case RATING_OK:
        default:
            return 'VehicleRatingCounterHigh';
    }
}

var VehicleRatingCounter = exports.VehicleRatingCounter = function VehicleRatingCounter(_ref) {
    var total = _ref.total,
        ratingType = _ref.ratingType;
    return _react2.default.createElement(
        'div',
        { className: 'VehicleRatingCounter' },
        _react2.default.createElement(
            'div',
            { className: getVehicleRatingClassName(ratingType) },
            total
        )
    );
};

VehicleRatingCounter.propTypes = {
    total: _propTypes2.default.number.isRequired,
    ratingType: _propTypes2.default.string
};

exports.default = VehicleRatingCounter;