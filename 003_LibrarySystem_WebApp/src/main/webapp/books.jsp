<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of books</title>
</head>
<body>

	<h1>List of all books</h1>

	<c:forEach var="book" items="${books}">
		<div class="book">
		<p>Id: <a href="/books/${book.bookId}" class="book-title">${book.title}</a></p>
		<p>BookTitle: <span class="book-title">${book.title}</span></p>
		<p class="book-author">${book.author}</p>
		<div class="action"><a href="/books/${book.bookId}/edit">Edytuj</a></div>
		<div class="action"><a href="/books/${book.bookId}/add-to-basket">Dodaj do koszyka</a></div>
		</div>
	</c:forEach>

	<a href="/add_new_book">Add new book<br></a>
	<a href="/index.jsp">Back to MENU</a>
</body>
</html>