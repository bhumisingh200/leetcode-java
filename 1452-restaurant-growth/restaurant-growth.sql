# Write your MySQL query statement below
#SELF JOIN QUESTION
SELECT 
    c1.visited_on,
    SUM(c2.amount) AS amount,
    ROUND(SUM(c2.amount) / 7, 2) AS average_amount
FROM
    (
        SELECT visited_on, SUM(amount) AS amount
        FROM Customer
        GROUP BY visited_on
    ) c1
JOIN
    (
        SELECT visited_on, SUM(amount) AS amount
        FROM Customer
        GROUP BY visited_on
    ) c2
ON c2.visited_on BETWEEN
   DATE_SUB(c1.visited_on, INTERVAL 6 DAY)
   AND c1.visited_on
GROUP BY c1.visited_on
HAVING COUNT(DISTINCT c2.visited_on) = 7
ORDER BY c1.visited_on;