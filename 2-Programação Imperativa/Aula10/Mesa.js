//Arrays e Coleções

let lista = ["Achocolatado", "Leite", "Fermento", "Arroz"];

//A - Acessar elementos específicos de um array.
console.log(lista[0]);
console.log(lista[1]);
console.log(lista[2]);
console.log(lista[3]);

//B - Modificar cada um dos elementos de um array e imprimi-los no console.
lista[0] = 1
lista[1] = 2
lista[2] = 3
lista[3] = 4
console.log(lista[0]);
console.log(lista[1]);
console.log(lista[2]);
console.log(lista[3]);

//C - Adicionar elementos a um array.
lista.push("Arroz");
console.log(lista);

//D - Extrair elementos de um array.
let x = lista.pop();
console.log(lista);

//E - Comparar elementos de um array com os elementos de outro. 
let lista2 = ["4", "Leite", "Fermento", "Arroz"];
console.log(lista[2] == lista2[2]);
console.log(lista[3] == lista2[0]);



//O que esses códigos retornam?

