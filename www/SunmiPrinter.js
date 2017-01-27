var exec = require('cordova/exec');

exports.printTicket = function(messages, code, success, error) {
    exec(success, error, "SunmiPrinter", "printTicket", [messages, code]);
};

exports.printText = function(messages, success, error) {
    exec(success, error, "SunmiPrinter", "printText", [messages]);
};