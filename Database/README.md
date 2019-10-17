# Postgres

---

1. select * from Customers

2. 

```sql
INSERT INTO public.customers("id","name","email") 
values (5,'neymar','neymar@gmail.com')
```



3. insert 

```sql
insert into customers (id,"name","email") values (7,'cavani','cavani@gmail.com')
```

4. order by clause

```sql
select * from customers order by name
```

5. 

```sql
SELECT name,email FROM  CUSTOMERS
```

6. wanna display the column with any name.
```sql
SELECT name "Name of the customers" FROM  CUSTOMERS

```

7. Where clause
```sql
SELECT * FROM CUSTOMERS WHERE ID=3

SELECT * FROM CUSTOMERS WHERE ID>=3

SELECT * FROM CUSTOMERS WHERE ID!=3

SELECT * FROM CUSTOMERS WHERE ID<>3

SELECT * FROM CUSTOMERS WHERE name Like 'Vue'

SELECT * FROM CUSTOMERS
WHERE name = 'cavani'

```



### Activity

---

1.  Table creation

```sql

CREATE TABLE Persons (
    PersonID int,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255)
);

insert into Persons (personid,"lastname","firstname","address","city") values (2,'Chance','Rapper','US','Nyc')

select * from Customers 
where name like '%o'

select * from Customers 
where name like '%e%'


select * from Customers 
where email like '%gmail.com'
```




---