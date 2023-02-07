package session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Cookiee")
public class Cookiee extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try
	{
	resp.setContentType("text/html");
	PrintWriter pw=resp.getWriter();
	String n=req.getParameter("username");
	pw.print("welcome"+n);
	Cookie c=new Cookie("uname",n);
	resp.addCookie(c);
	pw.print("<form action='Cookieee'>");
	pw.print("<input type='submit' value='go'>");
	pw.print("</form>");
	pw.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
