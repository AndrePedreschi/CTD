const aluno = require("./modulo");
const estudantes = require("./alunos");       //Micro desafio 7

let curso = {                 //Micro desafio 3
    nomeDoCurso: "Culinária Emergêncial nos Andes",
    notaDeAprovacao: 7,
    faltasMax: 3,
    estudantesLista: estudantes,
    novoEstudante: function (aluno) {           //Micro desafio 4
        this.estudantesLista.push(aluno);
    },
    aprovacaoVerificar: function (aluno) {             //Micro desafio 5
        if ((aluno.calcularMedia() >= this.notaDeAprovacao &&
            aluno.qtdFaltas < this.faltasMax) || (aluno.qtdFaltas === this.faltasMax) && (aluno.calcularMedia() >= this.notaDeAprovacao * 1.1)) {
            return aluno.nome + ' - Aprovou ' + '(' + true + ')';
        } else {
            return aluno.nome + ' - Reprovou ' + '(' + false + ')';
        }
    },
    verificaTodos: function () {
        let teste = this.estudantesLista.map((item) => this.aprovacaoVerificar(item));
        return teste;
    },
}

//Adiciona um novo aluno
curso.novoEstudante(new aluno("Kleber", 5, [3, 2, 7, 4, 6]));

//Verifica se um aluno em específico passou
console.log(curso.aprovacaoVerificar(curso.estudantesLista[0]));

//Verifica se todos os alunos da çista passaram
console.log(curso.verificaTodos());


