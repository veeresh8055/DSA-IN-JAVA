// reverse a string 

// brute-force using methods
function reverseString(str) {
    return str.split("").reverse().join("");
}


function reverseStr(str) {
    let newStr = "";

    for (let i = str.length - 1; i >= 0; i--) {
        newStr = newStr + str[i]  ; 
    }

    return newStr;
}
// reverseStr("Veeresh")
console.log(reverseStr("Veereshh"))




console.log(reverseString("Hello"))
