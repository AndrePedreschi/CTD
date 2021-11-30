//Microdesafio

const acaoCarro = (callback) => {return callback()};
// function acaoCarro(callback) {
//     return callback();
// }

const andar=()=>console.log('O carro está andando');

// function andar() {
//     console.log('O carro está andando');
    
// }

const parar = ()=> console.log('O carro parou');

// function parar() {
//     console.log('O carro parou');
// }


acaoCarro(andar);
acaoCarro(parar);