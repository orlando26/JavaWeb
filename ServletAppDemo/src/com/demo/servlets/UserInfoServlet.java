package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserInfoServlet
 */
@WebServlet("/UserInfoServlet")
public class UserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		PrintWriter out = response.getWriter();
		
		out.println("<h3>Reading data using 'getParameter(String name):String' method");
		out.println("<div>");
		out.println("<p>First Name: " + firstName + "</p>");
		out.println("<p>Last Name: " + lastName + "</p>");
		out.println("</div>");
		
		out.println("<hr>");
		
		out.println("<h3>Reading data using 'getParameterNames():Enumeration' method");
		Enumeration<String> paramNames = request.getParameterNames();
		out.println("<div>");
		while(paramNames.hasMoreElements()){    
			String paramName = paramNames.nextElement();
			String paramValue = request.getParameter(paramName);
			out.println("<p>" + paramName + " : " + paramValue + "</p>");
		}
		out.println("</div>");
		
		out.println("<hr>");
		
		Map<String, String[]> paramMap = request.getParameterMap();
		Set<String> paramNamesSet = paramMap.keySet();
		out.println("<h3>Reading data using 'getParameterMap():Map' method");
		out.println("<div>");
		for(String paramName : paramNamesSet){
			String[] paramValues = paramMap.get(paramName);
			out.print("<p>" + paramName + " : ");
			for (String string : paramValues) {
				out.print(string);
			}
			out.print("</p>");
		}
		out.println("</div>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
