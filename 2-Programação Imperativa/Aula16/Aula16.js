let bemVindo = () =>'Olá Mundo!';

let dobro = numero => numero*2;

let soma = (a,b) => a+b;

let horaAtual = () => {
    let data= new Date();
    return data.getHours()+':'+ data.getMinutes();
}
console.log(bemVindo());
console.log(dobro(7));
console.log(soma(4,9));
console.log(horaAtual());


















