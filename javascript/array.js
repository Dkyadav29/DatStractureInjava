// Access elements using the .at() method (ES2022 feature)
let age = [34, 54, 65, 6, 76, 3434, 6565, 56];

let findAge = age.at(4);  // Gets element at index 4 (5th element)
console.log(findAge);     // Output: 76

// You can also access elements using array[index]
let ageByIndex = age[3];  // Gets element at index 3 (4th element)
console.log("Age by index number:", ageByIndex);  // Output: 6


// Empty the array by setting its length to 0
// age.length = 0;
// console.log("Array after emptying:", age);


// Array methods: push, pop, shift, unshift

// push(...) adds items to the end of the array
age.push(23, 43, 434, 543, 43);
console.log("Array after push:", age);

// pop() removes the last item and returns it
let popMethod = age.pop();
console.log("Popped item:", popMethod);
console.log("Array after pop:", age);


// splice(start, deleteCount) removes elements and returns removed items
let spliceMethod = age.splice(1, 2);  // Remove 2 elements starting from index 1
console.log("Spliced items:", spliceMethod);
console.log("Array after splice:", age);


// slice() returns a shallow copy of the array or part of it without modifying original array
let sliceMethod = age.slice();
console.log("Slice (copy of array):", sliceMethod);

let sliceMethodWithIndex = age.slice(1, 4);  // Extracts elements from index 1 up to (not including) 2
console.log("Slice with index range:", sliceMethodWithIndex);



// concate


let concateOperation = [1,3,5,6,7,8,3,5]

let addNumber = concateOperation.concat(10,20,30);

console.log("concate method add item end of array ", addNumber)