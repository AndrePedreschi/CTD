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
    for(let j=0; j<x.length; j++){
        
        x[j] = x[j].push(y[j].pop().toUpperCase());     
    }
    return x
    
}
console.log(passagemDeElementos(filmes, filmesAnimacao));