'use strict';

var num2words1 = {1: 'one', 2: 'two', 3: 'three', 4: 'four', 5: 'five',
            6: 'six', 7: 'seven', 8: 'eight', 9: 'nine', 10: 'ten',
            11: 'eleven', 12: 'twelve', 13: 'thirteen', 14: 'fourteen',
            15: 'fifteen', 16: 'sixteen', 17: 'seventeen', 18: 'eighteen', 19: 'nineteen'};
var num2words2 = ['twenty', 'thirty', 'forty', 'fifty', 'sixty', 'seventy', 'eighty', 'ninety'];

function main(params) {
    var num = Number(params['number']);
    return { 'inWords': number(num) };
}
function number(Number) {
    if (1 <= Number < 19) {
        return num2words1[Number];
    } else if (20 <= Number <= 99) {
        tens, below_ten = divmod(Number, 10);
        return num2words2[tens - 2] + '-' + num2words1[below_ten];
    } else {
        console.log('Number out of range');

    }
}

exports.handler = main;
