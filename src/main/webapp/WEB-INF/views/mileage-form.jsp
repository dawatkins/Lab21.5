<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mileage App</title>
<link rel="stylesheet" href="/style.css"/>
</head>
<body>
	<h1>Mileage Applicaton Miles Remaining</h1>
	<div>
		<form action ="/mileage-results">
		<p>Mileage (MPG): <input type="number" placeholder="0.00" step="0.10" name="mpg" /></p>
		<p>Gallons in tank: <input type="number" placeholder="0.00" step="0.10" name="gallonsLeft" /></p>
		<p><button type="submit">Calculate</button></p>
		</form>
	</div>
</body>
</html>