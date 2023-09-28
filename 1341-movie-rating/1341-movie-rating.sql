# Write your MySQL query statement below
(
  SELECT u.name AS results
  FROM MovieRating r LEFT JOIN Users u
  ON (r.user_id = u.user_id)
  GROUP BY r.user_id
  ORDER BY COUNT(r.movie_id) DESC, u.name 
  LIMIT 1
)

union all
(
  SELECT m.title AS results
  FROM MovieRating r LEFT JOIN Movies m
  ON (r.movie_id = m.movie_id)
  WHERE r.created_at LIKE '2020-02%'
  GROUP BY r.movie_id
  ORDER BY AVG(r.rating) DESC, m.title 
  LIMIT 1
);

# (select m.title as results
# from movieRating mr join movies m on mr.movie_id=m.movie_id
# where mr.created_at like "2020-02%"
# group by mr.movie_id
# having avg(rating)=(
#                     select max(average)
#                     from(
#                         select avg(rating) as average
#                         from movieRating mr3
#                         where mr3.created_at like "2020-02%"
#                         group by mr3.movie_id
#                         )as av
#                     )
# order by m.title
# limit 1
# ) 
# ;


# (
#   SELECT u.name AS results
#   FROM Movie_Rating r LEFT JOIN Users u
#   ON (r.user_id = u.user_id)
#   GROUP BY r.user_id
#   ORDER BY COUNT(r.movie_id) DESC, u.name 
#   LIMIT 1
# )
# UNION
# (
#   SELECT m.title AS results
#   FROM Movie_Rating r LEFT JOIN Movies m
#   ON (r.movie_id = m.movie_id)
#   WHERE r.created_at LIKE '2020-02%'
#   GROUP BY r.movie_id
#   ORDER BY AVG(r.rating) DESC, m.title 
#   LIMIT 1
# )