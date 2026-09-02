second largest number 

let secondLarge = function (numArr) {

    let max = -Infinity;
    let secMax = -Infinity;

    for (let num of numArr) {

        if (num > max) {
            secMax = max;
            max = num;
        } else if (num !== max && num > secMax) {
            secMax = num
        }


    }
    return secMax;
}

console.log(secondLarge([3, 33, 4, 23, 1, 33,44, 44]))

