
let count = 0;
document.querySelector("footer>div").innerHTML = count;
document.querySelector("footer>div").addEventListener("click",write);
function write(){
    count += 1;
    document.querySelector("footer>div").innerHTML = count;
}
