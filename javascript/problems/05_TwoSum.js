// two Sum 

// brute force----
function twoSum(arr, target) {
    for (let i = 0; i < arr.length; i++) {
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[i] + arr[j] === target) {
                return [i, j];
            }
        }
    }

    return [-1, -1]
}

//Optimized 
function TwoSumOp(arr, target) {
    let obj = {} 

    for(let i = 0 ; i<arr.length ; i++){
        let current = arr[i] ; 
        let element = target - arr[i] ; 
 
        if(obj[element] !== undefined ){
            return [ obj[element]  , i ]
        }
         obj[current] = i ; 
    }
}


console.log(TwoSumOp([1, 2, 3, 4, 5], 9))