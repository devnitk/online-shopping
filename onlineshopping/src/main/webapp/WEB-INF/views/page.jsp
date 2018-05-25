<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>online shopping - ${title}</title>

<script> 
		window.menu='${title}'
	</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

	<div class="wrapper">
		<%@include file="./shared/navbar.jsp"%>

		<div class="content">
			<!-- Page Content -->
			<c:if test="${userClickOnHome == true}">
				<%@include file="home.jsp"%>
			</c:if>

			<c:if test="${userClickOnAbout == true}">
				<%@include file="about.jsp"%>
			</c:if>

			<c:if test="${userClickOnContact == true}">
				<%@include file="contact.jsp"%>
			</c:if>
		</div>

			<!-- /.container -->

			<!-- Footer -->
			<%@include file="./shared/footer.jsp"%>

			<!-- Bootstrap core JavaScript -->
			<script src="${js}/jquery.js"></script>

			<script src="${js}/myapp.js"></script>
			<script src="${js}/bootstrap.bundle.min.js"></script>

		</div>
</body>

</html>