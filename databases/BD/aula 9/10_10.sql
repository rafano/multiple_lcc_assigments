SELECT customer.first_name, customer.last_name, SUM(TIMESTAMPDIFF(MINUTE, rental.rent_date, rental.return_date)) as 'tempo de aluguer' FROM rental INNER JOIN customer ON customer.customer_id=rental.customer_id
GROUP BY customer.customer_id ORDER BY SUM(TIMESTAMPDIFF(MINUTE, rental.rent_date, rental.return_date)) DESC, customer.first_name ASC, customer.last_name ASC LIMIT 20;




(select first_name, last_name, SUM(TIMESTAMPDIFF(MINUTE, rent_date, return_date)) as A from rental inner join customer on rental.customer_id=customer.customer_id group by rental.customer_id order by 3 DESC LIMIT 20);
