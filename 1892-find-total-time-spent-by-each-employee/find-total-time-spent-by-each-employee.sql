# Write your MySQL query statement below
SELECT event_day AS day, emp_id, 
        SUM(out_time-in_time) AS total_time   #Sum can be used as they have multiple entries in a single day
FROM Employees
GROUP BY emp_id,event_day;
#Did not used TIMESTAMPDIFF(unit,start_date,end_date) as no time was provided 