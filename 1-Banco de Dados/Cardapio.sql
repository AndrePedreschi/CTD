CREATE SCHEMA IF NOT EXISTS `cardapio`;
USE `cardapio` ;
-- -----------------------------------------------------
-- Tabela `cardapio`.`categorias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cardapio`.`categorias` (
  `idCategoria` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(20) NULL,
  `url_imagem` VARCHAR(250) NULL,
  PRIMARY KEY (`idCategoria`));
-- -----------------------------------------------------
-- Tabela `cardapio`.`produtos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cardapio`.`produtos` (
  `idProduto` INT(11) NOT NULL AUTO_INCREMENT,
  `idCategoria` int NOT NULL,
  `nome` VARCHAR(100) NULL,
  `descricao` VARCHAR(300) NULL,
  `imagem` VARCHAR(250) NULL,
  `valor` decimal(5,2) NULL,
  PRIMARY KEY (`idProduto`),
  CONSTRAINT `FKId_Cat`
		FOREIGN KEY  (`idCategoria`)
        REFERENCES `cardapio`.`categorias`(`idCategoria`)
   );
     -- -----------------------------------------------------
-- Tabela `cardapio`.`clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cardapio`.`clientes` (
  `idCliente` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NULL,
  `sobrenome` VARCHAR(100) NULL,
  `cpf` CHAR(11) NULL,
  `nrCelular` CHAR(15) NULL,
  `email` VARCHAR(150) NULL,
  PRIMARY KEY (`idCliente`)
  );
       -- -----------------------------------------------------
-- Tabela `cardapio`.`pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cardapio`.`pedidos` (
  `idPedido` INT(11) NOT NULL AUTO_INCREMENT,
  `idProduto` int NOT NULL,
  `idCliente` int NOT NULL,
  `quantidade` int NULL,
  `precoTotal` decimal(7,2) NULL,
PRIMARY KEY (`idPedido`),
CONSTRAINT `FKId_Prod`
		FOREIGN KEY  (`idProduto`)
        REFERENCES `cardapio`.`produtos`(`idProduto`),
CONSTRAINT `FKId_Cli`
		FOREIGN KEY  (`idCliente`)
        REFERENCES `cardapio`.`clientes`(`idCliente`)
   );
           -- -----------------------------------------------------
-- Tabela `cardapio`.`vendas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cardapio`.`vendas` (
  `idVenda` INT(11) NOT NULL AUTO_INCREMENT,
  `idPedido` int NOT NULL,
  `data_atual` date,
  `hora_atual` time,
  `Total` decimal(7,2) NULL,
PRIMARY KEY (`idVenda`),
CONSTRAINT `FKId_Ped`
		FOREIGN KEY  (`idPedido`)
        REFERENCES `cardapio`.`pedidos`(`idPedido`)
   );

insert into `cardapio`.`categorias` (`nome`, `url_imagem`)
values ('pratos', 'https://img.elo7.com.br/product/main/22565B3/adesivo-parede-prato-comida-frango-salada-restaurante-lindo-adesivo-parede.jpg'),
('lanches', 'http://planoatlas.com.br/wp-content/uploads/2018/07/Lanchonete.jpg'),
('sobremesas', 'https://www.sabornamesa.com.br/media/k2/items/cache/dd45d054dfce696b68bc0b43a11d1bfe_XL.jpg'),
('bebidas', 'https://www.bebidasfamosas.com.br/blog/wp-content/uploads/2018/08/Bebidas-Alco%C3%B3licas-Drinks.jpg');

insert into `cardapio`.`produtos` (`idCategoria`, `nome`, `descricao`, `imagem`, `valor`)
values (1, 'Rosbife com batatas', 'Rosbife fatiado com batata e cebola. Acompanha arroz branco.', 'https://img.cybercook.com.br/imagens/receitas/914/rosbife-com-batatas-e-cebolas-840x480.jpg?q=75',85.30),
(1, 'Macarronada da Nona', 'Macarronada com molho de carne moída. Acompanha queijo parmesão ralado.', 'http://www.lopessupermercados.com.br/portalrevista/wp-content/uploads/2018/06/shutterstock_413580649-e1529706570772.jpg',45.60),
(2, 'Sanduba à moda', 'Pão,hamburguer duplo, ovo, bacon, salsicha e maionese. Acommpanha fritas.', 'https://d1ralsognjng37.cloudfront.net/a2d0cb0f-a1b9-4c20-8c44-014ee3b271e2.jpeg',21.20),
(2, 'Pizza calabreza', 'Muzzarela, tomate, ovo, calabreza.', 'https://image.freepik.com/fotos-gratis/pizza-de-calabresa-isolada-no-branco_317111-45.jpg',45.80),
(3, 'Creme de abacaxi', 'Leite condensado, cubos de abacaxi, creme de leite e coco ralado.', 'https://t2.rg.ltmcdn.com/pt/images/2/3/6/sobremesa_de_abacaxi_para_o_natal_3632_600.jpg',18.00),
(3, 'Torta de bana', 'torta cremosa de banana com canela.', 'https://d1uz88p17r663j.cloudfront.net/resized/19f2935e9039c77e9ebbe40803b12091_soberemesa-quente-banana-receitas-nestle_1200_600.jpg',8.00),
(4, 'Refrigerante', 'Refrigerante vários sabores.', 'https://bolodamadre.com.br/wp-content/uploads/2020/05/refrigerante-lata.jpg',5.00),
(4, 'Cerveja', 'Cerveja puro malte.', 'https://www.puromaltepilsen.com.br/static/img/cervejas.png',12.00);
