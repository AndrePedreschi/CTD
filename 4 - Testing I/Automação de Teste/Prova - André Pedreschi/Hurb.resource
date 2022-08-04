***Variables***
${SITE}         https://www.hurb.com/br
${NAVEGADOR}    Firefox
${BTN_COOKIES}  xpath=//*[@id="CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"]
${BTN_PACOTES}  xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[1]/div/div/button[2]
${INPUT_CIDADE}  xpath=//*[@id="destination-input"]
${1#CIDADE}  TÓQUIO
${BTN_PESQUISAR}  xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[2]/button
${PACOTE}  xpath=//*[@id="__next"]/div/main/section/div[2]/a/div[1]/img
${BTN_ESCOLHER_PACOTE}  xpath=//*[@id="__next"]/div/main/div[3]/aside/div/div/div[2]/button
${1#RADIO_PACOTE}  css=#LGPKG-1140178-2779860
${BTN_PROXIMO}  css=.h-1yuatql
${BTN_DIARIAS}  css=button.h-cqz66k:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)
${BTN_PROXIMO2}  css=.h-1yuatql                      
${BTN_IR_PAGAMENTO}  css=.h-1yuatql
${PATH_CONFIGURACAO}  xpath=/html/body/div[3]/div/div[1]/div[1]/div[6]/div/div/div[2]/div[2]
${1#TEXTO_CONFIGURACAO}  7 diárias\n1 pessoa por pacote
${PATH_PERIODO1}  xpath=/html/body/div[3]/div/div[1]/div[1]/div[7]/div/div/div[2]/div[2]
${1#TEXTO_PERIODO1}  01 Mar 2023
${PATH_PERIODO2}  xpath=/html/body/div[3]/div/div[1]/div[1]/div[7]/div/div/div[3]/div[2]
${1#TEXTO_PERIODO2}  30 Nov 2023
${BTN_BOLETO}  xpath=//*[@id="ui-id-1"]
${INPUT_NOME_PAGADOR}  xpath=//*[@id="paymentMethods__bill"]/section/div[1]/div[1]/div/input
${TEXTO_NOME_PAGADOR}  André Rabelo de Castro Pedreschi
${INPUT_CPF}  xpath=//*[@id="paymentMethods__bill"]/section/div[1]/div[2]/div/input
${TEXTO_CPF}  705.127.670-09
${INPUT_CELULAR}  xpath=//*[@id="paymentMethods__bill"]/section/div[2]/div[1]/div/input
${TEXTO_CELULAR}  (11) 99000-0000
${CHECKBOX}  xpath=//*[@id="cancellation-policy"]
${PATH_CANCELAMENTO}  xpath=//*[@id="purchase-confirmation"]/div[1]/div/div/div[2]
${TEXTO_CANCELAMENTO}  Cancelamento Grátis! 

${2#CIDADE}  LISBOA
${2#RADIO_PACOTE}  css=#LGPKG-1375634-3022543
${2#TEXTO_CONFIGURACAO}  7 diárias\n1 pessoa por pacote
${2#TEXTO_PERIODO1}  01 Mar 2024
${2#TEXTO_PERIODO2}  30 Nov 2024

${3#CIDADE}  AMSTERDAM
${3#RADIO_PACOTE}  css=#LGPKG-1253806-2898358
${3#TEXTO_CONFIGURACAO}  6 diárias\n1 pessoa por pacote
${3#TEXTO_PERIODO1}  01 Mar 2023
${3#TEXTO_PERIODO2}  30 Nov 2023

${4#CIDADE}  EGITO
${4#RADIO_PACOTE}  css=#LGPKG-1097998-2727802
${4#TEXTO_CONFIGURACAO}  8 diárias\n1 pessoa por pacote
${4#TEXTO_PERIODO1}  15 Set 2022
${4#TEXTO_PERIODO2}  30 Nov 2022


***Keywords***
1 - Abrir o site
  Open Browser                      ${SITE}  ${NAVEGADOR}
  Maximize Browser Window
  Set Selenium Speed  0.75
  

1 - Clicar em “Permitir todos os cookies”
  Sleep  5
  Wait and Click                    ${BTN_COOKIES}

1 - Selecionar a opção “Pacotes”
  Wait and Click                    ${BTN_PACOTES}

1 - Buscar por alguma cidade turística
  Wait and Imput Text               ${INPUT_CIDADE}  ${1#CIDADE}
  Wait and Click                    ${BTN_PESQUISAR}

1 - Selecionar um pacote de viagem
  
  Wait and Click                    ${PACOTE}

1 - Clicar em “Escolher pacote”
  Switch Window  NEW
  Wait and Click                    ${BTN_ESCOLHER_PACOTE}

1 - Selecionar as opções do pacote e clicar em “Ir para pagamento”
  Wait and Click                    ${1#RADIO_PACOTE} 
  Click Element                     ${BTN_PROXIMO}
  Wait and Click                    ${BTN_DIARIAS}
  Click Element                     ${BTN_PROXIMO2}
  Click Element                     ${BTN_IR_PAGAMENTO}

1 - Validar as informações da “Configuração” da viagem
  Sleep  5
  Element Should Contain            ${PATH_CONFIGURACAO}  ${1#TEXTO_CONFIGURACAO}

1 - Validar as informações do período da viagem
  Element Should Contain            ${PATH_PERIODO1}  ${1#TEXTO_PERIODO1}
  Element Should Contain            ${PATH_PERIODO2}  ${1#TEXTO_PERIODO2}

1 - Selecionar a opção “Boleto parcelado” 
  Wait and Click                    ${BTN_BOLETO}

1 - Preencher os dados de pagamento
  Wait and Imput Text               ${INPUT_NOME_PAGADOR}  ${TEXTO_NOME_PAGADOR}
  Wait and Imput Text               ${INPUT_CPF}  ${TEXTO_CPF}
  Wait and Imput Text               ${INPUT_CELULAR}  ${TEXTO_CELULAR}

1 - Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
  Wait Until Element is Visible     ${CHECKBOX}
  Select Checkbox                   ${CHECKBOX}

1 - Validar a informação sobre cancelamento grátis
  Element Should Contain            ${PATH_CANCELAMENTO}  ${TEXTO_CANCELAMENTO}










2 - Abrir o site
  Open Browser                      ${SITE}  ${NAVEGADOR}
  Maximize Browser Window
  Set Selenium Speed  0.75
  

2 - Clicar em “Permitir todos os cookies”
  Sleep  5
  Wait and Click                    ${BTN_COOKIES}

2 - Selecionar a opção “Pacotes”
  Wait and Click                    ${BTN_PACOTES}

2 - Buscar por alguma cidade turística
  Wait and Imput Text               ${INPUT_CIDADE}  ${2#CIDADE}
  Wait and Click                    ${BTN_PESQUISAR}

2 - Selecionar um pacote de viagem
  
  Wait and Click                    ${PACOTE}

2 - Clicar em “Escolher pacote”
  Switch Window  NEW
  Wait and Click                    ${BTN_ESCOLHER_PACOTE}

2 - Selecionar as opções do pacote e clicar em “Ir para pagamento”
  Wait and Click                    ${2#RADIO_PACOTE} 
  Click Element                     ${BTN_PROXIMO}
  Wait and Click                    ${BTN_DIARIAS}
  Click Element                     ${BTN_PROXIMO2}
  Click Element                     ${BTN_IR_PAGAMENTO}

2 - Validar as informações da “Configuração” da viagem
  Sleep  5
  Element Should Contain            ${PATH_CONFIGURACAO}  ${2#TEXTO_CONFIGURACAO}

2 - Validar as informações do período da viagem
  Element Should Contain            ${PATH_PERIODO1}  ${2#TEXTO_PERIODO1}
  Element Should Contain            ${PATH_PERIODO2}  ${2#TEXTO_PERIODO2}

2 - Selecionar a opção “Boleto parcelado” 
  Wait and Click                    ${BTN_BOLETO}

2 - Preencher os dados de pagamento
  Wait and Imput Text               ${INPUT_NOME_PAGADOR}  ${TEXTO_NOME_PAGADOR}
  Wait and Imput Text               ${INPUT_CPF}  ${TEXTO_CPF}
  Wait and Imput Text               ${INPUT_CELULAR}  ${TEXTO_CELULAR}

2 - Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
  Wait Until Element is Visible     ${CHECKBOX}
  Select Checkbox                   ${CHECKBOX}

2 - Validar a informação sobre cancelamento grátis
  Element Should Contain            ${PATH_CANCELAMENTO}  ${TEXTO_CANCELAMENTO}










3 - Abrir o site
  Open Browser                      ${SITE}  ${NAVEGADOR}
  Maximize Browser Window
  Set Selenium Speed  0.75
  

3 - Clicar em “Permitir todos os cookies”
  Sleep  5
  Wait and Click                    ${BTN_COOKIES}

3 - Selecionar a opção “Pacotes”
  Wait and Click                    ${BTN_PACOTES}

3 - Buscar por alguma cidade turística
  Wait and Imput Text               ${INPUT_CIDADE}  ${3#CIDADE}
  Wait and Click                    ${BTN_PESQUISAR}

3 - Selecionar um pacote de viagem
  
  Wait and Click                    ${PACOTE}

3 - Clicar em “Escolher pacote”
  Switch Window  NEW
  Wait and Click                    ${BTN_ESCOLHER_PACOTE}

3 - Selecionar as opções do pacote e clicar em “Ir para pagamento”
  Wait and Click                    ${3#RADIO_PACOTE} 
  Click Element                     ${BTN_PROXIMO}
  Wait and Click                    ${BTN_DIARIAS}
  Click Element                     ${BTN_PROXIMO2}
  Click Element                     ${BTN_IR_PAGAMENTO}

3 - Validar as informações da “Configuração” da viagem
  Sleep  5
  Element Should Contain            ${PATH_CONFIGURACAO}  ${3#TEXTO_CONFIGURACAO}

3 - Validar as informações do período da viagem
  Element Should Contain            ${PATH_PERIODO1}  ${3#TEXTO_PERIODO1}
  Element Should Contain            ${PATH_PERIODO2}  ${3#TEXTO_PERIODO2}

3 - Selecionar a opção “Boleto parcelado” 
  Wait and Click                    ${BTN_BOLETO}

3 - Preencher os dados de pagamento
  Wait and Imput Text               ${INPUT_NOME_PAGADOR}  ${TEXTO_NOME_PAGADOR}
  Wait and Imput Text               ${INPUT_CPF}  ${TEXTO_CPF}
  Wait and Imput Text               ${INPUT_CELULAR}  ${TEXTO_CELULAR}

3 - Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
  Wait Until Element is Visible     ${CHECKBOX}
  Select Checkbox                   ${CHECKBOX}

3 - Validar a informação sobre cancelamento grátis
  Element Should Contain            ${PATH_CANCELAMENTO}  ${TEXTO_CANCELAMENTO}










4 - Abrir o site
  Open Browser                      ${SITE}  ${NAVEGADOR}
  Maximize Browser Window
  Set Selenium Speed  0.75
  

4 - Clicar em “Permitir todos os cookies”
  Sleep  5
  Wait and Click                    ${BTN_COOKIES}

4 - Selecionar a opção “Pacotes”
  Wait and Click                    ${BTN_PACOTES}

4 - Buscar por alguma cidade turística
  Wait and Imput Text               ${INPUT_CIDADE}  ${4#CIDADE}
  Wait and Click                    ${BTN_PESQUISAR}

4 - Selecionar um pacote de viagem
  
  Wait and Click                    ${PACOTE}

4 - Clicar em “Escolher pacote”
  Switch Window  NEW
  Wait and Click                    ${BTN_ESCOLHER_PACOTE}

4 - Selecionar as opções do pacote e clicar em “Ir para pagamento”
  Wait and Click                    ${4#RADIO_PACOTE} 
  Click Element                     ${BTN_PROXIMO}
  Wait and Click                    ${BTN_DIARIAS}
  Click Element                     ${BTN_PROXIMO2}
  Click Element                     ${BTN_IR_PAGAMENTO}

4 - Validar as informações da “Configuração” da viagem
  Sleep  5
  Element Should Contain            ${PATH_CONFIGURACAO}  ${4#TEXTO_CONFIGURACAO}

4 - Validar as informações do período da viagem
  Element Should Contain            ${PATH_PERIODO1}  ${4#TEXTO_PERIODO1}
  Element Should Contain            ${PATH_PERIODO2}  ${4#TEXTO_PERIODO2}

4 - Selecionar a opção “Boleto parcelado” 
  Wait and Click                    ${BTN_BOLETO}

4 - Preencher os dados de pagamento
  Wait and Imput Text               ${INPUT_NOME_PAGADOR}  ${TEXTO_NOME_PAGADOR}
  Wait and Imput Text               ${INPUT_CPF}  ${TEXTO_CPF}
  Wait and Imput Text               ${INPUT_CELULAR}  ${TEXTO_CELULAR}

4 - Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
  Wait Until Element is Visible     ${CHECKBOX}
  Select Checkbox                   ${CHECKBOX}

4 - Validar a informação sobre cancelamento grátis
  Element Should Contain            ${PATH_CANCELAMENTO}  ${TEXTO_CANCELAMENTO}
























### Keywords Personalizadas ###
Wait and Click
  [Arguments]                       ${ELEMENTO}
  Wait Until Element is Visible     ${ELEMENTO}
  Click Element                     ${ELEMENTO}

Wait and Imput Text
  [Arguments]                       ${CAMPO}  ${TEXT}
  Wait Until Element is Visible     ${CAMPO}
  Input Text                        ${CAMPO}  ${TEXT}