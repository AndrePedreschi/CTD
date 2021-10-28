function teste1(x,y) {//micro 01
    return y-x
}
console.log(teste1(10,40));



function teste2(x,y) {//micro 02
    return x*2
    console.log(x)
    return x/2
}
console.log(teste2(10));



function pol(x) {//exercício 01
    return x*2.54
}
console.log(pol(10));



function url(x) {//exercício 02
    return "http://www."+x+".com.br"
}
console.log(url("goggle"));



function frase(x) {//exercício 03
    return x+"!"
}
console.log(frase("Eu adoro gatos"));



function dogLife(x) {//exercício 04
    return x*7
}
console.log(dogLife(6));



function horaTrabalho(x) {//exercício 05
    return x/160
}
console.log(horaTrabalho(3000));



function imc(alt, peso) {//exercício 06
    return peso/(alt*alt)
}
console.log(imc(1.69,85));
console.log(imc(1.63,64));
console.log(imc(1.70,98));



function up(x) {//exercício 07
    return x.toUpperCase()
}
console.log(up("texto"));



function type(x) {//exercício 08
    return typeof x
}
console.log(type("text"));
console.log(type(56));



function circ(raio) {//exercício 09
    return  2*Math.PI*raio
}
console.log(circ(2));