// How would you check if a number is a Integer..

//we have two ways to check it is a integer or not...

//first way by using isInteger() function
let a = 10;
let b = 20.2;
console.log(Number.isInteger(a)); // true
console.log(Number.isInteger(b)); // false

// second way-- by reminder
function findInteger(num) {
  return num % 1 === 0;
}

console.log(findInteger(a)); // true
console.log(findInteger(b)); // false
