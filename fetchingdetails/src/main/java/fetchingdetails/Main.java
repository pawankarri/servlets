package fetchingdetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Main")
public class Main extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String tempopt=req.getParameter("opt");
	int option=Integer.parseInt(tempopt);
	PrintWriter pw=resp.getWriter();
	switch(option)
	{
	case 1:
		RequestDispatcher r=req.getRequestDispatcher("FetchAll.html");
		r.include(req,resp);
		break;
	case 2:
		RequestDispatcher R=req.getRequestDispatcher("Fetch.html");
		R.include(req,resp);
		break;
		default:
			pw.println("enter vaild option");
			break;
	}
}
}