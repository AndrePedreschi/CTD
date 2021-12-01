
let numeros = [1,5,9,3,5,7];
let dobro = numeros.map(function(item){
    return item * 2;
});

//console.log(dobro);


let idades =[15,12,
16,20,30,36];

let maiores = idades.filter(function (item) {
    return item>=18;
});
//console.log(maiores);

let total = idades.reduce(function(acumulador, item) {
    return acumulador+' - '+item;
});

//console.log(total);

let paises = ['Brasil', 'Cuba', 'Peru', 'India'];

paises.forEach(function(item) {
    //console.log("<li>"+item+"</li>");
});




