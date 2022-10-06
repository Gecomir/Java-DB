# 08. Employee 24
SELECT e.`employee_id`, e.`first_name`,
CASE 
	WHEN DATE(p.start_date) <= '2004-12-31' THEN p.`name`
	ELSE NULL
END AS `project_name`
FROM `employees` AS e
JOIN `employees_projects` AS ep
ON e.`employee_id` = ep.`employee_id`
JOIN `projects` AS p
ON p.`project_id` = ep.`project_id`
WHERE e.`employee_id` = 24
ORDER BY p.`name`;