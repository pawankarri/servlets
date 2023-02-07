package loginlogout;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");  
    PrintWriter out=response.getWriter();  
      
    request.getRequestDispatcher("linkk.html").include(request, response);  
      
    Cookie ck[]=request.getCookies();  
    if(ck!=null){  
     String name=ck[0].getValue();  
    if(!name.equals("")||name!=null){  
        out.print("<b>Welcome to Profile</b>");  
        out.print("<br>Welcome, "+name);  
    }  
    }else{  
        out.print("Please login first");  
        request.getRequestDispatcher("loginn.html").include(request, response);  
    }  
    out.close();
}
}
