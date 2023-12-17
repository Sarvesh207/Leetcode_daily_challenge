/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let count = init;

    let increment = function () {
        return ++count
    }

    let decrement = function () {
        return --count;
    }

    let reset = function () {
        return (count = init);
    }

    return {increment, decrement, reset};
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */