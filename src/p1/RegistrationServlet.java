package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         PrintWriter out=response.getWriter();	
    
		
        String FirstName=request.getParameter("fname");
        String LastName=request.getParameter("lname");
        String Email=request.getParameter("email");
        String Mobile=request.getParameter("phonenumber");
        String DateofBirth=request.getParameter("dob");
        String Address=request.getParameter("address");
        String Password=request.getParameter("password");
        String Reenter=request.getParameter("password");
        out.println("<font color='green'>welcome to Registration</font>");
        out.println("FirstName:"+request.getParameter("fname")+"<br />");
        out.println("LastName:"+request.getParameter("lname")+"<br />");
        out.println("Email:"+request.getParameter("email")+"<br />");
        out.println("Mobile:"+request.getParameter("phonenumber")+"<br />");
        out.println("DateofBirth:"+request.getParameter("dob")+"<br />");
        out.println("Address:"+request.getParameter("address")+"<br />");
        out.println("Password:"+request.getParameter("password")+"<br />");
        out.println("Reenter:"+request.getParameter("password")+"<br />");
        
    	RequestDispatcher rd=request.getRequestDispatcher("login.html");
    	rd.include(request,response);
        
  
	}

	

}
