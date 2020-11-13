package com.Foodcart.fc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FoodCart")
public class FoodCart extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//when user request fir a website the request comes to servlet(controller) and asks db(model) to give that particular data then db returns that asked data to servlet//
	   //soon after receiving data from db, servlet redirect to jsp page(view) (sent that data to jsp where user can view the page)//
	   //1.1 get the data from db//
		//now send some data (get data from db) to jsp page by setting data requestdispatcher object//
		String[] foodItems= {"chicken","pizza","burger"};
		request.setAttribute("foodItems", foodItems);//now to display this data go to jsp and add jstl jars and set uri and loop//
		//2. redirect to jsp page//
	 RequestDispatcher reqdis = request.getRequestDispatcher("show-food.jsp");//requestdispatcher is to redirectto another page//
	 reqdis.forward(request,response);
		
	}

}
