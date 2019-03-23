package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*@WebServlet("/New")*/ //url mapping
public class LoginServlet extends HttpServlet {
    
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();	
		
        String user=request.getParameter("txtLogin");
        String pass=request.getParameter("txtpass");
        if(user.equals("sa")&&pass.equals("sa"))
        {
        	out.println("<font color='green'>welcome to servlet</font>");
        	RequestDispatcher rd=request.getRequestDispatcher("Welcome");
        	rd.include(request,response);
        }
        else
        {
        	out.println("<font color='red'>check your username or password");
        }
      }
	
	}
