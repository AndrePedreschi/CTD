# robot .\Andre.robot

*** Settings***
Library  SeleniumLibrary
Resource  ./Andre.resource
Test Teardown  Close Browser
***Test Case***
Processo de compra da loja Sauce Demo
  Abrir a loja
  Fazer login
  Selecionar um produto e colocar no carrinho