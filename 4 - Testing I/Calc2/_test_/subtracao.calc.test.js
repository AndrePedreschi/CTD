const { subtracao } = require('../calc.js');

describe('Teste de subtracao', ()=>{

    test('subtracao de dois números', ()=>{
        expect(subtracao(5,2)).toBe(3);
    })
    test('subtracao de dois zeros', ()=>{
        expect(subtracao(0,0)).toBe(0);
    })
    test('subtracao de dois null', ()=>{
        expect(subtracao(null,null)).toBe(0);
    })
    test('subtracao de strings', ()=>{
        expect(subtracao("a","b")).toBe(NaN);
    })
    test('subtracao de dois números', ()=>{
        expect(subtracao(-5,5)).toBe(-10);
    })
    test('subtracao de dois números', ()=>{
        expect(subtracao(-5,-5)).toBe(0);
    })
})