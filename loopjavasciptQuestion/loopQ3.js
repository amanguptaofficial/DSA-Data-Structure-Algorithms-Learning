// write a  function which is loop an array of objects and remove all objects which dont have gender value male

let arr = [
  { name: "Aman Gupta", age: 22, gender: "male" },
  { name: "Akash Gupta", age: 22, gender: "male" },
  { name: "Ankita thakur", age: 22, gender: "female" },
  { name: "Amit Gupta", age: 22, gender: "female" },
  { name: "Anita yadav", age: 22, gender: "female" },
];

// //first way
// for (let i = 0; i < arr.length; i++) {
//   if (arr[i].gender != "male") {
//     arr.splice(i, 1);
//   }
// }
// console.log(arr);

var count = 0;
arr.forEach((elem) => {
  if (elem.gender != "male") count++;
});
console.log(count);

for (let i = 0; i < count; i++) {
  for (let j = 0; j < arr.length; j++) {
    if (arr[j].gender !== "male") {
      arr.splice(j, 1);
    }
  }
}

console.log(arr);

// second way by creating a new Array
const newArr = arr.filter((elem) => elem.gender === "male");
console.log(newArr);
