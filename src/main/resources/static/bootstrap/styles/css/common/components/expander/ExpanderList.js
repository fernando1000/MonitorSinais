'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});

var _classCallCheck2 = require('babel-runtime/helpers/classCallCheck');

var _classCallCheck3 = _interopRequireDefault(_classCallCheck2);

var _createClass2 = require('babel-runtime/helpers/createClass');

var _createClass3 = _interopRequireDefault(_createClass2);

var _possibleConstructorReturn2 = require('babel-runtime/helpers/possibleConstructorReturn');

var _possibleConstructorReturn3 = _interopRequireDefault(_possibleConstructorReturn2);

var _inherits2 = require('babel-runtime/helpers/inherits');

var _inherits3 = _interopRequireDefault(_inherits2);

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _propTypes = require('prop-types');

var _propTypes2 = _interopRequireDefault(_propTypes);

var _reactBootstrap = require('react-bootstrap');

var _classnames = require('classnames');

var _classnames2 = _interopRequireDefault(_classnames);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var ExpanderList = function (_Component) {
    (0, _inherits3.default)(ExpanderList, _Component);

    /* istanbul ignore next */
    function ExpanderList() {
        var _ref;

        (0, _classCallCheck3.default)(this, ExpanderList);

        for (var _len = arguments.length, args = Array(_len), _key = 0; _key < _len; _key++) {
            args[_key] = arguments[_key];
        }

        var _this = (0, _possibleConstructorReturn3.default)(this, (_ref = ExpanderList.__proto__ || Object.getPrototypeOf(ExpanderList)).call.apply(_ref, [this].concat(args)));

        _this.state = {
            items: _this.parseItems(_this.props.items)
        };
        return _this;
    }

    (0, _createClass3.default)(ExpanderList, [{
        key: 'parseItems',
        value: function parseItems(items) {
            return items.map(function (item, index) {
                // Generate a unique id instead of using the index for the key as it will create
                // side effects when removing items from the list and re-render the ExpanderList.
                item.uid = index + '-' + Math.random();
                item.open = item.open || false;
                return item;
            });
        }
    }, {
        key: 'componentWillReceiveProps',
        value: function componentWillReceiveProps(nextProps) {
            // Only update the list when the amount of items is different
            if (nextProps.items.length !== this.state.items.length) {
                this.setState({
                    items: this.parseItems(nextProps.items)
                });
            }
        }
    }, {
        key: 'handleExpand',
        value: function handleExpand(itemToExpand) {
            // Toggle the open state for the selected item
            var result = this.state.items.find(function (item) {
                return item.uid === itemToExpand.uid;
            });
            result.open = !result.open;

            this.setState({
                items: this.state.items
            });
        }
    }, {
        key: 'getHeaderElement',
        value: function getHeaderElement(item) {
            var _this2 = this;

            var headerClassNames = (0, _classnames2.default)('expander-list-header', item.headerClassName && item.headerClassName);
            var iconClassNames = item.body && (0, _classnames2.default)('expander-icon', 'rioglyph', 'rioglyph-chevron-down');
            return _react2.default.createElement(
                'div',
                { className: headerClassNames,
                    onClick: function onClick() {
                        if (item.body) {
                            _this2.handleExpand(item);
                        }
                    } },
                _react2.default.createElement(
                    'span',
                    { className: 'expander-list-header-content' },
                    item.header
                ),
                _react2.default.createElement('span', { className: iconClassNames })
            );
        }
    }, {
        key: 'getBodyElement',
        value: function getBodyElement(item, isOpen, mountOnEnter, unmountOnExit) {
            if (!item.body) {
                return;
            }

            var bodyClassNames = (0, _classnames2.default)('expander-list-body', item.bodyClassName && item.bodyClassName);

            return _react2.default.createElement(
                _reactBootstrap.Collapse,
                { 'in': isOpen, mountOnEnter: mountOnEnter, unmountOnExit: unmountOnExit },
                _react2.default.createElement(
                    'div',
                    { className: 'expander-list-body-wrapper' },
                    _react2.default.createElement(
                        'div',
                        { className: bodyClassNames },
                        item.body
                    )
                )
            );
        }
    }, {
        key: 'getListItem',
        value: function getListItem(item) {
            var isOpen = item.open;
            var itemClassNames = (0, _classnames2.default)('list-group-item', item.className && '' + item.className, item.body && 'expandable', isOpen && 'open');

            return _react2.default.createElement(
                'li',
                { className: itemClassNames, key: item.uid },
                this.getHeaderElement(item),
                this.getBodyElement(item, isOpen, this.props.mountOnEnter, this.props.unmountOnExit)
            );
        }
    }, {
        key: 'render',
        value: function render() {
            var _this3 = this;

            var listClassNames = (0, _classnames2.default)('expander-list list-group', this.props.className);

            return _react2.default.createElement(
                'ul',
                { className: listClassNames },
                this.state.items.map(function (item) {
                    return _this3.getListItem(item);
                })
            );
        }
    }]);
    return ExpanderList;
}(_react.Component);

exports.default = ExpanderList;


ExpanderList.defaultProps = {
    items: [],
    mountOnEnter: true,
    unmountOnExit: true
};

ExpanderList.propTypes = {
    className: _propTypes2.default.string,
    items: _propTypes2.default.arrayOf(_propTypes2.default.shape({
        className: _propTypes2.default.string,
        headerClassName: _propTypes2.default.string,
        bodyClassName: _propTypes2.default.string,
        header: _propTypes2.default.node.isRequired,
        body: _propTypes2.default.node,
        open: _propTypes2.default.bool
    })).isRequired,
    mountOnEnter: _propTypes2.default.bool,
    unmountOnExit: _propTypes2.default.bool
};