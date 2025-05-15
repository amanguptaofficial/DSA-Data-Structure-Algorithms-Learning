// Input :-  Hello Aman Kaise ho 
// output:- olleH namA esiaK oh
function reverse(str){ 
 const reverse = str.split(" ").map((word)=>{
   return word.split("").reverse().join("");
  }).join(" "); 

 console.log(reverse); 
}

reverse("Hello Aman Kaise ho")