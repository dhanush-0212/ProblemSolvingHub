/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    var x=n;
    next=0;
    return function() {

        return n++;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */