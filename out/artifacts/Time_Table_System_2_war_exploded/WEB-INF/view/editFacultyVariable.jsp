<%@include file="templates/top-nav.jsp"%>
<script>
    function changeVariableType() {
        if (document.getElementById("isFaculty").checked){
            document.getElementById("fname").disabled = false;
            document.getElementById("lname").disabled = false;

            document.getElementById("fname").required = true;
            document.getElementById("lname").required = true;
        }

        if (!document.getElementById("isFaculty").checked){
            document.getElementById("fname").value = "";
            document.getElementById("lname").value = "";
            document.getElementById("fname").disabled = true;
            document.getElementById("lname").disabled = true;
        }
    }
</script>

<div id="page-wrapper">

    <div class="container-fluid">


        <div class="col-md-12">

            <div class="row">
                <h1 class="page-header">
                    Edit Faculty Variable
                </h1>

            </div>


            <form action="<c:url value="/editFacultyVariable"/>" method="post">


                <div class="col-md-8">

                    <div class="form-group row">
                        <div class="col-xs-3">
                            <label for="vcode">Code</label>
                            <input type="text" value="${theTeacher.code}" name="code" id="vcode" class="form-control" size="60" required>
                        </div>
                    </div>
                    <div>
                        <label for="fname">First Name</label>
                        <input type="text" value="${theTeacher.firstname}" name="firstname" id="fname" class="form-control" disabled>
                    </div>
                    <div>
                        <label for="lname">Last Name </label>
                        <input type="text" value="${theTeacher.lastname}" class="form-control" id="lname" name="lastname" disabled><br>
                    </div>
                    <div>
                        <label for="isFaculty">is Faculty</label>
                        <input type="checkbox" id="isFaculty" class="form-control" name="isFaculty" onchange="changeVariableType()"><br>
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