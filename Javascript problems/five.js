// make a duplicate array....
// Input =[1,2,3,4,5]
// output = [1,2,3,4,5,1,2,3,4,5];

let arr = [1, 2, 3, 4, 5];

// we can do this by using many ways

//first way :-- by using concat method

const duplicateArr = arr.concat(arr);
console.log(duplicateArr);
/**Output
[
  1, 2, 3, 4, 5,
  1, 2, 3, 4, 5
]*/

//second way :-  by using spread operator...

const newArr = [...arr, ...arr];
console.log(newArr);


