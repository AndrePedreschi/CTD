const aluno=require('./modulo');


let dados =[
   new aluno('André Pedreschi',4,[10,8,7,9]),           //falta>max (false)
   new aluno('Victor Leão',3,[10,10,10,10]),            //falta=max e nota>1.1*notaDeAprovacao (true)
   new aluno('Breno Sabino',3,[9,5,7,7]),               //falta=max e nota<1.1*notaDeAprovacao (false)
   new aluno('Jaqueline Silva',0,[10,3,5,7]),           //falta<max e nota<notaDeAprovacao (false)
   new aluno('Vinicius de Andrade',0,[9,10,8,10])       //falta<max e nota>notaDeAprovacao (true)
];



module.exports=dados;


