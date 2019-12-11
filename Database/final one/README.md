# This is my first  table

```sql
create table Student (
    name varchar(34),
    age integer
);



select * from Student;

insert into Student ("name",age) values ('james',29);

select * from Student;
```


1. Create a table names Sales with following
data  and structure.


p_name    p_number  p_price _quantity
keyboard  121       125.23  200
mouse     122       123.23  250
harddisk  123       4000.0  250

1. Find name of products having price >=125 but price<4000
2. update value of quantity from 200 to 205 of the product keyboard.
3. Add a new column names p_date and enter corresponding values.
4. Change the name of the column p_number to p_id.
5. Find the record of all products whose price is not null.


---

1. 

```sql
CREATE TABLE SALES (
    p_name varchar(20),
    p_number numeric(20),
    p_price numeric(20,2),
    p_quantity numeric(20)
);

```


2. 

```sql
insert into Sales values('Keyboard',121,125.23,200);
insert into Sales values('Mouse',122,123.23,250);
insert into Sales (p_name,p_number,p_price,p_quantity) values('Hard Disk',123,4000.00,250);

```

3. 

```sql
select * from Sales where p_price>=125 and p_price <4000;


```


4. 
```sql
update Sales set p_quantity=205 where p_name='Keyboard';
```

5. 

```sql
alter table Sales add p_date date;

```


6. Delete a column

```sql
delete from Sales where p_date = 'jun-3-2019';

```

7. Add values to a specific column

```sql
update Sales set p_date='JUN-4-2019' where p_name='Mouse';
update Sales set p_date='MAY-4-2019' where p_name='Hard Disk';
update Sales set p_date='DEC-4-2019' where p_name='Keyboard';

```

8. Alter the name of the table

```sql
alter table Sales rename to Sale;

```

#Updating all rows or single row


```sql
update Sale set p_price=500;
update Sale set p_price=205 where p_name='Mouse';
update Sale set p_price=4000 where p_name='Hard Disk';
update Sale set p_date=('JUN-9-2019') where p_name='Keyboard' or p_name='Mouse';


```


#Deleting all the data or single,selected column

:-1:   :fire:

```sql
delete from Sale;


delete from Sale where p_name='Keyboard';

```
---















# Update 

---

1. Can update all rows at a time or selected rows.

```sql
    update Sale set p_name='Computer';


Computer	123	4000.00	250	2019-06-09
Computer	122	123.23	250	2019-06-09
Computer	122	123.23	250	2019-06-09

```

2. Can update selected rows using where

```sql

update Sale set p_name='Keyboard' where p_price>=3000;
update Sale set p_number=124 where p_price=4000.00;

update Sale set location='Turin' where p_name='Laptop';
update Sale set location='Paris' where p_name='Mouse';
update Sale set location='LA' where p_name='Keyboard';



```



# Alter

---

1. __Add a new column__

```sql
alter table Sale add location varchar(20);
```

> now to add values to these we can't use insert , because insert creates a new row

```sql
update Sale set location='Turin' where p_name='Laptop';
update Sale set location='Paris' where p_name='Mouse';
update Sale set location='LA' where p_name='Keyboard';

```


---




# Drop

1. Drop  any column

```sql
alter table Sale drop p_date;
```

2. Rename any column

```sql
alter table Sale rename p_quantity to quantity;
```

3. Rename table

```sql
alter table Sale rename to Sales;

```

4. To modify existing table( *datatype* *size*)

```sql

```



---




# October 21


1. Create employee table

```sql
Create table Employee (
    emp_name  char(20) not null ,
    emp_id varchar(20) primary key,
    emp_salary numeric(10,2) not null ,
    emp_address varchar(30) not null ,
    emp_project varchar(30) not null ,
    emp_dept_no numeric(10) not null ,
    emp_dependents varchar(30) not null,
    unique (emp_name,emp_address) ,
    unique (emp_project,emp_dept_no),
    unique (emp_project)
)

```



```sql
insert into Employee values ('James',1,15000.00,'California','Docker Integration',1,'Vue,Sam');
insert into Employee values ('Henry',1,15000.00,'Lyon','Git',1,'Vue,Sam');
insert into Employee values ('Leo',1,150000.00,'Monaco','',1,'Vue,Sam');
insert into Employee values ('Cristiano',1,900000.00,'Wales','Docker Integration',1,'Vue,Sam');
insert into Employee values ('Gareth',1,800000.00,'Turin','Docker Integration',1,'Vue,Sam');

```




```sql
create table Country(
    name char(20),
    id integer
);

select * from Country;


alter table Country add constraint id primary key (id);

drop table Country;

insert into Country values ('Us',21);
insert into Country values ('India',31);
insert into Country values ('Germany',23);


select * from Country where  id=2;




```


# 4 Nov,  Foreign key


```sql

create table Department(
         dept_id varchar(20) primary key ,
         dept_name varchar(20)
     )


create table Employee(
         emp_id varchar(20) primary key ,
         emp_name varchar(20) ,
         dept_number varchar(20) references Department(dept_id),
         emp_salary number(10,2)
     )
```


---

```sql

insert into Employee values ('e1','justin','development',40804.99);

insert or update on table "employee" violates foreign key constraint 
"employee_dept_number_fkey" Detail: Key (dept_number)=(development) is not present in table "department".

```

---