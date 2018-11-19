'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.default = MarkerTooltip;

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _VehicleCategory = require('../vehicleCategory/VehicleCategory');

var _VehicleCategory2 = _interopRequireDefault(_VehicleCategory);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

function renderVehicleRatingCounter(count, styleClass) {
    if (count) {
        return _react2.default.createElement(
            'div',
            { className: 'RatingCounter' },
            _react2.default.createElement(
                'div',
                { className: styleClass },
                count
            )
        );
    }
}

/*
 * Presentational component for the info popup for a rated vehicle (marker).
 */
/**
 * @fileOverview: Presentational component for the info popup for a rated
 * vehicle (marker).
 */

function MarkerTooltip(props) {

    var className = props.className ? props.className : '';
    return _react2.default.createElement(
        'div',
        { className: 'clearfix' },
        _react2.default.createElement(
            'div',
            { className: 'MarkerTooltip ' + (props.renderLeft ? 'left' : 'right') + ' ' + className },
            _react2.default.createElement(
                'div',
                { className: 'vehicleIconAndName' },
                _react2.default.createElement(
                    'div',
                    { className: 'vehicleIconWrapper' },
                    _react2.default.createElement(_VehicleCategory2.default, { category: props.vehicle.category, styleClasses: 'vehicleIcon' })
                ),
                _react2.default.createElement(
                    'div',
                    { className: 'vehicleName' },
                    props.vehicle.name || 'unknown'
                )
            ),
            _react2.default.createElement(
                'div',
                { className: 'ratings' + (props.renderLeft ? ' left' : ' right') },
                renderVehicleRatingCounter(props.exceptionCount, 'VehicleRatingCounterLow'),
                renderVehicleRatingCounter(props.warningCount, 'VehicleRatingCounterMedium')
            )
        )
    );
}

MarkerTooltip.propTypes = {
    className: _propTypes2.default.string,
    renderLeft: _propTypes2.default.bool,
    vehicle: _propTypes2.default.object.isRequired,
    warningCount: _propTypes2.default.number,
    exceptionCount: _propTypes2.default.number
};