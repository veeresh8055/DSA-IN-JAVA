let isPalindrome = function (x){
    return x < 0 ? false : x === +x.toString().split("").reverse().join("");
}

console.log(isPalindrome(121))
console.log(isPalindrome(21))
console.log(isPalindrome(11))
console.log(isPalindrome(1))
