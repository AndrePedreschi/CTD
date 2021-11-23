const alicia = [23, 69, 32];
const bob = [12, 67, 43];



function encontraGanhador(a, b) {
    let pontosPrimeiroParticipante = 0;
    let pontosSegundoParticipante = 0;

    for (let i = 0; i < a.length; i++) {
        if (a[i] > b[i]) {
            pontosPrimeiroParticipante++;
        } else if (b[i] > a[i]) {
            pontosSegundoParticipante++;
        }

    }
    console.log(pontosPrimeiroParticipante);
    console.log(pontosSegundoParticipante);

    if (pontosPrimeiroParticipante > pontosSegundoParticipante) {
        return "Alicia"
    } else {
        return "Bob"
    }

}
//console.log("O vencedor é: "+ encontraGanhador(alicia,bob));


function digitalHouse(num1, num2) {

    for (let j = 1; j <= 100; j++) {
        if (j % num1 == 0 & j % num2 == 0) {
            console.log("O número " + j + " é Digital House")
        } else if (j % num1 == 0) {
            console.log("O número " + j + " é Digital");
        } else if (j % num2 == 0) {
            console.log("O número " + j + " é House");
        }

    }

}
//console.log(digitalHouse(1,7));


function somaArray(arrayX){
    let soma=0;
for(let c=0; c<arrayX.length; c++){
    soma=soma+arrayX[c];
}
return soma
}

//console.log(somaArray([-5,100]));



function join(arrayJ){
        let soma="";
    for(let c=0; c<arrayJ.length; c++){
       soma=soma+arrayJ[c];
    }
    return soma
}
console.log(join(["o","l","a"]));