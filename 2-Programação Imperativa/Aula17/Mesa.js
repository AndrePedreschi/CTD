//Mesa

//1

let numEx1=[1,2,3,4];
function ex1(num) {
    let reduzir= num.reduce(function (acumulador, item) {
        return acumulador+item;    
    });

    let conta = num.map(function (item) {
        return item/reduzir;
    });
    
    console.log(conta);
}
//console.log(ex1([1,2,3,4]));
//ex1([1,2,3,4]);
//console.log(ex1(numEx1));


//console.log(reduzir);
//console.log(conta);

//2
let palavras =["borracha", "caneta", "lápiz"]
let numero = 5;

function arrayPalavras(a,b) {
    let ex2 = a.filter(function (item) {
        return item.length>b;
    });
console.log(ex2);
}

//arrayPalavras(palavras,numero);




//3 Crie um array de objetos literais, onde cada objeto será um aluno e terá dois atributos: nome e nota. Crie duas funções que ordenam o array: uma ordenará os alunos em ordem alfabética e a outra o fará por nota, da mais alta para a mais baixa. (Analise qual método seria apropriado para este caso. Recomendamos que você consulte a documentação do MDN: https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Array)

var alunos = [
    { nome: 'André', nota: 7 },
    { nome: 'Marcela', nota: 5 },
    { nome: 'Kleber', nota: 1 }, //Precisa estudar mais
    { nome: 'Wellington', nota: 3 },
    { nome: 'Duda', nota: 9 }
];

let compNome = alunos.sort(function (a, b) {
    if (a.nome > b.nome) {
      return 1;
    }
    if (a.nome < b.nome) {
      return -1;
    }
    return 0;
});
//console.log(compNome);

let compNota = alunos.sort(function (a, b) {
    if (a.nota < b.nota) {
      return 1;
    }
    if (a.nota > b.nota) {
      return -1;
    }
    return 0;
});
//console.log(compNota);



//Exercício Integrador

//Temos que fazer um sistema para um Agricultor controlar suas vendas. Ele tem um controle de vendas em um caderno, onde os produtos estão organizados por nome, preço e quantidade vendida. 
//Portanto, crie um array de objetos literais com essas informações. No sistema, você tem que adicionar uma função (ou várias) que realize os seguintes passos:





let dados = [
{nome:"Abobrinha", preco:7.5, qtdVenda:12 },
{nome:"Alface", preco:2.0, qtdVenda:25 },
{nome:"Abobrinha", preco:7.0, qtdVenda:47 },
{nome:"Repolho", preco:2.5, qtdVenda:56 },
{nome:"Repolho", preco:2.3, qtdVenda:116 },
{nome:"Cenoura", preco:6.0, qtdVenda:72 },
{nome:"Abobrinha", preco:6.5, qtdVenda:186 },
{nome:"Alface", preco:1.75, qtdVenda:142 },
{nome:"Cenoura", preco:5.45, qtdVenda:275 },
];

//console.log(dados);

//1 - Calcular o lucro total de todos os produtos;
//Resolução Normal
function lucroTotal(x) {
  let soma=0;
  for(let i=0; i<x.length;i++){
    soma= soma+(x[i].preco*x[i].qtdVenda);
  }
return soma;
}
//console.log(lucroTotal(dados));

//Resolução Simples
let totaLucro =dados.reduce((acumulador,item)=>{return acumulador+(item.qtdVenda*item.preco)},0);
//console.log(totaLucro);



//2 - Permitir pesquisar um produto pelo nome e calcular seu lucro total; 
function pesquisaLucro(x,y) {
  let itemEspecifico = x.filter((item)=>{return item.nome==y});
  let lucro =itemEspecifico.reduce((acumulador,item)=>{return acumulador+(item.qtdVenda*item.preco)},0);
  return lucro;
}
//console.log(pesquisaLucro(dados,"Cenoura"));


//3 -  Permite receber um valor e indicar todos os produtos que venderam mais que esse valor;

//resposta seimples, sem agrupar
function pesquisaVendas(x,y) {
  let filtroVendas = x.filter((item)=>{return item.qtdVenda>y});
return filtroVendas;
}
//console.log(pesquisaVendas(dados,140));



//4 - Classifique todos os produtos pela quantidade de dinheiro que geraram.
// let todosLucro=dados.map((item)=>{return { "nome:" +item.nome+","+ "lucro:" +item.qtdVenda*item.preco+ } });
// console.log(todosLucro);




//5 - Encontre um produto e atribua a ele um novo valor (reutilize o código que permite encontrar o produto pelo nome).
function trocaValor(x,y) {
  let itemEspecifico = x.filter((item)=>{return item.nome==y});
  
  let lucro =itemEspecifico.reduce((acumulador,item)=>{return acumulador+(item.qtdVenda*item.preco)},0);
  return lucro;
}

console.log(trocaValor(dados,"Cenoura"));







//6 - Calcule o lucro total após pagar 45% do lucro em impostos.
function imposto(x) {
  let lucroImposto =dados.reduce((acumulador,item)=>{return acumulador+(item.qtdVenda*item.preco)},0);
  return lucroImposto=(lucroImposto*0.65).toFixed(2);
}
//console.log("Lucro descontado impostos R$: "+imposto(dados));



