<%@ page import="timetable.entity.Users" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>TTAS</title>

    <!-- Bootstrap Core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css"/> " rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<c:url value="/resources/css/sb-admin.css"/> " rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="<c:url value="/resources/css/plugins/morris.css" />" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<c:url value="/resources/font-awesome/css/font-awesome.min.css"/> " rel="stylesheet" type="text/css">
</head>

<body>

<div id="wrapper">

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <span class="navbar-brand">Admin Area</span>
        </div>
        <!-- Top Menu Items -->
        <ul class="nav navbar-right top-nav">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i>
                    <%
                        Users user = (Users) request.getSession().getAttribute("user");
                        out.print(user.getFirstname() + " " + user.getLastname());
                    %>
                    <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li class="divider"></li>
                    <li>
                        <a href="myProfile"><i class="fa fa-user"></i> My Profile</a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="logout"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                    </li>
                </ul>
            </li>
        </ul>
        <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav side-nav">
                <li class="active">
                    <a href="dashboard"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a>
                </li>
                <li>
                    <a href="getAllTeachersPage"><i class="fa fa-fw fa-group"></i> View Faculties</a>
                </li>
                <li>
                    <a href="getSubjectList"><i class="fa fa-fw fa-book"></i> View Subject</a>
                </li>
                <li>
                    <a href="getClassList"><i class="fa fa-fw fa-table"></i> View ClassRooms</a>
                </li>
                <li>
                    <a href="getAcademicClassesPage"><i class="fa fa-fw fa-bolt"></i>Academic Classes</a>
                </li>
                <li>
                    <a href="getUsersList"><i class="fa fa-fw fa-photo"></i> View Users</a>
                </li>
                <li>
                    <a href="insertTimeTablePrePage"><i class="fa fa-fw fa-table"></i> Insert Timetable</a>
                </li>
                <li>
                    <a href="faculty"><i class="fa fa-fw fa-pencil-square"></i>Faculty Occupancy Report</a>
                </li>
                <li>
                    <a href="class"><i class="fa fa-fw fa-pencil"></i>Class Occupancy Report</a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </nav>