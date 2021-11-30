***Variables***
${SITE}         https://www.saucedemo.com/
${NAVEGADOR}    Chrome
${CAMPO_LOGIN}  css=#user-name
${CAMPO_SENHA}  css=#password
${BOTAO_LOGIN}  css=#login-button
${LOGIN}        standard_user
${SENHA}        secret_sauce
${PRODUTO}      css=#item_4_title_link > div
${ADICIONAR}    css=#add-to-cart-sauce-labs-backpack

***Keywords***
Abrir a loja
  Open Browser  ${SITE}  ${NAVEGADOR}
  Maximize Browser Window
  Set Selenium Speed  0.75

Fazer login
  Input Text         ${CAMPO_LOGIN}  ${LOGIN}
  Input Text         ${CAMPO_SENHA}  ${SENHA}    
  Click Element      ${BOTAO_LOGIN}

Selecionar um produto e colocar no carrinho
  Click Element  ${PRODUTO}
  Click Element  ${ADICIONAR}