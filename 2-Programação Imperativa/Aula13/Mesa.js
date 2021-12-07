function Contas(numConta, tipoConta, saldoConta, titularConta) {
    this.numero = numConta;
    this.tipo = tipoConta;
    this.saldo = saldoConta;
    this.titular = titularConta;
}

let lista = [];
lista.push(new Contas(5486273622, 'Conta Corrente', 27771, 'Abigael Natte'), new Contas(1183971869, 'Conta Poupança', 8675, 'Ramon Connell'), new Contas(9582019689, 'Conta Poupança', 27363, 'Jarret Lafuente'), new Contas(1761924656, 'Conta Poupança', 32415, 'Ansel Ardley'), new Contas(7401971607, 'Conta Poupança', 18789, 'Jacki Shurmer'), new Contas(630841470, 'Conta Corrente', 28776, 'Jobi Mawtus'), new Contas(4223508636, 'Conta Corrente', 2177, 'Thomasin Latour'), new Contas(185979521, 'Conta Poupança', 25994, 'Lonnie Verheijden'), new Contas(3151956165, 'Conta Corrente', 7601, 'Alonso Wannan'), new Contas(2138105881, 'Conta Poupança', 33196, 'Bendite Huggett'));

//console.log(lista[6].numero);

let banco = {
    clientes: lista,
    consultarCliente: function (titular) {
        for (let count = 0; count < this.clientes.length; count++) {
            if (this.clientes[count].titular == titular) {
                return this.clientes[count];
            }
        }
    },
    deposito: function (titular, valor) {
        for (let count = 0; count < this.clientes.length; count++) {
            if (this.clientes[count].titular == titular) {
                this.clientes[count].saldo += valor;
                return "Depósito realizado, seu novo saldo é: " + this.clientes[count].saldo;
            }
        }
    },
    saque: function (titular, valor) {
        for (let count = 0; count < this.clientes.length; count++) {
            if (this.clientes[count].titular == titular) {
                if (this.clientes[count].saldo - valor < 0) {
                    return "Fundos insuficientes";
                } else {
                    this.clientes[count].saldo -= valor;
                    return "Extração feita com sucesso, seu novo saldo é: " + this.clientes[count].saldo;
                }
            }
        }
    }
}

//console.log(banco.clientes[0]);// lista de todos os clientes
//console.log(banco.consultarCliente('Bendite Huggett'));//consulta um cliente específico 
//console.log(banco.deposito('Abigael Natte',2229));//Pessoa em específico realiza um depósito
//console.log(banco.saque('Abigael Natte',2229));
//console.log(banco.saque('Abigael Natte',200229));


//Exercício Bônus - Propriedade Única


let array = [{ nome: "Lean", idade: 27 }, { nome: "Eze", idade: 49 }];

function propriedadeUnica(x, y) {
    let arrayOrg = [];
    if (y == "nome") {
        for (let i = 0; i < x.length; i++) {
            arrayOrg.push("{nome:" + x[i].nome + "}");
        }
        return arrayOrg;

    } else if (y == "idade") {
        for (let i = 0; i < x.length; i++) {
            arrayOrg.push("{idade:" + x[i].idade + "}");
        }
        return arrayOrg;
    }
}
//console.log(propriedadeUnica(array, "nome"));

//Resolução fixa
// let aluno = {
//     nome: 'André Pedreschi',
//     numero: 1,
//     listaNotas: [10, 8, 7, 9],

//     media: function () {
//         let media=0;
//         for (let i = 0; i < this.listaNotas.length; i++) {
//             media=media+this.listaNotas[i];
//         }
//         media=media/4;
//         return media
//     },
// }

// console.log(aluno.media());



//Resolução dinâmica

function base(nome, numero, listaNotas) {
    this.nome=nome;
    this.numero=numero;
    this.notas=listaNotas;
}

let listAluno =[];
listAluno.push(new base('André Pedreschi',1,[10,8,7,9]), new base('João Melão',2,[7,6,4,8]), new base('Márcia',3,[9,5,7,2]));

//console.log(listAluno);



let alunos={
    baseDados: listAluno,
    media: function (num) {
        //console.log(num);
        let soma=0;
        let total=0
        //console.log(this.baseDados);
        for (let count = 0; count <= this.baseDados.length; count++) {
            
            if (this.baseDados[count].numero===num) {

                for (let i = 0; i < 4; i++) {
                    soma=soma+this.baseDados[count].notas[i];
                    //console.log(this.baseDados[count].notas[i]);
                    //console.log(soma);
                }
            }
            //console.log(this.baseDados[1].notas[0]);
            //console.log(this.baseDados[1].numero)
            total=soma/4;
        }
        return total;
    },
}
//console.log(alunos.baseDados);
alunos.media(3);






// const fs = require('fs');
// let dados=fs.readFileSync(__dirname+'/dados.txt', 'utf8');