/* 
Passo a passo para executar o desafio - Aula 7
1 - Criar a opção de escolha do felino 
2 - Verificar qual foi a escolha
3 - Definir uma url da internet
4 - Alteram o atributo "src"
*/

function changeImg() {
    let listafelinos = document.querySelectorAll("img");
    let escolha = parseInt(
        prompt(
            "Escolha um felino\n1)Tigre\n2)Leão\n3)Leopardo\n4)Pantera\n5)Jaguar\n6)Guepardo") - 1);
    let url = prompt("Insira a URL da imagem de deseja.");
    listafelinos[escolha].setAttribute("src", url);

    let div=listafelinos[escolha].parentElement;
    let h2=div.querySelector('h2');
    if(escolha==4){  // kkkkk
        h2.innerText="jaguar tirica";
    }
}

