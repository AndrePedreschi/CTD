/* const body = document.querySelector('body');
const h1 = document.querySelector('h1');
const item = document.querySelectorAll('.item');
const elemento = document.querySelectorAll("h2, p");



function alterar() {

    body.style.backgroundColor = 'rgb(39, 39, 39)';
    h1.style.backgroundColor = 'rgb(19, 19, 19)';
    h1.style.color = 'rgb(170, 170, 170)';
    h1.style.borderColor = "red";

    item.forEach(item=>{
        item.style.borderColor='black';
        item.style.backgroundColor='rgb(19, 19, 19)';
    })
   
    elemento.forEach(item => {
        item.style.color = 'rgb(230, 230, 230)';
    })


}; */


let body = document.querySelector('body')
let h1 = document.querySelector('h1');
let item = document.querySelectorAll('.item');
let elemento = document.querySelectorAll('p,h2');

function alterar() {
    body.classList.toggle('body');
    h1.classList.toggle('h1');

    item.forEach(item => {
        item.classList.toggle('itemMaluco');
    })

    elemento.forEach(item => {
        item.classList.toggle('elemento');
    })

};

