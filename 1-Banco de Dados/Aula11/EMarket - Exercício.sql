-- Parte 1 - Categoias e produtos
SELECT CategoriaNome, Descricao FROM emarket.categorias;

SELECT ProdutoNome FROM emarket.produtos;

select count(*) as prod_descontinuado from emarket.produtos where Descontinuado = 1;

select * from emarket.produtos where provedorID=8;

select * from emarket.produtos where PrecoUnitario between 10 and 22;

select * from emarket.produtos where UnidadesEstoque < NivelReabastecimento;

select * from emarket.produtos where UnidadesEstoque < NivelReabastecimento and UnidadesPedidas = 0;


select * from emarket.clientes
order by ClienteID 
limit 21
offset 10;

select * from emarket.clientes
where Titulo like upper('O%')
order by ClienteID 
limit 21
offset 10;

--  Queries I - Parte I - Clientes
-- 1) Obtenha uma lista de todos os clientes com contato, empresa, cargo, País. Classifique a lista por país.
SELECT Contato,Empresa,Titulo as cargo,Pais FROM emarket.clientes
order by Pais

-- 2) Queremos atender todos os clientes que possuem o título de  “Proprietário". Esse título estará em inglês (Owner).
SELECT Contato,Empresa,Titulo as cargo,Pais FROM emarket.clientes
where titulo = 'Owner' 
order by contato asc

-- 3) A operadora de telefonia atendeu um cliente e não lembra o nome dele. Sabe apenas que começa com "C". Podemos ajudá-lo a obter uma lista com
-- todos os contatos que começam com a letra C?

select * from emarket.clientes
where contato like ('C%')

-- Queries I - Parte I - Faturas
-- 1) Obtenha uma lista de todas as faturas, ordenadas por data da fatura em ordem ascendente.

select * from emarket.faturas
order by DataFatura asc

-- 2) Agora é necessário uma lista de faturas com o país de envio "EUA" e
-- que a FormaeEnvio seja diferente de 3.

select * from emarket.faturas
where PaisEnvio = 'USA' and FormaEnvio <> 3

-- 3) O cliente 'GOURL' fez um pedido?
-- Sim!
select * from emarket.faturas
where ClienteID = 'GOURL'

-- 4) Você deseja visualizar todas as faturas dos funcionários 2, 3, 5, 8 e 9.
select FaturaId from emarket.faturas
where EmpregadoID = 2 or EmpregadoID = 3 or EmpregadoID = 5 or EmpregadoID = 8 or EmpregadoID = 9

select FaturaId from emarket.faturas
where EmpregadoID in (2,3,5,8,9)


-- Queries I - Parte II - Produtos
-- 1) Obtenha a lista de todos os produtos em ordem decrescente por preço unitário.

Select * from produtos
order by precounitario desc

-- 2) Obtenha a lista dos 5 melhores produtos cujo preço unitário é o mais "Caro".
Select * from produtos


-- 3) Obtenha um top 10 dos produtos com mais unidades em estoque.
Select * from produtos
order by UnidadesEstoque desc
limit 10

-- Queries I - Parte II - DetalheFatura
-- 1) Obtenha uma lista de FaturaId, Produto, Quantidade. 

-- 2) Classifique a lista acima por Quantidade decrescente. 

-- 3) Filtre a mesma lista apenas para os produtos cuja quantidade esteja entre 50 e 100. 

-- 4) Em outra nova consulta, obtenha uma lista com os seguintes nomes de coluna: Número da fatura (FaturaId), Produto (ProdutoId), 
-- Total (Preço Unitário * Quantidade)


