package listener;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;

import java.io.IOException;

@WebServlet("/")
public class TheServlet extends HttpServlet {

    /*public void init(ServletConfig config) throws ServletException {
	
		   // Initialization logic goes here

		   
	}*/
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().println("The Servlet Executed");
    }

    /*public void destroy(){
	
			// Clean-up resources here
	}*/
}
