import {objectsDeeplyEqual} from "../task06.js";

const obj = {here: {is: "null"}, object: 2};
// console.log(objectsDeeplyEqual(obj, obj));
// console.log(objectsDeeplyEqual(obj, {here: 1, object: 2}));
// console.log(objectsDeeplyEqual(obj, {here: {is: "an"}, object: 2}));
// console.log(objectsDeeplyEqual(5,5));
// console.log(objectsDeeplyEqual("tes","tes"));
// console.log(objectsDeeplyEqual("tes",null));
// console.log(objectsDeeplyEqual("tes","tes"));

const a = null
console.log(objectsDeeplyEqual(a,null));