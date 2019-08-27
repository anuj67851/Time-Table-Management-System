<%@include file="templates/top-nav.jsp"%>

<div id="page-wrapper">

    <div class="container-fluid">


        <div class="col-md-12">

            <div class="row">
                <h1 class="page-header">
                    Edit Subject

                </h1>

            </div>


            <form action="editSubject" method="post">


                <div class="col-md-8">

                    <div class="form-group row">
                        <div class="col-xs-3">
                            <label for="code">Subject Code</label>
                            <input type="text" value="${theSubject.scode}" name="code" id="code" class="form-control" size="60" required>
                        </div>
                    </div>
                    <div>
                        <label for="fname">Subject Name</label>
                        <input type="text" value="${theSubject.name}" id="fname" name="name" class="form-control" size="60" required>
                    </div>
                    <div>
                        <label for="scode">Short Code</label>
                        <input type="text" value="${theSubject.shortcode}" class="form-control" id="scode"
                               required name="shortCode"><br>
                    </div>
                    <div>
                        <label for="lname">Semester</label>
                        <select class="form-control" name="semester" id="lname">
                            <optgroup label="Current">
                                <option value="${theSubject.academicSemester}">${theSubject.academicSemester}</option>
                            </optgroup>
                            <optgroup label="Available">
                                <c:forEach var="tempClass" items="${allAcademicClasses}">
                                    <option value="${tempClass}">${tempClass}</option>
                                </c:forEach>
                            </optgroup>
                        </select>
                    </div>
                    <div>
                        <label for="sem">Is HS or Elective Subject?</label>
                        <select class="form-control" name="elective" id="elec" required>
                            <option value="1">Yes</option>
                            <option value="0">No</option>
                        </select>
                    </div>
                    <input type="hidden" value="${theSubject.scode}" name="oldCode">
                    <input type="hidden" value="${theSubject.shortcode}" name="oldShortCode">
                    <br>
                    <div class="form-group ">
                        <input type="submit" name="update" class="btn btn-primary btn-lg" value="Update">
                    </div>



                </div><!--Main Content-->



            </form>


        </div>
        <!-- /.container-fluid -->

    </div>
    <!-- /#page-wrapper -->
</div>
    <%@include file="templates/footer.jsp"%>