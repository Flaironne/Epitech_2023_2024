export function fizzBuzz(num){

    let myString = "";
    if (num>=1){
        myString = myString.concat("1");
    }
    

    for(let i=2;i<num+1;i++){
        if(i%3==0 && i%5==0){
            myString = myString.concat(', ', "FizzBuzz");
        }
        else if(i%3==0){
            myString = myString.concat(', ', "Fizz");
        }
        else if(i%5==0){
            myString = myString.concat(', ', "Buzz");
        }
        else
            myString = myString.concat(', ', i.toString());
    }
    console.log(myString);
    return 0;
}
