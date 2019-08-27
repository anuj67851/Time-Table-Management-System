<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Login</title>

    <!-- Bootstrap Core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<c:url value="/resources/css/shop-homepage.css" />" rel="stylesheet">

</head>

<body>

<!-- Navigation -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">

        <div class="navbar-header">
            <span class="navbar-brand">Time Table Management System</span>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>

<!-- Page Content -->
<div class="container">

    <header>
        <h1 class="text-center">Login</h1>

        <h4 style="color: red" class="text-center">
            <%
                if (request.getAttribute("message") != null)
                    out.print(request.getAttribute("message"));
                request.setAttribute("message", null);
            %>
        </h4>
        <div class="col-sm-4 col-sm-offset-5">
            <form class="" action="<c:url value="handleLogin" />" method="post">
                <div class="form-group"><label for="">
                    Username<input type="text" name="username" class="form-control" autofocus required></label>
                </div>
                <div class="form-group"><label for="password">
                    Password<input type="password" name="password" class="form-control" required></label>
                </div>

                <div class="form-group">
                    <input type="submit" name="submit" class="btn btn-primary">
                </div>
            </form>
        </div>


    </header>


</div>

<script src="<c:url value="/resources/js/html5shiv.js" />"></script>

<script src="<c:url value="/resources/js/respond.min.js" />"></script>

<!-- jQuery -->
<script src="<c:url value="/resources/js/jquery.js" />"></script>

<!-- Bootstrap Core JavaScript -->
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</body>

</html>
