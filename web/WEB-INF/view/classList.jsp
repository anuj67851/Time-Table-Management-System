<%@include file="templates/top-nav.jsp" %>

<div id="page-wrapper">

    <div class="container-fluid">

        <div class="row">

            <h1 class="page-header">
                All Classrooms
                <div class="pull-right">
                    Total Classrooms :
                    ${allClasses.size()}
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

                <form action="addClassroom" method="post">

                    <div class="form-group">
                        <label for="faculty-code">Room Number</label>
                        <input type="text" class="form-control" name="code" id="faculty-code" required>
                    </div>
                    <div>
                        <label for="sem">Is Variable?</label>
                        <select class="form-control" name="variable" id="elec" required>
                            <option value="0">No</option>
                            <option value="1">Yes</option>
                        </select>
                    </div>

                    <div class="form-group">

                        <input name="submit" type="submit" class="btn btn-primary" value="Add Classroom">
                    </div>


                </form>


            </div>

            <div class="col-md-8">


                <table class="table table-hover">


                    <thead>

                    <tr>
                        <th>ClassRoom</th>
                        <th></th>
                        <th></th>
                        <th style="text-align: center">View Time Table</th>
                        <th style="text-align: center">View All Lectures</th>
                        <th style="text-align: center">Delete All Lectures</th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="${allClasses}" var="tempClass">
                        <tr>
                            <td>${tempClass.classroom}</td>
                            <td><a href="editClassroomPage?id=${tempClass.classroom}"><span class="glyphicon glyphicon-edit"></span></a></td>
                            <td><a href="deleteClassroom?id=${tempClass.classroom}"><span class="glyphicon glyphicon-trash"></span></a></td>
                            <td style="text-align: center"><a href="getClassroomTimeTable?id=${tempClass.classroom}"><span class="glyphicon glyphicon-calendar"></span></a></td>
                            <td style="text-align: center"><a href="getClassLectures?id=${tempClass.classroom}"><span class="glyphicon glyphicon-calendar"></span></a></td>
                            <td style="text-align: center"><a href="deleteLecturesForClassroom?id=${tempClass.classroom}"><span class="glyphicon glyphicon-trash"></span></a></td>
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