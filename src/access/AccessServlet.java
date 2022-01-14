package access;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AccessServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String method=request.getParameter("method");
		System.out.println("服务器应答："+method);
		if (method.equals("home")){
			String ua=request.getParameter("ua");
			System.out.println("服务器发现访问，跳转页面");
			if (ua.equals("android")){
				request.getRequestDispatcher("/Jsp/Home/Home-a.jsp").forward(request, response);
			}else if (ua.equals("windows")){
				request.getRequestDispatcher("/Jsp/Home/Home.jsp").forward(request, response);
			}
			
		}else{
			
		}
	}
}
