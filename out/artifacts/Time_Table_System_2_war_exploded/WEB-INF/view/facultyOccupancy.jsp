<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Faculty</title>
    <style>
        td {
            text-align: center;
            height: 50px;
            width: 50px;
        }
        table{
            table-layout: auto;
            width: ${(allTeachers.size()+2)*5}%;;
        }
    </style>
</head>
<body>
<table border="1" style="table-layout:fixed;">
    <tr>
        <td rowspan="2">DAY</td>
        <td rowspan="2">TIME</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <td>${tempTeacher.firstname} ${tempTeacher.lastname.substring(0,1)}.</td>
        </c:forEach>
    </tr>
    <tr>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <td>${tempTeacher.code}</td>
        </c:forEach>
    </tr>

    <!--Monday-->

    <tr>
        <td rowspan="8">MON</td>
        <td>9:10 to 10:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.m1 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.m1.academicclasses.academicClass}
                        <c:if test="${tempTeacher.m1.subject.contains('-')}">
                            ${tempTeacher.m1.subject.substring(tempTeacher.m1.subject.length()-2,tempTeacher.m1.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.m1.subject.contains('-')}">
                                ${tempTeacher.m1.subject.substring(0,tempTeacher.m1.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.m1.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.m1.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>10:10 to 11:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.m2 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.m2.academicclasses.academicClass}
                        <c:if test="${tempTeacher.m2.subject.contains('-')}">
                            ${tempTeacher.m2.subject.substring(tempTeacher.m2.subject.length()-2,tempTeacher.m2.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.m2.subject.contains('-')}">
                                ${tempTeacher.m2.subject.substring(0,tempTeacher.m2.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.m2.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.m2.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>11:10 to 12:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>12:10 to 1:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.m3 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.m3.academicclasses.academicClass}
                        <c:if test="${tempTeacher.m3.subject.contains('-')}">
                            ${tempTeacher.m3.subject.substring(tempTeacher.m3.subject.length()-2,tempTeacher.m3.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.m3.subject.contains('-')}">
                                ${tempTeacher.m3.subject.substring(0,tempTeacher.m3.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.m3.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.m3.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>1:10 to 2:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.m4 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.m4.academicclasses.academicClass}
                        <c:if test="${tempTeacher.m4.subject.contains('-')}">
                            ${tempTeacher.m4.subject.substring(tempTeacher.m4.subject.length()-2,tempTeacher.m4.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.m4.subject.contains('-')}">
                                ${tempTeacher.m4.subject.substring(0,tempTeacher.m4.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.m4.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.m4.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:10 to 2:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 3:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.m5 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.m5.academicclasses.academicClass}
                        <c:if test="${tempTeacher.m5.subject.contains('-')}">
                            ${tempTeacher.m5.subject.substring(tempTeacher.m5.subject.length()-2,tempTeacher.m5.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.m5.subject.contains('-')}">
                                ${tempTeacher.m5.subject.substring(0,tempTeacher.m5.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.m5.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.m5.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 4:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.m6 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.m6.academicclasses.academicClass}
                        <c:if test="${tempTeacher.m6.subject.contains('-')}">
                            ${tempTeacher.m6.subject.substring(tempTeacher.m6.subject.length()-2,tempTeacher.m6.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.m6.subject.contains('-')}">
                                ${tempTeacher.m6.subject.substring(0,tempTeacher.m6.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.m6.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.m6.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>

    <tr style="height: 10px;"></tr>

    <!--Tuesday-->

    <tr>
        <td rowspan="8">TUE</td>
        <td>9:10 to 10:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.tue1 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.tue1.academicclasses.academicClass}
                        <c:if test="${tempTeacher.tue1.subject.contains('-')}">
                            ${tempTeacher.tue1.subject.substring(tempTeacher.tue1.subject.length()-2,tempTeacher.tue1.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.tue1.subject.contains('-')}">
                                ${tempTeacher.tue1.subject.substring(0,tempTeacher.tue1.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.tue1.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.tue1.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>10:10 to 11:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.tue2 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.tue2.academicclasses.academicClass}
                        <c:if test="${tempTeacher.tue2.subject.contains('-')}">
                            ${tempTeacher.tue2.subject.substring(tempTeacher.tue2.subject.length()-2,tempTeacher.tue2.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.tue2.subject.contains('-')}">
                                ${tempTeacher.tue2.subject.substring(0,tempTeacher.tue2.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.tue2.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.tue2.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>11:10 to 12:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>12:10 to 1:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.tue3 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.tue3.academicclasses.academicClass}
                        <c:if test="${tempTeacher.tue3.subject.contains('-')}">
                            ${tempTeacher.tue3.subject.substring(tempTeacher.tue3.subject.length()-2,tempTeacher.tue3.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.tue3.subject.contains('-')}">
                                ${tempTeacher.tue3.subject.substring(0,tempTeacher.tue3.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.tue3.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.tue3.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>1:10 to 2:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.tue4 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.tue4.academicclasses.academicClass}
                        <c:if test="${tempTeacher.tue4.subject.contains('-')}">
                            ${tempTeacher.tue4.subject.substring(tempTeacher.tue4.subject.length()-2,tempTeacher.tue4.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.tue4.subject.contains('-')}">
                                ${tempTeacher.tue4.subject.substring(0,tempTeacher.tue4.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.tue4.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.tue4.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:10 to 2:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 3:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.tue5 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.tue5.academicclasses.academicClass}
                        <c:if test="${tempTeacher.tue5.subject.contains('-')}">
                            ${tempTeacher.tue5.subject.substring(tempTeacher.tue5.subject.length()-2,tempTeacher.tue5.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.tue5.subject.contains('-')}">
                                ${tempTeacher.tue5.subject.substring(0,tempTeacher.tue5.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.tue5.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.tue5.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 4:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.tue6 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.tue6.academicclasses.academicClass}
                        <c:if test="${tempTeacher.tue6.subject.contains('-')}">
                            ${tempTeacher.tue6.subject.substring(tempTeacher.tue6.subject.length()-2,tempTeacher.tue6.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.tue6.subject.contains('-')}">
                                ${tempTeacher.tue6.subject.substring(0,tempTeacher.tue6.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.tue6.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.tue6.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>

    <tr style="height: 10px;"></tr>

    <!--Wednesday-->

    <tr>
        <td rowspan="8">WED</td>
        <td>9:10 to 10:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.w1 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.w1.academicclasses.academicClass}
                        <c:if test="${tempTeacher.w1.subject.contains('-')}">
                            ${tempTeacher.w1.subject.substring(tempTeacher.w1.subject.length()-2,tempTeacher.w1.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.w1.subject.contains('-')}">
                                ${tempTeacher.w1.subject.substring(0,tempTeacher.w1.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.w1.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.w1.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>10:10 to 11:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.w2 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.w2.academicclasses.academicClass}
                        <c:if test="${tempTeacher.w2.subject.contains('-')}">
                            ${tempTeacher.w2.subject.substring(tempTeacher.w2.subject.length()-2,tempTeacher.w2.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.w2.subject.contains('-')}">
                                ${tempTeacher.w2.subject.substring(0,tempTeacher.w2.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.w2.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.w2.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>11:10 to 12:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>12:10 to 1:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.w3 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.w3.academicclasses.academicClass}
                        <c:if test="${tempTeacher.w3.subject.contains('-')}">
                            ${tempTeacher.w3.subject.substring(tempTeacher.w3.subject.length()-2,tempTeacher.w3.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.w3.subject.contains('-')}">
                                ${tempTeacher.w3.subject.substring(0,tempTeacher.w3.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.w3.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.w3.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>1:10 to 2:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.w4 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.w4.academicclasses.academicClass}
                        <c:if test="${tempTeacher.w4.subject.contains('-')}">
                            ${tempTeacher.w4.subject.substring(tempTeacher.w4.subject.length()-2,tempTeacher.w4.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.w4.subject.contains('-')}">
                                ${tempTeacher.w4.subject.substring(0,tempTeacher.w4.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.w4.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.w4.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:10 to 2:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 3:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.w5 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.w5.academicclasses.academicClass}
                        <c:if test="${tempTeacher.w5.subject.contains('-')}">
                            ${tempTeacher.w5.subject.substring(tempTeacher.w5.subject.length()-2,tempTeacher.w5.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.w5.subject.contains('-')}">
                                ${tempTeacher.w5.subject.substring(0,tempTeacher.w5.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.w5.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.w5.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 4:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.w6 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.w6.academicclasses.academicClass}
                        <c:if test="${tempTeacher.w6.subject.contains('-')}">
                            ${tempTeacher.w6.subject.substring(tempTeacher.w6.subject.length()-2,tempTeacher.w6.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.w6.subject.contains('-')}">
                                ${tempTeacher.w6.subject.substring(0,tempTeacher.w6.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.w6.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.w6.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>

    <tr style="height: 10px;"></tr>

    <!--Thursday-->

    <tr>
        <td rowspan="8">THU</td>
        <td>9:10 to 10:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.th1 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.th1.academicclasses.academicClass}
                        <c:if test="${tempTeacher.th1.subject.contains('-')}">
                            ${tempTeacher.th1.subject.substring(tempTeacher.th1.subject.length()-2,tempTeacher.th1.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.th1.subject.contains('-')}">
                                ${tempTeacher.th1.subject.substring(0,tempTeacher.th1.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.th1.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.th1.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>10:10 to 11:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.th2 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.th2.academicclasses.academicClass}
                        <c:if test="${tempTeacher.th2.subject.contains('-')}">
                            ${tempTeacher.th2.subject.substring(tempTeacher.th2.subject.length()-2,tempTeacher.th2.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.th2.subject.contains('-')}">
                                ${tempTeacher.th2.subject.substring(0,tempTeacher.th2.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.th2.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.th2.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>11:10 to 12:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>12:10 to 1:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.th3 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.th3.academicclasses.academicClass}
                        <c:if test="${tempTeacher.th3.subject.contains('-')}">
                            ${tempTeacher.th3.subject.substring(tempTeacher.th3.subject.length()-2,tempTeacher.th3.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.th3.subject.contains('-')}">
                                ${tempTeacher.th3.subject.substring(0,tempTeacher.th3.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.th3.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.th3.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>1:10 to 2:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.th4 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.th4.academicclasses.academicClass}
                        <c:if test="${tempTeacher.th4.subject.contains('-')}">
                            ${tempTeacher.th4.subject.substring(tempTeacher.th4.subject.length()-2,tempTeacher.th4.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.th4.subject.contains('-')}">
                                ${tempTeacher.th4.subject.substring(0,tempTeacher.th4.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.th4.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.th4.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:10 to 2:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 3:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.th5 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.th5.academicclasses.academicClass}
                        <c:if test="${tempTeacher.th5.subject.contains('-')}">
                            ${tempTeacher.th5.subject.substring(tempTeacher.th5.subject.length()-2,tempTeacher.th5.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.th5.subject.contains('-')}">
                                ${tempTeacher.th5.subject.substring(0,tempTeacher.th5.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.th5.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.th5.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 4:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.th6 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.th6.academicclasses.academicClass}
                        <c:if test="${tempTeacher.th6.subject.contains('-')}">
                            ${tempTeacher.th6.subject.substring(tempTeacher.th6.subject.length()-2,tempTeacher.th6.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.th6.subject.contains('-')}">
                                ${tempTeacher.th6.subject.substring(0,tempTeacher.th6.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.th6.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.th6.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>

    <tr style="height: 10px;"></tr>


    <!--Friday-->

    <tr>
        <td rowspan="8">FRI</td>
        <td>9:10 to 10:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.f1 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.f1.academicclasses.academicClass}
                        <c:if test="${tempTeacher.f1.subject.contains('-')}">
                            ${tempTeacher.f1.subject.substring(tempTeacher.f1.subject.length()-2,tempTeacher.f1.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.f1.subject.contains('-')}">
                                ${tempTeacher.f1.subject.substring(0,tempTeacher.f1.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.f1.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.f1.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>10:10 to 11:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.f2 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.f2.academicclasses.academicClass}
                        <c:if test="${tempTeacher.f2.subject.contains('-')}">
                            ${tempTeacher.f2.subject.substring(tempTeacher.f2.subject.length()-2,tempTeacher.f2.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.f2.subject.contains('-')}">
                                ${tempTeacher.f2.subject.substring(0,tempTeacher.f2.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.f2.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.f2.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>11:10 to 12:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>12:10 to 1:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.f3 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.f3.academicclasses.academicClass}
                        <c:if test="${tempTeacher.f3.subject.contains('-')}">
                            ${tempTeacher.f3.subject.substring(tempTeacher.f3.subject.length()-2,tempTeacher.f3.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.f3.subject.contains('-')}">
                                ${tempTeacher.f3.subject.substring(0,tempTeacher.f3.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.f3.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.f3.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>1:10 to 2:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.f4 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.f4.academicclasses.academicClass}
                        <c:if test="${tempTeacher.f4.subject.contains('-')}">
                            ${tempTeacher.f4.subject.substring(tempTeacher.f4.subject.length()-2,tempTeacher.f4.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.f4.subject.contains('-')}">
                                ${tempTeacher.f4.subject.substring(0,tempTeacher.f4.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.f4.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.f4.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:10 to 2:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 3:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.f5 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.f5.academicclasses.academicClass}
                        <c:if test="${tempTeacher.f5.subject.contains('-')}">
                            ${tempTeacher.f5.subject.substring(tempTeacher.f5.subject.length()-2,tempTeacher.f5.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.f5.subject.contains('-')}">
                                ${tempTeacher.f5.subject.substring(0,tempTeacher.f5.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.f5.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.f5.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 4:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.f6 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.f6.academicclasses.academicClass}
                        <c:if test="${tempTeacher.f6.subject.contains('-')}">
                            ${tempTeacher.f6.subject.substring(tempTeacher.f6.subject.length()-2,tempTeacher.f6.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.f6.subject.contains('-')}">
                                ${tempTeacher.f6.subject.substring(0,tempTeacher.f6.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.f6.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.f6.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>

    <tr style="height: 10px;"></tr>


    <!--Saturday-->

    <tr>
        <td rowspan="8">SAT</td>
        <td>9:10 to 10:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.s1 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.s1.academicclasses.academicClass}
                        <c:if test="${tempTeacher.s1.subject.contains('-')}">
                            ${tempTeacher.s1.subject.substring(tempTeacher.s1.subject.length()-2,tempTeacher.s1.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.s1.subject.contains('-')}">
                                ${tempTeacher.s1.subject.substring(0,tempTeacher.s1.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.s1.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.s1.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>10:10 to 11:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.s2 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.s2.academicclasses.academicClass}
                        <c:if test="${tempTeacher.s2.subject.contains('-')}">
                            ${tempTeacher.s2.subject.substring(tempTeacher.s2.subject.length()-2,tempTeacher.s2.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.s2.subject.contains('-')}">
                                ${tempTeacher.s2.subject.substring(0,tempTeacher.s2.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.s2.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.s2.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>11:10 to 12:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>12:10 to 1:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.s3 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.s3.academicclasses.academicClass}
                        <c:if test="${tempTeacher.s3.subject.contains('-')}">
                            ${tempTeacher.s3.subject.substring(tempTeacher.s3.subject.length()-2,tempTeacher.s3.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.s3.subject.contains('-')}">
                                ${tempTeacher.s3.subject.substring(0,tempTeacher.s3.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.s3.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.s3.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>1:10 to 2:10</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.s4 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.s4.academicclasses.academicClass}
                        <c:if test="${tempTeacher.s4.subject.contains('-')}">
                            ${tempTeacher.s4.subject.substring(tempTeacher.s4.subject.length()-2,tempTeacher.s4.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.s4.subject.contains('-')}">
                                ${tempTeacher.s4.subject.substring(0,tempTeacher.s4.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.s4.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.s4.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:10 to 2:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 3:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.s5 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.s5.academicclasses.academicClass}
                        <c:if test="${tempTeacher.s5.subject.contains('-')}">
                            ${tempTeacher.s5.subject.substring(tempTeacher.s5.subject.length()-2,tempTeacher.s5.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.s5.subject.contains('-')}">
                                ${tempTeacher.s5.subject.substring(0,tempTeacher.s5.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.s5.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.s5.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 4:20</td>
        <c:forEach var="tempTeacher" items="${allTeachers}">
            <c:choose>
                <c:when test="${tempTeacher.s6 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempTeacher.s6.academicclasses.academicClass}
                        <c:if test="${tempTeacher.s6.subject.contains('-')}">
                            ${tempTeacher.s6.subject.substring(tempTeacher.s6.subject.length()-2,tempTeacher.s6.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempTeacher.s6.subject.contains('-')}">
                                ${tempTeacher.s6.subject.substring(0,tempTeacher.s6.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempTeacher.s6.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempTeacher.s6.classroom.classroom}</td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
</table>
</body>
</html>