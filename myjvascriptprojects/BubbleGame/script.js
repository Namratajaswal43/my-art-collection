function makeBubble(){ 
var clutter ="";

for (var i=1;i<=168;i++) {
  var rn = Math.floor(Math.random()*10)
  clutter =`<div class="bubble">${rn}</div>`;
    
}
document.querySelector("#pbottom").innerHTML =clutter;
}
var timer=
0;
function runTimer(){
  var timerint = setInterval(function(){
    if (timer>0) {
      timer--;
    document.querySelector("#timervalue").textContent=timer;
    }
    else{
      clearInterval(timerint);
    }
    
  },1000);
}
makeBubble();