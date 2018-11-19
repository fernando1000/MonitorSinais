'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.RIOAutoSuggest = undefined;

var _extends2 = require('babel-runtime/helpers/extends');

var _extends3 = _interopRequireDefault(_extends2);

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _reactAutosuggest = require('react-autosuggest');

var _reactAutosuggest2 = _interopRequireDefault(_reactAutosuggest);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var RIOAutoSuggest = exports.RIOAutoSuggest = function RIOAutoSuggest(props) {
    return _react2.default.createElement(_reactAutosuggest2.default, (0, _extends3.default)({
        theme: {
            container: 'AutoSuggest',
            containerOpen: 'open',
            suggestionsList: 'dropdown-menu',
            suggestionsContainer: 'dropdown',
            suggestionsContainerOpen: 'open', // to replicate bootstrap
            suggestionHighlighted: 'highlighted'
        }
    }, props));
};

RIOAutoSuggest.defaultProps = {
    renderSuggestion: function renderSuggestion(suggestion) {
        return _react2.default.createElement(
            'a',
            { role: 'button' },
            suggestion.label
        );
    },
    getSuggestionValue: function getSuggestionValue(suggestion) {
        return suggestion.label;
    },
    shouldRenderSuggestions: function shouldRenderSuggestions() {
        return true;
    }
};

exports.default = RIOAutoSuggest;