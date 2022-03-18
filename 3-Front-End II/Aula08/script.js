// 1
function adicionar() {
    let novoConteudo = document.querySelector('#formulario');
    novoConteudo.innerHTML =
        `
        <form id="formulario">
            <fieldset>
                <legend id="cor">Dados pessoais</legend>
                    <div>
                        <label for="username">Usuário</label>
                        <input type="text" name="username" id="username">   
                    </div>
                    <div>
                        <label for="emailUsername">E-mail</label>
                        <input type="email" name="emailUsername" id="emailUsername">
                    </div>      
                    <div>
                        <label for="birthDate">Data de Nascimento</label>
                        <input type="date" name="birthDate" id="birthDate" min="2018-01-01" max="2024-10-05">
                    </div>   
                    <div>
                        <label for="passwordUser">Password</label>
                        <input type="password" name="passwordUser" id="passwordUser">
                    </div>           
                    <div>
                        <label for="observations">Observações</label>
                        <textarea name="observations" id="observations" cols="30" rows="10"></textarea>
                    </div>            
                    <div>
                        <input type="radio" name="person" id="pf" value="pessoaFisica" checked>
                        <label for="pf">Pessoa Física</label>
                        <input type="radio" name="person" id="pj" value="pessoaJuridica">
                        <label for="pj">Pessoa Jurídica</label>
                    </div>   
                    <div>
                        <button id="sub" type="submit">Enviar Formulário</button>
                        <button type="reset">Limpar Formulário</button>
                    </div>
                </fieldset>
        </form>`
};
adicionar();
    //Exercício 2
    //Previna a página de ser recarregada quando houver o submit utilizando preventDefault().


let previ = document.querySelector('#sub');
previ.addEventListener('click', function (event) {
    console.log("teste");
    event.preventDefault();
});


    //Exercício 3
    //Mostre um alerta na página quando a tela terminar de ser carregada.
window.onload = alerta;
function alerta() {
    window.alert("A página foi carregada !");
}

//Exercício 4
//Adicione uma cor a um texto quando o mouse ficar acima do mesmo e outra cor quando ele sair do mesmo.
let changeColor = document.getElementById('cor')

changeColor.onmouseover = function () {
    cor.style.color = 'pink'
}
changeColor.onmouseout = function () {
    cor.style.color = 'purple'
}

//Exercício 5
//Faça um trecho de código que utilize algum evento de teclado, esse evento irá escrever o conteúdo do input em uma tag <p> e logo abaixo o número de vezes que esse evento foi chamado. Exemplo: <p>futebol</p> <p>7</p> .





  