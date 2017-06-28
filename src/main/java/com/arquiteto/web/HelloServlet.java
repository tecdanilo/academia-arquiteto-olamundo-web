package com.arquiteto.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arquiteto.web.data.Data;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcessRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcessRequest(request, response);
	}
	
	protected void doProcessRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ano = request.getParameter("ano");
		String retorno = "";

		Data data = new Data(01,01,Integer.parseInt(ano));
		
		boolean ret = data.anoBissesto();
		
		if (ret)
			retorno = "É ano bissexto";
		else
			retorno = "Não é ano bissexto";
		
		request.setAttribute("msg", retorno);
		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
	    view.forward(request, response);
		
		
	}

}
