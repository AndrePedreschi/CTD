let carro = {
    modelo: "Ford",
    cor: "branca",
    andar: function(){
        return "carro "+this.modelo+" andando na cor "+this.cor;
    }
}
//console.log(carro.andar());

function Carro(modelo, cor){
    this.modelo = modelo;
    this.cor = cor;
    this.pular=function(){
        return 'meu '+this.modelo+' esta pulando';
    }

}
let carro1 = new Carro('Ford', 'vermelho');
let carro2 = new Carro('Tesla', 'Rosa');

//console.log(carro1.cor);
//console.log(carro2.pular());


//JSON
let dadosCarro = {
    "cor":"branco",
    "placa":"AXV-1598",
    "qtdPortas": 4
}

let strCarro = JSON.stringify(dadosCarro);
console.log(strCarro);