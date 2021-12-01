//Microdesafios
//1.
let num1=[2,6,10,32];
let numImp = num1.map(function(x) {
    return x+1;
})
console.log(numImp);


//2.
let nomesM = ["Maria", "João", "Kleber","Maria"];

let maria = nomesM.filter(function (item, indice) {
    if (item=="Maria"){
        console.log(indice, item);

    }
});
//console.log(maria);


//3.
 let numero3 = [1,5,9,3,7];

let exemplo3 = numero3.reduce(function (x,y) {
    return x+"-"+y;
});
console.log(exemplo3);


//4.
let animmais = ['cervo', 'cabra', 'vaca', 'boi'];

animmais.forEach(function(item) {
      console.log("O animal é "+item);
});

