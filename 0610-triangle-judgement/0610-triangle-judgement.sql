# Write your MySQL query statement below
SELECT *,IF(X+Y>Z AND Y+Z>X AND Z+X>Y, "Yes","No") AS Triangle 
FROM TRIANGLE;