<%@include file="templates/top-nav.jsp" %>

<div id="page-wrapper">

    <div class="container-fluid">

        <div class="row">

            <h1 class="page-header">
                All Faculties
                <div class="pull-right">
                    Total Faculties :
                    ${allTeachers.size()}
                </div>

            </h1>
            <h4 class="bg-success">
                <%
                    if (request.getAttribute("message") != null) {
                        out.print(request.getAttribute("message"));
                    }
                    request.setAttribute("message", null);
                %>
            </h4>
            <div class="col-md-4">

                <form action="addFaculty" method="post">

                    <div class="form-group">
                        <label for="faculty-code">Code</label>
                        <input type="text" class="form-control" name="code" id="faculty-code" required>
                    </div>
                    <div class="form-group">
                        <label for="faculty-firstname">Firstname</label>
                        <input type="text" name="firstname" id="faculty-firstname" class="form-control" required>
                    </div>

                    <div class="form-group">
                        <label for="faculty-lastname">Lastname</label>
                        <input type="text" name="lastname" id="faculty-lastname" class="form-control" required>
                    </div>

                    <div class="form-group">

                        <input name="submit" type="submit" class="btn btn-primary" value="Add Faculty">
                    </div>


                </form>


            </div>

            <div class="col-md-8">


                <table class="table table-hover">


                    <thead>

                    <tr>
                        <th>Code</th>
                        <th>FirstName</th>
                        <th>LastName</th>
                        <th></th>
                        <th></th>
                        <th style="text-align: center">View Time Table</th>
                        <th style="text-align: center">View All Lectures</th>
                        <th style="text-align: center">Delete All Lectures</th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="${allTeachers}" var="tempTeacher">
                        <tr>
                            <td>${tempTeacher.code}</td>
                            <td>${tempTeacher.firstname}</td>
                            <td>${tempTeacher.lastname}</td>
                            <td><a href="editFacultyPage?id=${tempTeacher.code}"><span class="glyphicon glyphicon-edit"></span></a></td>
                            <td><a href="deleteFaculty?id=${tempTeacher.code}"><span class="glyphicon glyphicon-trash"></span></a></td>
                            <td style="text-align: center"><a href="getFacultyTimeTable?id=${tempTeacher.code}"><span class="glyphicon glyphicon-calendar"></span></a></td>
                            <td style="text-align: center"><a href="getFacultyLectures?id=${tempTeacher.code}"><span class="glyphicon glyphicon-calendar"></span></a></td>
                            <td style="text-align: center"><a href="deleteLecturesForFaculty?id=${tempTeacher.code}"><span class="glyphicon glyphicon-trash"></span></a></td>
                        </tr>
                    </c:forEach>

                    </tbody>
                </table>
            </div>


        </div>


        <div class="row">

            <h1 class="page-header">
                All Faculty Variables
                <div class="pull-right">
                    Total Variables :
                    ${allVariables.size()}
                </div>
            </h1>

            <h4 class="bg-success">
                <%
                    if (request.getAttribute("message1") != null) {
                        out.print(request.getAttribute("message1"));
                    }
                    request.setAttribute("message1", null);
                %>
            </h4>
            <div class="col-md-4">

                <form action="addFacultyVariable" method="post">

                    <div class="form-group">
                        <label for="faculty-code">Variable Name</label>
                        <input type="text" class="form-control" name="vname" required>
                    </div>

                    <div class="form-group">

                        <input name="submit" type="submit" class="btn btn-primary" value="Add Variable">
                    </div>


                </form>


            </div>
            <div class="col-md-8">
                <table class="table table-hover">


                    <thead>

                    <tr>
                        <th>Variable Name</th>
                        <th></th>
                        <th>Delete Variable</th>
                        <th>View Time Table</th>
                        <th>View All Lectures</th>
                        <th>Delete all lectures</th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="${allVariables}" var="tempTeacher">
                        <tr>
                            <td>${tempTeacher.code}</td>
                            <td><a href="editFacultyVariablePage?id=${tempTeacher.code}"><span class="glyphicon glyphicon-edit"></span></a></td>
                            <td><a href="deleteFaculty?id=${tempTeacher.code}"><span class="glyphicon glyphicon-trash"></span></a></td>
                            <td><a href="getFacultyVariableTimeTable?id=${tempTeacher.code}"><span class="glyphicon glyphicon-calendar"></span></a></td>
                            <td><a href="getFacultyLectures?id=${tempTeacher.code}"><span class="glyphicon glyphicon-calendar"></span></a></td>
                            <td style="text-align: center"><a href="deleteLecturesForFaculty?id=${tempTeacher.code}"><span class="glyphicon glyphicon-trash"></span></a></td>
                        </tr>
                    </c:forEach>

                    </tbody>
                </table>
            </div>


        </div>
    </div>
    <!-- /.container-fluid -->

</div>
<!-- /#page-wrapper -->
<%@include file="templates/footer.jsp" %>