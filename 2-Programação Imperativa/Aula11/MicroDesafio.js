//1.
for (let papagaio = 0; papagaio<=5; papagaio++){
    console.log("Olá mundo");
    
}

//2.
for (let i=0; i<=10; i++){
    if (i%2 != 0){
        console.log("número impar = ",i);
    }
}

//3.

for(let tabuada = 1; tabuada<=10; tabuada++){
    resultado = tabuada * 2;
    console.log("2*"+tabuada +" = "+ resultado);
}



//Excercício pessoal
function tabuada(x){
    for(let t=1; t<=10; t++){
        result=t*x;
        console.log(x+"*"+t+" = "+ result);
    }
}
console.log(tabuada(7));


