# Check constraints in the database

```sql
create table Student(
 enrollment varchar2(20),
 age number(10),
contact varchar2(20),
city varchar2(20),
CHECK (enrollment like 'GEU%'),
CHECK (age>=18),
CHECK (city in ('Dehradun','Bhimtal','Paris','Barcelona'))
);
```

---

```sql
insert into Student values(
 'GEU103',20,'9876543620','Paris');
 
```
