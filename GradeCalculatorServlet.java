package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class GradeCalculatorServlet
 */
public class GradeCalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GradeCalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		int n1=Integer.parseInt(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
		int n3=Integer.parseInt(request.getParameter("num3"));
		int total=n1+n2+n3;
		int avg=total/3;
		
		String grade="";
		if(avg>30 && avg<=50) {
			grade="C";
		}
		else if(avg>50 && avg<=80) {
			grade="B";
		}
		else if(avg>80 && avg<=100) {
			grade="A";
		}
		else {
			grade="D";
		}
		
		response.getWriter().println("<h1 style=\"border:2px  margin-left:400px \">Your total marks is "+ total+"<br><br>"); 
		response.getWriter().println("Your average percentage is " +avg + "<br><br>");
		response.getWriter().println("Your grade is "+grade);
		
			 
		
	}

}
