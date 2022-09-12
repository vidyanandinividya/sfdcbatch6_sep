use sql_invoicing;
-- create a table Vehicles
create table vehicles(
vehicleId int,
year int,
make varchar(100));
describe vehicles;
-- add model column to the vehicle table
alter table vehicles
add model varchar(100);
-- add color and note to the vehicle table
alter table vehicles
add color varchar(50),
add note varchar(255);
-- modify the model column size to 150
alter table vehicles
modify model varchar(150);
-- modify the year column to smallint and increase the size of color column
alter table vehicles
modify year smallint,
modify color varchar(100) after make;
-- rename the note column to vehicle condition
alter table vehicles
change column note vehiclecondition varchar(255);
-- drop the vehiclecondition column
alter table vehicles
drop column vehiclecondition;
describe vehicles;
-- rename the table to cars
alter table vehicles
rename to cars;
describe cars;
select * from cars;
-- generated column
create table contacts(
id int,
first_name varchar(50),
last_name varchar(50),
email varchar(150)
);
describe contacts;
insert into contacts values(1,'john','smith','john@gmail.com');
insert into contacts values(2,'annie','urbana','annie@gmail.com');
insert into contacts values(3,'hary','porter','hary@gmail.com');
select * from contacts;
select id,first_name,last_name,concat(first_name,' ',last_name) as FullName,email
from contacts;

drop table if exists contacts;
create table contacts(
id int,
first_name varchar(50),
last_name varchar(50),
fullname varchar(150) generated always as (concat(first_name,' ',last_name)),
email varchar(150)
);
describe contacts;

insert into contacts(id,first_name,last_name,email) 
values(1,'john','smith','john@gmail.com');
insert into contacts(id,first_name,last_name,email)
values(2,'annie','urbana','annie@gmail.com');
insert into contacts(id,first_name,last_name,email)
values(3,'hary','porter','hary@gmail.com');
insert into contacts(id,first_name,last_name,email)
values
(4,'jack','smith','jack@gmail.com'),
(5,'cielo','rodriguez','cielo@gmail.com');

select * from contacts;

create table contact_details(
id int,
first_name varchar(50),
email varchar(150)
);
describe contact_details;

insert into contact_details(id,first_name,email)
select id,first_name,email
from contacts;

select * from contact_details;

create table status(
totalCustomers int,
totalContacts int,
totalContactDetails int
);
describe status;
insert into status(totalCustomers,totalContacts,totalContactDetails)
values(
(select count(*) from customers),
(select count(*) from contacts),
(select count(*) from contact_details)
);
select * from status;

select * from contacts;
-- update the email id of contact id 1
update contacts
set email='johnsmith@gmail.com',
	first_name='tom'
where id=1;

select * from contacts;
delete from contacts
where id=1;

select * from customers;

-- delete first 3 records from the customer table order by first_name

delete from customers
order by first_name
limit 3;

truncate table customers;
select * from customers;

-- constraint----
-- NOT NULL
create table tasks(
id int ,
title varchar(255) not null,
start_date date not null,
end_date date
);
describe tasks;
insert into tasks 
values
(1,'Learn NOT null constarint','2022-09-12','2022-09-12'),
(2,'Learn primary key constarint','2022-09-12',null);

select * from tasks;
insert ignore into tasks 
values
(3,'Learn Foreign Key constarint',null,'2022-09-12');

select *
from tasks
where end_date is null;

update tasks
set end_Date=start_date+7
where end_date is null;
-- apply the not null constraint to end date
truncate table tasks;
alter table tasks
change end_date
end_date date not null;
-- Primary Key
-- column label constraint
create table users(
user_id int AUTO_INCREMENT primary key,
username varchar(40),
password varchar(255),
email varchar(255)
);
insert into users(username,password,email) values('john','john123','john@gmail.com');
select * from users;
-- table label constraint
create table roles(
role_id int,
role_name varchar(50)
);

drop table roles;

alter table roles
add primary key(role_id,role_name);
describe roles;

insert into roles values(1,'Manager');
insert into roles values(1,'HR');
insert into roles values(2,'Manager');

select * from roles;
-- foreign key
create table categories(
categoryId int auto_increment primary key,
categoryName varchar(100) not null
);

insert into categories(categoryName)
values
('smartphone'),
('smartWatch'),
('smartTV');
select * from categories;

create table products(
productId int auto_increment primary key,
productName varchar(100) not null,
categoryId int,
foreign key(categoryId)
references categories(categoryId)
);
drop table products;
insert into products(productName,categoryId)
values
('iphone',1),
('oneplus',1),
('applewatch',2);

select * from products;
describe categories;
describe products;
-- cascade --
create table products(
productId int auto_increment primary key,
productName varchar(100) not null,
categoryId int,
foreign key(categoryId)
references categories(categoryId)
on update cascade
on delete cascade
);
update categories
set categoryId=100
where categoryId=1;

delete from categories
where categoryId=1;

-- UNIQUE ---
create table suppliers(
id int auto_increment primary key,
name varchar(50),
phone varchar(15) unique
);
describe suppliers;
insert into suppliers(name,phone)
values('john','123456789');
insert into suppliers(name,phone)
values('Tom',null);
select * from suppliers;
-- CHECK ---
create table parts(
part_no varchar(18) primary key,
description varchar(50),
cost decimal(10,2) not null check(cost>0)
);
drop table parts;
create table parts(
part_no varchar(18) primary key,
description varchar(50),
cost decimal(10,2) not null check(cost>0) not enforced
);
describe parts;
insert into parts values('A-001','cooler',10);
insert into parts values('A-002','engine',0);
select * from parts;
select * from products;
drop table products;
create table products(
productCode varchar(15),
productName varchar(70) not null,
productVendor varchar(50) not null,
productPrice decimal(10,2) not null,
primary key(productCode)
);
describe products;
insert into products(productCode,productName,productVendor,productPrice)
values
('A-001','phone','ABC Corp','48.91'),
('A-002','watch','xyz Corp','95.70'),
('A-003','tv','def Corp','95.58'),
('A-004','otg','ABC Corp','48.91'),
('A-005','smart phone','ABC Corp','68.99'),
('A-006','car','ABC Corp','117.91'),
('A-007','motorcycle','xyz Corp','115.57'),
('A-008','microwave','def Corp','40.91'),
('A-009','laptop','xyz Corp','58.33'),
('A-010','desktop','mnp Corp','141.54');
select * from products;
-- find the product whose vendor name contains the xyz keyword

select productName,productVendor
from products
where instr(productVendor,'xyz')>0;
select productName,length(productName),upper(productName)
from products;
select substring('Mysql Substring',7);
select substring('Mysql Substring',0);
select substring('Mysql Substring',-10);
select substring('Mysql Substring',1,5);
select substring('Mysql Substring' from 1 for 7);
select substring('Mysql Substring' from -15 for 5);
select replace('MySql Substring','Substring','replace');
select left('MySql LeftString',5);
select right('MySql LeftString',6);
CREATE TABLE DEPARTMENT
(
   DEPTCODE   INT(10) primary key,
   DeptName   CHAR(30) not null,
   LOCATION   VARCHAR(33)
);

CREATE TABLE EMPLOYEE
(
   EmpCode      INT(4) primary key,
   EmpFName     VARCHAR(15) not null,
   EmpLName     VARCHAR(15) not null,
   Job          VARCHAR(45) not null,
   Manager      CHAR(4),
   HireDate     DATE,
   Salary       INT(6) not null,
   Commission   INT(6),
   DEPTCODE     INT(2),
   foreign key(deptcode)
   references department(deptcode)
   on delete cascade
);
INSERT INTO EMPLOYEE  
VALUES (9369, 'TONY', 'STARK', 'SOFTWARE ENGINEER', 7902, '1980-12-17', 2800,0,20),
       (9499, 'TIM', 'ADOLF', 'SALESMAN', 7698, '1981-02-20', 1600, 300,30),    
       (9566, 'KIM', 'JARVIS', 'MANAGER', 7839, '1981-04-02', 3570,0,20),
       (9654, 'SAM', 'MILES', 'SALESMAN', 7698, '1981-09-28', 1250, 1400, 30),
       (9782, 'KEVIN', 'HILL', 'MANAGER', 7839, '1981-06-09', 2940,0,10),
       (9788, 'CONNIE', 'SMITH', 'ANALYST', 7566, '1982-12-09', 3000,0,20),
       (9839, 'ALFRED', 'KINSLEY', 'PRESIDENT', 7566, '1981-11-17', 5000,0, 10),
       (9844, 'PAUL', 'TIMOTHY', 'SALESMAN', 7698, '1981-09-08', 1500,0,30),
       (9876, 'JOHN', 'ASGHAR', 'SOFTWARE ENGINEER', 7788, '1983-01-12',3100,0,20),
       (9900, 'ROSE', 'SUMMERS', 'TECHNICAL LEAD', 7698, '1981-12-03', 2950,0, 20),
       (9902, 'ANDREW', 'FAULKNER', 'ANAYLYST', 7566, '1981-12-03', 3000,0, 10),
       (9934, 'KAREN', 'MATTHEWS', 'SOFTWARE ENGINEER', 7782, '1982-01-23', 3300,0,20),
       (9591, 'WENDY', 'SHAWN', 'SALESMAN', 7698, '1981-02-22', 500,0,30),
       (9698, 'BELLA', 'SWAN', 'MANAGER', 7839, '1981-05-01', 3420, 0,30),
       (9777, 'MADII', 'HIMBURY', 'ANALYST', 7839, '1981-05-01', 2000, 200, NULL),
       (9860, 'ATHENA', 'WILSON', 'ANALYST', 7839, '1992-06-21', 7000, 100, 50),
       (9861, 'JENNIFER', 'HUETTE', 'ANALYST', 7839, '1996-07-01', 5000, 100, 50);
select * from department;
select * from employee;
select count(*) from employee;
select avg(salary),min(salary),max(salary),sum(salary),count(salary) from employee;
-- calculate avg salary for each department
select deptcode,avg(salary)
from employee
group by deptcode;
-- calculate the number of employees in each department
select deptcode,count(*)
from employee
group by deptcode;
-- get those employee details whose salary greater than avg salary 
-- in respective departments 
select avg(salary) from employee;
select * from employee;

-- lists the number of employees in each departments. 
-- only includes department with more than 3 employees

select deptcode,count(deptcode)
from employee
group by deptcode
having count(deptcode)>3
order by count(deptcode) ;
-- return the departmentcode and the number of employees (in the associated department)
-- that make over 5000 salaray/year.only those departments with more than 3 employees
select deptcode,count(deptcode) as "Number of Employees"
from employee
where salary>2000
group by deptcode
having count(deptcode)>3;

select curdate(),current_date(),current_date,date(now()),sysdate();
select curdate(),adddate(curdate(),10);
select curdate(),adddate(curdate(),interval 12 week);
select adddate('2014-02-13', interval 3 quarter);
select adddate('2014-02-13', interval 5 year);
select adddate('2014-02-13', interval -3 month);
select datediff(current_date,current_date);
select datediff('2011-08-08','2011-08-17');
-- get all the orders whose status are in process and calculate the number of days
-- between ordered date and required date

select ordernumber,
datediff(requireddate,orderdate) remaining_days
from orders
where satus='in Process';
select day('2022-09-12');
select day(last_day('2022-10-12'));
select now(),date_add(now(),interval '-1 5' day_hour);
select date_add('2000-02-30',interval 1 day);
select date_sub(now(),interval 1 day);
select dayname(now()),month(now()),year(now());
select * from employee;
select max(hiredate),min(hiredate) from employee;

select count(*) from department;
select count(*) from employee;
-- return the employee name, employee code and department name
select empcode,empfname,e.deptcode as "EmpDept",deptname,d.deptcode as "DeptEmp"
from employee e inner join department d 
on e.deptcode=d.deptcode
order by empcode;
 -- left join
select empcode,empfname,e.deptcode as "EmpDept",deptname,d.deptcode as "DeptEmp"
from employee e left join department d 
on e.deptcode=d.deptcode
order by empcode;

-- right join
select empcode,empfname,e.deptcode as "EmpDept",deptname,d.deptcode as "DeptEmp"
from employee e right join department d 
on e.deptcode=d.deptcode
order by empcode;
-- cross join
select empcode,empfname,e.deptcode as "EmpDept",deptname,d.deptcode as "DeptEmp"
from employee e cross join department d 
order by empcode;
select * from employee;
create table employees(
empid int primary key,
empname varchar(50),
mgrid int,
empsal decimal(10,2));

insert into employees(empid,empname,mgrid,empsal)
values
(1,'john',null,8000.00),
(2,'jack',1,6000.00),
(3,'tom',1,6500.00),
(4,'henry',2,5000.00),
(5,'annie',2,5000.00),
(6,'cielo',1,6000.00),
(7,'glen',3,4000.00),
(8,'isabela',2,5000.00),
(9,'harry',1,7000.00),
(10,'cristofer',4,4000.00);

select * from employees;
-- return the empname and reporting manager name 
select e.empname "Employee Name",m.empname "manager Name"
from employees e join employees m
on e.mgrid=m.empid;

create view employeeManager
as 
select e.empname "Employee Name",m.empname "manager Name"
from employees e join employees m
on e.mgrid=m.empid;

select * from employeeManager;

-- return those employee details whose salary has more than avg salary
select * from employee;
select * 
from employee
where salary>
			(select avg(salary) from employee);
            
select empFname 
from employee
where 
	deptcode not in
		(select deptcode from department);
        
select max(sal),min(sal),avg(sal)
from 
(select deptcode, count(salary) as sal
from employee
group by deptcode) as emps;

-- return all the employees who earn more than the average salary in their department
select empfname,salary,deptcode
from employee outers
where salary>
(select avg(salary) from employee where deptcode=outers.deptcode);
-- find those employees who have atleast one person reporting to them
select * from employees;
select * from employees e
where not exists
(select * from employees where mgrid=e.empid);
-- find all departments that do not have any employees
select * 
from department d
where not  exists(select * from employee where deptcode=d.deptcode);





















