'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _Tag = require('../tag/Tag');

var _Tag2 = _interopRequireDefault(_Tag);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var SelectedFilterTag = function SelectedFilterTag(props) {
    var title = props.title,
        labels = props.labels,
        onDelete = props.onDelete,
        keyName = props.keyName,
        className = props.className;


    var titleLabel = title ? _react2.default.createElement(
        'span',
        null,
        title,
        ': '
    ) : '';

    var tags = labels.map(function (label, index) {
        return _react2.default.createElement(
            'li',
            { className: 'SelectedFilterTag ' + (className && className), key: keyName + '-' + index,
                onClick: function onClick() {
                    onDelete(label);
                } },
            _react2.default.createElement(
                _Tag2.default,
                { size: 'small', deletable: true },
                titleLabel,
                label
            )
        );
    });

    return _react2.default.createElement(
        'li',
        null,
        _react2.default.createElement(
            'ul',
            { className: 'list-inline' },
            tags
        )
    );
};

SelectedFilterTag.defaultProps = {};

SelectedFilterTag.propTypes = {
    title: _propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.node]),
    labels: _propTypes2.default.arrayOf(_propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.node])),
    onDelete: _propTypes2.default.func,
    keyName: _propTypes2.default.string,
    className: _propTypes2.default.string
};

exports.default = SelectedFilterTag;