# Write your MySQL query statement below
select
        CASE
           WHEN s.id % 2 != 0 AND s.id = (SELECT COUNT(*) FROM Seat) THEN s.id
           WHEN s.id % 2 = 0 THEN s.id - 1
           ELSE
               s.id + 1
           END AS id,
       student
from seat s 
order by id ;