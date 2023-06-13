package com.toursystem;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class ForgetPasswordServlet
 */
public class ForgetPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String user_id = request.getParameter("user_id");
		String new_password = request.getParameter("new_password");
		String confirm_password = request.getParameter("confirm_password");
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.updatePassword(email,user_id,new_password,confirm_password);
		

		if(isTrue == true) {
			
			List<Customer> pwdDetails =CustomerDBUtil.updatePassword(user_id);
			request.setAttribute("pwdDetails",pwdDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("Login.jsp");
			dis.forward(request, response);
		}
		else {
			List<Customer> pwdDetails = CustomerDBUtil.updatePassword(user_id);
			request.setAttribute("pwdDetails",pwdDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
		
		
		
		
	
	}

		
	}
}
