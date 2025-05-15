// write a javascript function that return a passed String with letters in alphabetical orders..
// Input :-  apple   output :- aelpp
// Input:- aman output :- aamn

function sortString(str) {
  return str.split("").sort().join("");
}

console.log(sortString("apple")); // aelpp
console.log(sortString("sdfdsghfdshg")); // dddffgghhsss
console.log(sortString("rjfkgnfkgk")); // ffggjkkknr
