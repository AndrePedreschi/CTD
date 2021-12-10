function aluno(nome, qtdFaltas, notas) {
  this.nome = nome;
  this.qtdFaltas = qtdFaltas;
  this.notas = notas;
  this.calcularMedia = function () {
      let media = this.notas.reduce(function (acumulador, item) {
          return acumulador+item;
      },0)
      return media/this.notas.length;
  };
  this.faltas = function () {
    return this.qtdFaltas++;
  };
};

module.exports = aluno;




















