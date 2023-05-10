#Grupo 8
#André Pedreschi
#Ruan Araújo
#Belicio Cardoso
#Arivaldo Lopes Camargo

#Where
##1
select contact.FirstName, contact.MiddleName, contact.LastName from contact where contact.LastName like '_a%';

##2
select contact.Title, concat(contact.FirstName,' ', contact.LastName) as nomeCompleto from contact where contact.Title like 'Mr.' or contact.Title like 'Ms.';
select contact.Title, concat(contact.FirstName,' ', contact.LastName) as nomeCompleto from contact where contact.Title between 'Mr.' and 'Ms.';

##3
select product.Name, product.ProductNumber from product where product.ProductNumber like 'AR%' or product.ProductNumber like 'BE%' or product.ProductNumber like 'DC%';

##4
select contact.ContactID, contact.FirstName, contact.LastName 
from contact 
where contact.FirstName like 'C%' and contact.FirstName not like '_O%'  and contact.FirstName not like '_E%';
#NOT LIKE 'C[letra,letra]%';


