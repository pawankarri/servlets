package loginlogout;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet 
{
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");  
    PrintWriter out=response.getWriter();  
      
      
    request.getRequestDispatcher("linkk.html").include(request, response);  
      
    Cookie ck=new Cookie("name","");  
    ck.setMaxAge(0);  
    response.addCookie(ck);  
      
    out.print("you are successfully logged out!");  
}
}
