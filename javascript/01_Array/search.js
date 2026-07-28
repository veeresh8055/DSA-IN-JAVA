// search an element in an array 
// two ways to search 
// 1..linear seac 
// 2. Binary search 

// 1. linear search 

let arr = [1,2,3,4,5,6]

let target = 3 

 let searchElement = (target , array)=>{
         for(let el of array  ){
            if(target === el ){
                console.log("element found ")
                return ; 
            }
         }
 }

// console.log(searchElement(target , arr ))


// 2. Binary Search 

function binarySearch(arr, target) {
  let left = 0;
  let right = arr.length - 1;

  while (left <= right) {
    // Find the middle index (prevents potential overflow)
    let mid = Math.floor(left + (right - left) / 2);

    if (arr[mid] === target) {
      return mid; // Target found, return its index
    }
    
    if (arr[mid] < target) {
      left = mid + 1; // Discard left half, look in the right half
    } else {
      right = mid - 1; // Discard right half, look in the left half
    }
  }

  return -1; // Target does not exist in the array
}

console.log(binarySearch( arr , target  ))