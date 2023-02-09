package fetchingdetails;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/AllDetails")
public class AllDetails extends HttpServlet{
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 response.setContentType("text/html");
     PrintWriter out = response.getWriter();
     
    out.println("<html><body>");
     out.println("<h3>Fetching All Details</h3>");
     out.println("<table border=1><tr>" + "<td><b>name</b></td>" + "<td><b>phone</b></td>"
             + "<td><b>gender</b></td>" + "<td><b>duration</b></td>"
             + "<td><b>batch</b></td>" + "<td><b>batch_time</b></td>" + "<td><b>address</b></td>"  + "<td><b>password</b></td>" + "<td><b>batch</b></td>" + "<td><b>Email</b></td></tr>");
     String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="select * from pawan.register";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url);
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				String name=rs.getString(1);
				String phone=rs.getString(2);
				String gender=rs.getString(3);
				String duration=rs.getString(4);
				String batch=rs.getString(5);
				String batch_time=rs.getString(6);
				String address=rs.getString(6);
				String username=rs.getString(6);
				String password=rs.getString(6);
				String Email=rs.getString(6);
				
				
				out.println("<tr>" + "<td>" + name + "</td>" + "<td>" + phone + "</td>" + "<td>" + gender + "</td>"
                        + "<td>" + duration + "</td>" + "<td>" + batch + "</td>" + "<td>" + batch_time
                        + "</td>" + "<td>" + address + "</td>" + "<td>" + username +"</td>" + "<td>" + password + "</td>" + "<td>" +Email + "</td></tr>");
			}
			out.println("</table></body></html>");
			 rs.close();
	            ps.close();
	            out.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
