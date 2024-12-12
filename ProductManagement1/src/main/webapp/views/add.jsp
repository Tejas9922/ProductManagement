<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link rel="stylesheet" type="text/css" href="css/add.css">




</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<br>



<div class="container register">
                <div class="row">
                    <div class="col-md-3 register-left">
                        <img src="images/prod.jpg" alt=""/>
                        <h3>Welcome</h3>
                        <p>You are 30 seconds away from earning your own money!</p>
                       
                    </div>
                    <div class="col-md-9 register-right">
                        <ul class="nav nav-tabs nav-justified" id="myTab" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Employee</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Hirer</a>
                            </li>
                        </ul>
                       
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <h3 class="register-heading">Add Product Details</h3>
                                 <form action="insert-product" method="post">
                                <div class="row register-form">
                                    <div class="col-md-6 offset-md-3">
                                  
                                     
                                        <div class="form-group">
                                            <input type="text" name="name" class="form-control" placeholder="Product Name *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="number" name="price" class="form-control" placeholder="price *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="number" name="qty" class="form-control" placeholder="quantity *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" name="category" class="form-control"  placeholder="category" value="" />
                                        </div>
                                        <div> 
                                       <button type="submit" class="btn btn-primary">save record</button>
                                    </div>
                                    </div>      
                                </div>
                                </form>
                           </div>
                                </div>
                              
                            </div>
                        </div>
                    </div>
                </div>

            </div>
</body>
</html>