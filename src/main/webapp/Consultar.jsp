<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
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

			
				<jsp:include page="Usuarios.jsp"></jsp:include>



	<div class="container mt-3">

		<div class="row">

			<div class="col-sm">

				<table class="table table-dark table-striped">

					<thead>
						<tr>
							<th scope="col"># </th>
							<th scope="col">Usuario</th>
							<th scope="col">Password</th>
							<th scope="col">Cedula</th>
							<th scope="col">Nombre</th>
							<th scope="col">E-email</th>


						</tr>
					</thead>

					<tbody>
						<%
						Usuarios usuarioEncontrado = (Usuarios) request.getAttribute("encontrado");

						if (usuarioEncontrado != null) {

							out.println("    <tr>\n" + "      <th scope=\"row\">" + usuarioEncontrado.getIdusuarios() + "</th>\n" + "      <td>"
							+ usuarioEncontrado.getUsuario() + "</td>\n" + "      <td>" + usuarioEncontrado.getPassword() + " </td>\n"
							+ "      <td>" + usuarioEncontrado.getCedula() + " </td>\n" + "      <td>" + usuarioEncontrado.getNomber()
							+ " </td>\n" + "      <td>" + usuarioEncontrado.getEmail() + " </td>\n"

							+ "    </tr>");

						}else{
							out.print("    <tr>\n" + "      <th scope=\"row\"> Usuario no encontrado</th>\n" 
									+ "      <td> </td>\n"
											+ "      <td> </td>\n"
													+ "      <td> </td>\n"
															+ "      <td> </td>\n"
																	+ "      <td> </td>\n"
									+"    </tr>"
									);
						}
						%>



					</tbody>






				</table>
			</div>
		</div>
	</div>
</body>

</html>