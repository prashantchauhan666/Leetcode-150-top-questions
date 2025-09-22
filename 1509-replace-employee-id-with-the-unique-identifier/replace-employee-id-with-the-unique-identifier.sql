# Write your MySQL query statement below
SELECT eu.unique_id,e.name
FROM Employees e
left JOIN EmployeeUNI eu
on eu.id=e.id;
