import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DemoServlet1 implements Servlet
{
	public void init(ServletConfig con)
	{

	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body><p>Hello India</p><br>ReferenceID="+this+"<br>ThreadName="+Thread.currentThread().getName());
		
		try{
			Thread.sleep(5000);
		}
		catch(Exception e){
			System.out.println(e);
		}

		out.println("</body></html>");
	}

	public void destroy(){}

	public ServletConfig getServletConfig(){
		return null;
	}

	public String getServletInfo(){
		return null;
	}
}