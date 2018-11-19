'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.CATEGORY_VAN = exports.CATEGORY_BUS = exports.CATEGORY_TRUCK = undefined;

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

var _busIcon = require('./busIcon');

var _busIcon2 = _interopRequireDefault(_busIcon);

var _vanIcon = require('./vanIcon');

var _vanIcon2 = _interopRequireDefault(_vanIcon);

var _truckIcon = require('./truckIcon');

var _truckIcon2 = _interopRequireDefault(_truckIcon);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

// defines the vehicle category for truck
var CATEGORY_TRUCK = exports.CATEGORY_TRUCK = 'TRUCK';

// defines the vehicle category for bus
var CATEGORY_BUS = exports.CATEGORY_BUS = 'BUS';

// defines the vehicle category for van
var CATEGORY_VAN = exports.CATEGORY_VAN = 'VAN';

function getIcon(category) {
    switch (category) {
        case CATEGORY_BUS:
            return _busIcon2.default;
        case CATEGORY_VAN:
            return _vanIcon2.default;
        case CATEGORY_TRUCK:
        default:
            return _truckIcon2.default;
    }
}

var VehicleCategory = function VehicleCategory(props) {
    var styleClasses = props.styleClasses,
        labeled = props.labeled,
        text = props.text,
        size = props.size;

    var iconStyle = (0, _classnames2.default)('iconItem', styleClasses, size && 'large');
    var iconLabelStyle = (0, _classnames2.default)('iconLabel', size && 'large');
    var category = props.category || CATEGORY_TRUCK;

    var CategoryIcon = getIcon(category);

    return _react2.default.createElement(
        'span',
        { className: 'VehicleCategory' },
        _react2.default.createElement(
            'span',
            { className: 'iconWrapper' },
            _react2.default.createElement(CategoryIcon, { className: iconStyle })
        ),
        labeled ? _react2.default.createElement(
            'span',
            { className: iconLabelStyle },
            text || category
        ) : undefined
    );
};

VehicleCategory.propTypes = {
    category: _propTypes2.default.oneOf([CATEGORY_BUS, CATEGORY_VAN, CATEGORY_TRUCK]),
    styleClasses: _propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.arrayOf(_propTypes2.default.string), _propTypes2.default.object]),
    labeled: _propTypes2.default.bool
};

exports.default = VehicleCategory;