# È·¶¨ÅÅÃû
# Write your MySQL query statement below
select s1.Score, (
select COUNT(DISTINCT s2.Score) 
from Scores  s2
where s2.Score >= s1.Score 
)  Rank
from Scores AS s1
order by s1.Score desc;