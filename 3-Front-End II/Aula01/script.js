/* let meuObjeto= { 
    mensagem: "Mensagem de texto", mensagem: "Prof Megamente",
    utilidade: "Prova de JS", utilidade: "Prova de matemática"  
    }; 
    let meuArray= [ "Primeira mensagem do array", "Segunda mensagem do array", "Terceira mensagem do array"] 
    console.table(meuObjeto); 
    console.table(meuArray);
     
     */


    let array=[1,2,4,8,10];
    let soma=0;
    for (let i=0; i<(array.length-1);i++){
        if(i==0){
        soma=array[i]+array[(i+1)];
    }else{
        soma=soma+array[(i+1)];
    }
        console.log(soma);
    }
    