package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	

	
    public Login() {
        super();
        
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 try (PrintWriter out = response.getWriter()) {
		if (request.getParameter("Ingresar") != null) {
		 String usuario = request.getParameter("user");
         String password = request.getParameter("password");
         HttpSession sesion = request.getSession();

         if (usuario.equals("admin") && password.equals("admin")) {

             sesion.setAttribute("correcto", 1);
             sesion.setAttribute("usuario", usuario);
            // response.sendRedirect("index.jsp");
             out.print("valido");

         } else {
            out.println("<div class=\"alert alert-primary\" role=\"alert\">\n"
            		+ "  A simple primary alert—check it out!\n"
            		+ "</div>");
         }

     }
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 try (PrintWriter out = response.getWriter()) {
				if (request.getParameter("Ingresar") != null) {
				 String usuario = request.getParameter("user");
		         String password = request.getParameter("password");
		         HttpSession sesion = request.getSession();

		         if (usuario.equals("admininicial") && password.equals("admin123456")) {

		             sesion.setAttribute("correcto", 1);
		             sesion.setAttribute("usuario", usuario);
		             //response.sendRedirect("NewFile.jsp");
		             out.print("valido");

		         } else {
		        	
		        	 out.println("<script type=\"text/javascript\">");
		        	   out.println("alert('User or password incorrect');");
		        	   out.println("location='NewFile.jsp';");
		        	   out.println("</script>");
		         }

		     }
			}
			}
	}


