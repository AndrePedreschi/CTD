let filmes = ["star wars", "matrix",  "mr. robot", "o preço do amanhã",  "a vida é bela"];
let filmesAnimacao = ["Toy Story", "Procurando Nemo", "Kung-fu Panda", "Wally", "Fortnite"];

//1.
function uper (upper){
    for(let i=0; i<upper.length; i++){
        upper[i] = upper[i].toUpperCase();        
    }
    return upper;
}
//console.log(uper(filmes));

//2.
function passagemDeElementos (x, y){
    const qtd = x.length;
    for(let j=0; j<qtd; j++){
        x.push(y.pop().toUpperCase());     
    }
    return x
    
}
//console.log(passagemDeElementos(filmes, filmesAnimacao));


//3.
function passagemDeElementos2 (x, y){
    let invalido = y.pop();
    const qtd = y.length;
    console.log("esse filme é invalido ",invalido);
    for(let j=0; j<qtd; j++){
        x.push(y.pop().toUpperCase());     
    }
    return x
    
}
//console.log(passagemDeElementos2(filmes, filmesAnimacao));


//4.
//Crie uma função que compare as notas e nos diga se elas são iguais ou diferentes.
//Para verificar se tudo está bem até agora, recomendamos testar cada uma das funções, a fim de verificar seu correto funcionamento.
//Se chegarmos a este ponto e tudo estiver bem, o tech leader da equipe deve estar extremamente feliz com nosso trabalho e desempenho.
const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];

function compararQualificacoes (a,b){
    let compararAsiaEuro = [];
    for(let cont=0; cont<asiaScores.length; cont++){
        compararAsiaEuro[cont] = a[cont] === b[cont];
    }
    return compararAsiaEuro
}

//console.log(compararQualificacoes(asiaScores, euroScores));


