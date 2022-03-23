let container = document.getElementById('container');
function adicionar() {
let nome=document.getElementById('name').value;
let url=document.getElementById('imagem').value;
let desc=document.getElementById('descricao').value;
let valor=document.getElementById('valor').value;
let qtd=document.getElementById('quantidade').value;

    let novaDiv = document.createElement('div');
    novaDiv.innerHTML = `
        <div class="card" style="width: 40rem;">
        <img src="${url}" class="card-img-top" alt="...">
            <div class="card-body">
                <h1>${nome}</h1>
                <p class="card-text">${desc}</p>
                <p>${"R$"+valor+",00"}</p>
                <p>Em estoque: ${qtd}</p>
            </div>
        </div>`

   
    document.getElementById('msg').classList.add('hide');
    container.appendChild(novaDiv.lastChild); //adiciona sem quebrar a formatação do css
    };