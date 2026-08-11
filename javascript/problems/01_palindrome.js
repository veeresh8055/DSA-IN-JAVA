let isPalindrome = function (x) {
    return x < 0 ? false : x === +x.toString().split("").reverse().join("");
}

let checkPalindrome = function (str) {
    let start = 0;
    let end = str.length - 1;

    while (start < end) {

        if (str[start] !== str[end]) {
            return false;
        }
        start++;
        end--;


    }

    return true;

}



console.log(isPalindrome(121))
console.log(isPalindrome(21))
console.log(checkPalindrome(11))
console.log(checkPalindrome("madam"))
