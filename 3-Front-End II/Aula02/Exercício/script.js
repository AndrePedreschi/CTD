/* let nome=prompt("Qual o seu nome?");

document.querySelector('p').innerText += " "+nome;
 */

/* let carro = {
    nome: "fox",
    ano: "2011"
} */
// exemplo de for in => usar em objetos
/* for(let prop in carro){
    console.log(prop)//nome das propriedades, classes do objeto
    console.log(carro.prop)//undefined
    console.log(carro[prop])//atributos das classes do objeto
    console.log(prop, carro[prop])//
} */


// exemplo de for of => usar com matrizes e strings
//agilizar o processo de iteração
/* let series = ["Friends", "Game of Thrones", "Breaking Bad"];

for(let valor of series){
    console.log(valor+" Bom")
} */

let i = 0;//Contador usuário ganha
let j = 0;//Contador máquina ganha

while ((i < 2)&(j < 2)) {




    let usuario = prompt("Escolha entre:\n1 - pedra,\n2 - papel ou\n3 - tesoura");
    let maquina = (Math.random() * 3);
    maquina=Math.round(maquina);
    console.log(maquina);

    switch (usuario) {
        case "1":
            if (maquina == 2) {//papel
                j++;
                alert("A máquina ganhou essa rodada, papel ganha de pedra!\n O placar está Usuário:"+i+" X "+"Máquina: "+j)
            } else if (maquina == 3) {//tesoura
                i++;
                alert("Você ganhou essa rodada, pedra ganha de tesoura!\n O placar está Usuário:"+i+" X "+"Máquina: "+j)
            } else {//pedra
                alert("Empataram\n O placar está Usuário:"+i+" X "+"Máquina: "+j)
            }
            break;

        case "2":
            if (maquina == 2) {//papel
                alert("Empataram\n O placar está Usuário:"+i+" X "+"Máquina: "+j)

            } else if (maquina == 3) {//tesoura
                j++;
                alert("A máquina ganhou essa rodada, tesoura ganha de papel!\n O placar está Usuário:"+i+" X "+"Máquina: "+j)

            } else {//pedra
                i++;
                alert("Você ganhou essa rodada, papel ganha de pedra!\n O placar está Usuário:"+i+" X "+"Máquina: "+j)

            }
            break;

        case "3":
            if (maquina == 2) {//papel
                i++;
                alert("Você ganhou essa rodada, tesoura ganha de papel!\n O placar está Usuário:"+i+" X "+"Máquina: "+j)
            } else if (maquina == 3) {//tesoura
                alert("Empataram\n O placar está Usuário:"+i+" X "+"Máquina: "+j)

            } else {//pedra
                j++;
                alert("A máquina ganhou essa rodada, pedra ganha de pedra!\n O placar está Usuário:"+i+" X "+"Máquina: "+j)
            }
            break;

    }
}















