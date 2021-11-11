let lista = ["Achocolatado", "Leite", "Fermento", "Arroz", "Feijão", "Macarrão", "Molho", "Farofa", "Óleo", " Sabonete"];//Criei um Array
console.log(lista);

let strlista = lista.join("-"); //Junta o array em uma string
console.log(strlista);

let x = lista.pop();//Exclui o último item do array
console.log(lista);//Mostra o array sem o último item
console.log(x);//Mostra o item que saiu do Array

lista.push("Couve", "Milho", "Café");//Adiciona itens ao final do Array
console.log(lista);

let y = lista.shift();//exclui o primeiro item do array
console.log(y);// Retorna o primeiro item que foi excluído
console.log(lista);//Retorna a lista do Array sem o primeiro item

lista.unshift(y, "Whey");//Adiciona um ou mais itens no início do array
console.log(lista.unshift(y, "Whey"));//Adiciona um ou mais itens no início do array e mostra o número de itens que o Array tem
console.log(lista);

