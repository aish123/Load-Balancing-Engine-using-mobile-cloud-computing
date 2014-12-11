<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="sjsu.cmpe281.cloud281.LoadBalancerService" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div id="header">
		<center>
			<P>Load Balancer</P>
		</center>


	</div>

	<div id="menu">

		<nav id="navigation" style="width: 500px; margin: 5px auto 0;">
			<ul>
				<li><a href="index.html">Home</a></li>
				<li><a href="login.html">Login</a></li>
				<li><a href="instances.html">Instances</a></li>
				<li><a href="about.html">About</a></li>
				<li><a href="contact.html">Contact</a></li>
				<li><a href="billing.html">Billing</a></li>
			</ul>
		</nav>





	</div>

	<div id="content" >
	<center>
	<form action="CloudServlet" method="post">
	
	<table>
	<tr>
	<td>
	<label>Select Algorithm</label>
	</td>
	<td>
		<select >
		<option selected>ANT</option>
		<option >HOLY BEE</option>
		<option>PSO</option>
		<option>RAMD</option>
		
		</select>
	</td>
	</tr>
	<tr>
	<td>
	<label> Memory</label>	
	</td>
	<td>
	<input type="text" placeholder="1GB">
	</td>
	</tr>
	<tr>
	<td>
	<label> CPU </label>
	</td>
	<td>
	<input type="text" placeholder="1GHZ">
	</td>
	</tr>
	<tr>
	<td>
	<label> LOCATION </label>
	</td>
	<td>
	<select>
	<option>VIRGINIA</option>
	<option>CALIFORNIA</option>
	<option>OREGON </option>
	<option>IRELAND</option>
	<option>TOKYO</option>
	<option>SYDNEY</option>
	</select>
	</td>
	</tr>
	<tr>
	<td>
	<input type="submit" onclick="Display.jsp" value="Allocate" style="align:center;">
	</td>
	</tr>
	</table>
	
	</form>
	</center>
	</div>

	<div id="footer">Team 2 (CMPE-281)</div>

</body>
</html>