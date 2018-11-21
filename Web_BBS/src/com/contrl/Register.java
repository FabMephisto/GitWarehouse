package com.contrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Userinfo;
import com.sevice.IUserinfoSevice;
import com.sevice.UserinfoSevice;

@WebServlet("/Register")
public class Register extends HttpServlet {
	IUserinfoSevice usersec = new UserinfoSevice();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username =request.getParameter("username");
		String pwd = request.getParameter("pwd");
		String usersex = request.getParameter("sex");
		String phone = request.getParameter("phone");
		
		Userinfo user = new Userinfo();
		user.setU_name(username);
		user.setU_phone(phone);
		user.setU_pwd(pwd);
		user.setU_sex(usersex);
		
		int num = usersec.regUser(user);
		
		String mess = "";
		if (num == 0) {
			mess = "新建失败";
		}else{
			mess = "新建成功";
		}
		request.setAttribute("mess", mess);
		request.getRequestDispatcher("jsp/addUser.jsp").forward(request, response);
	}

}
