package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Person;


public class PersonInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PersonInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Person person = new Person();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		person.setName(request.getParameter("name"));
		person.setLastName(request.getParameter("lastName"));
		person.setEmail(request.getParameter("email"));
		person.setAge( Integer.parseInt(request.getParameter("age")) );
		
		System.out.println(person);
		
		out.println("<h3>Reading Data using 'getParameter(String name):String' method</h3>");
		out.println("<div>");
		out.println("<p> First Name: " + person.getName() + "</p>");
		out.println("<p> Last Name: " + person.getLastName() + "</p>");
		out.println("<p> Email: " + person.getEmail() + "</p>");
		out.println("<p> Age: " + person.getAge() + "</p>");
		out.println("</div>");
		
		out.println("<hr>");
		
		out.println("<h3>Reading Data using 'getParameterNames():Enumeration' method</h3>");
		Enumeration<String> paramNames = request.getParameterNames();
		out.println("<div>");
		
		while(paramNames.hasMoreElements()) {
			String paramName = paramNames.nextElement();
			String paramValue = request.getParameter(paramName);
			out.println("<p>" + paramName + " : " + paramValue + "</p>");
		}
		
		out.println("</div>");
				
		out.println("<hr>");
		//List, Set, Map
		Map<String, String[]> paramMap =  request.getParameterMap();
		Set<String> paramNamesSet = paramMap.keySet();
		out.println("<h3>Reading Data using 'getParameterMap():Map' method</h3>");
		out.println("<div>");
		
		for (String paramName : paramNamesSet) {
			String[] paramValues = paramMap.get(paramName);
			out.print("<p>" + paramName + " : ");
			for (String value : paramValues) {
				out.print(value);
			}
			out.println("</p>");
		}
		
		out.println("</div>");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
