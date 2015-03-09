package com.example.servletjspdemo.web;

public class Person {
	
	private int 	id;
	private String 	imie;
	private String 	nazwisko;
	private String 	email;
	private String 	potEmail;
	private String 	pracodwaca;
	private String	wybor;
	private String 	coRobisz;
	
		Person(int id, String imie, String nazwisko, String email, String potEmail, String pracodawca, String wybor, String coRobisz){
			
			this.id	= id;
			this.imie	= imie;
			this.nazwisko = nazwisko;
			this.email = email;
			this.potEmail = potEmail;
			this.pracodwaca = pracodawca;
			this.wybor = wybor;
			this.coRobisz = coRobisz;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getImie() {
			return imie;
		}

		public void setImie(String imie) {
			this.imie = imie;
		}

		public String getNazwisko() {
			return nazwisko;
		}

		public void setNazwisko(String nazwisko) {
			this.nazwisko = nazwisko;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPotEmail() {
			return potEmail;
		}

		public void setPotEmail(String potEmail) {
			this.potEmail = potEmail;
		}

		public String getPracodwaca() {
			return pracodwaca;
		}

		public void setPracodwaca(String pracodwaca) {
			this.pracodwaca = pracodwaca;
		}

		public String getWybor() {
			return wybor;
		}

		public void setWybor(String wybor) {
			this.wybor = wybor;
		}

		public String getCoRobisz() {
			return coRobisz;
		}

		public void setCoRobisz(String coRobisz) {
			this.coRobisz = coRobisz;
		}
		
}
