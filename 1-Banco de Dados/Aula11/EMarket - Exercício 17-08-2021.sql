-- Lista de participantes:
-- Daniel Fontoura
-- Rodrigo Costa Valle
-- André Pedreschi
-- Breno Sabino
-- Danielle Alves 
-- Luiz de Souza
-- Isabelle de Almeida Leite

-- 1. Para cada empresa de correio, calcule o transporte total. Inclua todas as empresas de correio, mesmo que não tenham realizado nenhuma operação.

Select correios.Empresa, correios.CorreioID, sum(faturas.transporte) Total_Transporte
from  faturas
right join correios
on faturas.FormaEnvio = correios.CorreioID
group by correios.Empresa;


-- 2. Liste as informações de contato (ou, endereço, etc.) dos clientes que não fizeram compras. Exiba as informações no formato considerado mais adequado. 
-- Por exemplo: <endereço> (CP: < CEP>) 

Select clientes.Contato, concat('CEP: ', clientes.CodigoPostal) "ENDEREÇO"
from clientes
left join faturas
on clientes.ClienteID = faturas.ClienteID
where FaturaId is null;



-- 3. Liste as categorias e seus produtos, incluindo as categorias para as quais não há produtos no banco de dados.
-- Para nomes de produtos, onde mix ou Chef diz, substituí-lo por MIX ou CHEF, respectivamente. Por exemplo: Em vez de Filo Mix, coloque Mix Edge.

select categorias.CategoriaNome, upper(produtos.ProdutoNome)
from categorias
left join produtos
on categorias.CategoriaID = produtos.CategoriaID;




-- Faça uma consulta sobre o faturamento do e-market. Inclua as seguintes informações:
-- ID da fatura
-- data da fatura
-- nome da empresa de correio (O id da empresa consta da tabela faturas no campo FormaEnvio)
-- nome do cliente
-- categoria do produto vendido
-- nome do produto(Você chega ao produto consultando os detalhes da fatura)
-- preço unitário
-- quantidade

select faturas.FaturaId, faturas.DataFatura, clientes.Empresa Cliente, correios.Empresa Empresa_de_Transporte, categorias.CategoriaNome Categoria, produtos.ProdutoNome Produto, produtos.PrecoUnitario, produtos.QuantidadePorUnidade -- , empregados.Nome 
from faturas
inner join correios on Faturas.FormaEnvio = Correios.CorreioID
inner join clientes on faturas.ClienteID = clientes.ClienteID
inner join detalhefatura on detalhefatura.FaturaId = faturas.faturaId
INNER JOIN Produtos ON DetalheFatura.ProdutoID = Produtos.ProdutoID
INNER JOIN Categorias ON Produtos.CategoriaID = Categorias.CategoriaID
-- inner join empregados on empregados.EmpregadoID = faturas.EmpregadoID;





adriano de souza
Daniel Fontoura
Victor Leao Arthur Campolina
Bruno mourão
andré pedresschi


-- Relatórios II parte II - INNER, LEFT e RIGHT JOIN

-- 1.	Liste todas as categorias junto com informações sobre seus produtos. Incluir todas as categorias, mesmo que não tenham produtos.
-- 2.	Liste as informações de contato de clientes que nunca compraram no emarket.
-- 3.	Faça uma lista de produtos. Para cada um, indique seu nome, categoria e as informações de contato de seu fornecedor. Lembre-se que podem existir produtos para os quais o fornecedor não foi indicado.
-- 4.	Para cada categoria, liste o preço unitário médio de seus produtos.
-- 5.	Para cada cliente, indique a última nota fiscal de compra. Inclua clientes que nunca compraram no e-market.
-- 6.	Todas as faturas têm uma empresa de correio associada (envio). Gere uma lista com todas as empresas de correio e o número de faturas correspondentes. Execute a consulta usando RIGHT JOIN.








