<%@page import="com.model.util.*"%>
<%@page import="com.demo.model.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	<header> <%@ include file="template/header.jsp"%>
		<script src="resources/js/home.js"></script>
		<script src="resources/js/register.js"></script>
	</header>
	<article>
	<div class="container">
		<form>
			<div class="jumbotron">
			<h1>Home :D</h1>
			
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Name</th>
						<th scope="col">Last Name</th>
						<th scope="col">Email</th>
						<th scope="col">Age</th>
						<th scope="col">Address</th>
						<th scope="col">State</th>
						<th scope="col">City</th>
						<th scope="col">..</th>
						<th scope="col">..</th>
					</tr>
				</thead>
				<tbody>
				<%for (User user : new Dropdowns().getUserList()){ %>
					<tr>
						<th scope="row"><%=user.getId() %></th>
						<td><%=user.getName() %></td>
						<td><%=user.getLastName() %></td>
						<td><%=user.getEmail() %></td>
						<td><%=user.getAge() %></td>
						<td><%=user.getAddress() %></td>
						<td><%=user.getState() %></td>
						<td><%=user.getCity() %></td>
						<td>
							<button class="btn btn-outline-danger btn-block" type="button" onclick="deleteUser(<%=user.getId() %>)" id="deleteBtn">delete</button>
						</td>
						<td>
							<button class="btn btn-outline-primary btn-block" type="button" onclick="updateUser(<%=user.getId() %>)" id="updateBtn">Update</button>
						</td>
					</tr>
					<%} %>
				</tbody>
			</table>
			
		</div>
		</form>
		
		<div id="update-dialog" title="Basic dialog">
			<form action="/ServletAppDemo/UpdateServlet">
				<input type="text" id="inputId" class="form-control form-control-lg" placeholder="Id" name="id">
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
							<td><button type="submit" class="btn btn-outline-primary">Update</button></td>
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