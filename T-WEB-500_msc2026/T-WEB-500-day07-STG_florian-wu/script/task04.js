const bg = document.querySelector("select");
const span = document.querySelector("body");
const buttonMinus = document.querySelectorAll("button")[1];
const buttonPlus = document.querySelectorAll("button")[0];
var body = document.body;
currentFontSize = parseFloat(window.getComputedStyle(body, null).fontSize);

bg.addEventListener("change",chgColor);

function chgColor(){
    document.body.style.backgroundColor = bg.value ;
}


buttonPlus.addEventListener("click",Upfontsize);
function Upfontsize(){
    span.style.fontSize = ++currentFontSize + 'px';
}

buttonMinus.addEventListener("click",Downfontsize);
function Downfontsize(){
    span.style.fontSize = --currentFontSize + 'px';
}