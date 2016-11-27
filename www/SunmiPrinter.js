var exec = require('cordova/exec');

exports.printTicket = function(messages, code, success, error) {
    exec(success, error, "SunmiPrinter", "printTicket", [messages, code]);
};
