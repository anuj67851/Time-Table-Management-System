<%@include file="templates/top-nav.jsp" %>

<div id="page-wrapper">

    <div class="container-fluid">

        <div class="row">

            <h1 class="page-header">
                All Users
                <div class="pull-right">
                    Total Users :
                    ${allUsers.size()}
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

                <form action="addUser" method="post">

                    <div class="form-group">
                        <label for="faculty-code">Username</label>
                        <input type="text" class="form-control" name="username" id="faculty-code" required>
                    </div>
                    <div class="form-group">
                        <label for="faculty-code">Password</label>
                        <input type="password" class="form-control" name="password" id="fname" required>
                    </div>
                    <div class="form-group">
                        <label for="faculty-firstname">Firstname</label>
                        <input type="text" name="firstname" id="faculty-firstname" class="form-control" required>
                    </div>

                    <div class="form-group">
                        <label for="faculty-lastname">Lastname</label>
                        <input type="text" name="lastname" id="faculty-lastname" class="form-control" required>
                    </div>

                    <div class="form-group">

                        <input name="submit" type="submit" class="btn btn-primary" value="Add User">
                    </div>


                </form>


            </div>

            <div class="col-md-8">


                <table class="table table-hover">


                    <thead>

                    <tr>
                        <th>Username</th>
                        <th>FirstName</th>
                        <th>LastName</th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="${allUsers}" var="tempUser">
                        <tr>
                            <td>${tempUser.username}</td>
                            <td>${tempUser.firstname}</td>
                            <td>${tempUser.lastname}</td>
                            <td><a href="deleteUser?id=${tempUser.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
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