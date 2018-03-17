<%@ page language="java" import="com.demo.model.*, com.model.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header> <%@ include file="template/header.jsp"%>
		<script src="resources/js/register.js"></script>
	</header>
	<article>
	<div class="container">
		<div class="jumbotron">
			<h1>Register Form</h1>
			<hr>

			<form name="form1" method="POST"
				action="/ServletAppDemo/RegisterServlet">
				<table>
					<tbody>
						<tr>
							<td>Name:</td>
							<td><input type="text" name="name" class="form-control form-control-lg"/></td>
						</tr>

						<tr>
							<td>Last Name:</td>
							<td><input type="text" name="lastName" class="form-control form-control-lg"/></td>
						</tr>

						<tr>
							<td>Email:</td>
							<td><input type="text" name="email" class="form-control form-control-lg"/></td>
						</tr>

						<tr>
							<td>Age:</td>
							<td><input type="text" name="age" class="form-control form-control-lg"/></td>
						</tr>

						<tr>
							<td>Address:</td>
							<td><input type="text" name="address" class="form-control form-control-lg"/></td>
						</tr>	
						
						<tr>
							<td>State:</td>
							<td>
								<select id="states_select" name="state" class="form-control form-control-lg">
									<%for(State state : new Dropdowns().getStateDrop()){ %>
									<option value="<%=state.getId()%>"><%=state.getName() %></option>
									<% }%>
								</select>
							</td>
						</tr>
						
						<tr>
							<td>City:</td>
							<td>
								<select id="cities_select" name="city" class="form-control form-control-lg">
									
								</select>
							</td>
						</tr>

						<tr>
							<td>Password:</td>
							<td><input type="password" name="password" class="form-control form-control-lg"/></td>
						</tr>

						<tr>
							<td>&nbsp;</td>
							<td><button type="submit" class="btn btn-outline-primary">Register</button>&nbsp;
								<a class="btn btn-outline-danger" href="index.jsp" role="button">Cancel</a></td>
						</tr>
					</tbody>
				</table>
			</form>
		</div>
	</div>
	</article>
	<footer> <%@ include file="template/footer.jsp"%>
	</footer>
</body>
</html>