//Arrays e Coleções

//let lista = ["Achocolatado", "Leite", "Fermento", "Arroz"];

//A - Acessar elementos específicos de um array.
////console.log(lista[0]);
//console.log(lista[1]);
//console.log(lista[2]);
//console.log(lista[3]);

//B - Modificar cada um dos elementos de um array e imprimi-los no console.
//lista[0] = 1
//lista[1] = 2
//lista[2] = 3
//lista[3] = 4
//console.log(lista[0]);
//console.log(lista[1]);
//console.log(lista[2]);
//console.log(lista[3]);

//C - Adicionar elementos a um array.
//lista.push("Arroz");
//console.log(lista);

//D - Extrair elementos de um array.
//let x = lista.pop();
//console.log(lista);

//E - Comparar elementos de um array com os elementos de outro. 
//let lista2 = ["4", "Leite", "Fermento", "Arroz"];
//console.log(lista[2] == lista2[2]);
//console.log(lista[3] == lista2[0]);



//O que esses códigos retornam?

//1 - Undefined
//let numbers =[22, 33, 54, 66, 72];
//console.log(numbers[numbers.length]);

//2 - Spirderman
//let grupoDeAmigos = [ ["Harry", "Ron", "Hermione"], ["Spiderman", "Hulk", "Ironman"], ["Penélope Glamour", "Pierre Nodoyuna","Patán"] ];
//console.log(grupoDeAmigos[1][0]);

//3 - uma string qualquer(6-1=5, 6=0,1,2,3,4,5 - último elemento é o 5)
//let str = "uma string qualquer";
//let grupoDeAmigos = [ [45, 89, 0], ["Digital", "House", true], ["string", "123","false", 54, true, str] ];
//console.log(grupoDeAmigos[2][grupoDeAmigos[2].length - 1]);


//Array Invertido


function imprimirInverso (verso){
    return verso[0].split('').reverse().join('')
     
}
//console.log(imprimirInverso (["OUFF11 é um fundo imobiliário do tipo papel FOF – Fundo de fundos."]));

function arrayInverso (aInver){
    return aInver.reverse()
}
//console.log(arrayInverso(["Eu", "gosto", "de", "siriguela"]));


//Somar Array()

function somarArray(x){
   //let soma = (num1, num2) => num1 + num2;
   //return x.reduce(soma)
   return x.reduce ((num1, num2) => num1 + num2)
}
//console.log(somarArray([0,1,2,-5]));


//Simulação Array.join()

function join(arrayString){
    return arrayString.toString().replace(/,/g, " ")
}
//console.log(join(["o", "mar", "está", "calmo"]))


function join(arrayString){
    return arrayString.toString().replace(/,/g, "")
}
//console.log(join(["c","a","l","m","o"]))


//Coleções de Filmes (e mais…)

//1.Criar a estrutura apropriada para armazenar os seguintes filmes e séries:
let filmes = ["star wars", "matrix",  "mr. robot", "o preço do amanhã",  "a vida é bela"];

//console.log(filmes);


//2.Os filmes devem estar todos em letras maiúsculas. Para isso, crie uma função que recebe um array por parâmetro e converta o conteúdo de cada elemento em letras maiúsculas.
function uper (upper){
    return upper.toString().toUpperCase().split(",")
}
//console.log(uper(filmes));


//3.Crie outra estrutura semelhante à primeira, mas com os seguintes filmes de animação:
//"Toy Story", "Procurando Nemo", "Kung-fu Panda", "Wally", "Fortnite"
//Em seguida, crie uma função que receba dois arrays como parâmetros, para poder adicionar os elementos contidos no segundo array, dentro do primeiro, a fim de retornar um único array com todos os filmes como seus elementos.
let filmesAnimacao = ["Toy Story", "Procurando Nemo", "Kung-fu Panda", "Wally", "Fortnite"];

function listaFilmes (lista1, lista2){
    return lista1.concat(lista2)
}
//console.log(listaFilmes(filmes, filmesAnimacao));
//4.Durante o processo, percebemos que o último elemento na série de filmes animados é, na verdade, um game. Agora devemos editar nosso código e modificá-lo para que possamos remover o último elemento antes de migrar o conteúdo para o array que contém todos os filmes.
//PS: por precaução, salve o elemento que você vai deletar em uma variável.
function listaFilme (lista1, lista2){
    lista2.pop()
    return lista1.concat(lista2)
}
//console.log(listaFilme(filmes, filmesAnimacao));


//5.Finalmente, recebemos dois arrays com classificações feitas por diferentes usuários do mundo nos filmes com o seguinte formato:
const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];

//Crie uma função que compare as notas e nos diga se elas são iguais ou diferentes.
//Para verificar se tudo está bem até agora, recomendamos testar cada uma das funções, a fim de verificar seu correto funcionamento.
//Se chegarmos a este ponto e tudo estiver bem, o tech leader da equipe deve estar extremamente feliz com nosso trabalho e desempenho.

function compAsiaeuro (array1, array2){
    let resultado = [];
    resultado[0] = array1[0] === array2[0];
    resultado[1] = array1[1] === array2[1];
    resultado[2] = array1[2] === array2[2];
    resultado[3] = array1[3] === array2[3];
    resultado[4] = array1[4] === array2[4];
    resultado[5] = array1[5] === array2[5];
    resultado[6] = array1[6] === array2[6];
    resultado[7] = array1[7] === array2[7];
    resultado[8] = array1[8] === array2[8];
    return resultado
}
//console.log(compAsiaeuro(asiaScores,euroScores));





