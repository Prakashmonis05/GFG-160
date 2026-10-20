# Write your MySQL query statement below
select p.product_id, ifnull(round(sum(p.price*u.units)/sum(u.units),2),0) as average_price 
from Prices p 
left join UnitsSold u
ON p.product_id=u.product_id
and u.purchase_date>=p.start_date 
and u.purchase_date<=p.end_date
Group by p.product_id;