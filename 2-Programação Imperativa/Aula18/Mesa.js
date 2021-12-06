//1 - Loop de Pares
// Você deve criar uma função chamada loopDePares que receba um número como parâmetro e faça loops de 0 a 100 mostrando cada número do loop no console.
// Caso o número da iteração somado com o número passado pelo parâmetro seja par, aparecerá no console: "O número x é par"

function loopDePares(x) {
    for (let i = 0; i <= 100; i++) {
        if ((x + i) % 2 == 0) {
            console.log("O número " + (x + i) + " é par");
        }
    }
}
//

//2 - Loop ímpares com palavra
// Você deve criar uma função chamada loopDeImpares que receba um número e uma palavra como parâmetro e faça loops de 0 a 100 mostrando cada número do loop no console.
// Agora, modifique o código para que, caso esse número somado com o número passado por parâmetro seja ímpar, mostre a palavra passada por parâmetro no console.
function loopDePares(x, y) {
    for (let i = 0; i <= 100; i++) {

        if ((x + i) % 2 != 0) {
            console.log((x + i) + ' ' + y);
        }
    }
}
//console.log(loopDePares(2, 'Péricles'));




//3 - Soma
// 	Você deve criar uma função chamada soma que receba um número como parâmetro e retorne a soma de todos os seus números anteriores, incluindo o número recebido por parâmetro.
// Exemplo: 
// soma(3) deve retornar 6 pois faz (1 +2 +3)
// soma(8) deve retornar 36

function soma(x) {
    let y = 0;
    for (let i = x; i > 0; i--) {
        y = y + i;
    }
    return y;
}
//console.log(soma(4));



//4 - Novo Array
// Você deve criar uma função chamada newArray que receba um número como parâmetro e retorne um novo array com a quantidade de elementos equivalente ao valor do número que você passou por parâmetro.
// Exemplo: 
// newArray(5) deve retornar [1,2,3,4,5]
// newArray(10) deve retornar [1,2,3,4,5,6,7,8,9,10]

function newArray(num) {
    let newArray = [];
    for (let i = 1; i <= num; i++) {
        newArray.push(i);
    }
    return newArray;
}
//console.log(newArray(16));



//5 - String.split()
// Você deve criar uma função chamada split que receba uma string e simule o comportamento da função split original. Se você não sabe como funciona, o Google pode ajudá-lo.
// Importante: Você não pode usar o String.split()
// Exemplo: 
// split(“olá”) deve retornar [”o”,”l”,”á”]
// split(“tchau”) deve retornar [“t”,“c”,”h”,”a”,”u”]

function split(x) {
    let array = [];
    for (let i = 0; i < x.length; i++) {
        array.push(x[i]);
    }
    return array;
}
//console.log(split("ola"));





//6 - Mover os zeros para o final
// Você deve criar uma função chamada moverZeros que receba um array como parâmetro e retorne outro com os números 0 ordenados ao final.

// Exemplo: 
// moverZeros([false,1,0,1,2,0,1,3,"a"]) deve retornar [false,1,1,2,1,3,"a",0,0]
// moverZeros([1,2,0,1,0,1,0,3,0,1]) deve retornar [1,2,1,1,3,1,0,0,0,0]

function moverZeros(x) {
    let arrayZero = [];
    let arrayNovo = [];
    let arrayFinal = [];
    for (let i = 0; i < x.length; i++) {
        if (x[i] == 0) {
            arrayZero.push(x[i]);
        } else {
            arrayNovo.push(x[i]);
        }
    }
    return arrayFinal = [...arrayNovo, ...arrayZero];
}

//console.log(moverZeros([false,1,0,1,2,0,1,3,"a"]));

function moverZeros(x) {
    let arrayZero = x.filter(item => {
        return item === 0;
    })
    let arrayNovo = x.filter(item => {
        return item !== 0;
    })
    let arrayFinal = [...arrayNovo, ...arrayZero]
    return arrayFinal;
}

//console.log(moverZeros([false,1,0,1,2,0,1,3,"a"]));





//7 - Lidando com dois arrays
// Você deve criar uma função chamada arrayHandler que receba dois arrays de igual tamanho como parâmetros e exiba no console: "Eu sou {elemento do array 1} e eu sou {elemento do array 2}".
// Exemplo:
// arrayHandler([1,2,3], [“o”,”l”,”á”]) deve mostrar: 
// 		Eu sou 1 e eu sou o
// Eu sou 2 e eu sou l
// Eu sou 3 e eu sou á

function arrayHandler(x, y) {
    for (let i = 0; i < x.length; i++) {
        console.log("Eu sou " + x[i] + " e eu sou " + y[i]);
    }
}
//arrayHandler([1,2,3], ['o','l','á']);





//8 - Arrays de objetos
// Você deve criar uma função chamada arrayObjects que receba um número como parâmetro e retorne um array de objetos que tem uma propriedade chamada valor que contém o valor do número e seus anteriores.
// Exemplo:
// arrayObjects(5) deve retornar [{valor: 1}, {valor: 2}, {valor: 3}, {valor: 4}, {valor: 5}]
// arrayObjects(3) deve retornar [{valor: 1}, {valor: 2}, {valor: 3}]


function arrayObjects(x) {
    let arrayObj = [];
    for (let i = 1; i <= x; i++) {
        arrayObj.push('{valor: '+i+'}');
        
    }
    return arrayObj;
}

//console.log(arrayObjects(5));



//9 - Arrays de objetos 2
// Você deve criar uma função chamada arrayObjectsTwo que recebe um número e uma palavra como parâmetro e retorna um array de objetos que possui: uma propriedade nomeada pela palavra passada por parâmetro e o valor dessa propriedade deve ser o número passado por parâmetro e seus anteriores.

// Exemplo:
// arrayObjectsTwo(5, “olá”) deve retornar [{olá: 1}, {olá: 2}, {olá: 3}, {olá: 4}, {olá: 5 }]
// arrayObjectsTwo(3, “tchau”) deve retornar [{tchau: 1}, {tchau: 2}, {tchau: 3}]

function arrayObjectsTwo(x,y) {
    let arrayObj = [];
    for (let i = 1; i <= x; i++) {
        arrayObj.push('{'+y+': '+i+'}');
        
    }
    return arrayObj;
}

//console.log(arrayObjectsTwo(9,"tchau"));