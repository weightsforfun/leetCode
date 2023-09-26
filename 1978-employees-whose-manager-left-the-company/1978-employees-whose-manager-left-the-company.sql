# Write your MySQL query statement below
select e.employee_id
from employees e
where e.salary<30000 and 
(
e.manager_id not in (select e2.employee_id from employees e2)
    )
order by e.employee_id; 
    
    
    
