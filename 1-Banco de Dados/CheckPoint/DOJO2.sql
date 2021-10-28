-- CheckPoint II - Banco de Dados - Dojo de Artes Marciais .
-- Nome: André Pedreschi 
-- Considerações:
-- Faço artes marciais e ajudo na coordenação no Niten na unidade da cidade de Santo André, e estávamos conversando de talvez criar um site para usar como um sistema e gerir toda a parte administrativa da nossa unidade.
-- A minha ideia é usar o que aprendi na matéria para cria esse Banco de Dados que será a base para a criação desse sistema. 
-- - Os alunos tem de apresentar um atestado médico atual e com os dados do médico, atestando que podem fazer atividades físicas, ele tem validade de 1 ano.
-- - Os alunos devem informar, na ficha de cadastro, um ou mais hospitais que podem ser atendido caso se machuque nos treinos.
-- - Os Pagamentos mensais de cada aluno consistem do pagamento da Taxa da Federeção (quem autoriza e regulamenta os estilos ensinados no Dojo) e da Taxa Dojo (usada para custear os gastos do Dojo).
-- - Dentro do Dojo podem ser realizadas vários estilos de artes marciais e a quantidade de estilos realizadas por cada aluno influencia na quantia da Taxa Dojo a ser paga.


create database DOJO;
USE DOJO;

-- Criação das tabelas

create table dojo.hospital (
hospitalID int not null auto_increment,
nome_convenio  varchar (50),
nome_hosp varchar (150),
endereco_rua  varchar (100),
endereco_numero int,
endereco_bairro varchar (15),
endereco_cidade varchar (15),
PRIMARY KEY (`hospitalID`)
);

create table dojo.atestado_medico (
atestadoID int not null auto_increment,
nome_med varchar (50),
sobrenome_med varchar (100),
crm int not null,
img_atestado varchar (255),
data_atestado date,
PRIMARY KEY (`atestadoID`)
);

create table dojo.estilo (
estiloID int not null auto_increment,
nome_estilo varchar(50),
coordenador varchar(50),
data_inic date,
data_pausa date,
graduacao varchar(10),
PRIMARY KEY (`estiloID`)
);

create table dojo.aluno (
alunoID int not null auto_increment,
nome varchar(50),
sobrenome varchar(100),
nome_de_guerra varchar(50),
email varchar(50),
data_nasc date,
telefone varchar(15),
atestadoID int,
PRIMARY KEY (`alunoID`),
CONSTRAINT `FK_atestado` FOREIGN KEY (`atestadoID`) REFERENCES dojo.atestado_medico(`atestadoID`)
);

create table aluno_estilo(
aluno_estiloID int not null auto_increment,
alunoID int,
estiloID int,
PRIMARY KEY (`aluno_estiloID`),
CONSTRAINT `FK_aluno1` FOREIGN KEY (`alunoID`) REFERENCES dojo.aluno(`alunoID`),
CONSTRAINT `FK_estilo1` FOREIGN KEY (`estiloID`) REFERENCES dojo.estilo(`estiloID`)
);

create table dojo.hospital_aluno (
hosp_alunoID int not null auto_increment,
hospitalID int,
alunoID int,
PRIMARY KEY (`hosp_alunoID`),
CONSTRAINT `FK_hospital` FOREIGN KEY (`hospitalID`) REFERENCES dojo.hospital(`hospitalID`),
CONSTRAINT `FK_aluno2` FOREIGN KEY (`alunoID`) REFERENCES dojo.aluno(`alunoID`)
);

create table dojo.taxa_federacao (
taxa_fedID int not null auto_increment,
alunoID int,
data_pag datetime,
PRIMARY KEY (`taxa_fedID`),
CONSTRAINT `FK_aluno3` FOREIGN KEY (`alunoID`) REFERENCES dojo.aluno(`alunoID`)
);

create table dojo.taxa_dojo (
taxa_dojoID int not null auto_increment,
alunoID int,
data_pag datetime,
PRIMARY KEY (`taxa_dojoID`),
CONSTRAINT `FK_aluno4` FOREIGN KEY (`alunoID`) REFERENCES dojo.aluno(`alunoID`)
);

create table pagamentos_mensais (
pagamento_mansalID int not null auto_increment,
taxa_dojoID int,
taxa_fedID int,
PRIMARY KEY (`pagamento_mansalID`),
CONSTRAINT `FK_taxa_dojo1` FOREIGN KEY (`taxa_dojoID`) REFERENCES dojo.taxa_dojo(`taxa_dojoID`),
CONSTRAINT `FK_taxa_fed1` FOREIGN KEY (`taxa_fedID`) REFERENCES dojo.taxa_federacao(`taxa_fedID`)
);

create table estilo_taxa (
estilo_taxaID int not null auto_increment,
taxa_dojoID int,
estiloID int,
PRIMARY KEY (`estilo_taxaID`),
CONSTRAINT `FK_taxa_dojo2` FOREIGN KEY (`taxa_dojoID`) REFERENCES dojo.taxa_dojo(`taxa_dojoID`),
CONSTRAINT `FK_estilo2` FOREIGN KEY (`estiloID`) REFERENCES dojo.estilo(`estiloID`)
);

-- Inserção de dados dos atestados médicos
insert into atestado_medico (nome_med, sobrenome_med, crm, img_atestado, data_atestado) values
('Denis', 'Pimentel', '103978658', 'http://2.bp.blogspot.com/_S9DyCl5Taek/SQYgkimz6jI/AAAAAAAACAU/KuVWs-wGNzg/s400/atestado_diegomascarenhas.jpg', '2021-02-15'),
('Cristian', 'Jarbas', '098645754', 'https://i.pinimg.com/originals/4b/81/5c/4b815c29625a37157ba687bbd8a7fc04.jpg', '2021-02-15'),
('Mônica', 'Nascimento', '105489647', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQI1PM691v_C5eRhQuy174_xKiAyYgXZCDHxq9VDTn_IYJg1RHJtUCESk4-7j8ZpQRubtM&usqp=CAU', '2021-06-21'),
('Tadeu', 'Leite', '015697336', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvbwrozaNHRQSvbl2NkNbzercocQOXAeqqTLj7URatdZgaYjxIi2elnbrjK1A3FESCJxo&usqp=CAU', '2021-04-19'),
('Jonathan', 'Reis', '108619344', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRN30d3JyW8d9wlQMuWrsTRhqxGoiNtrVhMN4K_iDjQiJTh_05Q34gUWpuJC4X8Zc_WlU&usqp=CAU', '2021-03-15'),
('Cleber', 'Inácio', '111587946', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvbwrozaNHRQSvbl2NkNbzercocQOXAeqqTLj7URatdZgaYjxIi2elnbrjK1A3FESCJxo&usqp=CAU', '2021-03-06'),
('Keli', 'Japur', '088645978', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTak8uiEx5pQYOg7NZ0SsDCqFTrFeirnXPzygRbs8yuRydoerRi1gPi38iwDuwEhk_A5Y8&usqp=CAU', '2021-02-01'),
('Laércio', 'Bragança', '067251658', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStWQPesvy7ZZg35dahw-2BvQk9vpwMteYIUhWOBkbhSaFIExZo3AxaPc6K3k7W5eizRmY&usqp=CAU', '2021-02-07'),
('Thaís', 'Ferreira', '127364996', 'https://i.pinimg.com/originals/84/0e/16/840e166712c1c98424b8d236faa75cee.jpg', '2021-02-17'),
('Pedro', 'Cruz', '116325446', 'https://www.jornalopcao.com.br/wp-content/uploads/2018/07/atestado.jpg', '2021-03-21');

-- Exemplo CRUD - CREATE/INSERT, Vou inserir os dados de 10 alunos
insert into aluno (nome, sobrenome, nome_de_guerra, email, data_nasc, telefone) values 
('Leonardo', 'Anjoletto', 'Anjoletto', 'anjoletto.leonardo@gmail.com', '1990-05-19', '99954-6127'),
('Roger', 'Niero', 'Roger', 'roger.niero@gmail.com', '1990-04-26', '99894-6678'),
('André', 'Luis Franco', 'Franco', 'franco.andre@gmail.com', '1982-07-08', '99784-3685'),
('Áurea', 'Nagamine Akemi', 'Akemi', 'aurea.nagamine@gmail.com', '1957-02-21', '99787-1219'),
('André', 'Pedreschi', 'Pedreschi', 'a.pedreschi32@gmail.com', '1990-10-04', '99397-7565'),
('Pedro', 'Arcieri', 'Arcieri', 'p.arcieri@gmail.com', '1989-08-17', '99651-5583'),
('Renan', 'Franco', 'Renan', 'renan44@gmail.com', '2000-01-09', '97613-3462'),
('Élcio', 'Novais', 'Novais', 'elcio.nov@gmail.com', '2008-11-23', '99645-1678'),
('Jonathan', 'Bonifácio', 'Boni', 'jonathan65@gmail.com', '1992-03-29', '96482-6479'),
('Roberto', 'Dias', 'Roberto', 'roberto.dias15@gmail.com', '1988-09-12', '99384-4862');

-- Acabou faltando os dados referente a atestadoID, vou inserir eles
insert into aluno (atestadoID) values
('2'), 
('10'),
('7'),
('3'),
('1'),
('4'),
('5'),
('6'),
('8'),
('9');

-- Exemplo CRUD - DELETE, vou usar para apagar os dados que inseri anteriormente na coluna "atestadoID", pois os valores entraram de forma errada
  delete from aluno where alunoID between 21 and 30;

-- Exemplo CRUD - UPDATE, usado para trocar os dados da coluna "atestadoID" de "NULL" para os seus respectivos valores  
update aluno set atestadoID = '2' where alunoID = 1 ;
update aluno set atestadoID = '10' where alunoID = 2 ;
update aluno set atestadoID = '7' where alunoID = 3 ;
update aluno set atestadoID = '3' where alunoID = 4 ;
update aluno set atestadoID = '1' where alunoID = 5 ;
update aluno set atestadoID = '4' where alunoID = 6 ;
update aluno set atestadoID = '5' where alunoID = 7 ;
update aluno set atestadoID = '6' where alunoID = 8 ;
update aluno set atestadoID = '8' where alunoID = 9 ;
update aluno set atestadoID = '9' where alunoID = 10 ;

-- Exemplo CRUD - READ/SELECT, 	Vou usar o comando select em conjunto com as funções de datas para criar um "quadro" de alerta para vencimento dos atestados médicos dos alunos.
-- Como essa consulta que irei fazer será recorente, criei essa procedure para facilitar e agilizar.

DELIMiTER $$
create procedure status_atestado()
begin 

select concat(aluno.nome, ' ', aluno.sobrenome) as "Nome do Aluno", 
date_format (atestado_medico.data_atestado, '%d/' '%m/' '%Y') as "Data do Último Atestado Médico", 
datediff(date_add(atestado_medico.data_atestado, interval 1 year), now()) as "Dias até o vencimento do Atestado",
case 
	when datediff(date_add(atestado_medico.data_atestado, interval 1 year), now()) <= 0 then 'Atestado atrasado' 
	when datediff(date_add(atestado_medico.data_atestado, interval 1 year), now()) <= 30 then 'Vence esse Mês' 
    when datediff(date_add(atestado_medico.data_atestado, interval 1 year), now()) <= 60 then 'Cobrar atestado' 
    when datediff(date_add(atestado_medico.data_atestado, interval 1 year), now()) <= 90 then 'Lembrar de trazer o atestado' 
    else 'Atestado em Dia'
    end as 'Estatus dos Atestados'
from aluno
inner join atestado_medico on aluno.atestadoID = atestado_medico.atestadoID
order by atestado_medico.data_atestado asc; 

end $$

call status_atestado();