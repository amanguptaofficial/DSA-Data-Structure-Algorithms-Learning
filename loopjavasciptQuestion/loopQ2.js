// write a function which find in an array of number and Strings only add those numbers which are not string..

let arr = [123, "aman", 231, "akash"];

// first way:---
let sum = 0;
for (let i = 0; i < arr.length; i++) {
  if (typeof arr[i] === "number") {
    sum = sum + arr[i];
  }
}
console.log(sum);

// second way:---

function sumOfNumber(arr) {
  const newArr = arr.filter((data) => {
    return typeof data === "number";
  });
  const sum = newArr.reduce((accumlator, currentValue) => {
    return accumlator + currentValue;
  }, 0);

  console.log(sum);
}

sumOfNumber(arr);
