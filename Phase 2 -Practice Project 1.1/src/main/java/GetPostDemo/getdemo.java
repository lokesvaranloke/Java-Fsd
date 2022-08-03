package GetPostDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getdemo")
public class getdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public getdemo() {
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int number1=Integer.parseInt(request.getParameter("number1"));
		int number2=Integer.parseInt(request.getParameter("number2"));
		int result=number1+number2;
		PrintWriter pw = response.getWriter();
		pw.println("Result : "+result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
