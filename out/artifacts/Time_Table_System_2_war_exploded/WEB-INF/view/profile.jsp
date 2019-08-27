<%@include file="templates/top-nav.jsp"%>

<div id="page-wrapper">

    <div class="container-fluid">


        <div class="col-md-12">

            <div class="row">
                <h1 class="page-header">
                    User Profile

                </h1>

            </div>


            <form action="<c:url value="/updateUser"/>" method="post">


                <div class="col-md-8">

                    <div class="form-group row">
                        <div class="col-xs-3">
                            <label for="product-price">First Name</label>
                            <input type="text" value="${theUser.firstname}" name="firstname" class="form-control" size="60" required>
                        </div>

                        <div class="col-xs-3">
                            <label for="product-quantity">Last Name</label>
                            <input type="text" value="${theUser.lastname}" name="lastname" class="form-control" size="60" step="1" required>
                        </div>
                    </div>

                    <div>
                        <label for="user-name">User Name </label>
                        <input type="text" value="${theUser.username}" class="form-control"
                               required disabled><br>
                    </div>

                    <div>
                        <label for="product-price">Password</label>
                        <input type="password" value="${theUser.password}" name="password"
                               class="form-control" size="60" required><br>
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