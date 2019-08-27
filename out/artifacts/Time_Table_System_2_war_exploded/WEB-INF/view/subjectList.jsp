<%@include file="templates/top-nav.jsp" %>

<div id="page-wrapper">

    <div class="container-fluid">

        <div class="row">

            <h1 class="page-header">
                All Subjects
                <div class="pull-right">
                    Total Subjects :
                    ${allSubjects.size()}
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

                <form action="addSubject" method="post">

                    <div class="form-group">
                        <label for="faculty-code">Subject Code</label>
                        <input type="text" class="form-control" name="scode" id="faculty-code" required>
                    </div>
                    <div class="form-group">
                        <label for="faculty-firstname">Name</label>
                        <input type="text" name="name" id="faculty-firstname" class="form-control" required>
                    </div>

                    <div class="form-group">
                        <label for="faculty-lastname">ShortCode</label>
                        <input type="text" name="shortCode" id="faculty-lastname" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label for="sem">Semester</label>
                        <select class="form-control" name="semester" id="sem">
                                <c:forEach var="tempClass" items="${allAcademicClasses}">
                                    <option value="${tempClass.academicClass}">${tempClass.academicClass}</option>
                                </c:forEach>
                        </select>
                    </div>
                    <div>
                        <label for="sem">Is HS or Elective Subject?</label>
                        <select class="form-control" name="elective" id="elec" required>
                            <option value="0">No</option>
                           <option value="1">Yes</option>
                        </select>
                    </div>

                    <div class="form-group">

                        <input name="submit" type="submit" class="btn btn-primary" value="Add Subject">
                    </div>


                </form>


            </div>

            <div class="col-md-8">


                <table class="table table-hover">


                    <thead>

                    <tr>
                        <th>Subject Code</th>
                        <th>Name</th>
                        <th>Short Code</th>
                        <th>Semester</th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="${allSubjects}" var="tempSubject">
                        <tr>
                            <td>${tempSubject.scode}</td>
                            <td>${tempSubject.name}</td>
                            <td>${tempSubject.shortcode}</td>
                            <td>${tempSubject.academicSemester}</td>
                            <td><a href="editSubjectPage?id=${tempSubject.scode}"><span class="glyphicon glyphicon-edit"></span></a></td>
                            <td><a href="deleteSubject?id=${tempSubject.scode}"><span class="glyphicon glyphicon-trash"></span></a></td>
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