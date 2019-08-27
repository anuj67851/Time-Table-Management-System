<%@include file="templates/top-nav.jsp"%>

<div id="page-wrapper">

    <div class="container-fluid">


        <div class="col-md-12">

            <div class="row">
                <h1 class="page-header">
                    Edit Classroom

                </h1>

            </div>


            <form action="editClassroomInfo" method="post">


                <div class="col-md-8">

                    <div class="form-group row">
                        <div class="col-xs-3">
                            <label for="code">Class Room</label>
                            <input type="text" value="${theClassroom.classroom}" name="code" id="code" class="form-control" size="60" required>
                        </div>
                    </div>
                    <input type="hidden" value="${theClassroom.classroom}" name="oldCode">
                    <div>
                        <label for="sem">Is Variable?</label>
                        <select class="form-control" name="variable" id="elec" required>
                            <option value="0">No</option>
                            <option value="1">Yes</option>
                        </select>
                    </div>
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