const { multiplicacao } = require('../calc.js');

describe('Teste de multiplicacao', ()=>{
    test('soma de dois números', ()=>{
        expect(multiplicacao(5,3)).toBe(15);
    })

})