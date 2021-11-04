//EX.01
//1.
console.log(!true);//FALSE

//2.
console.log(!false);//TRUE

//3.
console.log(!false);//FALSE

//4.
console.log(!!true);//TRUE

//5.
console.log(!1);//FALSE

//6.
console.log(!!1);//TRUE

//7.
console.log(!0;//TRUE

//8.
console.log(!!0);//FALSE

//9.
console.log(!!"");//FALSE

//10.
let x = 5 ;		
let y = 9;
//a.
console.log(x < 10 && x!==5);//FALSE

//b.
console.log(x>9 || x===5);//TRUE

//c.
console.log(!(x===y));//TRUE

//EX. 02
//1.
let x=10
let y ="a"
console.log(y==="b" || x >= 10);//TRUE

//2.
let x=3
let y=8
console.log(!(x == "3" || x === y) && !(y !== 8 && x <= y));//FALSE

//3.
let str = ""
let msg = "haha!"
let eBonito = "false"
console.log(!((str || msg) && eBonito)); //FALSE