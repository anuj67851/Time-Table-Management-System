<%@include file="templates/top-nav.jsp"%>

<div id="page-wrapper">

    <div class="container-fluid">


        <div class="col-md-12">

            <div class="row">
                <h1 class="page-header">
                    Edit Faculty

                </h1>

            </div>


            <form action="editFacultyInfo" method="post">


                <div class="col-md-8">

                    <div class="form-group row">
                        <div class="col-xs-3">
                            <label for="code">Teacher Code</label>
                            <input type="text" value="${theTeacher.code}" name="code" id="code" class="form-control" size="60" required>
                        </div>
                    </div>
                    <div>
                        <label for="fname">First Name</label>
                        <input type="text" value="${theTeacher.firstname}" id="fname" name="firstname" class="form-control" size="60" required>
                    </div>
                    <div>
                        <label for="lname">Last Name </label>
                        <input type="text" value="${theTeacher.lastname}" class="form-control" id="lname"
                               required name="lastname"><br>
                    </div>
                    <input type="hidden" value="${theTeacher.code}" name="oldCode">
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