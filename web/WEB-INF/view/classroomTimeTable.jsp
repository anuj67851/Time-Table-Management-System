<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="timetable.entity.Classroom" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Faculty TimeTable</title>
    <style>
        table {
            text-align: center;
            border-collapse: collapse;
            padding: 0;
        }

        table tr td {
            height: 50px;
            width: 200px;
        }
    </style>
</head>
<body>
<h3 align="center"><%
    Classroom classroom = (Classroom) request.getAttribute("theClass");
    out.print(classroom.getClassroom());
%></h3>
<table border="5" align="center">
    <tr>
        <td>HRS</td>
        <td colspan="2">MON</td>
        <td colspan="2">TUE</td>
        <td colspan="2">WED</td>
        <td colspan="2">THU</td>
        <td colspan="2">FRI</td>
        <td colspan="2">SAT</td>
    </tr>
    <tr>
        <td>9:10 to 10:10</td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.m1 != null}">
                    ${theClass.m1.academicclasses.academicClass}
                    <c:if test="${theClass.m1.subject.contains('-')}">
                        ${theClass.m1.subject.substring(theClass.m1.subject.length()-2,theClass.m1.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.m1.subject.contains('-')}">
                            ${theClass.m1.subject.substring(0,theClass.m1.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.m1.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.m1.teacher.code}
                    <c:if test="${theClass.m1.altTeacher != null}">
                      + ${theClass.m1.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.tue1 != null}">
                    ${theClass.tue1.academicclasses.academicClass}
                    <c:if test="${theClass.tue1.subject.contains('-')}">
                        ${theClass.tue1.subject.substring(theClass.tue1.subject.length()-2,theClass.tue1.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.tue1.subject.contains('-')}">
                            ${theClass.tue1.subject.substring(0,theClass.tue1.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.tue1.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.tue1.teacher.code}
                    <c:if test="${theClass.tue1.altTeacher != null}">
                        + ${theClass.tue1.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.w1 != null}">
                    ${theClass.w1.academicclasses.academicClass}
                    <c:if test="${theClass.w1.subject.contains('-')}">
                        ${theClass.w1.subject.substring(theClass.w1.subject.length()-2,theClass.w1.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.w1.subject.contains('-')}">
                            ${theClass.w1.subject.substring(0,theClass.w1.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.w1.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.w1.teacher.code}
                    <c:if test="${theClass.w1.altTeacher != null}">
                        + ${theClass.w1.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.th1 != null}">
                    ${theClass.th1.academicclasses.academicClass}
                    <c:if test="${theClass.th1.subject.contains('-')}">
                        ${theClass.th1.subject.substring(theClass.th1.subject.length()-2,theClass.th1.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.th1.subject.contains('-')}">
                            ${theClass.th1.subject.substring(0,theClass.th1.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.th1.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.th1.teacher.code}
                    <c:if test="${theClass.th1.altTeacher != null}">
                        + ${theClass.th1.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.f1 != null}">
                    ${theClass.f1.academicclasses.academicClass}
                    <c:if test="${theClass.f1.subject.contains('-')}">
                        ${theClass.f1.subject.substring(theClass.f1.subject.length()-2,theClass.f1.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.f1.subject.contains('-')}">
                            ${theClass.f1.subject.substring(0,theClass.f1.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.f1.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.f1.teacher.code}
                    <c:if test="${theClass.f1.altTeacher != null}">
                        + ${theClass.f1.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.s1 != null}">
                    ${theClass.s1.academicclasses.academicClass}
                    <c:if test="${theClass.s1.subject.contains('-')}">
                        ${theClass.s1.subject.substring(theClass.s1.subject.length()-2,theClass.s1.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.s1.subject.contains('-')}">
                            ${theClass.s1.subject.substring(0,theClass.s1.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.s1.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.s1.teacher.code}
                    <c:if test="${theClass.s1.altTeacher != null}">
                        + ${theClass.s1.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
    </tr>



    <tr>
        <td>10:10 to 11:10</td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.m2 != null}">
                    ${theClass.m2.academicclasses.academicClass}
                    <c:if test="${theClass.m2.subject.contains('-')}">
                        ${theClass.m2.subject.substring(theClass.m2.subject.length()-2,theClass.m2.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.m2.subject.contains('-')}">
                            ${theClass.m2.subject.substring(0,theClass.m2.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.m2.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.m2.teacher.code}
                    <c:if test="${theClass.m2.altTeacher != null}">
                        + ${theClass.m2.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.tue2 != null}">
                    ${theClass.tue2.academicclasses.academicClass}
                    <c:if test="${theClass.tue2.subject.contains('-')}">
                        ${theClass.tue2.subject.substring(theClass.tue2.subject.length()-2,theClass.tue2.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.tue2.subject.contains('-')}">
                            ${theClass.tue2.subject.substring(0,theClass.tue2.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.tue2.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.tue2.teacher.code}
                    <c:if test="${theClass.tue2.altTeacher != null}">
                        + ${theClass.tue2.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.w2 != null}">
                    ${theClass.w2.academicclasses.academicClass}
                    <c:if test="${theClass.w2.subject.contains('-')}">
                        ${theClass.w2.subject.substring(theClass.w2.subject.length()-2,theClass.w2.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.w2.subject.contains('-')}">
                            ${theClass.w2.subject.substring(0,theClass.w2.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.w2.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.w2.teacher.code}
                    <c:if test="${theClass.w2.altTeacher != null}">
                        + ${theClass.w2.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.th2 != null}">
                    ${theClass.th2.academicclasses.academicClass}
                    <c:if test="${theClass.th2.subject.contains('-')}">
                        ${theClass.th2.subject.substring(theClass.th2.subject.length()-2,theClass.th2.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.th2.subject.contains('-')}">
                            ${theClass.th2.subject.substring(0,theClass.th2.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.th2.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.th2.teacher.code}
                    <c:if test="${theClass.th2.altTeacher != null}">
                        + ${theClass.th2.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.f2 != null}">
                    ${theClass.f2.academicclasses.academicClass}
                    <c:if test="${theClass.f2.subject.contains('-')}">
                        ${theClass.f2.subject.substring(theClass.f2.subject.length()-2,theClass.f2.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.f2.subject.contains('-')}">
                            ${theClass.f2.subject.substring(0,theClass.f2.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.f2.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.f2.teacher.code}
                    <c:if test="${theClass.f2.altTeacher != null}">
                        + ${theClass.f2.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.s2 != null}">
                    ${theClass.s2.academicclasses.academicClass}
                    <c:if test="${theClass.s2.subject.contains('-')}">
                        ${theClass.s2.subject.substring(theClass.s2.subject.length()-2,theClass.s2.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.s2.subject.contains('-')}">
                            ${theClass.s2.subject.substring(0,theClass.s2.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.s2.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.s2.teacher.code}
                    <c:if test="${theClass.s2.altTeacher != null}">
                        + ${theClass.s2.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
    </tr>
    


    <tr>
        <td rowspan="1">11:10 to 12:10</td>
        <td colspan="12">RECESS</td>
    </tr>

    <tr>
        <td>12:10 to 1:10</td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.m3 != null}">
                    ${theClass.m3.academicclasses.academicClass}
                    <c:if test="${theClass.m3.subject.contains('-')}">
                        ${theClass.m3.subject.substring(theClass.m3.subject.length()-2,theClass.m3.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.m3.subject.contains('-')}">
                            ${theClass.m3.subject.substring(0,theClass.m3.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.m3.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.m3.teacher.code}
                    <c:if test="${theClass.m3.altTeacher != null}">
                        + ${theClass.m3.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.tue3 != null}">
                    ${theClass.tue3.academicclasses.academicClass}
                    <c:if test="${theClass.tue3.subject.contains('-')}">
                        ${theClass.tue3.subject.substring(theClass.tue3.subject.length()-2,theClass.tue3.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.tue3.subject.contains('-')}">
                            ${theClass.tue3.subject.substring(0,theClass.tue3.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.tue3.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.tue3.teacher.code}
                    <c:if test="${theClass.tue3.altTeacher != null}">
                        + ${theClass.tue3.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.w3 != null}">
                    ${theClass.w3.academicclasses.academicClass}
                    <c:if test="${theClass.w3.subject.contains('-')}">
                        ${theClass.w3.subject.substring(theClass.w3.subject.length()-2,theClass.w3.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.w3.subject.contains('-')}">
                            ${theClass.w3.subject.substring(0,theClass.w3.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.w3.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.w3.teacher.code}
                    <c:if test="${theClass.w3.altTeacher != null}">
                        + ${theClass.w3.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.th3 != null}">
                    ${theClass.th3.academicclasses.academicClass}
                    <c:if test="${theClass.th3.subject.contains('-')}">
                        ${theClass.th3.subject.substring(theClass.th3.subject.length()-2,theClass.th3.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.th3.subject.contains('-')}">
                            ${theClass.th3.subject.substring(0,theClass.th3.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.th3.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.th3.teacher.code}
                    <c:if test="${theClass.th3.altTeacher != null}">
                        + ${theClass.th3.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.f3 != null}">
                    ${theClass.f3.academicclasses.academicClass}
                    <c:if test="${theClass.f3.subject.contains('-')}">
                        ${theClass.f3.subject.substring(theClass.f3.subject.length()-2,theClass.f3.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.f3.subject.contains('-')}">
                            ${theClass.f3.subject.substring(0,theClass.f3.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.f3.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.f3.teacher.code}
                    <c:if test="${theClass.f3.altTeacher != null}">
                        + ${theClass.f3.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.s3 != null}">
                    ${theClass.s3.academicclasses.academicClass}
                    <c:if test="${theClass.s3.subject.contains('-')}">
                        ${theClass.s3.subject.substring(theClass.s3.subject.length()-2,theClass.s3.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.s3.subject.contains('-')}">
                            ${theClass.s3.subject.substring(0,theClass.s3.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.s3.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.s3.teacher.code}
                    <c:if test="${theClass.s3.altTeacher != null}">
                        + ${theClass.s3.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
    </tr>


    <tr>
        <td>1:10 to 2:10</td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.m4 != null}">
                    ${theClass.m4.academicclasses.academicClass}
                    <c:if test="${theClass.m4.subject.contains('-')}">
                        ${theClass.m4.subject.substring(theClass.m4.subject.length()-2,theClass.m4.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.m4.subject.contains('-')}">
                            ${theClass.m4.subject.substring(0,theClass.m4.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.m4.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.m4.teacher.code}
                    <c:if test="${theClass.m4.altTeacher != null}">
                        + ${theClass.m4.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.tue4 != null}">
                    ${theClass.tue4.academicclasses.academicClass}
                    <c:if test="${theClass.tue4.subject.contains('-')}">
                        ${theClass.tue4.subject.substring(theClass.tue4.subject.length()-2,theClass.tue4.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.tue4.subject.contains('-')}">
                            ${theClass.tue4.subject.substring(0,theClass.tue4.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.tue4.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.tue4.teacher.code}
                    <c:if test="${theClass.tue4.altTeacher != null}">
                        + ${theClass.tue4.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.w4 != null}">
                    ${theClass.w4.academicclasses.academicClass}
                    <c:if test="${theClass.w4.subject.contains('-')}">
                        ${theClass.w4.subject.substring(theClass.w4.subject.length()-2,theClass.w4.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.w4.subject.contains('-')}">
                            ${theClass.w4.subject.substring(0,theClass.w4.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.w4.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.w4.teacher.code}
                    <c:if test="${theClass.w4.altTeacher != null}">
                        + ${theClass.w4.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.th4 != null}">
                    ${theClass.th4.academicclasses.academicClass}
                    <c:if test="${theClass.th4.subject.contains('-')}">
                        ${theClass.th4.subject.substring(theClass.th4.subject.length()-2,theClass.th4.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.th4.subject.contains('-')}">
                            ${theClass.th4.subject.substring(0,theClass.th4.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.th4.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.th4.teacher.code}
                    <c:if test="${theClass.th4.altTeacher != null}">
                        + ${theClass.th4.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.f4 != null}">
                    ${theClass.f4.academicclasses.academicClass}
                    <c:if test="${theClass.f4.subject.contains('-')}">
                        ${theClass.f4.subject.substring(theClass.f4.subject.length()-2,theClass.f4.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.f4.subject.contains('-')}">
                            ${theClass.f4.subject.substring(0,theClass.f4.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.f4.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.f4.teacher.code}
                    <c:if test="${theClass.f4.altTeacher != null}">
                        + ${theClass.f4.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.s4 != null}">
                    ${theClass.s4.academicclasses.academicClass}
                    <c:if test="${theClass.s4.subject.contains('-')}">
                        ${theClass.s4.subject.substring(theClass.s4.subject.length()-2,theClass.s4.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.s4.subject.contains('-')}">
                            ${theClass.s4.subject.substring(0,theClass.s4.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.s4.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.s4.teacher.code}
                    <c:if test="${theClass.s4.altTeacher != null}">
                        + ${theClass.s4.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
    </tr>
    
    <tr>
        <td rowspan="1">2:10 to 2:20</td>
        <td colspan="12">RECESS</td>
    </tr>


    <tr>
        <td>2:20 to 3:20</td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.m5 != null}">
                    ${theClass.m5.academicclasses.academicClass}
                    <c:if test="${theClass.m5.subject.contains('-')}">
                        ${theClass.m5.subject.substring(theClass.m5.subject.length()-2,theClass.m5.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.m5.subject.contains('-')}">
                            ${theClass.m5.subject.substring(0,theClass.m5.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.m5.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.m5.teacher.code}
                    <c:if test="${theClass.m5.altTeacher != null}">
                        + ${theClass.m5.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.tue5 != null}">
                    ${theClass.tue5.academicclasses.academicClass}
                    <c:if test="${theClass.tue5.subject.contains('-')}">
                        ${theClass.tue5.subject.substring(theClass.tue5.subject.length()-2,theClass.tue5.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.tue5.subject.contains('-')}">
                            ${theClass.tue5.subject.substring(0,theClass.tue5.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.tue5.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.tue5.teacher.code}
                    <c:if test="${theClass.tue5.altTeacher != null}">
                        + ${theClass.tue5.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.w5 != null}">
                    ${theClass.w5.academicclasses.academicClass}
                    <c:if test="${theClass.w5.subject.contains('-')}">
                        ${theClass.w5.subject.substring(theClass.w5.subject.length()-2,theClass.w5.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.w5.subject.contains('-')}">
                            ${theClass.w5.subject.substring(0,theClass.w5.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.w5.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.w5.teacher.code}
                    <c:if test="${theClass.w5.altTeacher != null}">
                        + ${theClass.w5.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.th5 != null}">
                    ${theClass.th5.academicclasses.academicClass}
                    <c:if test="${theClass.th5.subject.contains('-')}">
                        ${theClass.th5.subject.substring(theClass.th5.subject.length()-2,theClass.th5.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.th5.subject.contains('-')}">
                            ${theClass.th5.subject.substring(0,theClass.th5.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.th5.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.th5.teacher.code}
                    <c:if test="${theClass.th5.altTeacher != null}">
                        + ${theClass.th5.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.f5 != null}">
                    ${theClass.f5.academicclasses.academicClass}
                    <c:if test="${theClass.f5.subject.contains('-')}">
                        ${theClass.f5.subject.substring(theClass.f5.subject.length()-2,theClass.f5.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.f5.subject.contains('-')}">
                            ${theClass.f5.subject.substring(0,theClass.f5.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.f5.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.f5.teacher.code}
                    <c:if test="${theClass.f5.altTeacher != null}">
                        + ${theClass.f5.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.s5 != null}">
                    ${theClass.s5.academicclasses.academicClass}
                    <c:if test="${theClass.s5.subject.contains('-')}">
                        ${theClass.s5.subject.substring(theClass.s5.subject.length()-2,theClass.s5.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.s5.subject.contains('-')}">
                            ${theClass.s5.subject.substring(0,theClass.s5.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.s5.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.s5.teacher.code}
                    <c:if test="${theClass.s5.altTeacher != null}">
                        + ${theClass.s5.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
    </tr>


    <tr>
        <td>3:20 to 4:20</td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.m6 != null}">
                    ${theClass.m6.academicclasses.academicClass}
                    <c:if test="${theClass.m6.subject.contains('-')}">
                        ${theClass.m6.subject.substring(theClass.m6.subject.length()-2,theClass.m6.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.m6.subject.contains('-')}">
                            ${theClass.m6.subject.substring(0,theClass.m6.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.m6.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.m6.teacher.code}
                    <c:if test="${theClass.m6.altTeacher != null}">
                        + ${theClass.m6.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.tue6 != null}">
                    ${theClass.tue6.academicclasses.academicClass}
                    <c:if test="${theClass.tue6.subject.contains('-')}">
                        ${theClass.tue6.subject.substring(theClass.tue6.subject.length()-2,theClass.tue6.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.tue6.subject.contains('-')}">
                            ${theClass.tue6.subject.substring(0,theClass.tue6.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.tue6.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.tue6.teacher.code}
                    <c:if test="${theClass.tue6.altTeacher != null}">
                        + ${theClass.tue6.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.w6 != null}">
                    ${theClass.w6.academicclasses.academicClass}
                    <c:if test="${theClass.w6.subject.contains('-')}">
                        ${theClass.w6.subject.substring(theClass.w6.subject.length()-2,theClass.w6.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.w6.subject.contains('-')}">
                            ${theClass.w6.subject.substring(0,theClass.w6.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.w6.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.w6.teacher.code}
                    <c:if test="${theClass.w6.altTeacher != null}">
                        + ${theClass.w6.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.th6 != null}">
                    ${theClass.th6.academicclasses.academicClass}
                    <c:if test="${theClass.th6.subject.contains('-')}">
                        ${theClass.th6.subject.substring(theClass.th6.subject.length()-2,theClass.th6.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.th6.subject.contains('-')}">
                            ${theClass.th6.subject.substring(0,theClass.th6.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.th6.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.th6.teacher.code}
                    <c:if test="${theClass.th6.altTeacher != null}">
                        + ${theClass.th6.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.f6 != null}">
                    ${theClass.f6.academicclasses.academicClass}
                    <c:if test="${theClass.f6.subject.contains('-')}">
                        ${theClass.f6.subject.substring(theClass.f6.subject.length()-2,theClass.f6.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.f6.subject.contains('-')}">
                            ${theClass.f6.subject.substring(0,theClass.f6.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.f6.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.f6.teacher.code}
                    <c:if test="${theClass.f6.altTeacher != null}">
                        + ${theClass.f6.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theClass.s6 != null}">
                    ${theClass.s6.academicclasses.academicClass}
                    <c:if test="${theClass.s6.subject.contains('-')}">
                        ${theClass.s6.subject.substring(theClass.s6.subject.length()-2,theClass.s6.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theClass.s6.subject.contains('-')}">
                            ${theClass.s6.subject.substring(0,theClass.s6.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theClass.s6.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theClass.s6.teacher.code}
                    <c:if test="${theClass.s6.altTeacher != null}">
                        + ${theClass.s6.altTeacher.code}
                    </c:if>
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
    </tr>
</table>

</body>
</html>