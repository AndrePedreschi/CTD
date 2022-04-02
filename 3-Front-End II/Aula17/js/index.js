//Site da API = https://randomuser.me/
// Aqui realizamos a consulta da promisse, esperando sua resposta assíncrona

function atualizarAPI(){

fetch('https://randomuser.me/api/')
    .then(response => {
        if (response.status == 200) {
            return response.json()
        }
        else {
            console.log("Erro ao importar os dados da API")
        }
    })
    .then(dados => {
        //manipulamos a resposta
        //console.log(dados)
        renderizarDadosUsuario(dados.results[0])
    });

}


    /* -------------------------------- Tarefa 1 -------------------------------- */
    // Aqui devem desenvolver uma função que seja exibida na tela:
    // a foto, o nome completo do usuário e o e-mail.
    // Isto deve ser baseado nas informações que obtemos da API e inseridas no HTML.
      
function renderizarDadosUsuario(dados) {
    let base=document.querySelector(".card")

    //let novaDiv = document.createElement('div');
    base.innerHTML=`
        <div class="item">
            <img src=${dados.picture.large}>
                <h2>${dados.name.first +" "+dados.name.last}</h2>
                <p>${"Email: "+ dados.email}</p>
        </div>
    `
    //base.appendChild(novaDiv.lastChild);
    document.querySelector(".card div").classList.add('cards')

}


/* --------------------------- Tarefa 2 (extra) --------------------------- */
// Aqui você pode ir para o ponto extra de usar o botão que está comentado no HTML.
// Você pode descomentar o código no index.html e usar esse botão para executar uma nova solicitação API, sem recarregar a página.
// Cabe aos desenvolvedores decidirem qual bloco de código deve ser contido dentro de uma função para que ele possa ser executado toda vez que um clique de botão for realizado.

atualizarAPI()







