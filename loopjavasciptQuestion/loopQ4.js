// Write a javascript function to clone an array...

function cloneArray(arr) {
  //   return [...arr];      // first way
  return Array.from(arr); // second way
}

console.log(cloneArray([1, 2, 3, 4, 5, 6]));
