let texto = document.querySelector("h1");
console.log(texto);

let paragrafo2=document.querySelectorAll(".paragrafo")[1];
console.log(paragrafo2);

const template = '<h1>Olá Mundo</h1>';
const body=document.getElementById('body');

body.innerHTML+=template;
body.innerText+=template;