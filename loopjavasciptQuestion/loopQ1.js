// loop an array and add all members of it

let arr = [1, 2, 3, 4, 5, 6, 7, 8]; //add all the number of array

// first way
const sum = arr.reduce((accumelater, currentval) => {
  return (accumelater = accumelater + currentval);
}, 0);
console.log(sum);

//second way
let add = 0;
for (let i = 0; i < arr.length; i++) {
  add = add + arr[i];
}
console.log(add);