const dados = require('./dados')


//Exercício 1 - a maior e a menor altura do grupo

function altura(x) {
    let alturaOrdem = x.sort(function (a, b) {
        if (a.altura > b.altura) {
            return 1;
        }
        if (a.altura < b.altura) {
            return -1;
        }
        return 0;
    });
    let indexFinal = x.length - 1;
    
    console.log("A menor altura é: "+alturaOrdem[0].altura);
    console.log("A maior altura é: "+alturaOrdem[indexFinal].altura);
}
//altura(dados);



//Exercício 2 - a média de altura das mulheres
function alturaMulher(x) {
    let mulher = x.filter(function (item) {
        return item.sexo=="F";
    })
    let media = mulher.reduce(function (acumulador, item) {
        return acumulador+parseFloat(item.altura)
        //return acumulador+Number(item.altura)
    },0)
    return (media/mulher.length).toFixed(3);
}
//console.log(alturaMulher(dados));



//Exercício 3 - o número de homens
function qtdHomens(x) {
    let homens = x.filter(function (item) {
        return item.sexo=="M";
    })
    console.log("Tem "+ homens.length +" homens.");
}
//qtdHomens(dados);
