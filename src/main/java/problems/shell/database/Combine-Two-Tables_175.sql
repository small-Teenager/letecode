# 组合两个表
# Write your MySQL query statement below method 1
	select FirstName, LastName, City, State
	from Person left join Address
	on Person.PersonId = Address.PersonId;
# method 2	
	select a.FirstName,a.LastName,b.City,b.State 
	from Person a left join Address b on
	a.PersonId = b.PersonId