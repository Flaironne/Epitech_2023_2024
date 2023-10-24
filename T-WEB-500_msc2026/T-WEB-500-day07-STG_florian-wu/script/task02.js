document.querySelector("footer>div").innerHTML = "What's your name ?";
document.querySelector("footer>div").addEventListener("click",write);
function write(){
    var name = prompt("What's your name ?");
    if (name != "" && name!= null){
        confirm("Are you sure that "+name+" is your name?");
        document.querySelector("footer>div").innerHTML = "Hello "+name+"!";
        window.alert("Hello "+name+"!");
    }
    
}