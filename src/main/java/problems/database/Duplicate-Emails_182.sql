# Write your MySQL query statement below
# 查找重复的电子邮箱
	select Email, count(Email) as num
	from Person
	group by Email;
	
	select Email from(
	  select Email, count(Email) as num
	  from Person
	  group by Email
	) as statistic
	where num > 1;
	
	select Email
	from Person
	group by Email
	having count(Email) > 1;