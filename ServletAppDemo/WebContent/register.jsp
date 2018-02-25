<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header> <%@ include file="template/header.jsp"%>
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
							<td><input type="text" name="name" /></td>
						</tr>

						<tr>
							<td>Last Name:</td>
							<td><input type="text" name="lastName" /></td>
						</tr>

						<tr>
							<td>Email:</td>
							<td><input type="text" name="email" /></td>
						</tr>

						<tr>
							<td>Age:</td>
							<td><input type="text" name="age" /></td>
						</tr>

						<tr>
							<td>Address:</td>
							<td><input type="text" name="address" /></td>
						</tr>

						<tr>
							<td>Password:</td>
							<td><input type="password" name="password" /></td>
						</tr>

						<tr>
							<td>&nbsp;</td>
							<td><input type="submit" name="btnRegister" value="Register" />&nbsp;
								<input type="reset" name="btnClear" value="Clear" /></td>
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