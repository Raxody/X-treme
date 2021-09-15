package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import Clases.*;

/**
 * Servlet implementation class Consultar
 */
@WebServlet("/Consultar")
public class Consultar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SQL_SELECT = "SELECT * FROM xtreme.usuarios";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Consultar() {
        super();
        // TODO Auto-generated constructor stub
    }
    
   	 private void consultar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    	String ced = request.getParameter("cedula");
		if(ced.isEmpty()!= true ) {
			
		
		
		
			
		
		try ( PrintWriter out = response.getWriter()){
			
			
			if(request.getParameter("consultar") != null  ) {
				
				Connection con = null;
				PreparedStatement st = null;
				ResultSet rs = null;
				
				try {
					
					
					con = Conexion.getConnection();
					st = con.prepareStatement(SQL_SELECT);
					rs = st.executeQuery();
					
					
					
					Usuarios usuario = null;
					Usuarios objetoEncontrado =null;
					
					List<Usuarios> usuarios = new ArrayList<Usuarios>();
					
					while (rs.next() ) {
						 int idusuarios = rs.getInt("idusuarios");
						 String user  = rs.getString("usuario");
						 String password = rs.getString("password");
						 String cedula = rs.getString("cedula");
						 String nomber = rs.getString("nombre");
						 String email = rs.getString("email");
						 
						 usuario = new Usuarios(idusuarios,user, password, cedula, nomber,email);
						
						 usuarios.add(usuario);
					}
					
					
					 
					for (int i = 0; i < usuarios.size(); i++) {
						
						if(usuarios.get(i).getCedula().equals(ced)) {
							
							
							objetoEncontrado = new Usuarios(usuarios.get(i).getIdusuarios(), usuarios.get(i).getUsuario(),usuarios.get(i).getPassword(),usuarios.get(i).getCedula(),usuarios.get(i).getNomber(),usuarios.get(i).getEmail());
						
						
						
						}
						
					}
					
					
					request.setAttribute("encontrado", objetoEncontrado);
					request.setAttribute("a", ced);
					
					RequestDispatcher rd = request.getRequestDispatcher("Consultar.jsp");
					rd.forward(request, response);
					
					
				} catch (Exception e) {
					out.print(e);
				}finally {
					 Conexion.close(rs);
			            Conexion.close(st);
			            Conexion.close(con);
			            
				}
				
				
			}else {
				response.sendRedirect("Usuarios.jsp");
			}
		
			
			
	
			
		} catch (Exception e) {
			
			// TODO: handle exception
		}
		}else {
			response.sendRedirect("Usuarios.jsp");
		}
    	
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		consultar(request, response);
		
		/*String ced = request.getParameter("cedula");
		if(ced.isEmpty()!= true ) {
			
		
		
		
			
		
		try ( PrintWriter out = response.getWriter()){
			
			
			if(request.getParameter("consultar") != null  ) {
				
				Connection con = null;
				PreparedStatement st = null;
				ResultSet rs = null;
				
				try {
					
					
					con = Conexion.getConnection();
					st = con.prepareStatement(SQL_SELECT);
					rs = st.executeQuery();
					
					
					
					Usuarios usuario = null;
					Usuarios objetoEncontrado =null;
					
					List<Usuarios> usuarios = new ArrayList<Usuarios>();
					
					while (rs.next() ) {
						 int idusuarios = rs.getInt("idusuarios");
						 String user  = rs.getString("usuario");
						 String password = rs.getString("password");
						 String cedula = rs.getString("cedula");
						 String nomber = rs.getString("nombre");
						 String email = rs.getString("email");
						 
						 usuario = new Usuarios(idusuarios,user, password, cedula, nomber,email);
						
						 usuarios.add(usuario);
					}
					
					
					 
					for (int i = 0; i < usuarios.size(); i++) {
						
						if(usuarios.get(i).getCedula().equals(ced)) {
							
							
							objetoEncontrado = new Usuarios(usuarios.get(i).getIdusuarios(), usuarios.get(i).getUsuario(),usuarios.get(i).getPassword(),usuarios.get(i).getCedula(),usuarios.get(i).getNomber(),usuarios.get(i).getEmail());
						
						
						
						}
						
					}
					
					
					request.setAttribute("encontrado", objetoEncontrado);
					request.setAttribute("a", ced);
					
					RequestDispatcher rd = request.getRequestDispatcher("Consultar.jsp");
					rd.forward(request, response);
					
					
				} catch (Exception e) {
					out.print(e);
				}finally {
					 Conexion.close(rs);
			            Conexion.close(st);
			            Conexion.close(con);
			            
				}
				
				
			}else {
				response.sendRedirect("Usuarios.jsp");
			}
		
			
			
	
			
		} catch (Exception e) {
			
			// TODO: handle exception
		}
		}else {
			response.sendRedirect("Usuarios.jsp");
		}
		*/
		
	}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
