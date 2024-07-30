// Write a javascript function to get the first element of the array passing a parameter n will return the first n element of the array.

function retrieve(arr, occ) {
  if (occ <= arr.length) {
    for (let i = 0; i <occ; i++) {
      console.log(arr[i]);
    }
  } else {
    console.log(occ + "Element is not present in this index");
  }
}

retrieve([1, 2, 3, 4, 5, 6], 4);
