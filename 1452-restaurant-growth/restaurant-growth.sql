# Write your MySQL query statement below
#Correlated subquery
SELECT visited_on, 
       (
        SELECT SUM(c2.amount)
        FROM Customer c2
        WHERE c2.visited_on BETWEEN DATE_SUB(c.visited_on, INTERVAL 6 DAY)
        AND c.visited_on
       ) AS amount,
       ROUND((
        SELECT SUM(c2.amount)
        FROM Customer c2
        WHERE c2.visited_on BETWEEN DATE_SUB(c.visited_on, INTERVAL 6 DAY)
        AND c.visited_on
       )/7,2) AS average_amount
FROM Customer c
WHERE  c.visited_on >= (
    SELECT DATE_ADD(MIN(visited_on), INTERVAL 6 DAY)
    FROM Customer
)
GROUP BY visited_on
ORDER BY visited_on;