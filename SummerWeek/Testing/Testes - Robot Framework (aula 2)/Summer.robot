*** Settings ***
Library         SeleniumLibrary
Library         String
Library         OperatingSystem
Resource        Summer.resource
Test Setup      Abrir o site da aplicação
Test Teardown   Close Browser

*** Test Cases ***
Cadastro
  Clicar no botão (+) para cadastrar um novo filme
  Adicionar uma URL de imagem
  Inserir "Shrék" como título do filme
  Inserir "1 filmê muito legal" a descrição do filme
  Clicar em "Salvar"
  Gerar um arquivo de texto com a descrição do filme

Edição
  Clicar no botão "Detalhes" de um cartão
  Alterar a URL da imagem
  Alterar o título para: "Shèeek"
  Alterar a descrição para: "Descrição alterada"
  Clicar em "Salvar_2"

Exclusão
  Clicar no botão "Detalhes" de um cartão
  Clicar no botão "Deletar"

Favoritar
  Clicar no ícone de estrela
  Clicar na aba "Favoritos"

Desfavoritar
  Clicar na aba "Favoritos"
  Clicar na estrela destacada

