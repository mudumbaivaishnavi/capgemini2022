1. Write a SQL statement to create a simple table countries including columns country_id,country_name and region_id.
Ans.
CREATE TABLE countries( 
COUNTRY_ID varchar(2),
COUNTRY_NAME varchar(40),
REGION_ID decimal(10,0)
);

2. Write a SQL statement to create a simple table countries including columns country_id,country_name and region_id which already exist.
Ans.
CREATE TABLE IF NOT EXISTS countries( 
COUNTRY_ID varchar(2),
COUNTRY_NAME varchar(40),
REGION_ID decimal(10,0)
);

3. Write a SQL statement to create the structure of a table dup_countries similar to countries.
Ans.
CREATE TABLE dup_countries AS SELECT * FROM countries;

4. Write a SQL statement to create a duplicate copy of countries table including structure and data by name dup_countries.
Ans.
CREATE TABLE IF NOT EXISTS dup_countries AS SELECT * FROM countries;

5. Write a SQL statement to create a table countries set a constraint NULL.
Ans.
CREATE TABLE IF NOT EXISTS countries ( 
COUNTRY_ID varchar(2) NOT NULL,
COUNTRY_NAME varchar(40) NOT NULL,
REGION_ID decimal(10,0) NOT NULL
);


insert

1. Write a SQL statement to insert a record with your own value into the table countries against each column.

Here in the following is the structure of the table countries.

    Column    |         Type          | Modifiers
--------------+-----------------------+-----------
 country_id   | character varying(2)  |
 country_name | character varying(40) |
 region_id    | numeric(10,0)         |
 
Ans.
INSERT INTO countries VALUES('C1','India',1001);

2. Write a SQL statement to insert one row into the table countries against the column country_id and country_name.

Here in the following is the structure of the table countries.

    Column    |         Type          | Modifiers
--------------+-----------------------+-----------
 country_id   | character varying(2)  |
 country_name | character varying(40) |
 region_id    | numeric(10,0)         |
Click me to see the solution

Ans.
INSERT INTO countries (country_id,country_name) VALUES('C2','India');

3. Write a SQL statement to create duplicates of countries table named country_new with all structure and data.

Here in the following is the structure of the table countries.

    Column    |         Type          | Modifiers
--------------+-----------------------+-----------
 country_id   | character varying(2)  |
 country_name | character varying(40) |
 region_id    | numeric(10,0)         |
Click me to see the solution

Ans.
CREATE TABLE IF NOT EXISTS country_new AS SELECT * FROM countries;

4. Write a SQL statement to insert NULL values into region_id column for a row of countries table.

Click me to see the solution

Ans.
INSERT INTO countries (country_id,country_name,region_id) VALUES('C3','India',NULL);

5. Write a SQL statement to insert 3 rows by a single insert statement.

Ans.
INSERT INTO countries VALUES('C0001','India',1001),
('C0002','USA',1007),('C0003','UK',1003);
--verifying
select * from countries;

select

1. Write a query to display the names (first_name, last_name) using an alias name “First Name", "Last Name".
Ans.
SELECT first_name "First Name",  last_name "Last Name" FROM employees;

2. Write a query to get a unique department ID from employee table.
Ans.
SELECT DISTINCT department_id FROM employees;

3. Write a query to get the names (first_name, last_name), salary and 15% of salary as PF for all the employees.
Ans.
SELECT first_name, last_name, salary, salary*.15 PF FROM employees;

4. Write a query to get the employee ID, names (first_name, last_name) and salary in ascending order according to their salary.
Ans.
SELECT employee_id, first_name, last_name, salary FROM employees ORDER BY salary;

5.Write a query to get the number of employees working with the company.
Ans.
SELECT COUNT(*) FROM employees;

1. Write a query to display the name, including first_name and last_name and salary for all employees whose salary is out of the range between $10,000 and $15,000.
Ans.
SELECT first_name, last_name, salary FROM employees WHERE salary NOT BETWEEN 10000 AND 15000;

2. Write a query to display the name, including first_name and last_name, and department ID who works in the department 30 or 100 and arrange the result in ascending order according to the department ID.
Ans.
SELECT first_name, last_name, department_id FROM employees WHERE department_id IN (30, 100) ORDER BY  department_id  ASC;

3. Write a query to display the name, including first_name and last_name, and salary who works in the department either 30 or 100 and salary is out of the range between $10,000 and $15,000.
Ans.
SELECT first_name, last_name, salary, department_id FROM employees WHERE salary NOT BETWEEN 10000 AND 15000 AND department_id IN (30, 100);

4. Write a query to display the name, including first_name and last_name and hire date for all employees who were hired in 1987.

+-------------+-------------+-------------+----------+--------------------+------------+------------+----------+----------------+------------+---------------+
| EMPLOYEE_ID | FIRST_NAME  | LAST_NAME   | EMAIL    | PHONE_NUMBER       | HIRE_DATE  | JOB_ID     | SALARY   | COMMISSION_PCT | MANAGER_ID | DEPARTMENT_ID |
+-------------+-------------+-------------+----------+--------------------+------------+------------+----------+----------------+------------+---------------+
|         100 | Steven      | King        | SKING    | 515.123.4567       | 1987-06-17 | AD_PRES    | 24000.00 |           0.00 |          0 |   		  90 |
|         101 | Neena       | Kochhar     | NKOCHHAR | 515.123.4568       | 1987-06-18 | AD_VP      | 17000.00 |           0.00 |        100 |            90 |
|         102 | Lex         | De Haan     | LDEHAAN  | 515.123.4569       | 1987-06-19 | AD_VP      | 17000.00 |           0.00 |        100 |            90 |
|         103 | Alexander   | Hunold      | AHUNOLD  | 590.423.4567       | 1987-06-20 | IT_PROG    |  9000.00 |           0.00 |        102 |            60 |
|         104 | Bruce       | Ernst       | BERNST   | 590.423.4568       | 1987-06-21 | IT_PROG    |  6000.00 |           0.00 |        103 |            60 |
|         105 | David       | Austin      | DAUSTIN  | 590.423.4569       | 1987-06-22 | IT_PROG    |  4800.00 |           0.00 |        103 |            60 |
|         106 | Valli       | Pataballa   | VPATABAL | 590.423.4560       | 1987-06-23 | IT_PROG    |  4800.00 |           0.00 |        103 |            60 |
Ans.
SELECT first_name, last_name, hire_date FROM employees WHERE YEAR(hire_date)  LIKE '1987%';