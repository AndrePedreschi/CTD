const { generateText, validateInput, createElement } = require('../util.js');

describe('Validação de texto de saída', () =>{

    test('Saída de nome e idade', () =>{
        const text = generateText('Tiago Gomes', 28);
        expect(text).toBe('Tiago Gomes (28 years old)');
    })
})

describe('Validate Create element',() => {
    test('Create new element with data', () => {
        const element = createElement('li', "exampleElement", 'user-item');
        expect(element.textContent).toMatch(/exampleElement/);
    });
    test('Create new element without data', () => {
        const element = createElement(null);
        expect(element.textContent).toBe("");
    });
})



describe('Validação função input', () =>{

    test('Validate de input', () =>{
        const text = validateInput('texto');
        expect(text).toBeTruthy;
    })
})


