<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="Clases.*"%>
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
</head>
<body>
<jsp:include page="Index.jsp"></jsp:include>
<form action="Consultar" method="get">
	<div class="container mt-3">

		<div class="row">

			<div class="col-sm-2">
				
					<label for="email">Cedula</label>
				
			</div>

			<div class="col-sm-4">
				
					<input type="text" name="cedula" class="form-control" tabindex="4">
				
			</div>


			<div class="col-sm-1">
				<label for="email">Usuario:</label>
			</div>
			<div class="col-sm-4">
				<input type="email" name="usuario" id="email" class="form-control"
					tabindex="4">
			</div>
		</div>


		<div class="row mt-3">
			<div class="col-sm-2">
				<label for="email">Nombre Completo:</label>
			</div>
			<div class="col-sm-4">
				<input type="email" name="email" id="email" class="form-control"
					placeholder="Email" tabindex="4">
			</div>

			<div class="col-sm-1">
				<label for="email">Contrasena:</label>
			</div>
			<div class="col-sm-4">
				<input type="email" name="email" id="email" class="form-control"
					placeholder="Email" tabindex="4">
			</div>
		</div>
		<div class="row mt-3">
			<div class="col-sm-2">
				<label for="email">Correo Electronico:</label>
			</div>
			<div class="col-sm-4">
				<input type="email" name="email" id="email" class="form-control"
					placeholder="Email" tabindex="4">
			</div>


		</div>
	</div>

	<div class="container">

		<div class="row mt-3">

			<div class="col-sm-3">
				
					<button type="submit" class="btn btn-dark" name="consultar"
						id="btn_consulta">Consultar</button>
				
			</div>

			<div class="col-sm-3">
				<button type="submit" class="btn btn-dark" name="crear" id="btn">Crear</button>
			</div>

			<div class="col-sm-3">
				<button type="submit" class="btn btn-dark" name="actualizar"
					id="btn">Actualizar</button>
			</div>
			<div class="col-sm-3">
				<button type="submit" class="btn btn-dark" name="borrar" id="btn">Borrar</button>
			</div>
		</div>

	</div>
</form>



</body>
</html>