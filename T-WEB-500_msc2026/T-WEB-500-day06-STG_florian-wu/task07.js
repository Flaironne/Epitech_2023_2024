export function  arrayFiltering(array, test){
    var newArray = [];    
    for(let i=0;i<array.length;i++){
        if(test(array[i])){
            newArray.push(array[i]);
        }
    }
    return newArray;
}

// export const arrayFiltering = (array, test) => array.filter(item => test(item));
