let history = ["google.com"];

let current = 0;

update();

function visitPage(){

let url = document.getElementById("url").value;

if(url==="") return;

history = history.slice(0,current+1);

history.push(url);

current++;

update();

}

function goBack(){

if(current>0)

current--;

update();

}

function goForward(){

if(current<history.length-1)

current++;

update();

}

function update(){

document.getElementById("currentPage").innerHTML=history[current];

let list=document.getElementById("history");

list.innerHTML="";

history.forEach((item)=>{

list.innerHTML+=`<li>${item}</li>`;

});

}
