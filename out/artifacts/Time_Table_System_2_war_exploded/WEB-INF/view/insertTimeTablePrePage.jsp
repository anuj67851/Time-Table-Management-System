<%@include file="templates/top-nav.jsp" %>

<div id="page-wrapper">

    <div class="container-fluid">

        <div class="row">
            <h4 class="bg-success">
                <%
                    if (request.getAttribute("message") != null) {
                        out.print(request.getAttribute("message"));
                    }
                    request.setAttribute("message", null);
                %>
            </h4>

            <div class="col-md-4">

                <form action="getTimeTableInsertPage" method="post">

                    <div class="form-group">Choose Class :
                        <select class="form-control" name="ac" required>
                            <optgroup label="Individual">
                                <c:forEach var="tempAc" items="${allAcademicsNormal}">
                                    <option value="${tempAc.academicClass}">${tempAc.academicClass}</option>
                                </c:forEach>
                            </optgroup>
                            <optgroup label="Combined">
                                <c:forEach var="tempAc" items="${allAcademicsCombined}">
                                    <option value="${tempAc.academicClass}">${tempAc.academicClass}</option>
                                </c:forEach>
                            </optgroup>
                        </select>
                    </div>

                    <div class="form-group">

                        <input name="submit" type="submit" class="btn btn-primary" value="Insert Timetable">
                    </div>


                </form>


            </div>

        </div>
    </div>
    <!-- /.container-fluid -->

</div>
<!-- /#page-wrapper -->
<%@include file="templates/footer.jsp" %>