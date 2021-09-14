package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Clases.Conexion;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
    private static final String SQL_SELECT = "SELECT * FROM test.usuario WHERE usuario= ? && password =  ? ";
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try ( PrintWriter out = response.getWriter()){
			
			 if (request.getParameter("Ingresar") != null) {
				
					String usuario = request.getParameter("user");
			        String password = request.getParameter("password");
			        Connection con = null;
					PreparedStatement st = null;
					ResultSet rs = null;
			        HttpSession sesion = request.getSession();
					 
					  try {
							 
							
							con = Conexion.getConnection();
							st = con.prepareStatement(SQL_SELECT );
				              st.setString(1, usuario);
				              st.setString(2, password);
				              rs = st.executeQuery();
				              int conteo = 0;
				             
				            	  
				              
				              while (rs.next()) {
				            	  
				            	 
				            	  conteo += 1;
				            	  sesion.setAttribute("correcto", "1");
				                  sesion.setAttribute("usuario", rs.getString("usuario"));
				                  sesion.setAttribute("id", rs.getString("id_usuario"));
				                  response.sendRedirect("Index.jsp");
				              }
				            	 if(conteo != 0 ) {
				            		 
				            	 }else {
				            		  
				            		  out.println("<script type=\"text/javascript\">");
				   	        	   out.println("alert('User or password incorrect');");
				   	        	   out.println("location='Login.jsp';");
				   	        	   out.println("</script>");
				            	  }
				            		  
				              

				              
				              
				             
				              
				          } catch (Exception e) {
				        	  out.print(e);
				          }finally {
				        	  Conexion.close(rs);
				        	  Conexion.close(st);
				        	  Conexion.close(con);
				        	  
				          }
		             
		              
		        
			  }
			
		}
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
