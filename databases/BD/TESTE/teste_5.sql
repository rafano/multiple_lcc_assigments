select first_name, last_name from customer inner join rental on customer.customer_id =rental.customer_id INNER JOIN inventory on rental.inventory_id=inventory.inventory_id NATURAL JOIN film where title like 'C%' and title like '%S' order by 1,2;