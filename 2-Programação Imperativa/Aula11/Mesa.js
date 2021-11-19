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

//Bonus

const partA = [5,8,4,9,5];
const partB = [8,7,8,6,8];
const partC = [7,5,10,8,3];

function pontuacaoMedia(a){
    let media = 0;
    for(let cont=0; cont<a.length; cont++){
        media=media+a[cont];
    }
    media = media/a.length;
    return media
}
//console.log(pontuacaoMedia(partA));

function pontuacaoMaior(b){
    let maior = 0;
    for(let conta=0; conta<b.length; conta++){
        if (b[conta]>maior) {
            maior = b[conta];
        }
    }
    return maior

}
//console.log(pontuacaoMaior(partA));

function competicao(part1,part2,part3){
    let result=[];

    for(let g=0; g<3; g++){
        if (g==0) {  
            result[g] = ((2*pontuacaoMedia(part1))+pontuacaoMaior(part1))/3;
        }else if(g==1){
            result[g] = ((2*pontuacaoMedia(part2))+pontuacaoMaior(part2))/3;
        }else{
            result[g] = ((2*pontuacaoMedia(part3))+pontuacaoMaior(part3))/3;
        }      
    }
    
    if (result[0]>result[1] && result[0]>result[2]) {
        console.log("O Participante 1 é o vencedor!");
    }else if (result[1]>result[0] && result[1]>result[2]) {
        console.log("O Participante 2 é o vencedor!");
    }else{
        console.log("O Participante 3 é o vencedor!");
    }
    console.log("Pontuação do participante 1: "+result[0]);
    console.log("Pontuação do participante 2: "+result[1]);
    console.log("Pontuação do participante 3: "+result[2]);
}

console.log(competicao(partA,partB,partC));


