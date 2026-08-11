
// looping 
let largestNum = function(numArr){

    let max = numArr[0] ; 

    for(let num of numArr ){
        if(num > max){
            max = num ;
        }
    }
    return max ; 
}


// array methods 
let largestNumber = function(arr ){
    return arr.sort((a,b)=>b-a)[0];
}

console.log(largestNum([1,2,3,4,5,121,3,55,23,4]))
console.log(largestNumber([3,2,44,5,1]))