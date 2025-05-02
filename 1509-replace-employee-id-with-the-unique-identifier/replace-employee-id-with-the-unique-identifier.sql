# Write your MySQL query statement below
select u.unique_id as unique_id,e.name as name
from EmployeeUNI as u
right join Employees as e
on e.id=u.id