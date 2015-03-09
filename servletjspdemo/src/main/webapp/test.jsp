<%@page import="com.example.servletjspdemo.domain.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formularz konferencja</title>
</head>
<body>

<form action="FormReceiver" method="get" enctype="text/plain"><div>
<label>Imię</label></br>
	<input name="imie" placeholder="Imię"/></br>	
<label>Nazwisko</label></br>
	<input name="nazwisko" placeholder="Nazwisko"/></br>
<label>E-mail</label></br>
	<input name="email" placeholder="Email"/></br>
<label>Powtórz E-mail</label></br>
	<input name="pomEmail" placeholder="Email"/></br>
<label>Nazwa Pracodawcy</label></br>
	<input name="pracodawca" placeholder="Pracodawca"/></br>
<label>Skąd dowiedziałeś się o konferencji:</label>
</br>
	<input type="radio" name="radio" value="1" />Ogłoszenie w pracy<br/>
	<input type="radio" name="radio" value="2" />Ogłoszenie na uczelni<br/>
	<input type="radio" name="radio" value="3" />Facebook<br/>
	<input type="radio" name="radio" value="4" />Znajomi<br/>
	<input type="radio" name="radio" value="5" />Inne (jakie?)<br/>
	<input name="inne" placeholder="Inne"/></br>
</br>
</br>
	<label>Czym się zajmujesz?</label>
</br>
	<input name="coRobisz" placeholder="Czym się zajmujesz"/>
</br>
	<input type="submit" value="Wyślij zgłoszenie" />
</body>
</html>