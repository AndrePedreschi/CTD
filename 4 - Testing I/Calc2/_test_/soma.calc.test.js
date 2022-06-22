const { soma } = require('../calc.js');

describe('Teste de soma', ()=>{
    test('soma de dois números', ()=>{
        expect(soma(2,2)).toBe(4);
    })
    test('soma de dois zeros', ()=>{
        expect(soma(0,0)).toBe(0);
    })
    test('soma de dois null', ()=>{
        expect(soma(null,null)).toBe(0);
    })
    test('soma de strings', ()=>{
        expect(soma("a","b")).toBe("ab");
    })
})

/* para rodar, no terminal digitamos, npm test */

 /* "test": "jest --collect-coverage" */