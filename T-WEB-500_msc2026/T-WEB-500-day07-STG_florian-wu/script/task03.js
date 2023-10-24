document.addEventListener("keydown",thefunction);
var myVar = ""

function thefunction(event){
    myVar += event.key;
    if(myVar.length<42){
        document.querySelector("footer>div").innerHTML += event.key;   
    }
    else{
        myVar = myVar.substring(1);
        document.querySelector("footer>div").innerHTML = myVar;
    }
}