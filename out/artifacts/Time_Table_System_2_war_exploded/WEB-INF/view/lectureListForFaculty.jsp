<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="templates/top-nav.jsp" %>

<div id="page-wrapper">

    <div class="container-fluid">

        <div class="row">

            <h1 class="page-header">
                All Current Lectures For ${theTeacher.code}
            </h1>
            <h4 class="bg-success">
                <%
                    if (request.getAttribute("message") != null) {
                        out.print(request.getAttribute("message"));
                    }
                    request.setAttribute("message", null);
                %>
            </h4>

            <div class="col-md-12">


                <table class="table table-hover">


                    <thead>

                    <tr>
                        <th>Id</th>
                        <th>Academic Class</th>
                        <th>Classroom</th>
                        <th>Subject</th>
                        <th>Slot Number</th>
                        <th>Number Of Hours</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td colspan="7" style="text-align: center;"><h3><b>Monday</b></h3></td>
                    </tr>

                    <c:choose>
                        <c:when test="${theTeacher.m1 != null}">
                            <tr>
                                <td>${theTeacher.m1.id}</td>
                                <td>${theTeacher.m1.academicclasses.academicClass}</td>
                                <td>${theTeacher.m1.classroom.classroom}</td>
                                <td>${theTeacher.m1.subject}</td>
                                <td>${theTeacher.m1.hours}</td>
                                <td>${theTeacher.m1.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.m1.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theTeacher.m2 != null}">
                            <tr>
                                <td>${theTeacher.m2.id}</td>
                                <td>${theTeacher.m2.academicclasses.academicClass}</td>
                                <td>${theTeacher.m2.classroom.classroom}</td>
                                <td>${theTeacher.m2.subject}</td>
                                <td>${theTeacher.m2.hours}</td>
                                <td>${theTeacher.m2.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.m2.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theTeacher.m3 != null}">
                            <tr>
                                <td>${theTeacher.m3.id}</td>
                                <td>${theTeacher.m3.academicclasses.academicClass}</td>
                                <td>${theTeacher.m3.classroom.classroom}</td>
                                <td>${theTeacher.m3.subject}</td>
                                <td>${theTeacher.m3.hours}</td>
                                <td>${theTeacher.m3.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.m3.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.m4 != null}">
                            <tr>
                                <td>${theTeacher.m4.id}</td>
                                <td>${theTeacher.m4.academicclasses.academicClass}</td>
                                <td>${theTeacher.m4.classroom.classroom}</td>
                                <td>${theTeacher.m4.subject}</td>
                                <td>${theTeacher.m4.hours}</td>
                                <td>${theTeacher.m4.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.m4.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.m5 != null}">
                            <tr>
                                <td>${theTeacher.m5.id}</td>
                                <td>${theTeacher.m5.academicclasses.academicClass}</td>
                                <td>${theTeacher.m5.classroom.classroom}</td>
                                <td>${theTeacher.m5.subject}</td>
                                <td>${theTeacher.m5.hours}</td>
                                <td>${theTeacher.m5.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.m5.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.m6 != null}">
                            <tr>
                                <td>${theTeacher.m6.id}</td>
                                <td>${theTeacher.m6.academicclasses.academicClass}</td>
                                <td>${theTeacher.m6.classroom.classroom}</td>
                                <td>${theTeacher.m6.subject}</td>
                                <td>${theTeacher.m6.hours}</td>
                                <td>${theTeacher.m6.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.m6.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <tr>
                        <td colspan="7" style="text-align: center;"><h3><b>Tuesday</b></h3></td>
                    </tr>

                    <c:choose>
                        <c:when test="${theTeacher.tue1 != null}">
                            <tr>
                                <td>${theTeacher.tue1.id}</td>
                                <td>${theTeacher.tue1.academicclasses.academicClass}</td>
                                <td>${theTeacher.tue1.classroom.classroom}</td>
                                <td>${theTeacher.tue1.subject}</td>
                                <td>${theTeacher.tue1.hours}</td>
                                <td>${theTeacher.tue1.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.tue1.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theTeacher.tue2 != null}">
                            <tr>
                                <td>${theTeacher.tue2.id}</td>
                                <td>${theTeacher.tue2.academicclasses.academicClass}</td>
                                <td>${theTeacher.tue2.classroom.classroom}</td>
                                <td>${theTeacher.tue2.subject}</td>
                                <td>${theTeacher.tue2.hours}</td>
                                <td>${theTeacher.tue2.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.tue2.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theTeacher.tue3 != null}">
                            <tr>
                                <td>${theTeacher.tue3.id}</td>
                                <td>${theTeacher.tue3.academicclasses.academicClass}</td>
                                <td>${theTeacher.tue3.classroom.classroom}</td>
                                <td>${theTeacher.tue3.subject}</td>
                                <td>${theTeacher.tue3.hours}</td>
                                <td>${theTeacher.tue3.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.tue3.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.tue4 != null}">
                            <tr>
                                <td>${theTeacher.tue4.id}</td>
                                <td>${theTeacher.tue4.academicclasses.academicClass}</td>
                                <td>${theTeacher.tue4.classroom.classroom}</td>
                                <td>${theTeacher.tue4.subject}</td>
                                <td>${theTeacher.tue4.hours}</td>
                                <td>${theTeacher.tue4.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.tue4.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.tue5 != null}">
                            <tr>
                                <td>${theTeacher.tue5.id}</td>
                                <td>${theTeacher.tue5.academicclasses.academicClass}</td>
                                <td>${theTeacher.tue5.classroom.classroom}</td>
                                <td>${theTeacher.tue5.subject}</td>
                                <td>${theTeacher.tue5.hours}</td>
                                <td>${theTeacher.tue5.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.tue5.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.tue6 != null}">
                            <tr>
                                <td>${theTeacher.tue6.id}</td>
                                <td>${theTeacher.tue6.academicclasses.academicClass}</td>
                                <td>${theTeacher.tue6.classroom.classroom}</td>
                                <td>${theTeacher.tue6.subject}</td>
                                <td>${theTeacher.tue6.hours}</td>
                                <td>${theTeacher.tue6.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.tue6.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <tr>
                        <td colspan="7" style="text-align: center;"><h3><b>Wednesday</b></h3></td>
                    </tr>

                    <c:choose>
                        <c:when test="${theTeacher.w1 != null}">
                            <tr>
                                <td>${theTeacher.w1.id}</td>
                                <td>${theTeacher.w1.academicclasses.academicClass}</td>
                                <td>${theTeacher.w1.classroom.classroom}</td>
                                <td>${theTeacher.w1.subject}</td>
                                <td>${theTeacher.w1.hours}</td>
                                <td>${theTeacher.w1.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.w1.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theTeacher.w2 != null}">
                            <tr>
                                <td>${theTeacher.w2.id}</td>
                                <td>${theTeacher.w2.academicclasses.academicClass}</td>
                                <td>${theTeacher.w2.classroom.classroom}</td>
                                <td>${theTeacher.w2.subject}</td>
                                <td>${theTeacher.w2.hours}</td>
                                <td>${theTeacher.w2.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.w2.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theTeacher.w3 != null}">
                            <tr>
                                <td>${theTeacher.w3.id}</td>
                                <td>${theTeacher.w3.academicclasses.academicClass}</td>
                                <td>${theTeacher.w3.classroom.classroom}</td>
                                <td>${theTeacher.w3.subject}</td>
                                <td>${theTeacher.w3.hours}</td>
                                <td>${theTeacher.w3.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.w3.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.w4 != null}">
                            <tr>
                                <td>${theTeacher.w4.id}</td>
                                <td>${theTeacher.w4.academicclasses.academicClass}</td>
                                <td>${theTeacher.w4.classroom.classroom}</td>
                                <td>${theTeacher.w4.subject}</td>
                                <td>${theTeacher.w4.hours}</td>
                                <td>${theTeacher.w4.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.w4.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.w5 != null}">
                            <tr>
                                <td>${theTeacher.w5.id}</td>
                                <td>${theTeacher.w5.academicclasses.academicClass}</td>
                                <td>${theTeacher.w5.classroom.classroom}</td>
                                <td>${theTeacher.w5.subject}</td>
                                <td>${theTeacher.w5.hours}</td>
                                <td>${theTeacher.w5.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.w5.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.w6 != null}">
                            <tr>
                                <td>${theTeacher.w6.id}</td>
                                <td>${theTeacher.w6.academicclasses.academicClass}</td>
                                <td>${theTeacher.w6.classroom.classroom}</td>
                                <td>${theTeacher.w6.subject}</td>
                                <td>${theTeacher.w6.hours}</td>
                                <td>${theTeacher.w6.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.w6.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <tr>
                        <td colspan="7" style="text-align: center;"><h3><b>Thursday</b></h3></td>
                    </tr>

                    <c:choose>
                        <c:when test="${theTeacher.th1 != null}">
                            <tr>
                                <td>${theTeacher.th1.id}</td>
                                <td>${theTeacher.th1.academicclasses.academicClass}</td>
                                <td>${theTeacher.th1.classroom.classroom}</td>
                                <td>${theTeacher.th1.subject}</td>
                                <td>${theTeacher.th1.hours}</td>
                                <td>${theTeacher.th1.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.th1.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theTeacher.th2 != null}">
                            <tr>
                                <td>${theTeacher.th2.id}</td>
                                <td>${theTeacher.th2.academicclasses.academicClass}</td>
                                <td>${theTeacher.th2.classroom.classroom}</td>
                                <td>${theTeacher.th2.subject}</td>
                                <td>${theTeacher.th2.hours}</td>
                                <td>${theTeacher.th2.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.th2.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theTeacher.th3 != null}">
                            <tr>
                                <td>${theTeacher.th3.id}</td>
                                <td>${theTeacher.th3.academicclasses.academicClass}</td>
                                <td>${theTeacher.th3.classroom.classroom}</td>
                                <td>${theTeacher.th3.subject}</td>
                                <td>${theTeacher.th3.hours}</td>
                                <td>${theTeacher.th3.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.th3.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.th4 != null}">
                            <tr>
                                <td>${theTeacher.th4.id}</td>
                                <td>${theTeacher.th4.academicclasses.academicClass}</td>
                                <td>${theTeacher.th4.classroom.classroom}</td>
                                <td>${theTeacher.th4.subject}</td>
                                <td>${theTeacher.th4.hours}</td>
                                <td>${theTeacher.th4.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.th4.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.th5 != null}">
                            <tr>
                                <td>${theTeacher.th5.id}</td>
                                <td>${theTeacher.th5.academicclasses.academicClass}</td>
                                <td>${theTeacher.th5.classroom.classroom}</td>
                                <td>${theTeacher.th5.subject}</td>
                                <td>${theTeacher.th5.hours}</td>
                                <td>${theTeacher.th5.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.th5.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.th6 != null}">
                            <tr>
                                <td>${theTeacher.th6.id}</td>
                                <td>${theTeacher.th6.academicclasses.academicClass}</td>
                                <td>${theTeacher.th6.classroom.classroom}</td>
                                <td>${theTeacher.th6.subject}</td>
                                <td>${theTeacher.th6.hours}</td>
                                <td>${theTeacher.th6.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.th6.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <tr>
                        <td colspan="7" style="text-align: center;"><h3><b>Friday</b></h3></td>
                    </tr>

                    <c:choose>
                        <c:when test="${theTeacher.f1 != null}">
                            <tr>
                                <td>${theTeacher.f1.id}</td>
                                <td>${theTeacher.f1.academicclasses.academicClass}</td>
                                <td>${theTeacher.f1.classroom.classroom}</td>
                                <td>${theTeacher.f1.subject}</td>
                                <td>${theTeacher.f1.hours}</td>
                                <td>${theTeacher.f1.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.f1.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theTeacher.f2 != null}">
                            <tr>
                                <td>${theTeacher.f2.id}</td>
                                <td>${theTeacher.f2.academicclasses.academicClass}</td>
                                <td>${theTeacher.f2.classroom.classroom}</td>
                                <td>${theTeacher.f2.subject}</td>
                                <td>${theTeacher.f2.hours}</td>
                                <td>${theTeacher.f2.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.f2.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theTeacher.f3 != null}">
                            <tr>
                                <td>${theTeacher.f3.id}</td>
                                <td>${theTeacher.f3.academicclasses.academicClass}</td>
                                <td>${theTeacher.f3.classroom.classroom}</td>
                                <td>${theTeacher.f3.subject}</td>
                                <td>${theTeacher.f3.hours}</td>
                                <td>${theTeacher.f3.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.f3.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.f4 != null}">
                            <tr>
                                <td>${theTeacher.f4.id}</td>
                                <td>${theTeacher.f4.academicclasses.academicClass}</td>
                                <td>${theTeacher.f4.classroom.classroom}</td>
                                <td>${theTeacher.f4.subject}</td>
                                <td>${theTeacher.f4.hours}</td>
                                <td>${theTeacher.f4.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.f4.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.f5 != null}">
                            <tr>
                                <td>${theTeacher.f5.id}</td>
                                <td>${theTeacher.f5.academicclasses.academicClass}</td>
                                <td>${theTeacher.f5.classroom.classroom}</td>
                                <td>${theTeacher.f5.subject}</td>
                                <td>${theTeacher.f5.hours}</td>
                                <td>${theTeacher.f5.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.f5.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.f6 != null}">
                            <tr>
                                <td>${theTeacher.f6.id}</td>
                                <td>${theTeacher.f6.academicclasses.academicClass}</td>
                                <td>${theTeacher.f6.classroom.classroom}</td>
                                <td>${theTeacher.f6.subject}</td>
                                <td>${theTeacher.f6.hours}</td>
                                <td>${theTeacher.f6.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.f6.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <tr>
                        <td colspan="7" style="text-align: center;"><h3><b>Saturday</b></h3></td>
                    </tr>

                    <c:choose>
                        <c:when test="${theTeacher.s1 != null}">
                            <tr>
                                <td>${theTeacher.s1.id}</td>
                                <td>${theTeacher.s1.academicclasses.academicClass}</td>
                                <td>${theTeacher.s1.classroom.classroom}</td>
                                <td>${theTeacher.s1.subject}</td>
                                <td>${theTeacher.s1.hours}</td>
                                <td>${theTeacher.s1.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.s1.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theTeacher.s2 != null}">
                            <tr>
                                <td>${theTeacher.s2.id}</td>
                                <td>${theTeacher.s2.academicclasses.academicClass}</td>
                                <td>${theTeacher.s2.classroom.classroom}</td>
                                <td>${theTeacher.s2.subject}</td>
                                <td>${theTeacher.s2.hours}</td>
                                <td>${theTeacher.s2.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.s2.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theTeacher.s3 != null}">
                            <tr>
                                <td>${theTeacher.s3.id}</td>
                                <td>${theTeacher.s3.academicclasses.academicClass}</td>
                                <td>${theTeacher.s3.classroom.classroom}</td>
                                <td>${theTeacher.s3.subject}</td>
                                <td>${theTeacher.s3.hours}</td>
                                <td>${theTeacher.s3.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.s3.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.s4 != null}">
                            <tr>
                                <td>${theTeacher.s4.id}</td>
                                <td>${theTeacher.s4.academicclasses.academicClass}</td>
                                <td>${theTeacher.s4.classroom.classroom}</td>
                                <td>${theTeacher.s4.subject}</td>
                                <td>${theTeacher.s4.hours}</td>
                                <td>${theTeacher.s4.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.s4.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.s5 != null}">
                            <tr>
                                <td>${theTeacher.s5.id}</td>
                                <td>${theTeacher.s5.academicclasses.academicClass}</td>
                                <td>${theTeacher.s5.classroom.classroom}</td>
                                <td>${theTeacher.s5.subject}</td>
                                <td>${theTeacher.s5.hours}</td>
                                <td>${theTeacher.s5.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.s5.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theTeacher.s6 != null}">
                            <tr>
                                <td>${theTeacher.s6.id}</td>
                                <td>${theTeacher.s6.academicclasses.academicClass}</td>
                                <td>${theTeacher.s6.classroom.classroom}</td>
                                <td>${theTeacher.s6.subject}</td>
                                <td>${theTeacher.s6.hours}</td>
                                <td>${theTeacher.s6.numhours}</td>


                                <td><a href="deleteLectureForFaculty?id=${theTeacher.s6.id}&tcode=${theTeacher.code}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <!-- /.container-fluid -->

</div>
<!-- /#page-wrapper -->
<%@include file="templates/footer.jsp" %>