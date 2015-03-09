package com.example.servletjspdemo.web;
import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import javax.servlet.http.HttpSessionEvent;



@WebServlet("/FormReceiver")
	public class FormReceiver extends HttpServlet {
		private static final long serialVersionUID = 1L;
		public FormReceiver() {
			super();
		}
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ArrayList<Person> persons = new ArrayList<Person>(5);
			
			String[] radioValues = new String[5];
			radioValues[0] = "Ogloszenie z pracy";
			radioValues[1] = "Ogloszenie na uczelni";
			radioValues[2] = "Facebook";
			radioValues[3] = "Znajomi";
			radioValues[4] = "Inne (jakie?):";
			
			PrintWriter out = response.getWriter();
			
			int id = 1;
			
			try{
				if(persons.size() == 5){
					out.println("Brak wolnych miejsc ;(");
				}else{
					if(request.getSession(false) == null){
						
						out.println("Witaj w Java 4 USI");
						String imie		=	request.getParameter("Imię");
						String nazwisko	=	request.getParameter("Nazwisko");
						String email	=	request.getParameter("E-mail");
						String potEmail	=	request.getParameter("Potwierdz e-mail");
						String pracodawca = request.getParameter("Nazwa pracodawcy");
						int wybor	= 	Integer.parseInt(request.getParameter("Skąd dowiedziałeś się o konferencji"));
						
						String coRobisz	=	request.getParameter("Czym się zajmujesz?");
						
						Person person = new Person(id,  imie, nazwisko, email, potEmail, pracodawca, radioValues[wybor], coRobisz);
						
						try{
							persons.add(person);
						}catch(ArrayIndexOutOfBoundsException e){
							out.println("Twoje zgłoszenie zostału już przyjęte!");
						}
						
						
						id++;
												
						HttpSession session = request.getSession(true);	
						out.println(persons.get(0).getImie());
					}else{
				        out.println("Niestety jestes juz zarejestrowany.");
					}
				 }
				}finally{
					
				}
				
			}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		}
		
		
}

		
