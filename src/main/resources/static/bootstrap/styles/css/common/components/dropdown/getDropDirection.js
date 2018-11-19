'use strict';

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.default = getDropDirection;
function getDropDirection(event) {
    if (!event) {
        return {};
    }

    var menu = event.currentTarget.parentElement.querySelector('.dropdown-menu');
    var button = event.currentTarget;
    var pageX = event.pageX;
    var pageY = event.pageY;

    var buttonHeight = button.offsetHeight;

    // menu has its height and width already when closed because visibility is collapse
    var menuWidth = menu.offsetWidth;
    var menuHeight = menu.offsetHeight;

    var spaceUp = pageY - buttonHeight - menuHeight - window.pageYOffset;
    var spaceDown = window.innerHeight - (pageY + menuHeight + buttonHeight);

    var spaceLeft = pageX - menuWidth - window.pageXOffset;
    var spaceRight = window.innerWidth - (pageX + menuWidth);

    var dropup = spaceDown < 0 && (spaceUp >= 0 || spaceUp > spaceDown);
    var pullRight = spaceRight < 0 && (spaceLeft >= 0 || spaceLeft > spaceRight);

    return {
        dropup: dropup,
        pullRight: pullRight
    };
}