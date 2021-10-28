//Calculadora - Nível I

function adicionar(x,y) {
    return x+y
}

function subtração(x,y) {
    return x-y
}

function multiplicação(x,y) {
    return x*y
}

function divisão(x,y) {
    return x/y
}




//Calculadora - Nível II
console.log("-------------- Teste de Operações / Calculadora --------------");


console.log(adicionar(10,2));//chamada de teste
console.log(subtração(10,2));//chamada de teste
console.log(multiplicação(10,2));//chamada de teste
console.log(divisão(10,2));//chamada de teste
console.log(divisão(0,2));//chamada de teste


//Calculadora - Nível III
console.log("-------------- Teste de Operações / Calculadora NÍVEL III --------------");


function quadradoDoNumero(x) {
   return multiplicação(x,x)

}
console.log(quadradoDoNumero(12));//chamada de teste



function mediaDeTresNumeros(x, y, z){
    x = adicionar(x,y)
    x = adicionar(x,z)
    return divisão(x,3)

}
console.log(mediaDeTresNumeros(2,3,4));//chamada de teste



function calculaPorcentagem(total, porcentagem){
    porcentagem = divisão(porcentagem, 100)
    return multiplicação(total, porcentagem)

}
console.log(calculaPorcentagem(200, 10));//chamada de teste
