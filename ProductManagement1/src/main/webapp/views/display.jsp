<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Display page</title>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>

<table class="table table-hover table-dark">
  <thead>
    <tr>
      <th scope="col">Product Id</th>
      <th scope="col">Product Name</th>
      <th scope="col">Product Price</th>
      <th scope="col">Product Quantity</th>
      <th scope="col">Product Category</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  
    <c:forEach var="p" items="${products}">
      <tr>
        <td scope="row">${p.id}</td>
          <td>${p.name}</td>
           <td>${p.price}</td>
           <td>${p.qty}</td>
            <td>${p.category}</td>
            <td><a href="view-product?id=${p.id}" class="btn btn-warning" >Update</a> &nbsp; <a href="delete-product?id=${p.id}" class="btn btn-danger">Delete</a></td>
      </tr>
    </c:forEach>
  
    
  </tbody>
</table>
</body>
</html>