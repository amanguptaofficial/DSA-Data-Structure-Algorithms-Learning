// write a javascript function that accepts a string as a parameter and,
//  convert a first letter of each word of the string in upper case.

//Input a ="hello aman kaise ho" output :- Hello Aman Kaise Ho

function convertFirstLetterCapital(str) {
  let captilizedWords = str.split(" ").map((word) => {
    return word.charAt(0).toUpperCase() + word.slice(1); // we can use slice() and substring() anything
  });
  return captilizedWords.join(" ");
}

console.log(convertFirstLetterCapital("hello aman kaise ho"));
