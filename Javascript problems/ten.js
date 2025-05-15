// Write a javascript function to get the number of occurrence of each letter in specified String...
// example: apple ---- a-1,p-2,l-1,e-1

function countOccurence(str) {
  let obj = {};
  for (let i = 0; i < str.length; i++) {
    if (!obj.hasOwnProperty(str.charAt(i))) {
      obj[str.charAt(i)] = 1;
    } else {
      obj[str.charAt(i)] = obj[str.charAt(i)] + 1;
    }
  }
  return obj;
}

console.log(countOccurence("aakash")); // { a: 3, k: 1, s: 1, h: 1 }
console.log(countOccurence("aman")); // { a: 2, m: 1, n: 1 }
console.log(countOccurence("apple")); // { a: 1, p: 2, l: 1, e: 1 }
