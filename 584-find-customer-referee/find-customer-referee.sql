# Write your MySQL query statement below
SELECT a.name
FROM Customer a
WHERE referee_id!=2 OR referee_id IS null;
