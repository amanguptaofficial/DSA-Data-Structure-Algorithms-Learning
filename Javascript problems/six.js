// Write a Javascript program which reverse a number...
// Input :-- 1234567
// output :-- 7654321
const num = 1234567;

function reverseNum(num) {
  let rev = 0;
  while (num > 0) {
    let rem = num % 10;
    rev = rev * 10 + rem;
    num = Math.floor(num / 10);
  }
  return rev;
}

console.log(reverseNum(num));
