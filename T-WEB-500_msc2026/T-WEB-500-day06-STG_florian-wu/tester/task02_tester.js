import { arraysAreEqual } from"../task02.js";
const arrays = [
    [[[1, 2], [1, 4], false]],
    [[[2, 2], [2, 2], true]],
    [[[3, 4], [4, 4], false]],
    [[[4, 4], [4, 3], false]],
    [[[4, 4], [4, 4], true]],
    [[[5, 5], [5, 5], true]],
    [[[0, 0], [0, 0], true]],
    [[[2, 2], [2, 2], true]],
    [[[3, 3], [3, 3], true]],
    [[[1, 2], [1, 4], false]],
    [[[2, 2], [2, 2], true]],
    [[[3, 4], [4, 4], false]],
    [[[4, 4], [4, 3], false]],
    [[[4, 4], [4, 4], true]],
    [[[5, 5], [5, 5], true]],
]

for (const array of arrays) {
    console.log(`For ${array[0][0]} and ${array[0][1]} expected ${array[0][2]} and got ${arraysAreEqual(array[0][0], array[0][1])}`)
}