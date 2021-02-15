CREATE DATABASE DatabaseName;
CREATE DATABASE testDB;
SHOW DATABASES;

DROP DATABASE DatabaseName;
 DROP DATABASE testDB;
SHOW DATABASES;

USE DatabaseName;
USE testDB;

CREATE TABLE table_name(
   column1 datatype,
   column2 datatype,
   column3 datatype,
   .....
   columnN datatype,
   PRIMARY KEY( one or more columns )
);

eg.
CREATE TABLE CUSTOMERS(
   ID   INT              NOT NULL,
   NAME VARCHAR (20)     NOT NULL,
   AGE  INT              NOT NULL,
   ADDRESS  CHAR (25) ,
   SALARY   DECIMAL (18, 2),       
   PRIMARY KEY (ID)
);

DESC CUSTOMERS;

DROP TABLE table_name;

DROP TABLE CUSTOMERS;

INSERT INTO TABLE_NAME (column1, column2, column3,...columnN)  
VALUES (value1, value2, value3,...valueN);

eg.
INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (1, 'Ramesh', 32, 'Ahmedabad', 2000.00 );

INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (2, 'Khilan', 25, 'Delhi', 1500.00 );

INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (3, 'kaushik', 23, 'Kota', 2000.00 );

INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (4, 'Chaitali', 25, 'Mumbai', 6500.00 );

INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (5, 'Hardik', 27, 'Bhopal', 8500.00 );

INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (6, 'Komal', 22, 'MP', 4500.00 );

     or 
INSERT INTO CUSTOMERS 
VALUES (7, 'Muffy', 24, 'Indore', 10000.00 );

SELECT column1, column2, columnN FROM table_name;
    or
SELECT * FROM table_name;

eg.
SELECT ID, NAME, SALARY FROM CUSTOMERS;
        or
SELECT * FROM CUSTOMERS;

where *****
SELECT column1, column2, columnN 
FROM table_name
WHERE [condition]

1.fetch the ID, Name and Salary fields from the CUSTOMERS table, where the salary is greater than 2000.

SELECT ID, NAME, SALARY 
FROM CUSTOMERS
WHERE SALARY > 2000;

2. ID, Name and Salary fields from the CUSTOMERS table for a customer with the name Hardik.

SELECT ID, NAME, SALARY 
FROM CUSTOMERS
WHERE NAME = 'Hardik';

and,or, operator
SELECT column1, column2, columnN 
FROM table_name
WHERE [condition1] AND [condition2]...AND [conditionN];

3. fetch the ID, Name and Salary fields from the CUSTOMERS table, where the salary is greater than 2000 and the age is less than 25 years.

SELECT ID, NAME, SALARY 
FROM CUSTOMERS
WHERE SALARY > 2000 AND age < 25;

4.fetch the ID, Name and Salary fields from the CUSTOMERS table, where the salary is greater than 2000 OR the age is less than 25 years.

 SELECT ID, NAME, SALARY 
FROM CUSTOMERS
WHERE SALARY > 2000 OR age < 25;

update***********

UPDATE table_name
SET column1 = value1, column2 = value2...., columnN = valueN
WHERE [condition];

5.update the ADDRESS for a customer whose ID number is 6 in the table.

UPDATE CUSTOMERS
SET ADDRESS = 'Pune'
WHERE ID = 6;

modify all the ADDRESS and the SALARY column******

UPDATE CUSTOMERS
SET ADDRESS = 'Pune', SALARY = 1000.00; 

DELETE ****************
DELETE FROM table_name
WHERE [condition];

6.DELETE a customer, whose ID is 6.

DELETE FROM CUSTOMERS
WHERE ID = 6;

7. to delete all records from customer.
DELETE FROM CUSTOMERS;

like*****
SELECT * FROM CUSTOMERS
WHERE SALARY LIKE '200%';

1 WHERE SALARY LIKE '200%'
Finds any values that start with 200.

2 WHERE SALARY LIKE '%200%'
Finds any values that have 200 in any position.

3 WHERE SALARY LIKE '_00%'
Finds any values that have 00 in the second and third positions.

4 WHERE SALARY LIKE '2_%_%'
Finds any values that start with 2 and are at least 3 characters in length.

5 WHERE SALARY LIKE '%2'
Finds any values that end with 2.

6 WHERE SALARY LIKE '_2%3'
Finds any values that have a 2 in the second position and end with a 3.

7 WHERE SALARY LIKE '2___3'
Finds any values in a five-digit number that start with 2 and end with 3.

limit ***********
SELECT * FROM CUSTOMERS
LIMIT 3;

ORDER BY*************
SELECT column-list 
FROM table_name 
[WHERE condition] 
[ORDER BY column1, column2, .. columnN] [ASC | DESC];

8. sort the result in an ascending order by the NAME and the SALARY.

SELECT * FROM CUSTOMERS
   ORDER BY NAME, SALARY;

 sort the result in the descending order by NAME.

SELECT * FROM CUSTOMERS
   ORDER BY NAME DESC;

9 The SQL GROUP BY clause is used in collaboration with the SELECT statement to arrange identical data into groups. This GROUP BY clause follows the WHERE clause in a SELECT statement and precedes the ORDER BY clause.

SELECT column1, column2
FROM table_name
WHERE [ conditions ]
GROUP BY column1, column2
ORDER BY column1, column2

eg. to know the total amount of the salary on each customer,

SELECT NAME, SUM(SALARY) FROM CUSTOMERS
   GROUP BY NAME;

10. DISTINCT 
we do not have any duplicate entry.

SELECT DISTINCT SALARY FROM CUSTOMERS
   ORDER BY SALARY;

Contraints*********************

NOT NULL Constraint − Ensures that a column cannot have NULL value.

*CREATE TABLE CUSTOMERS(
   ID   INT              NOT NULL,
   NAME VARCHAR (20)     NOT NULL,
   AGE  INT              NOT NULL,
   ADDRESS  CHAR (25) ,
   SALARY   DECIMAL (18, 2),       
   PRIMARY KEY (ID)
);

*ALTER TABLE CUSTOMERS
   MODIFY SALARY  DECIMAL (18, 2) NOT NULL;

DEFAULT Constraint − Provides a default value for a column when none is specified.

*CREATE TABLE CUSTOMERS(
   ID   INT              NOT NULL,
   NAME VARCHAR (20)     NOT NULL,
   AGE  INT              NOT NULL,
   ADDRESS  CHAR (25) ,
   SALARY   DECIMAL (18, 2) DEFAULT 5000.00,       
   PRIMARY KEY (ID)
);

if table present allready then
MODIFY SALARY  DECIMAL (18, 2) DEFAULT 5000.00;

To DROP DEFAULT Constraint
ALTER TABLE CUSTOMERS
   ALTER COLUMN SALARY DROP DEFAULT;



UNIQUE Constraint − Ensures that all values in a column are different.

CREATE TABLE CUSTOMERS(
   ID   INT              NOT NULL,
   NAME VARCHAR (20)     NOT NULL,
   AGE  INT              NOT NULL UNIQUE,
   ADDRESS  CHAR (25) ,
   SALARY   DECIMAL (18, 2),       
   PRIMARY KEY (ID)
);

if table already created then
ALTER TABLE CUSTOMERS
   MODIFY AGE INT NOT NULL UNIQUE;

 TO DROP
ALTER TABLE CUSTOMERS
   DROP INDEX myUniqueConstraint;


PRIMARY Key − Uniquely identifies each row/record in a database table.
 CREATE TABLE CUSTOMERS(
   ID   INT              NOT NULL,
   NAME VARCHAR (20)     NOT NULL,
   AGE  INT              NOT NULL,
   ADDRESS  CHAR (25) ,
   SALARY   DECIMAL (18, 2),       
   PRIMARY KEY (ID)
);

if table is already create
ALTER TABLE CUSTOMER ADD PRIMARY KEY (ID);

Primary key on multiple columns..

CREATE TABLE CUSTOMERS(
   ID   INT              NOT NULL,
   NAME VARCHAR (20)     NOT NULL,
   AGE  INT              NOT NULL,
   ADDRESS  CHAR (25) ,
   SALARY   DECIMAL (18, 2),        
   PRIMARY KEY (ID, NAME)
);

if Table already created
ALTER TABLE CUSTOMERS 
   ADD CONSTRAINT PK_CUSTID PRIMARY KEY (ID, NAME);


FOREIGN Key − Uniquely identifies a row/record in any of the given database table.
The relationship between 2 tables matches the Primary Key in one of the tables with a Foreign Key in the second table.

Consider two tables Customers and orders as fllow
 CREATE TABLE CUSTOMERS(
   ID   INT              NOT NULL,
   NAME VARCHAR (20)     NOT NULL,
   AGE  INT              NOT NULL,
   ADDRESS  CHAR (25) ,
   SALARY   DECIMAL (18, 2),       
   PRIMARY KEY (ID)
);

CREATE TABLE ORDERS (
   ID          INT        NOT NULL,
   DATE        DATETIME, 
   CUSTOMER_ID INT references CUSTOMERS(ID),
   AMOUNT     double,
   PRIMARY KEY (ID)
);

if orders table is already created and firighen key has not yet been set then
ALTER TABLE ORDERS 
   ADD FOREIGN KEY (Customer_ID) REFERENCES CUSTOMERS (ID);


CHECK Constraint − The CHECK constraint ensures that all the values in a column satisfies certain conditions.

CREATE TABLE CUSTOMERS(
   ID   INT              NOT NULL,
   NAME VARCHAR (20)     NOT NULL,
   AGE  INT              NOT NULL CHECK (AGE >= 18),
   ADDRESS  CHAR (25) ,
   SALARY   DECIMAL (18, 2),       
   PRIMARY KEY (ID)
);

If the CUSTOMERS table has already been created, then to add a CHECK constraint.
ALTER TABLE CUSTOMERS
   MODIFY AGE INT NOT NULL CHECK (AGE >= 18 );





INDEX − Used to create and retrieve data from the database very quickly.

consider...
CREATE TABLE CUSTOMERS(
   ID   INT              NOT NULL,
   NAME VARCHAR (20)     NOT NULL,
   AGE  INT              NOT NULL,
   ADDRESS  CHAR (25) ,
   SALARY   DECIMAL (18, 2),       
   PRIMARY KEY (ID)
);

To create an INDEX on the AGE column, to optimize the search on customers for a specific age
CREATE INDEX idx_age
   ON CUSTOMERS ( AGE );
 
To Drop INDEX

ALTER TABLE CUSTOMERS
   DROP INDEX idx_age;

Dropping Constraints***********
ALTER TABLE EMPLOYEES DROP CONSTRAINT EMPLOYEES_PK;

JOINs**********

SELECT ID, NAME, AGE, AMOUNT
   FROM CUSTOMERS, ORDERS
   WHERE  CUSTOMERS.ID = ORDERS.CUSTOMER_ID;

INNER JOIN − returns rows when there is a match in both tables.

SELECT  ID, NAME, AMOUNT, DATE
   FROM CUSTOMERS
   INNER JOIN ORDERS
   ON CUSTOMERS.ID = ORDERS.CUSTOMER_ID;


LEFT JOIN − returns all rows from the left table, even if there are no matches in the right table.

SELECT  ID, NAME, AMOUNT, DATE
   FROM CUSTOMERS
   LEFT JOIN ORDERS
   ON CUSTOMERS.ID = ORDERS.CUSTOMER_ID;

RIGHT JOIN − returns all rows from the right table, even if there are no matches in the left table.

SELECT  ID, NAME, AMOUNT, DATE
   FROM CUSTOMERS
   RIGHT JOIN ORDERS
   ON CUSTOMERS.ID = ORDERS.CUSTOMER_ID;

FULL JOIN − returns rows when there is a match in one of the tables.

SELECT  ID, NAME, AMOUNT, DATE
   FROM CUSTOMERS
   FULL JOIN ORDERS
   ON CUSTOMERS.ID = ORDERS.CUSTOMER_ID;

SELF JOIN − is used to join a table to itself as if the table were two tables, temporarily renaming at least one table in the SQL statement.

SELECT  a.ID, b.NAME, a.SALARY
   FROM CUSTOMERS a, CUSTOMERS b
   WHERE a.SALARY < b.SALARY

CARTESIAN JOIN − returns the Cartesian product of the sets of records from the two or more joined tables.






 

