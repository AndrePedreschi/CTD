let tokenJwtusuarioLogado = localStorage.getItem("jwt")
onload = () =>{
    

    if(!tokenJwtusuarioLogado){
        location.href="index.html"
    }else{
        console.log(tokenJwtusuarioLogado);
    }
    //console.log(tokenJwtusuarioLogado);
}

//console.log(tokenJwtusuarioLogado);



let endPointUsuario = "https://ctd-todo-api.herokuapp.com/v1/users/getMe";
//let usuarioJson = JSON.stringify(usuarioObjeto);
let configuracaoRequisicao = {
    method: 'GET',
    //body: usuarioJson,
    headers: {
        //'content-type': 'application/json'
        'authorization': tokenJwtusuarioLogado
        }
    
}


//Adquirir os dados de usuário da api
fetch(endPointUsuario, configuracaoRequisicao).then(resultado=>{
        /* if(resultado.status == 201){
            return resultado.json();
        }
        throw resultado; */
        
       return resultado.json();      
    
    
    }).then(resultado =>{
        /* cadastroSucesso(resultado.jwt) */
        //console.log(resultado);
        //console.log(resultado.id);
        //console.log(resultado.firstName);
        //console.log(resultado.lastName);
        //console.log(resultado.email);
        document.querySelector("#nome").innerText = "Bem vindo " + resultado.firstName +" "+resultado.lastName;
        
    }).catch(erro=>{
        /* cadastroErro(erro)
        if(erro.status==400){
            alert("Usuário já cadastrado")
                    
        } */
        console.log(erro);
    }
);
 
    
function finalizarSessao(){
    localStorage.removeItem('jwt')
    alert("Logout Realizado")
    window.location.href = "index.html"
}



//Criar uma Tarefa
let tarefaJson={
    "description": "Aprender Front end III",
    "completed": false
  }
let tarefa = JSON.stringify(tarefaJson)
  let endPointRegistrarTarefas = "https://ctd-todo-api.herokuapp.com/v1/tasks";

  let configuracaoRegistrarTarefas = {
      method: 'POST',
      body: tarefa,
      headers: {
        'authorization': tokenJwtusuarioLogado,
        'content-type': 'application/json'
          
          }   
  }
  
  fetch(endPointRegistrarTarefas, configuracaoRegistrarTarefas).then(resultado=>{
          /* if(resultado.status == 201){
              return resultado.json();
          }
          throw resultado; */
          
         return resultado.json();      
      
      
      }).then(resultado =>{
          /* cadastroSucesso(resultado.jwt) */
          //let resultadoTarefa = resultado;
          console.log(resultado);
          //console.log(resultado.id);
          //console.log(resultado.firstName);
          //console.log(resultado.lastName);
          //console.log(resultado.email);
          //document.querySelector("#nome").innerText = "Bem vindo " + resultado.firstName +" "+resultado.lastName;
          
      }).catch(erro=>{
          /* cadastroErro(erro)
          if(erro.status==400){
              alert("Usuário já cadastrado")
                      
          } */
          console.log(erro);
    }
);





function addTarefas(){
    let skeleton = document.getElementById('skeleton');
    let novaTarefa = document.getElementById('novaTarea').innerText;

    let tarefaADD = `
    <li class="tarefa">
        <div class="not-done"></div>
        <div class="descricao">
            <p class="nome">${novaTarefa}</p>
            <p class="timestamp">Criada em: ${resultadoTarefa.createdAT}</p>
        </div>
    </li>      
    `
    
    skeleton.appendChild(tarefaADD);

}





















  //Listar tarefas do usuário

let endPointTarefas = "https://ctd-todo-api.herokuapp.com/v1/tasks";

let configuracaoTarefas = {
    method: 'GET',
    //body: usuarioJson,
    headers: {
        //'content-type': 'application/json'
        'authorization': tokenJwtusuarioLogado
        }   
}

fetch(endPointTarefas, configuracaoRequisicao).then(resultado=>{
        /* if(resultado.status == 201){
            return resultado.json();
        }
        throw resultado; */
        
       return resultado.json();      
    
    
    }).then(resultado =>{
        /* cadastroSucesso(resultado.jwt) */
        console.log(resultado);
        //console.log(resultado.id);
        //console.log(resultado.firstName);
        //console.log(resultado.lastName);
        //console.log(resultado.email);
        //document.querySelector("#nome").innerText = "Bem vindo " + resultado.firstName +" "+resultado.lastName;
        
    }).catch(erro=>{
        /* cadastroErro(erro)
        if(erro.status==400){
            alert("Usuário já cadastrado")
                    
        } */
        console.log(erro);
    }
);





