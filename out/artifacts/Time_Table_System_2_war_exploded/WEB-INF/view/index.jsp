<%@include file="templates/top-nav.jsp"%>

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        Dashboard
                        <small>Records Overview</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li class="active">
                            <i class="fa fa-dashboard"></i> Dashboard
                        </li>
                    </ol>
                </div>
            </div>
            <!-- /.row -->

            <!-- FIRST ROW WITH PANELS -->

            <!-- /.row -->
            <div class="row">

                <div class="col-lg-4 col-md-6">
                    <div class="panel panel-yellow">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-3">
                                    <i class="fa fa-group fa-5x"></i>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div class="huge">${TeacherCount}</div>
                                    <div>Faculties Registered!</div>
                                </div>
                            </div>
                        </div>
                        <a href="getAllTeachersPage">
                            <div class="panel-footer">
                                <span class="pull-left">View Details</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>


                <div class="col-lg-4 col-md-6">
                    <div class="panel panel-red">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-3">
                                    <i class="fa fa-building-o fa-5x"></i>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div class="huge">${ClassCount}</div>
                                    <div>Total Classes!</div>
                                </div>
                            </div>
                        </div>
                        <a href="getClassList">
                            <div class="panel-footer">
                                <span class="pull-left">View Details</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>

                <div class="col-lg-4 col-md-6">
                    <div class="panel panel-green">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-3">
                                    <i class="fa fa-book fa-5x"></i>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div class="huge">${SubjectCount}</div>
                                    <div>Subjects!</div>
                                </div>
                            </div>
                        </div>
                        <a href="getSubjectList">
                            <div class="panel-footer">
                                <span class="pull-left">View Details</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>


            </div>

            <!-- /.row -->


            <!-- SECOND ROW WITH TABLES-->

            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title"><i class="fa fa-money fa-fw"></i>&nbsp;Recently Added Lectures</h3>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-bordered table-hover table-striped">
                                    <thead>
                                    <tr>
                                        <th>Classroom</th>
                                        <th>Subject</th>
                                        <th>Teacher Code</th>
                                        <th>Alt teacher(IF ANY)</th>
                                        <th>Day and time</th>
                                        <th>Academic Class</th>

                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="tempLecture" items="${lectures}">
                                        <tr>
                                            <td>${tempLecture.classroom.classroom}</td>
                                            <td>${tempLecture.subject}</td>
                                            <td>${tempLecture.teacher.code}</td>
                                            <td>${tempLecture.altTeacher.code}</td>
                                            <td>${tempLecture.hours}</td>
                                            <td>${tempLecture.academicclasses.academicClass}</td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>


            </div>


        </div>
        <!-- /.row -->

    </div>
    <!-- /.container-fluid -->

</div>
<%@include file="templates/footer.jsp"%>