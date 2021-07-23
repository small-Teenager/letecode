
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
 SET N=N-1;
  RETURN (
      # Write your MySQL query statement below.
    
      select IFNULL((select distinct salary from employee order by salary desc limit N,1),NULL)
  );
END