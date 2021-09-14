<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	  <%@page import="java.sql.*"%>
   <%@page import =" java.sql.DriverManager"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<style type="text/css">
.navbar-center {
	position: absolute;
	left: 50%;
	transform: translatex(-50%);
}
</style>

</head>



<body>

	<div class="container mt-5">
		<div class="row">
			<div class="col-sm">
				<form method=get action="LoginServlet">
					<div class="mb-3">
						<label class="form-label">Usuario</label> <input type="text"
							class="form-control" name="user">
					</div>
					<div class="mb-3">
						<label class="form-label">Contrasena</label> <input
							type="password" class="form-control" name="password">
					</div>

					<button type="submit" class="btn btn-primary" name="Ingresar">Ingresar</button>
					
					
					 

				
		</form>
			  <%
		  
		 
                    %>




			</div>


		</div>


	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
	crossorigin="anonymous"></script>
</html>