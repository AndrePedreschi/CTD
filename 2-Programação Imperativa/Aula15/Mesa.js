
// SEGUINDO A MESA DE TRABALHO DA AULA 13. DESENVOLVA ESSE ALGORITMO 
// 1 - CRIE UMA FUNÇÃO CONSTRUTORA PARA O OBJETO CONTA BANCARIA COM AS SEGUINTES PROPRIEDADES:

// ● Número da conta (somente números)
// ● Tipo de conta (conta corrente ou poupança em $)
// ● Saldo em $ (valor apenas)
// ● Titular da conta (nome completo)

function Contas(numConta, tipoConta, saldoConta, titularConta) {
    this.numero = numConta;
    this.tipo = tipoConta;
    this.saldo = saldoConta;
    this.titular = titularConta;
}

// 2 - MOLDE AS INFORMAÇÕES DO ARQUIVO https://drive.google.com/file/d/16L2NejZU49mCLbo6RTmSKtuElOTOYUXv/view
// PARA O FORMATO JSON, E EXPORTE ESSE JSON COMO MODULO
const dados=require('./modulo');
let usuarios=[];
//console.log(dados[1]);



// 3 - DESENVOLVA UM ALGORITOMO QUE IRA RECEBER O MODULO ARRAY DE JSON E CRIE DINAMICAMENTE OS 
// OBJETOS CONTA BANCARIA EM UM SEGUNDO ARRAY LISTA USUARIOS ARMAZENE ESSE OBJETOS 

for(let i=0;i<dados.length; i++){
    usuarios.push(new Contas(dados[i].numero, dados[i].tipo, dados[i].saldo, dados[i].titular));
}

//console.log(usuarios[0]);

// 4 - CRIE DE UM OBJETO LITERAL CHAMADO BANCO QUE TERÁ UMA PROPRIEDADE CHAMADA CLIENTES, ELE SERÁ COMPOSTO 
// PELA LISTA DE OBJETOS GERADOS NO PONTO ANTERIOR.

let banco = {
    clientes: usuarios,
    consultarCliente: function (titular) {
        for (let count = 0; count < this.clientes.length; count++) {
            if (this.clientes[count].titular == titular) {
                return this.clientes[count];
            }
        }
    },
}
//console.log(banco.clientes);
console.log(banco.consultarCliente('Jarret Lafuente'));

// 5 - O OBJETO DO BANCO CRIARÁ UM MÉTODO CHAMADO CONSULTARCLIENTE QUE RECEBERÁ UM
// NOME (TITULAR) POR PARÂMETRO E DEVE PESQUISAR NA LISTA DE CONTAS E RETORNAR AO
// OBJETO DO CLIENTE QUE CORRESPONDE A ESSE NOME INSERIDO.









