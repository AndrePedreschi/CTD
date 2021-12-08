const dados = require('./dados');

//Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e a sua opinião em relação ao filme: ótimo - 3, bom - 2, regular -1.
//Faça um programa que receba a idade e a opinião de 15 espectadores, calcule e imprima:


//1 - a média das idades das pessoas que responderam ótimo;


function mediaOtimo(x) {
    let otimo = x.filter(function (item) {
        return item.opniao==3;
    })
    
    let media = otimo.reduce(function (acumulador, item) {
        return acumulador+parseFloat(item.idade);
        //return acumulador+Number(item.idade)
    },0)
   
    return (media/otimo.length).toFixed(3);
}
//console.log(mediaOtimo(dados));

//2 - a quantidade de pessoas que responderam regular;
function qtdRegular(x) {
    let regular = x.filter(function (item) {
        return item.opniao==2;
    })
    console.log(regular.length +" é quantidade de pessoas que responderam regular");
}
//qtdRegular(dados);


//3 - a porcentagem de pessoas que responderam bom entre todos os espectadores analisados.
function porctBom(x) {
    let bom=x.filter((item)=>{return item.opniao==2});
    return ((bom.length/x.length)*100)+"% das pessoas responderam Bom na opnião";
}
console.log(porctBom(dados));