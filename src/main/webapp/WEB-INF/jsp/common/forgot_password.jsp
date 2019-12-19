<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation_register.jspf"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
  <head>

    <style>
           .container{
              margin: 0;
                position: absolute;
                top: 40%;
                left: 5%;
                -ms-transform: translateY(-50%);
                transform: translateY(-50%);
            }
    </style>

      <meta charset="utf-8">
      <title>Create an account</title>
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" type="text/css"">


  </head>

  <body>

    <div class="container">

        <center><form:form method="POST" modelAttribute="userForm" class="form-signin">
            <spring:bind path="email">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="email" style="width:300px;" path="email" class="form-control" placeholder="Email"
                                autofocus="true"></form:input>
                    <form:errors path="email"></form:errors>
                </div>
            </spring:bind>

            <button class="btn btn-success" type="submit">Reset Password</button>
        </form:form></center>

    </div>
  </body>
</html>
<%@ include file="common/footer_out.jspf"%>
