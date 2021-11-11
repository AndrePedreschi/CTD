let nome = "    André Rabelo de Castro Pedreschi"
console.log(nome.length);

console.log(nome);
console.log(nome.trim());

nome=nome.trim();
console.log(nome.split(" "));

let lista = ["André","Rabelo","de","Castro","Pedreschi", 25, true];//Criei um Array
console.log(lista[4]);

lista[4] = "Novo";

lista.push("Teste", 15, 78);
console.log(lista);

let x = lista.pop();
console.log(lista);
console.log(x);

let y = lista.shift();
console.log(y);

lista.unshift(y, x, "outra coisa");
console.log(lista);

let strlista = lista.join("-");
console.log(strlista);

lista.push("André");
console.log(lista);
console.log(lista.lastIndexOf("André"));
console.log(lista.indexOf("André"));
console.log(lista.indexOf("Andreeee"));

console.log(lista.includes("André"));
console.log(lista.includes("Andresdwvr"));





