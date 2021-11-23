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


