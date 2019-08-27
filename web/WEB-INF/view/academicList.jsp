<%@include file="templates/top-nav.jsp" %>

<div id="page-wrapper">

    <div class="container-fluid">

        <div class="row">

            <h1 class="page-header">
                All Academic Classes
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

                <form action="addAc" method="post">

                    <div class="form-group">
                        <label for="faculty-code">Academic Class</label>
                        <input type="text" class="form-control" name="aclass" id="faculty-code" required>
                    </div>

                    <div class="form-group">
                        <label for="faculty-code">Is Combined ?</label>
                        <select class="form-control" name="isCombined" required>
                            <option value="yes">Yes</option>
                            <option value="no">No</option>
                        </select>
                    </div>

                    <div class="form-group">

                        <input name="submit" type="submit" class="btn btn-primary" value="Add Academic Class">
                    </div>


                </form>


            </div>

            <div class="col-md-8">


                <table class="table table-hover">


                    <thead>

                    <tr>
                        <th>Academic Classes</th>
                        <th>View All Lectures</th>
                        <th>Delete Class</th>
                        <th style="text-align: center">Delete All Lectures</th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="${allAcademicsNormal}" var="tempAc">
                        <tr>
                            <td>${tempAc.academicClass}</td>
                            <td><a href="viewLectures?id=${tempAc.academicClass}"><span class="glyphicon glyphicon-calendar"></span></a></td>
                            <td><a href="deleteAc?id=${tempAc.academicClass}"><span class="glyphicon glyphicon-trash"></span></a></td>
                            <td style="text-align: center"><a href="deleteLecturesForAcademicClass?id=${tempAc.academicClass}"><span class="glyphicon glyphicon-trash"></span></a></td>
                        </tr>
                    </c:forEach>

                    </tbody>
                </table>
            </div>

            <br/><br/><br/><br/>

            <div class="col-md-8 pull-right">


                <table class="table table-hover">


                    <thead>
                    <tr><th colspan="4" style="text-align: center">Combined Classes</th></tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th>Academic Classes</th>
                        <th>View All Lectures</th>
                        <th>Delete Class</th>
                        <th style="text-align: center">Delete All Lectures</th>
                    </tr>

                    <c:forEach items="${allAcademicsCombined}" var="tempAc">
                        <tr>
                            <td>${tempAc.academicClass}</td>
                            <td><a href="viewLectures?id=${tempAc.academicClass}"><span class="glyphicon glyphicon-calendar"></span></a></td>
                            <td><a href="deleteAc?id=${tempAc.academicClass}"><span class="glyphicon glyphicon-trash"></span></a></td>
                            <td style="text-align: center"><a href="deleteLecturesForAcademicClass?id=${tempAc.academicClass}"><span class="glyphicon glyphicon-trash"></span></a></td>
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