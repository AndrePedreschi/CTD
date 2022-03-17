function abre(){
    document.getElementById('popup').style.display = 'block';
}
function fecha(){
    document.getElementById('popup').style.display = 'none';
}
document.getElementById('popup1').addEventListener("mouseover",abre);
document.querySelector('#popup1').addEventListener("mouseout",fecha);

