function somaArray(arrayX){
    let soma=0;
for(let c=0; c<arrayX.length; c++){
    soma+=arrayX[c];
}
return soma;
}

function join(arrayJ){
        let soma="";
    for(let c=0; c<arrayJ.length; c++){
       soma=soma+arrayJ[c];
    }
    return soma;
}


module.exports = {
    somaArrayF: somaArray,
    joinF: join,
}