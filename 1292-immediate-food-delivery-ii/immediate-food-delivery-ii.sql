# Write your MySQL query statement below
SELECT
    ROUND(
        AVG(order_date = customer_pref_delivery_date) * 100,
        2
    ) AS immediate_percentage
FROM Delivery
WHERE (customer_id, order_date) IN (    #Does this exact pair exist in the result of my subquery?
    SELECT customer_id, MIN(order_date) #Give me the first order date of every customer.
    FROM Delivery
    GROUP BY customer_id
);
