<%@include file="templates/top-nav.jsp" %>

<div id="page-wrapper">

    <div class="container-fluid">

        <div class="row">

            <h1 class="page-header">
                All Lectures For ${theAcademic.academicClass}
                <div class="pull-right">
                    Total Lectures :
                    ${theSize}
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

            <div class="col-md-12">


                <table class="table table-hover">


                    <thead>

                    <tr>
                        <th>Id</th>
                        <th>Teacher Code</th>
                        <th>Alt Teacher Code(If Any)</th>
                        <th>Classroom</th>
                        <th>Subject</th>
                        <th>Slot Number</th>
                        <th>Number Of Hours</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td colspan="7" style="text-align: center;"><h3><b>Monday</b></h3></td>
                    </tr>

                    <c:forEach items="${monday}" var="tempLecture">
                        <tr>
                            <td>${tempLecture.id}</td>
                            <td>${tempLecture.teacher.code}</td>
                            <td>${tempLecture.altTeacher.code}</td>
                            <td>${tempLecture.classroom.classroom}</td>
                            <td>${tempLecture.subject}</td>
                            <td>${tempLecture.hours}</td>
                            <td>${tempLecture.numhours}</td>
                            <td><a href="deleteLecture?id=${tempLecture.id}&ac=${tempLecture.academicclasses.academicClass}"><span
                                    class="glyphicon glyphicon-trash"></span></a></td>
                        </tr>
                    </c:forEach>
                    <tr>
                        <td colspan="7" style="text-align: center;"><h3><b>Tuesday</b></h3></td>
                    </tr>

                    <c:forEach items="${tuesday}" var="tempLecture">
                        <tr>
                            <td>${tempLecture.id}</td>
                            <td>${tempLecture.teacher.code}</td>
                            <td>${tempLecture.altTeacher.code}</td>
                            <td>${tempLecture.classroom.classroom}</td>
                            <td>${tempLecture.subject}</td>
                            <td>${tempLecture.hours}</td>
                            <td>${tempLecture.numhours}</td>
                            <td><a href="deleteLecture?id=${tempLecture.id}&ac=${tempLecture.academicclasses.academicClass}"><span
                                    class="glyphicon glyphicon-trash"></span></a></td>
                        </tr>
                    </c:forEach>

                    <tr>
                        <td colspan="7" style="text-align: center;"><h3><b>Wednesday</b></h3></td>
                    </tr>

                    <c:forEach items="${wednesday}" var="tempLecture">
                        <tr>
                            <td>${tempLecture.id}</td>
                            <td>${tempLecture.teacher.code}</td>
                            <td>${tempLecture.altTeacher.code}</td>
                            <td>${tempLecture.classroom.classroom}</td>
                            <td>${tempLecture.subject}</td>
                            <td>${tempLecture.hours}</td>
                            <td>${tempLecture.numhours}</td>
                            <td><a href="deleteLecture?id=${tempLecture.id}&ac=${tempLecture.academicclasses.academicClass}"><span
                                    class="glyphicon glyphicon-trash"></span></a></td>
                        </tr>
                    </c:forEach>

                    <tr>
                        <td colspan="7" style="text-align: center;"><h3><b>Thursday</b></h3></td>
                    </tr>

                    <c:forEach items="${thursday}" var="tempLecture">
                        <tr>
                            <td>${tempLecture.id}</td>
                            <td>${tempLecture.teacher.code}</td>
                            <td>${tempLecture.altTeacher.code}</td>
                            <td>${tempLecture.classroom.classroom}</td>
                            <td>${tempLecture.subject}</td>
                            <td>${tempLecture.hours}</td>
                            <td>${tempLecture.numhours}</td>
                            <td><a href="deleteLecture?id=${tempLecture.id}&ac=${tempLecture.academicclasses.academicClass}"><span
                                    class="glyphicon glyphicon-trash"></span></a></td>
                        </tr>
                    </c:forEach>

                    <tr>
                        <td colspan="7" style="text-align: center;"><h3><b>Friday</b></h3></td>
                    </tr>

                    <c:forEach items="${friday}" var="tempLecture">
                        <tr>
                            <td>${tempLecture.id}</td>
                            <td>${tempLecture.teacher.code}</td>
                            <td>${tempLecture.altTeacher.code}</td>
                            <td>${tempLecture.classroom.classroom}</td>
                            <td>${tempLecture.subject}</td>
                            <td>${tempLecture.hours}</td>
                            <td>${tempLecture.numhours}</td>
                            <td><a href="deleteLecture?id=${tempLecture.id}&ac=${tempLecture.academicclasses.academicClass}"><span
                                    class="glyphicon glyphicon-trash"></span></a></td>
                        </tr>
                    </c:forEach>

                    <tr>
                        <td colspan="7" style="text-align: center;"><h3><b>Saturday</b></h3></td>
                    </tr>

                    <c:forEach items="${saturday}" var="tempLecture">
                        <tr>
                            <td>${tempLecture.id}</td>
                            <td>${tempLecture.teacher.code}</td>
                            <td>${tempLecture.altTeacher.code}</td>
                            <td>${tempLecture.classroom.classroom}</td>
                            <td>${tempLecture.subject}</td>
                            <td>${tempLecture.hours}</td>
                            <td>${tempLecture.numhours}</td>
                            <td><a href="deleteLecture?id=${tempLecture.id}&ac=${tempLecture.academicclasses.academicClass}"><span
                                    class="glyphicon glyphicon-trash"></span></a></td>
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