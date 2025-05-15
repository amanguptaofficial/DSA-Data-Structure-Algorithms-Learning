//Write a program to check Wheater a passed String is palindrome or not.....
// example : lol  outout true ,,,,  example:2- abcba output :true ,,,,  example:3- aman output := false

let str = "LOL";

function checkPalindrome(str) {
  const reverseString = str.split("").reverse().join("");
  return str === reverseString;
}

console.log(checkPalindrome(str)); // true

console.log(checkPalindrome("abcba")); //true
console.log(checkPalindrome("aman")); // false
