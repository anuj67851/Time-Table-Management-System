<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="templates/top-nav.jsp" %>

<div id="page-wrapper">

    <div class="container-fluid">

        <div class="row">

            <h1 class="page-header">
                All Current Lectures For ${theClass.classroom}
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
                        <th>Faculty Code</th>
                        <th>Alt Faculty(If Any)</th>
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
                        <c:when test="${theClass.m1 != null}">
                            <tr>
                                <td>${theClass.m1.id}</td>
                                <td>${theClass.m1.academicclasses.academicClass}</td>
                                <td>${theClass.m1.teacher.code}</td>
                                <td>${theClass.m1.altTeacher.code}</td>
                                <td>${theClass.m1.subject}</td>
                                <td>${theClass.m1.hours}</td>
                                <td>${theClass.m1.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.m1.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theClass.m2 != null}">
                            <tr>
                                <td>${theClass.m2.id}</td>
                                <td>${theClass.m2.academicclasses.academicClass}</td>
                                <td>${theClass.m2.teacher.code}</td>
                                <td>${theClass.m2.altTeacher.code}</td>
                                <td>${theClass.m2.subject}</td>
                                <td>${theClass.m2.hours}</td>
                                <td>${theClass.m2.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.m2.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theClass.m3 != null}">
                            <tr>
                                <td>${theClass.m3.id}</td>
                                <td>${theClass.m3.academicclasses.academicClass}</td>
                                <td>${theClass.m3.teacher.code}</td>
                                <td>${theClass.m3.altTeacher.code}</td>
                                <td>${theClass.m3.subject}</td>
                                <td>${theClass.m3.hours}</td>
                                <td>${theClass.m3.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.m3.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.m4 != null}">
                            <tr>
                                <td>${theClass.m4.id}</td>
                                <td>${theClass.m4.academicclasses.academicClass}</td>
                                <td>${theClass.m4.teacher.code}</td>
                                <td>${theClass.m4.altTeacher.code}</td>
                                <td>${theClass.m4.subject}</td>
                                <td>${theClass.m4.hours}</td>
                                <td>${theClass.m4.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.m4.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.m5 != null}">
                            <tr>
                                <td>${theClass.m5.id}</td>
                                <td>${theClass.m5.academicclasses.academicClass}</td>
                                <td>${theClass.m5.teacher.code}</td>
                                <td>${theClass.m5.altTeacher.code}</td>
                                <td>${theClass.m5.subject}</td>
                                <td>${theClass.m5.hours}</td>
                                <td>${theClass.m5.numhours}</td>


                                <td><a href="deleteLectureForClass?id=${theClass.m5.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.m6 != null}">
                            <tr>
                                <td>${theClass.m6.id}</td>
                                <td>${theClass.m6.academicclasses.academicClass}</td>
                                <td>${theClass.m6.teacher.code}</td>
                                <td>${theClass.m6.altTeacher.code}</td>
                                <td>${theClass.m6.subject}</td>
                                <td>${theClass.m6.hours}</td>
                                <td>${theClass.m6.numhours}</td>


                                <td><a href="deleteLectureForClass?id=${theClass.m6.id}&class=${theClass.classroom}"><span
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
                        <c:when test="${theClass.tue1 != null}">
                            <tr>
                                <td>${theClass.tue1.id}</td>
                                <td>${theClass.tue1.academicclasses.academicClass}</td>
                                <td>${theClass.tue1.teacher.code}</td>
                                <td>${theClass.tue1.altTeacher.code}</td>
                                <td>${theClass.tue1.subject}</td>
                                <td>${theClass.tue1.hours}</td>
                                <td>${theClass.tue1.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.tue1.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theClass.tue2 != null}">
                            <tr>
                                <td>${theClass.tue2.id}</td>
                                <td>${theClass.tue2.academicclasses.academicClass}</td>
                                <td>${theClass.tue2.teacher.code}</td>
                                <td>${theClass.tue2.altTeacher.code}</td>
                                <td>${theClass.tue2.subject}</td>
                                <td>${theClass.tue2.hours}</td>
                                <td>${theClass.tue2.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.tue2.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theClass.tue3 != null}">
                            <tr>
                                <td>${theClass.tue3.id}</td>
                                <td>${theClass.tue3.academicclasses.academicClass}</td>
                                <td>${theClass.tue3.teacher.code}</td>
                                <td>${theClass.tue3.altTeacher.code}</td>
                                <td>${theClass.tue3.subject}</td>
                                <td>${theClass.tue3.hours}</td>
                                <td>${theClass.tue3.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.tue3.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.tue4 != null}">
                            <tr>
                                <td>${theClass.tue4.id}</td>
                                <td>${theClass.tue4.academicclasses.academicClass}</td>
                                <td>${theClass.tue4.teacher.code}</td>
                                <td>${theClass.tue4.altTeacher.code}</td>
                                <td>${theClass.tue4.subject}</td>
                                <td>${theClass.tue4.hours}</td>
                                <td>${theClass.tue4.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.tue4.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.tue5 != null}">
                            <tr>
                                <td>${theClass.tue5.id}</td>
                                <td>${theClass.tue5.academicclasses.academicClass}</td>
                                <td>${theClass.tue5.teacher.code}</td>
                                <td>${theClass.tue5.altTeacher.code}</td>
                                <td>${theClass.tue5.subject}</td>
                                <td>${theClass.tue5.hours}</td>
                                <td>${theClass.tue5.numhours}</td>


                                <td><a href="deleteLectureForClass?id=${theClass.tue5.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.tue6 != null}">
                            <tr>
                                <td>${theClass.tue6.id}</td>
                                <td>${theClass.tue6.academicclasses.academicClass}</td>
                                <td>${theClass.tue6.teacher.code}</td>
                                <td>${theClass.tue6.altTeacher.code}</td>
                                <td>${theClass.tue6.subject}</td>
                                <td>${theClass.tue6.hours}</td>
                                <td>${theClass.tue6.numhours}</td>


                                <td><a href="deleteLectureForClass?id=${theClass.tue6.id}&class=${theClass.classroom}"><span
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
                        <c:when test="${theClass.w1 != null}">
                            <tr>
                                <td>${theClass.w1.id}</td>
                                <td>${theClass.w1.academicclasses.academicClass}</td>
                                <td>${theClass.w1.teacher.code}</td>
                                <td>${theClass.w1.altTeacher.code}</td>
                                <td>${theClass.w1.subject}</td>
                                <td>${theClass.w1.hours}</td>
                                <td>${theClass.w1.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.w1.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theClass.w2 != null}">
                            <tr>
                                <td>${theClass.w2.id}</td>
                                <td>${theClass.w2.academicclasses.academicClass}</td>
                                <td>${theClass.w2.teacher.code}</td>
                                <td>${theClass.w2.altTeacher.code}</td>
                                <td>${theClass.w2.subject}</td>
                                <td>${theClass.w2.hours}</td>
                                <td>${theClass.w2.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.w2.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theClass.w3 != null}">
                            <tr>
                                <td>${theClass.w3.id}</td>
                                <td>${theClass.w3.academicclasses.academicClass}</td>
                                <td>${theClass.w3.teacher.code}</td>
                                <td>${theClass.w3.altTeacher.code}</td>
                                <td>${theClass.w3.subject}</td>
                                <td>${theClass.w3.hours}</td>
                                <td>${theClass.w3.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.w3.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.w4 != null}">
                            <tr>
                                <td>${theClass.w4.id}</td>
                                <td>${theClass.w4.academicclasses.academicClass}</td>
                                <td>${theClass.w4.teacher.code}</td>
                                <td>${theClass.w4.altTeacher.code}</td>
                                <td>${theClass.w4.subject}</td>
                                <td>${theClass.w4.hours}</td>
                                <td>${theClass.w4.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.w4.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.w5 != null}">
                            <tr>
                                <td>${theClass.w5.id}</td>
                                <td>${theClass.w5.academicclasses.academicClass}</td>
                                <td>${theClass.w5.teacher.code}</td>
                                <td>${theClass.w5.altTeacher.code}</td>
                                <td>${theClass.w5.subject}</td>
                                <td>${theClass.w5.hours}</td>
                                <td>${theClass.w5.numhours}</td>


                                <td><a href="deleteLectureForClass?id=${theClass.w5.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.w6 != null}">
                            <tr>
                                <td>${theClass.w6.id}</td>
                                <td>${theClass.w6.academicclasses.academicClass}</td>
                                <td>${theClass.w6.teacher.code}</td>
                                <td>${theClass.w6.altTeacher.code}</td>
                                <td>${theClass.w6.subject}</td>
                                <td>${theClass.w6.hours}</td>
                                <td>${theClass.w6.numhours}</td>


                                <td><a href="deleteLectureForClass?id=${theClass.w6.id}&class=${theClass.classroom}"><span
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
                        <c:when test="${theClass.th1 != null}">
                            <tr>
                                <td>${theClass.th1.id}</td>
                                <td>${theClass.th1.academicclasses.academicClass}</td>
                                <td>${theClass.th1.teacher.code}</td>
                                <td>${theClass.th1.altTeacher.code}</td>
                                <td>${theClass.th1.subject}</td>
                                <td>${theClass.th1.hours}</td>
                                <td>${theClass.th1.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.th1.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theClass.th2 != null}">
                            <tr>
                                <td>${theClass.th2.id}</td>
                                <td>${theClass.th2.academicclasses.academicClass}</td>
                                <td>${theClass.th2.teacher.code}</td>
                                <td>${theClass.th2.altTeacher.code}</td>
                                <td>${theClass.th2.subject}</td>
                                <td>${theClass.th2.hours}</td>
                                <td>${theClass.th2.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.th2.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theClass.th3 != null}">
                            <tr>
                                <td>${theClass.th3.id}</td>
                                <td>${theClass.th3.academicclasses.academicClass}</td>
                                <td>${theClass.th3.teacher.code}</td>
                                <td>${theClass.th3.altTeacher.code}</td>
                                <td>${theClass.th3.subject}</td>
                                <td>${theClass.th3.hours}</td>
                                <td>${theClass.th3.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.th3.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.th4 != null}">
                            <tr>
                                <td>${theClass.th4.id}</td>
                                <td>${theClass.th4.academicclasses.academicClass}</td>
                                <td>${theClass.th4.teacher.code}</td>
                                <td>${theClass.th4.altTeacher.code}</td>
                                <td>${theClass.th4.subject}</td>
                                <td>${theClass.th4.hours}</td>
                                <td>${theClass.th4.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.th4.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.th5 != null}">
                            <tr>
                                <td>${theClass.th5.id}</td>
                                <td>${theClass.th5.academicclasses.academicClass}</td>
                                <td>${theClass.th5.teacher.code}</td>
                                <td>${theClass.th5.altTeacher.code}</td>
                                <td>${theClass.th5.subject}</td>
                                <td>${theClass.th5.hours}</td>
                                <td>${theClass.th5.numhours}</td>


                                <td><a href="deleteLectureForClass?id=${theClass.th5.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.th6 != null}">
                            <tr>
                                <td>${theClass.th6.id}</td>
                                <td>${theClass.th6.academicclasses.academicClass}</td>
                                <td>${theClass.th6.teacher.code}</td>
                                <td>${theClass.th6.altTeacher.code}</td>
                                <td>${theClass.th6.subject}</td>
                                <td>${theClass.th6.hours}</td>
                                <td>${theClass.th6.numhours}</td>


                                <td><a href="deleteLectureForClass?id=${theClass.th6.id}&class=${theClass.classroom}"><span
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
                        <c:when test="${theClass.f1 != null}">
                            <tr>
                                <td>${theClass.f1.id}</td>
                                <td>${theClass.f1.academicclasses.academicClass}</td>
                                <td>${theClass.f1.teacher.code}</td>
                                <td>${theClass.f1.altTeacher.code}</td>
                                <td>${theClass.f1.subject}</td>
                                <td>${theClass.f1.hours}</td>
                                <td>${theClass.f1.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.f1.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theClass.f2 != null}">
                            <tr>
                                <td>${theClass.f2.id}</td>
                                <td>${theClass.f2.academicclasses.academicClass}</td>
                                <td>${theClass.f2.teacher.code}</td>
                                <td>${theClass.f2.altTeacher.code}</td>
                                <td>${theClass.f2.subject}</td>
                                <td>${theClass.f2.hours}</td>
                                <td>${theClass.f2.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.f2.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theClass.f3 != null}">
                            <tr>
                                <td>${theClass.f3.id}</td>
                                <td>${theClass.f3.academicclasses.academicClass}</td>
                                <td>${theClass.f3.teacher.code}</td>
                                <td>${theClass.f3.altTeacher.code}</td>
                                <td>${theClass.f3.subject}</td>
                                <td>${theClass.f3.hours}</td>
                                <td>${theClass.f3.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.f3.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.f4 != null}">
                            <tr>
                                <td>${theClass.f4.id}</td>
                                <td>${theClass.f4.academicclasses.academicClass}</td>
                                <td>${theClass.f4.teacher.code}</td>
                                <td>${theClass.f4.altTeacher.code}</td>
                                <td>${theClass.f4.subject}</td>
                                <td>${theClass.f4.hours}</td>
                                <td>${theClass.f4.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.f4.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.f5 != null}">
                            <tr>
                                <td>${theClass.f5.id}</td>
                                <td>${theClass.f5.academicclasses.academicClass}</td>
                                <td>${theClass.f5.teacher.code}</td>
                                <td>${theClass.f5.altTeacher.code}</td>
                                <td>${theClass.f5.subject}</td>
                                <td>${theClass.f5.hours}</td>
                                <td>${theClass.f5.numhours}</td>


                                <td><a href="deleteLectureForClass?id=${theClass.f5.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.f6 != null}">
                            <tr>
                                <td>${theClass.f6.id}</td>
                                <td>${theClass.f6.academicclasses.academicClass}</td>
                                <td>${theClass.f6.teacher.code}</td>
                                <td>${theClass.f6.altTeacher.code}</td>
                                <td>${theClass.f6.subject}</td>
                                <td>${theClass.f6.hours}</td>
                                <td>${theClass.f6.numhours}</td>


                                <td><a href="deleteLectureForClass?id=${theClass.f6.id}&class=${theClass.classroom}"><span
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
                        <c:when test="${theClass.s1 != null}">
                            <tr>
                                <td>${theClass.s1.id}</td>
                                <td>${theClass.s1.academicclasses.academicClass}</td>
                                <td>${theClass.s1.teacher.code}</td>
                                <td>${theClass.s1.altTeacher.code}</td>
                                <td>${theClass.s1.subject}</td>
                                <td>${theClass.s1.hours}</td>
                                <td>${theClass.s1.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.s1.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theClass.s2 != null}">
                            <tr>
                                <td>${theClass.s2.id}</td>
                                <td>${theClass.s2.academicclasses.academicClass}</td>
                                <td>${theClass.s2.teacher.code}</td>
                                <td>${theClass.s2.altTeacher.code}</td>
                                <td>${theClass.s2.subject}</td>
                                <td>${theClass.s2.hours}</td>
                                <td>${theClass.s2.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.s2.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${theClass.s3 != null}">
                            <tr>
                                <td>${theClass.s3.id}</td>
                                <td>${theClass.s3.academicclasses.academicClass}</td>
                                <td>${theClass.s3.teacher.code}</td>
                                <td>${theClass.s3.altTeacher.code}</td>
                                <td>${theClass.s3.subject}</td>
                                <td>${theClass.s3.hours}</td>
                                <td>${theClass.s3.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.s3.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.s4 != null}">
                            <tr>
                                <td>${theClass.s4.id}</td>
                                <td>${theClass.s4.academicclasses.academicClass}</td>
                                <td>${theClass.s4.teacher.code}</td>
                                <td>${theClass.s4.altTeacher.code}</td>
                                <td>${theClass.s4.subject}</td>
                                <td>${theClass.s4.hours}</td>
                                <td>${theClass.s4.numhours}</td>

                                <td><a href="deleteLectureForClass?id=${theClass.s4.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.s5 != null}">
                            <tr>
                                <td>${theClass.s5.id}</td>
                                <td>${theClass.s5.academicclasses.academicClass}</td>
                                <td>${theClass.s5.teacher.code}</td>
                                <td>${theClass.s5.altTeacher.code}</td>
                                <td>${theClass.s5.subject}</td>
                                <td>${theClass.s5.hours}</td>
                                <td>${theClass.s5.numhours}</td>


                                <td><a href="deleteLectureForClass?id=${theClass.s5.id}&class=${theClass.classroom}"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr></tr>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${theClass.s6 != null}">
                            <tr>
                                <td>${theClass.s6.id}</td>
                                <td>${theClass.s6.academicclasses.academicClass}</td>
                                <td>${theClass.s6.teacher.code}</td>
                                <td>${theClass.s6.altTeacher.code}</td>
                                <td>${theClass.s6.subject}</td>
                                <td>${theClass.s6.hours}</td>
                                <td>${theClass.s6.numhours}</td>


                                <td><a href="deleteLectureForClass?id=${theClass.s6.id}&class=${theClass.classroom}"><span
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