function menu(opcao, tempo){

    if (opcao == 1) {

        if (tempo>2*10 && tempo<=3*10) {
            return "A comida Queimou"; 
        }else if (tempo<10) {
            return "Tempo insuficiente";
        }else if (tempo>3*10) {
            return "Kabumm";
        }else {
            return "Prato pronto, bom apetite";
        }
    }else if (opcao == 2) {
        if (tempo>2*8 && tempo<=3*8) {
            return "A comida Queimou"; 
        }else if (tempo<8) {
            return "Tempo insuficiente";
        }else if (tempo>3*8) {
            return "Kabumm";
        }else {
            return "Prato pronto, bom apetite";
        }
    }else if (opcao == 3) {
        if (tempo>2*15 && tempo<=3*15) {
            return "A comida Queimou"; 
        }else if (tempo<15) {
            return "Tempo insuficiente";
        }else if (tempo>3*15) {
            return "Kabumm";
        }else {
            return "Prato pronto, bom apetite";
        }
    }else if (opcao == 4) {
        if (tempo>2*12 && tempo<=3*12) {
            return "A comida Queimou"; 
        }else if (tempo<12) {
            return "Tempo insuficiente";
        }else if (tempo>3*12) {
            return "Kabumm";
        }else {
            return "Prato pronto, bom apetite";
        }
    }else if (opcao == 5) {
        if (tempo>2*8 && tempo<=3*8) {
            return "A comida Queimou";
            }else if (tempo<8) {
            return "Tempo insuficiente";
            }else if (tempo>3*8) {
            return "Kabumm";
            }else {
            return "Prato pronto, bom apetite";
            }
    }else{
        return "Prato inexistente";

    }        

}

//Testes
//1 - Pipoca – 10 segundos (padrão);
//2 - Macarrão – 8 segundos (padrão);
//3 - Carne – 15 segundos (padrão);
//4 - Feijão – 12 segundos (padrão);
//5 - Brigadeiro – 8 segundos (padrão);
console.log(menu(5,7));//Abaixo de x - "Tempo insuficiente"
console.log(menu(5,24));//De 2x a 3x - "A comida Queimou"
console.log(menu(5,25));//Acima de 3x - "Kabumm"
console.log(menu(5,15));//Entre x e 2x - "Prato pronto, bom apetite"
console.log(menu(5,));//Caso não digite o tempo - "Prato pronto, bom apetite"
