-- it creates a new database
create database sql_invoicing; 
-- first it checks whether database exist or not 
-- if exist then drop the database and create new database with same name
drop database if exists sql_invoicing;
create database sql_invoicing;
-- to select the database
use sql_invoicing;
-- create customers table
create table customers(
customer_id int(11),
first_name varchar(50),
last_name varchar(50),
birth_date date,
phone varchar(50),
city varchar(50),
state char(2),
points int(11)
);
-- inserting records
insert into customers values(1,'Babara','MacCaffrey','1992-03-28','91-1234567890','Bengaluru','KA',947);
insert into customers values(2,'Ines','Brushfield','1982-04-13','91-5463876902','Bengaluru','KA',2773);
insert into customers values(3,'Freddi','Boagey','1985-03-28','91-1234567890','Mumbai','MH',2947);
insert into customers values(4,'Ambur','Roseburgh','1972-03-20','91-1233427890','Delhi','DL',457);
insert into customers values(5,'Clemia','MacCaffrey','1991-03-28','91-1234565670','Hyderabad','AP',3675);
insert into customers values(6,'Elka','Brushfield','1973-03-28','91-1234567890','Mumbai','MH',1762);
insert into customers values(7,'Ilene','Boagey','1999-03-28','91-1234567890','Delhi','DL',902);
insert into customers values(8,'John','Smith','2002-11-28','91-1234567890','Delhi','DL',205);
insert into customers values(9,'Hary','Porter','2001-07-20','91-1234567890','Bengaluru','KA',1486);
insert into customers values(10,'Levy','Mynett','1992-03-28','91-1234567890','Bengaluru','KA',796);
-- to fetch the records use select
select * 
from customers
where customer_id=1; -- used to restrict the number of rows based on condition
-- retrieve first_name and last_name of all customers
select first_name,last_name
from customers;
-- retrieve first_name,last_name,points and add 10 point to each customer
select first_name as FirstName,last_name,points,points+10 as additionalpoints
from customers;
-- retrieve state from customers
select distinct(state) -- it is used for unique values
from customers;
-- retrieve first 3 records from customers table
select * 
from customers
limit 3;
-- retrieve the records from 3 to 5 records from customer table
select *
from customers
limit 2,5;

select * 
from customers
limit 2;

-- where clause
-- > < >= <= != <> ==
-- fetch the customer details having points more than 1500
select * 
from customers
where points > 1500;
-- fetch the customer details who are all staying in KA
select * 
from customers
where state ='KA';
-- fetch the customers who are all belongs to KA and having points more than 1500

select * from
customers
where state='KA' or points>1500;

-- fetch the customers who are all belongs to DL and date of birth after 2000 or points >1000
select * from
customers
where points > 1000 and birth_date > '2000-01-01' ;

select * from
customers
where state='DL' or points > 1000;

select * from
customers
where state='DL' or points > 1000 and birth_date > '2000-01-01' ;
-- fetch the customers having date of birth after 2000 or points >1000

select * from
customers
where not(birth_date>'2000-01-01' or points > 1000);
-- fetch the customers who are all staying in KA or DL
select * 
from customers
where state not in ('KA','DL');

-- fetch the customer records whose point is more than 1000 and less than 1800
select *
from customers
where points>=1000 and points<=1800;
select *
from customers
where points between 1486 and 1762;
-- returns customers born between 1/1/1990 and 1/1/2000
select *
from customers
where birth_date between '1990-01-01' and '2000-01-01';

select last_name
from customers;
-- return last_name ends with d 
-- % any number of charcaters
-- _ single character
select last_name
from customers
where last_name like '%d';
-- return last_name starts with b 
select last_name
from customers
where last_name like 'b%';
-- return last_name contains e 
select last_name
from customers
where last_name like '%e%';
-- return last_name third charcter is c
select last_name
from customers
where last_name like '__c%' ;
select last_name
from customers
where last_name like 's___h' ;
-- return customer last_name which contains field
select * 
from customers
where last_name regexp 'field';
-- return customer last_name starts with b
select * 
from customers
where last_name regexp '^b';

-- return customer last_name ends with d
select * 
from customers
where last_name regexp 'd$';

-- return customer last_name which contains field or mac or rose
select * 
from customers
where last_name regexp 'field$|^mac|rose';

select * 
from customers
where last_name regexp '[ir]e[ya]';

-- Get the customers whose
    -- first names are elka or amber
    select *
    from customers
    where first_name regexp 'elka|ambur';
    -- last names end with EY or ON
    select *
    from customers
    where last_name regexp 'ey$|on$';
    -- last name start with MY or contains SE
    select *
    from customers
    where last_name regexp '^my|se';
    -- last name contain B followed by R or U
    select *
    from customers
    where last_name regexp 'b[ru]';
    -- select customer details from customers table and order by first_name
	select *
    from customers
    order by first_name desc;
    
    select *
    from customers
    order by birth_date;
    
    select *
    from customers
    order by first_name desc


