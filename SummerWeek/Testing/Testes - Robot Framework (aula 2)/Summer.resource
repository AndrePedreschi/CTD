*** Variables ***
${SITE}                     http://localhost:3000/
${NAVEGADOR}                Chrome
${BOTAO_CADASTRAR}          css=#root > button
${CAMPO_IMAGEM}             css=#formUrl
${URL_IMAGEM}               https://s2.glbimg.com/y1bduR7O9iMxVj0tVP5U6IsSSeY=/0x0:607x350/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_ba3db981e6d14e54bb84be31c923b00c/internal_photos/bs/2021/h/3/2priFtRwykPwl34XyDkA/2018-05-18-shrek.jpg
${CAMPO_TITULO}             css=#formTitle
${TITULO}                   Shrék
${CAMPO_DESCRICAO}          css=#formDescription
${DESCRICAO}                1 filmê muito legal
${BOTAO_SALVAR}             css=body > div.fade.modal.show > div > div > div.modal-footer > button
${BOTAO_SALVAR_2}           css=body > div.fade.modal.show > div > div > div.modal-footer > button.btn.btn-success
${BOTAO_DETALHES}           css=#uncontrolled-tab-example-tabpane-all > div > div > div:nth-child(1) > div > div > button
${NOVA_URL_IMAGEM}          https://www.magazine-hd.com/apps/wp/wp-content/uploads/2017/04/Carros_3.jpg
${NOVO_TITULO}              Shèeek
${NOVA_DESCRICAO}           Descrição alterada
${BOTAO_DELETAR}            css=body > div.fade.modal.show > div > div > div.modal-footer > button.btn.btn-danger
${ICONE_ESTRELA}            css=#uncontrolled-tab-example-tabpane-all > div > div > div:nth-child(1) > div > span
${ABA_FAVORITOS}            ss=#uncontrolled-tab-example-tab-favorites
${ICONE_ESTRELA_DESTACADA}  css=#uncontrolled-tab-example-tabpane-favorites > div > div > div > div > span
${AREA_DESCRICAO}           css=#uncontrolled-tab-example-tabpane-all > div > div > div:nth-child(1) > div > div > p
${CAMINHO}                  C:\SummerWeek QA\Testes Automatizados\
${ARQUIVO}                  Descricao.txt

*** Keywords ***
Abrir o site da aplicação
  Open Browser                  ${SITE}                 ${NAVEGADOR}
  Maximize Browser Window

Clicar no botão (+) para cadastrar um novo filme
  Wait and Click                ${BOTAO_CADASTRAR}

Adicionar uma URL de imagem
  Wait and Input Text           ${CAMPO_IMAGEM}         ${URL_IMAGEM}

Inserir "Shrék" como título do filme
  Wait and Input Text           ${CAMPO_TITULO}         ${TITULO}

Inserir "1 filmê muito legal" a descrição do filme
  Wait and Input Text           ${CAMPO_DESCRICAO}      ${DESCRICAO}

Clicar em "Salvar"
  Wait and Click                ${BOTAO_SALVAR}

Clicar no botão "Detalhes" de um cartão
  Wait and Click                ${BOTAO_DETALHES}

Alterar a URL da imagem
  Wait and Input Text           ${CAMPO_IMAGEM}         ${NOVA_URL_IMAGEM}

Alterar o título para: "Shèeek"
  Wait and Input Text           ${CAMPO_TITULO}         ${NOVO_TITULO}

Alterar a descrição para: "Descrição alterada"
  Wait and Input Text           ${CAMPO_DESCRICAO}      ${NOVA_DESCRICAO}

Clicar em "Salvar_2"
  Wait and Click                ${BOTAO_SALVAR_2}

Clicar no botão "Deletar"
  Wait and Click                ${BOTAO_DELETAR}

Clicar no ícone de estrela
  Wait and Click                ${ICONE_ESTRELA}

Clicar na aba "Favoritos"
  Wait and Click                ${ABA_FAVORITOS}

Clicar na estrela destacada
  Wait and Click                ${ICONE_ESTRELA_DESTACADA}

Gerar um arquivo de texto com a descrição do filme
  ${DATA}           Get Text                            ${AREA_DESCRICAO}
  Create File                   ${CAMINHO}${ARQUIVO}    ${DATA}
  


Wait and Click
  [Arguments]                       ${ELEMENTO}
  Wait Until Element is Visible     ${ELEMENTO}
  Wait Until Element is Enabled     ${ELEMENTO}
  Click Element                     ${ELEMENTO}

Wait and Input Text
  [Arguments]                       ${ELEMENTO}  ${TEXTO}
  Wait Until Element is Visible     ${ELEMENTO}
  Wait Until Element is Enabled     ${ELEMENTO}
  Input Text                        ${ELEMENTO}  ${TEXTO}