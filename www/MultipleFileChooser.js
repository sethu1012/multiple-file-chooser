var exec = require('cordova/exec');

module.exports.add = function (arg0, success, error) {
    exec(success, error, 'MultipleFileChooser', 'add', [arg0])
};