import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DemoServlet extends GenericServlet{

	PrintWriter out;
	static int count=0;

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{

		res.setContentType("text/html");
		out=res.getWriter();
		destroy();
		out.println("<html><body><h1>Servlet from Generic" + count + "</h1><p>"+this+"</p>");
		try{
			Thread.sleep(2000);
			out.println("<br>");
		}
		catch(Exception e){}
		out.println("<p>"+Thread.currentThread().getName()+"</p>");
		out.println("</body></html>");
}
		public void destroy(){
			out.println("destroy");
			count++;
		
	}
}