package GenericServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class genericdemo extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String s1 = req.getParameter("FirstName");
		String s2 = req.getParameter("LastName");
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h2>FirstName : "+s1+"</h2>");
		pw.println("<h2>LastName  : "+s2+"</h2>");
		pw.println("</body>");
		pw.println("</html>");
	}

}
