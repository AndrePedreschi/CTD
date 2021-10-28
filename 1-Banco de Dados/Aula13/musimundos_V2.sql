select * from musimundos.faturas;

-- 1 - O valor da fatura mais alta cujo a cidade de cobrança é “Oslo”. (MAX)
select max(valor_total) from musimundos.faturas where cidade_cobranca = "Oslo";
-- 2 - O valor da fatura mais baixa de todas. (MIN)
select min(valor_total) from musimundos.faturas;
-- 3 - O valor médio das faturas que o país de cobrança é “Canada”. (AVG)
select avg(valor_total) from musimundos.faturas where pais_cobranca = "Canada";
-- 4 - A quantidade de faturas que o país de cobrança é “Canada”. (COUNT)
select count(id) from musimundos.faturas where pais_cobranca = "Canada";
-- 5 - O valor total somado de todas as faturas. (SUM)
select sum(valor_total) from musimundos.faturas;
-- 6 - Selecione o id, a data e valor das faturas com valor abaixo da média.
select id, data_fatura, valor_total from faturas where valor_total < (select avg(valor_total) from musimundos.faturas);
-- 7 - A data de nascimento do funcionário mais jovem da empresa (MAX)
select max(data_nascimento) from empregados;
-- 8 - A data de nascimento do funcionário mais velho da empresa (MIN)
select min(data_nascimento) from empregados;
-- 9 - Formate a data do nascimento dos funcionários no formato ex: "02 May 2020".
select date_format(`data_nascimento`, "%D,%M,%Y") from empregados;
-- 10 - O numero de cancoes que tem como compositor “AC/DC”. (COUNT)
select * from cancoes;
select count(distinct `nome`) from cancoes where compositor = "AC/DC";
-- 11 - A duração média das músicas em milisegundos (AVG)
select round (avg(`duracao_milisegundos`),0) from musimundos.cancoes;
-- 12 - O tamanho médio em bytes das músicas que como compositor “AC/DC”. (AVG)
select round (avg(`bytes`),0) from musimundos.cancoes where compositor = "AC/DC";
-- 13 - Quantidade de clientes que moram na cidade de “São Paulo”. (COUNT)
select Count(`id`) from clientes where cidade = "São Paulo";
-- 14 - Quantidade de clientes que moram na cidade “Paris”. (COUNT)
select count(`id`) from clientes where cidade = "Paris";
-- 15 - Quantidade de clientes que tenham email do “yahoo”. (COUNT e LIKE)
select count(`id`) from clientes where email like "%yahoo%";



-- 1 - Selecione o nome dos artistas(tabela artistas) com o nome de seus albuns (tabela
-- albuns) ordenado por id do artista (Order by).
select artistas.id, artistas.nome, albuns.titulo
from artistas
inner join albuns
on artistas.id = albuns.id_artista
order by artistas.id;

-- 2 - Selecione o nome do cliente (clientes) e suas faturas (faturas), porém somente as
-- faturas com valor maior de 5 ordenados pelo valor da fatura decrescente.
select clientes.nome, faturas.*
from clientes
inner join faturas
on clientes.id = faturas.id_cliente
where valor_total > 5
order by valor_total desc;
-- offset valor_total >= "5";

-- 3 Selecione o nome das cancoes (tabela cancoes) e o tipo de arquivo (tabela
-- tipos_de_arquivos) e exiba o nome da canção e o tipo ordenado pelo id da canção.


select cancoes.id, cancoes.nome "Canções", tipos_de_arquivo.nome "Tipo de Arquivo"
from cancoes
inner join tipos_de_arquivo
on cancoes.id_tipo_de_arquivo = tipos_de_arquivo.id;

kened silva
Jaqueline Silva
Bruno Nonato
Giovanna Maia
Thiago R. Silva
Victor Leao
André Pedreschi
André T. Machado




