function drawTriangle(context, point1, point2, point3, filled) {
    context.beginPath();
    context.moveTo(point1.x, point1.y);
    context.lineTo(point2.x, point2.y);
    context.lineTo(point3.x, point3.y);
    context.fillStyle = "white";
    context.closePath();
    filled ? context.fill() : context.stroke();
}

var MYcanvas = document.querySelector("canvas");
var context = MYcanvas.getContext('2d');

const point1 = {x: 6,  y: 6};
const point2 = {x: 14, y: 10};
const point3 = {x: 6, y: 14 };

drawTriangle(context, point1, point2, point3,true);

const Pause = document.querySelectorAll("button")[0];
const Stop = document.querySelectorAll("button")[1];
const Mute = document.querySelectorAll("button")[2];
const Play = document.querySelector("canvas");
const audio = new Audio("https://cdn.alexishenry.eu/shared/videos/music.mp3");

Pause.addEventListener("click",Pausethesong);
Stop.addEventListener("click",Stopthesong);
Mute.addEventListener("click",Mutethesong);
Play.addEventListener("click",Playthesong);

function Pausethesong(){  
    audio.pause();
}

function Stopthesong(){  
    audio.pause();
    audio.currentTime = 0;
}

function Mutethesong(){  
    audio.muted = !audio.muted;
}

function Playthesong(){ 
    audio.play();
}