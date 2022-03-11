
let Felinos = [{
    nome: "Tigre",
    src: "./imagens/tiger.jpg",
    descricao: "O tigre (Panthera tigris) é uma das espécies da subfamília Pantherinae (família Felidae) pertencente ao gênero Panthera. É encontrado de forma nativa apenas no continente asiático; é um predador carnívoro e é a maior espécie de felino do mundo junto com o leão."
},
{
    nome: "Leão",
    src: "./imagens/leon.jpg",
    descricao: "O leão (Panthera leo) é um mamífero carnívoro da família dos felinos é uma das cinco espécies do gênero  Panthera. Os leões selvagens vivem em populações cada vez mais dispersas e fragmentadas na África subsahariana (com exceção das regiões florestais e das regiões de selva da Bacia do Congo) e uma pequena área do noroeste da  Índia."
},
{
    nome: "Leopardo",
    src: "./imagens/leopardo.jpg",
    descricao: " O leopardo (Panthera pardus) é um mamífero carnívoro da família dos felinos. Como três dos outros felinos do gênero Panthera: o leão, o tigre e a onça-pintada, são caracterizados por uma modificação do osso  hióide que lhes permite rugir. É também conhecido como pantera marrom e, quando tem a pelagem completamente escura, como pantera negra (melanista)."
},
{
    nome: "Pantera Negra",
    src: "./imagens/pantera-negra.jpg",
    descricao: " A pantera negra é uma variação escura (melanismo) de várias espécies de felinos grandes, especialmente o leopardo (Panthera pardus) e a onça-pintada (Panthera onca).  Mas deve-se ressaltar que não se trata de uma espécie nova, nem mesmo de uma subespécie, é simplesmente uma variação negra destes animais."
},
{
    nome: "Jaguar",
    src: "./imagens/jaguar.jpg",
    descricao: " O jaguar, ou jaguarete (Panthera onca) é um carnívoro felídeo da sub-família Panthera e do gênero Panthera. É a única das cinco espécies existentes deste gênero encontradas nas Américas. Também é o maior felino das Américas e o terceiro maior do mundo, depois do tigre (Panthera tigris) e do leão (Panthera leo)."
},
{
    nome: "Guepardo",
    src: "./imagens/chita.jpg",
    descricao: " O guepardo, ou chita (Acinonyx jubatus) é um membro atípico da família felina. É o único representante vivo do gênero Acinonyx. Ele caça graças à sua visão e grande velocidade. É o animal terrestre mais rápido do mundo, atingindo uma velocidade máxima de 115 km/h em corridas de até quinhentos metros."
}];

let container = document.querySelector('.container');


function remover(){
    let cards = document.querySelectorAll('.item');
    cards.forEach(card => {
        card.remove();
        console.log("texto");
    });

}

function adicionar(){
    Felinos.forEach(card=>{
        let novaDiv = document.createElement('div');
        novaDiv.innerHTML=`
        <div class="item">
            <img src=${card.src}>
                <h2>${card.nome}</h2>
                <p>${card.descricao}</p>
        </div>`
    
        //container.insertBefore(novaDiv,container.firstChild); //Os cards acabam ficando na ordem trocada
       //container.insertBefore(novaDiv,container.lastElementChild); //Acerta a ordem dos cards
      // container.insertBefore(novaDiv,container.lastChild);
     container.appendChild(novaDiv.lastChild); //adiciona sem quebrar a formatação do css
      // container.appendChild(novaDiv); 
    });

}

