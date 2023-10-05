# Write your MySQL query statement below
with c as 
    (
        select count(*) as user_count
        from users
    )
select contest_id,round(count(*)/c.user_count*100,2) as percentage
from register,c
group by contest_id
order by percentage desc , contest_id asc;