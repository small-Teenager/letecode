# Write your MySQL query statement below
select t.Request_at as Day,
        round(sum(case when t.Status in ('cancelled_by_client', 'cancelled_by_driver') then 1 else 0 end) / count(t.Id), 2) as "Cancellation Rate"
from trips t 
left join users u
    on t.Client_Id = u.Users_Id
where t.Request_at >= '2013-10-01' and t.Request_at<= '2013-10-03'
    and u.Banned = 'No'
group by t.Request_at