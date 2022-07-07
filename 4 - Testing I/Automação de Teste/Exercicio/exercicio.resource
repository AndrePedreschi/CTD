***Variables***
${SITE}         https://bugbank.netlify.app/
${NAVEGADOR}    Chrome
${CAMPO_LOGIN}  xpath=//*[@id="__next"]/div/div[2]/div/div[1]/form/div[1]/input
${CAMPO_SENHA}  xpath=//*[@id="__next"]/div/div[2]/div/div[1]/form/div[2]/div/input
${BOTAO_LOGIN}  xpath=//*[@id="__next"]/div/div[2]/div/div[1]/form/div[3]/button[1]
${LOGIN}        a@a.com
${SENHA}        1234
${BTNEXTRATO}   id=btn-EXTRATO
${SALDO1ID}     id=textBalanceAvailable
${SALDO1TEXTO}  R$ 1.000,00  
${SALDO2ID}     id=textTransferValue
${SALDO2TEXTO}  R$ 1.000,00
${BTNSAIR}      xpath=//*[@id="__next"]/div/div[1]/div


***Keywords***
Abrir o site
  Open Browser                      ${SITE}  ${NAVEGADOR}
  Maximize Browser Window
  Set Selenium Speed  0.75

Logar
  Input Text                        ${CAMPO_LOGIN}  ${LOGIN}
  Input Text                        ${CAMPO_SENHA}  ${SENHA}   
  Wait Until Element is Visible     ${BOTAO_LOGIN} 
  Click Element                     ${BOTAO_LOGIN}

Extrato
  Wait Until Element is Visible     ${BTNEXTRATO}
  Click Element                     ${BTNEXTRATO}
  Element Should Contain            ${SALDO1ID}  ${SALDO1TEXTO}
  Element Should Contain            ${SALDO2ID}  ${SALDO2TEXTO}

Sair
  Wait Until Element is Visible     ${BTNSAIR}
  Click Element                     ${BTNSAIR}
