//Mesa

const n0 = (x,y)=> x+' '+y+',Bem';
const n1 = (x)=> x;
const n2 = (y)=> y;

let FizzBuzz = (num1,num2,palav1,palav2)=> {
    for(let i=0; i<=100; i++){
        if(i%num1==0 && i%num2==0){
            console.log(n0(palav1,palav2));
        }else if(i%num1==0){
            console.log(n1(palav1));
        }else if(i%num2==0){
            console.log(n2(palav2));
        }else{
            console.log(i);
        }
    }
}

FizzBuzz(4,7,'Come', 'Abacate');//By Vovó Jujú...

