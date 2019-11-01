package com.exercise27mvchelloworld.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exercise27mvchelloworld.modelo.UsuarioModelo;


@WebServlet("/usuarioServlet")
public class usuarioServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
   
   	protected void doPost(HttpServletRequest request, HttpServletResponse response)
   			throws ServletException, IOException {
   	
   		
   		
	
		String sid="";
		int iid=0;
		String sname="";
		String sage="";
		short shage=0;
		
		sid = request.getParameter("txtId");
		sname = request.getParameter("txtName");
		sage = request.getParameter("txtAge");
		
		UsuarioModelo myUser = new UsuarioModelo (sid,sname,sage);
		
		response.getWriter().append("The id input is:"+sid);
		iid=Integer.parseInt(sid);
		response.getWriter().append("The name input is:"+sname);
		response.getWriter().append("The age input is:"+sage);
		shage = Short.parseShort(sage);
		
		UsuarioModelo myUser1 = new UsuarioModelo(iid, sname, shage);
		UsuarioModelo myUser2 = new UsuarioModelo();
		myUser2.setId(iid);
		myUser2.setName(sname);
		myUser2.setAge(shage);
		
		response.getWriter().append("The id input is:"+sid);
		response.getWriter().append("The name imput is:"+sname);
		response.getWriter().append("The age imput is:"+shage);
		
		
	
	}

}
