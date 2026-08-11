// second largest number 

let secondLarge = function(numArr){

    let max = -Infinity ;  
    let secMax = -Infinity ; 

    for(let num of numArr ){

        if(num > max){
            max = num ; 
            secMax = max ; 
        }


    }
    return secMax ; 
}

console.log(secondLarge([3,334,23,1,44]))