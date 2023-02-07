package session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Cookieee")
public class Cookieee extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try
	{
		resp.setContentType("type/html");
		PrintWriter pw=resp.getWriter();
		Cookie c[]=req.getCookies();
		pw.print("hello"+c[0].getValue());
		pw.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
