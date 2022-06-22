const { divisao } = require('../calc.js');

describe('Teste de divisao', ()=>{
    test('Divisao de dois números', ()=>{
        expect(divisao(6,3)).toBe(2);
    })

})