-- Referência de Tabelas #1 - Faça uma consulta no banco de dados onde mostre todos os registros 
-- que contenham músicas com seus gêneros, E que o compositor seja Willie Dixon, E que tenham o gênero Blues. 
-- A 2ª música encontrada foi:
-- 'Pretty Baby'

select cancoes.nome, generos.nome 
from musimundos.cancoes
inner join musimundos.generos
on cancoes.id_genero = generos.id
where cancoes.compositor = "Willie Dixon" and generos.nome = "Blues";

-- Joins #1 - Faça uma consulta ao nosso banco de dados que nos retorna as únicas músicas que possuem gênero rock. 
-- Qual é a música que aparece em quarto lugar?
-- Restless and Wild

select cancoes.nome, generos.nome 
from musimundos.cancoes
inner join musimundos.generos
on cancoes.id_genero = generos.id
where generos.nome = "Rock";

-- Joins #2 -Faça uma consulta ao nosso banco de dados que nos traga o título do álbum e o autor, para saber se o 
-- que estamos vendendo está correto.Qual o título do álbum que aparece na posição número 10?
-- Stormbringer

select distinct albuns.titulo, cancoes.compositor
from albuns
left join cancoes
on albuns.id_artista = cancoes.id_album;

select distinct albuns.titulo, artistas.nome
from albuns
inner join artistas
on albuns.id_artista = artistas.id;


select distinct albuns.titulo, cancoes.compositor
from albuns
inner join cancoes
on albuns.id_artista = cancoes.id_album;

select distinct albuns.titulo from albuns;






-- Joins #3 - Faça uma consulta que retorne o nome das músicas e o tipo de arquivo "MPEG audio file". 
-- Qual o nome da músca que aparece na posição número 4?
-- Inject the venon

select cancoes.nome, tipos_de_arquivo.nome 
from cancoes
inner join tipos_de_arquivo
on tipos_de_arquivo.id = cancoes.id_tipo_de_arquivo
where tipos_de_arquivo.nome = "MPEG audio file";

-- Distinct #1 - Faça uma consulta na tabela empregados. O cargo que aparece na 3a. posição é:
-- Sales Suport Agent

select distinct titulo from empregados;

-- Distinct #2 - Ranking cancoes: Faça uma consulta com o nome de todas as músicas que estão em 
-- uma lista de reprodução, e o nome da lista de reprodução a que pertencem.Observação! 
-- Tenhamos cuidado para não repetir os nomes das músicas.Para esta consulta, teremos que usar informações 
-- das tabelas cancoes, cancoes_playlists e playlists. O título da música na 5a. posição é:
-- Princess of the Dawn

select distinct cancoes.nome 
from cancoes
inner join cancoes_playlists
on cancoes.id = cancoes_playlists.id_cancao
inner join playlists
on cancoes_playlists.id_playlist = playlists.id;

-- Funcoes MySQL I #1 - Ranking cancoes 2: O departamento de desenvolvimento da Musimundos está preparando a
-- parte do aplicativo em que acessamos uma determinada música. Eles nos dizem que um texto específico deve aparecer 
-- abaixo da imagem da música:"A música" (nome do tema) "foi composta por" (compositor do tema).Faça uma consulta ao nosso 
-- banco de dados que nos traga o nome e o compositor de cada música, sem repetições, adicionando o texto acima. O primeiro resultado é:
-- A música For Those About To Rock (We Salute You) foi composta por Angus Young, Malcolm Young, Brian Johnson

select concat("A música"," ", nome," ", "foi composta por"," ", compositor) 
from cancoes;

-- Funcoes MySQL I #2 - Faturas: Faça uma consulta ao banco de dados que nos traga a primeira coluna não nula que encontrar entre as colunas 
-- estado_cobranca, pais_cobranca e cep_cobranca. O primeiro resultado obtido é:
-- Germany

select coalesce(estado_cobranca, pais_cobranca, cep_cobranca) from faturas;

-- Funcoes MySQL I #3 - Idade Empregados: Faça uma consulta no banco de dados que mostre a diferença entre sua data de nascimento e a data de contratação.
-- Digite a terceira diferença que você obteve. 
-- DICA: Lembre-se de que DATEDIFF () retorna a diferença entre as datas expressas em DIAS. 
-- Levando isso em consideração e sabendo que um ano tem 365 dias, como você faria a consulta?Para ajudá-lo, apresentamos a função FLOOR (), que arredonda 
-- qualquer número para casas decimais.
-- 27
select floor((datediff(data_contratacao, data_nascimento)/365)) from empregados;



-- Funções MySQL I #4 - Última fatura: Faça uma consulta ao banco de dados que traga todas as faturas do cliente número 2 solicitadas por sua data e extraia o mês. 
-- Qual foi o mês da sua última fatura?
-- 12

Select valor_total, extract(month from data_fatura)
from faturas
where id_cliente = '2'
order by data_fatura;

-- exercício mesa de trabalho 16/09/2021
-- Crie uma View com os seguintes dados do cliente: Id, contato, Fax e o telefone.

create view informacoes_clientes as 
select clientes.ClienteID, clientes.Contato, clientes.Fax, clientes.Telefone
from clientes;

select * from informacoes_clientes;


-- 2. Liste os números de telefone dos clientes que não possuem fax.
-- Faça isso de duas maneiras diferentes:
-- a. Consultando a tabela clientes
-- b. Consultando a view do cliente

create view clientessemfax as
select clientes.ClienteID, clientes.Contato, clientes.Fax, clientes.Telefone
from clientes
where clientes.Fax = '';


select * from informacoes_clientes
where Fax = '';

-- Crie uma view com os seguintes dados do fornecedor: Id, contato,
-- empresa e endereço. Para o endereço, pegue o endereço, cidade, código
-- postal e país.

create view dadosfornecedor as
select provedores.ProvedorID, provedores.Contato, provedores.Empresa, provedores.Endereco, provedores.Cidade, provedores.CodigoPostal, provedores.Pais
from provedores;

select * from dadosfornecedor
-- where Endereco like "Av.%";
where Endereco = 'Av. das Americanas 12.890';
drop view dadosfornecedor;



-- 1) Empregados
-- Crie uma SP que liste os sobrenomes e nomes dos empregados, ordenados alfabeticamente.
-- Invoque a SP para verificar o resultado.
DELIMITER $$
CREATE PROCEDURE EMPREGADOS()
BEGIN
SELECT nome, sobrenome from empregados
order by nome asc;
END $$

CALL EMPREGADOS ();


-- 2) Empregados por cidade
-- Crie uma SP que leva o nome de uma cidade e lista os funcionários dessa cidade
-- Invoque a SP para listar os empregados de Seattle.
DELIMITER $$
CREATE PROCEDURE EMPREGADOS_CID(IN cid_1 varchar(15))
BEGIN
SELECT cidade, nome, sobrenome from empregados
where cidade = cid_1;
END $$

CALL EMPREGADOS_CID ('Seattle');





-- 3) Clientes por país
-- Crie uma SP que recebe o nome de um país e retorne o número de clientes naquele país.
-- Invoque a SP para consultar a quantidade de clientes de Portugal.

-- Versão 1
DELIMITER $$
CREATE PROCEDURE CLIENTES_PAIS(IN pais_1 varchar(15))
BEGIN
SELECT count(Empresa)  from clientes
where Pais = pais_1;
END $$
CALL CLIENTES_PAIS ('Portugal');

-- Versão 2
DELIMITER $$
CREATE PROCEDURE CLIENTES_PAIS2(IN pais_1 varchar(15), out qtd_clientes_pais int)
BEGIN
SELECT count(Empresa) into qtd_clientes_pais from clientes
where Pais = pais_1;
END $$


CALL CLIENTES_PAIS2 ('Portugal', @qt);
select @qt;


-- 4) Produtos sem estoque
-- Crie uma SP que receba um número e liste os produtos cujo estoque está abaixo desse número.
-- O resultado deve mostrar o nome do produto, o Estoque atual e o nome da categoria à qual o produto pertence.
-- Liste os produtos com menos de 10 unidades no estoque;
-- Liste os produtos sem estoque.
select * from produtos;
select * from categorias;

DELIMITER $$
create procedure PRODUT_ESTOQ(IN NUMERO INT)
BEGIN
select produtos.ProdutoNome, produtos.UnidadesEstoque, categorias.CategoriaNome from produtos
inner join categorias
on categorias.CategoriaID = produtos.CategoriaID
where produtos.UnidadesEstoque< NUMERO;
END $$

CALL PRODUT_ESTOQ (10);


-- 5) Vendas com desconto
-- Crie uma SP que receba uma porcentagem e lista os nomes dos produtos que foram vendidos com desconto igual ou 
-- superior ao valor indicado, indicando, também,  o nome do cliente a quem foi vendido.
-- Liste as informações dos produtos que foram vendidos com um desconto superior a 10%.
DELIMITER $$
CREATE PROCEDURE DESC_VENDAS(IN DESC_1 varchar(20))
BEGIN
select produtos.ProdutoNome, detalhefatura.Desconto 
from produtos
inner join detalhefatura
on produtos.ProdutoID = detalhefatura.ProdutoID
where detalhefatura.desconto >= (DESC_1/100);
end $$

CALL DESC_VENDAS ('0.1');


DELIMITER $$
CREATE PROCEDURE DESC_VENDAS2(IN DESC_1 varchar(20), out lista_prod varchar(20))

Begin
select p.ProdutoNome, df.Desconto, c.Empresa, (df.PrecoUnitario / 100) as Porcetagem From faturas as f
inner join clientes as c on c.ClienteID= f.ClienteID
inner join detalhefatura as df on df.FaturaID = f.FaturaID
inner join produtos as p on p.Produto= df.ProdutoID
where df.Desconto >= DESC_1;

end $$

CALL DESC_VENDAS2 ('10', @lista_produtos);
select @lista_produtos;






-- Where
-- Exiba os nomes dos produtos que possuem qualquer combinação de ‘spread’.
-- Tabela: Produtos
-- Campo: ProdutoNome

select ProdutoNome from produtos
Where ProdutoNome like '%Spread';

-- Mostre os contatos  cujos nomes começam com a letra "Y"
-- Tabela: clientes
-- Campo: contato

select contato from clientes
where contato like "Y%";


-- Order by
-- Mostre cinco produtos mais caros e seus nomes em ordem decrescente
-- Tabela: produtos
-- Campos: ProdutoNome, PrecoUnitario

select ProdutoNome, PrecoUnitario from produtos
order by PrecoUnitario desc
limit 5;
-- offset 1; pula o primeiro


-- Operadores & joins
-- Mostre o contato, o  endereço concatenado com a cidade dos clientes cuja cidade é ‘London’
-- Tabela: clientes
-- Campos: Contato, Endereco, Cidade
select Contato, concat(Endereco,' - ', Cidade) as 'Endereço' from clientes
where clientes.Cidade like "London";

select * from clientes;

-- Concatene o nome  e o sobrenome dos empregados e mostre a soma dos valores em Transporte para cada um. Ordene os valores de forma decrescente.
-- Tabelas: empregados, faturas
-- Campos: nome, sobrenome, transporte
select * from faturas;

select concat(empregados.Nome, ' ', empregados.Sobrenome) as "Nome do Empregado", sum(faturas.transporte) as "Fatura Total de Transporte" from empregados
inner join faturas
on faturas.EmpregadoID = empregados.EmpregadoID
group by concat(empregados.Nome, ' ', empregados.Sobrenome)
order by sum(faturas.transporte) desc;


-- Funções de agregação
-- Mostre a data da fatura mais recente
-- Tabela: faturas
-- Campo: DataFatura
select faturas.FaturaId, faturas.DataFatura from faturas








-- Mostre o produto mais barato
-- Tabelas: produtos
-- Campos: ProdutoNome, PrecoUnitario



-- Join e Group by

-- Mostre o  nome dos produtos, o valor unitário,  a quantidade e o total vendido por produto.
-- Tabelas: detalhefaturas e produtos
-- Campos: ProdutoNome, ValorUnitario e Quantidade


-- Having
-- Mostre o  nome dos produtos, o valor unitário,  a quantidade e o total vendido por produto. Liste apenas os dados dos produtos que venderam mais de 40 unidades.
-- Tabelas: detalhefaturas e produtos
-- Campos: ProdutoNome, ValorUnitario e Quantidade


-- Índices
-- Exiba os índices existentes na tabela produtos;
-- Exclua o índice Produtos_ProdutoNome da tabela Produtos;
-- Crie uma consulta que traga os campos ProdutoNome da tabela produtos,  ProdutoID, PrecoUnitario e Quantidade da tabela detalhefatura. Observe o tempo de duração da consulta.
-- Crie o índice Produtos_ProdutoNome no campo ProdutoNome da tabela produtos e repita a consulta do item 3. Observe o tempo de duração da consulta. Houve alguma diferença? Descreva o que você observou.








