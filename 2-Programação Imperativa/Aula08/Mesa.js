//Parte I

//function podeSubir(altura, acompanhante){
    
//    if (altura>=1.4 && altura<2.0) {
//        podeSubir = true        
//    }else if (altura<1.4 && altura>=1.2 && acompanhante){
//        podeSubir = true
//    }else{
//        podeSubir = false
//    }
//    return podeSubir
//}

//console.log(podeSubir(1.5,true));


//Parte II
function podeSubir(altura, acompanhante){
    
    if (altura>=1.4 && altura<2.0) {
        podeSubir = "Acesso autorizado" 
    }else if (altura<1.4 && altura>=1.2 && acompanhante){
        podeSubir = "Acesso autorizado somente com acompanhante"
    }else{
        podeSubir = "Acesso negado"
    }
    return podeSubir
}

console.log(podeSubir(1.1,true));