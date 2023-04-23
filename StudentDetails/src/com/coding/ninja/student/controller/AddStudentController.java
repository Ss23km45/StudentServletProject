package com.coding.ninja.student.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coding.ninja.student.util.Student;
import com.coding.ninja.student.util.StudentDataUtil;

/**
 * Servlet implementation class AddStudentController
 */
@WebServlet("/AddStudentController")
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//Step1 : read the HTML Data
		String fname, sname,rollNo, email;
		fname = request.getParameter("firstName");
		sname = request.getParameter("secondName");
		rollNo = request.getParameter("rollNo");
		email = request.getParameter("email");
		//Step2: Upload the details to StundetUtil class
		//StudentDataUtil.addStudent(fname, sname, email, rollNo);
		
		PrintWriter out = response.getWriter();
		
		out.println("New Student Details has been added...." + fname);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentDataUtil stdutil = new StudentDataUtil();
		List<Student> listStu = stdutil.getStundents();
		
		request.setAttribute("MyList", listStu);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Display_Student_data.jsp");
		
		dispatcher.forward(request, response);
	}

}
