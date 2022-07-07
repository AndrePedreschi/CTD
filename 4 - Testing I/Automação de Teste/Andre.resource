
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
${CARRINHO}     css=#shopping_cart_container > a
${CHECKOUT}     css=#checkout
${NOME}         css=#first-name
${SOBRENOME}    css=#last-name
${CEP}          css=#postal-code
${CONTINUE}     css=#continue
${TOTAL}        css=#checkout_summary_container > div > div.summary_info > div.summary_total_label
${TEXTO}        $32.39
${FINISH}       css=#finish
${TEXTOCONFIRM} THANK YOU FOR YOUR ORDER
${CONFIRMPATH}  css=#checkout_complete_container > h2

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

Abrir o carrinho e fazer o checkout
  Wait Until Element is Visible  ${CARRINHO}
  Click Element  ${CARRINHO}
  Click Element  ${CHECKOUT}

Preencher dados do cliente
  Input Text      ${NOME}  André
  Input Text      ${SOBRENOME}  Pedreschi
  Input Text      ${CEP}  000000000
  Click Element   ${CONTINUE}

Confirmar valor total e finalizar compra
  Element Should Contain  ${TOTAL}  ${TEXTO}
  Click Element   ${FINISH}

Confirmar a compra
  Element Should Contain  ${CONFIRMPATH}  ${TEXTOCONFIRM}

### Keywords Personalizadas ###
Wait and Click
  [Arguments]                       ${ELEMENTO}
  Wait Until Element is Visible     ${ELEMENTO}
  Click Element                     ${ELEMENTO}

Wait and Imput Text
  [Arguments]                       ${CAMPO}  ${TEXT}
  Wait Until Element is Visible     ${CAMPO}
  Input Text                        ${CAMPO}  ${TEXT}