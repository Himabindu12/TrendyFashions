<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags"%>


<!DOCTYPE html>
<html lang="en">
<head>
<c:url value="/resources/css" var="css"/>
<c:url value="/resources/js" var="js"/>
<c:url value="/resources/images" var="img"/>
  <title>Add Category</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="${css}/bootstrap.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="${css}/style.css">
   <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" media="all">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css" rel="stylesheet" media="all">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="${js}jquery.js"></script>
<%--   <link rel="stylesheet" href="${css}/bootstrap.css"> --%>
 <style>
 li a:hover:not(.active) {
    background-color: #111;
}

.active {
    background-color:pink;
}

fieldset { 
    
    margin-left: 500px;
    margin-right: 500px;
    padding:25px;
    border: 2px solid pink;
}

legend
{
	color: crimson;
	text-align:center;
}
	</style>
</head>

<body style="background-color:light pink">

<nav class="navbar navbar-inverse" style="background-color:crimson">
  <div class="container-fluid">

    <ul class="nav navbar-nav" style="color:white">
      <li class="active"><a href="<c:url value="/"/>" style="color:white">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="<c:url value="/products"/>" style="color:white">Products <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="<c:url value="/men"/>" style="color:grey">Men</a></li>
          <li><a href="<c:url value="/women"/>" style="color:grey">Women</a></li>
          <li><a href="<c:url value="/kids"/>" style="color:greysssss">Kids</a></li>
        </ul>
      </li>
     <li><a href="<c:url value="/aboutus"/>" style="color:white">About Us</a></li>
	   <li><a href="<c:url value="/contactus"/>" style="color:white">Contact Us</a></li>
	    <li><a href="<c:url value="/addcategory"/>" style="color:white">Add Category</a></li>
      <li><a href="<c:url value="/addsupplier"/>" style="color:white">Add Supplier</a></li>
	   <li><a href="<c:url value="/addproduct"/>" style="color:white">Add Product</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="<c:url value="/signup"/>" style="color:white"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="<c:url value="/login"/>" style="color:white"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      <li><a href="<c:url value="/logout"/>" style="color:white"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      <li><a href="<c:url value="/cart"/>" style="color:white"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
    
    </ul>
  </div>
</nav>

<!-- <h1 style="align:center">Signup</h1> -->
<form>
<fieldset>
<legend>Signup</legend>
User Id: <input type="text" name="userId" placeholder="Enter UserId"><br><br>
User Name:<input type="text" name="userName" placeholder="Enter UserName"><br><br><br>
Email Id:<input type="text" name="emailId" placeholder="Email Id"><br><br><br>
Phone number:<input type="text" name="phonenumber" placeholder="Enter Phone number"><br><br><br>
Address:<input type="text" name="address" placeholder="Enter Address"><br><br><br>
Pass word:<input type="text" name="password" placeholder="Enter password"><br><br><br>
 <input type="submit" value="Submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <input type="reset" value="Cancel">
</fieldset>
</form>

</body>
</html>