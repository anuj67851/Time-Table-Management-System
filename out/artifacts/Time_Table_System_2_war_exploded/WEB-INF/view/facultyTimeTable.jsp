<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="timetable.entity.Teacher" %>
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
    Teacher teacher = (Teacher) request.getAttribute("theTeacher");
    out.print(teacher.getFirstname() + "  " + teacher.getLastname() + " (" + teacher.getCode() + ")");
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
                <c:when test="${theTeacher.m1 != null}">
                    ${theTeacher.m1.academicclasses.academicClass}
                    <c:if test="${theTeacher.m1.subject.contains('-')}">
                        ${theTeacher.m1.subject.substring(theTeacher.m1.subject.length()-2,theTeacher.m1.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.m1.subject.contains('-')}">
                            ${theTeacher.m1.subject.substring(0,theTeacher.m1.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.m1.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.m1.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.tue1 != null}">
                    ${theTeacher.tue1.academicclasses.academicClass}
                    <c:if test="${theTeacher.tue1.subject.contains('-')}">
                        ${theTeacher.tue1.subject.substring(theTeacher.tue1.subject.length()-2,theTeacher.tue1.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.tue1.subject.contains('-')}">
                            ${theTeacher.tue1.subject.substring(0,theTeacher.tue1.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.tue1.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.tue1.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.w1 != null}">
                    ${theTeacher.w1.academicclasses.academicClass}
                    <c:if test="${theTeacher.w1.subject.contains('-')}">
                        ${theTeacher.w1.subject.substring(theTeacher.w1.subject.length()-2,theTeacher.w1.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.w1.subject.contains('-')}">
                            ${theTeacher.w1.subject.substring(0,theTeacher.w1.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.w1.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.w1.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.th1 != null}">
                    ${theTeacher.th1.academicclasses.academicClass}
                    <c:if test="${theTeacher.th1.subject.contains('-')}">
                        ${theTeacher.th1.subject.substring(theTeacher.th1.subject.length()-2,theTeacher.th1.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.th1.subject.contains('-')}">
                            ${theTeacher.th1.subject.substring(0,theTeacher.th1.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.th1.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.th1.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.f1 != null}">
                    ${theTeacher.f1.academicclasses.academicClass}
                    <c:if test="${theTeacher.f1.subject.contains('-')}">
                        ${theTeacher.f1.subject.substring(theTeacher.f1.subject.length()-2,theTeacher.f1.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.f1.subject.contains('-')}">
                            ${theTeacher.f1.subject.substring(0,theTeacher.f1.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.f1.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.f1.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.s1 != null}">
                    ${theTeacher.s1.academicclasses.academicClass}
                    <c:if test="${theTeacher.s1.subject.contains('-')}">
                        ${theTeacher.s1.subject.substring(theTeacher.s1.subject.length()-2,theTeacher.s1.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.s1.subject.contains('-')}">
                            ${theTeacher.s1.subject.substring(0,theTeacher.s1.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.s1.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.s1.classroom.classroom}
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
                <c:when test="${theTeacher.m2 != null}">
                    ${theTeacher.m2.academicclasses.academicClass}
                    <c:if test="${theTeacher.m2.subject.contains('-')}">
                        ${theTeacher.m2.subject.substring(theTeacher.m2.subject.length()-2,theTeacher.m2.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.m2.subject.contains('-')}">
                            ${theTeacher.m2.subject.substring(0,theTeacher.m2.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.m2.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.m2.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.tue2 != null}">
                    ${theTeacher.tue2.academicclasses.academicClass}
                    <c:if test="${theTeacher.tue2.subject.contains('-')}">
                        ${theTeacher.tue2.subject.substring(theTeacher.tue2.subject.length()-2,theTeacher.tue2.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.tue2.subject.contains('-')}">
                            ${theTeacher.tue2.subject.substring(0,theTeacher.tue2.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.tue2.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.tue2.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.w2 != null}">
                    ${theTeacher.w2.academicclasses.academicClass}
                    <c:if test="${theTeacher.w2.subject.contains('-')}">
                        ${theTeacher.w2.subject.substring(theTeacher.w2.subject.length()-2,theTeacher.w2.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.w2.subject.contains('-')}">
                            ${theTeacher.w2.subject.substring(0,theTeacher.w2.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.w2.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.w2.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.th2 != null}">
                    ${theTeacher.th2.academicclasses.academicClass}
                    <c:if test="${theTeacher.th2.subject.contains('-')}">
                        ${theTeacher.th2.subject.substring(theTeacher.th2.subject.length()-2,theTeacher.th2.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.th2.subject.contains('-')}">
                            ${theTeacher.th2.subject.substring(0,theTeacher.th2.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.th2.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.th2.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.f2 != null}">
                    ${theTeacher.f2.academicclasses.academicClass}
                    <c:if test="${theTeacher.f2.subject.contains('-')}">
                        ${theTeacher.f2.subject.substring(theTeacher.f2.subject.length()-2,theTeacher.f2.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.f2.subject.contains('-')}">
                            ${theTeacher.f2.subject.substring(0,theTeacher.f2.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.f2.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.f2.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.s2 != null}">
                    ${theTeacher.s2.academicclasses.academicClass}
                    <c:if test="${theTeacher.s2.subject.contains('-')}">
                        ${theTeacher.s2.subject.substring(theTeacher.s2.subject.length()-2,theTeacher.s2.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.s2.subject.contains('-')}">
                            ${theTeacher.s2.subject.substring(0,theTeacher.s2.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.s2.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.s2.classroom.classroom}
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
                <c:when test="${theTeacher.m3 != null}">
                    ${theTeacher.m3.academicclasses.academicClass}
                    <c:if test="${theTeacher.m3.subject.contains('-')}">
                        ${theTeacher.m3.subject.substring(theTeacher.m3.subject.length()-2,theTeacher.m3.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.m3.subject.contains('-')}">
                            ${theTeacher.m3.subject.substring(0,theTeacher.m3.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.m3.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.m3.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.tue3 != null}">
                    ${theTeacher.tue3.academicclasses.academicClass}
                    <c:if test="${theTeacher.tue3.subject.contains('-')}">
                        ${theTeacher.tue3.subject.substring(theTeacher.tue3.subject.length()-2,theTeacher.tue3.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.tue3.subject.contains('-')}">
                            ${theTeacher.tue3.subject.substring(0,theTeacher.tue3.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.tue3.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.tue3.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.w3 != null}">
                    ${theTeacher.w3.academicclasses.academicClass}
                    <c:if test="${theTeacher.w3.subject.contains('-')}">
                        ${theTeacher.w3.subject.substring(theTeacher.w3.subject.length()-2,theTeacher.w3.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.w3.subject.contains('-')}">
                            ${theTeacher.w3.subject.substring(0,theTeacher.w3.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.w3.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.w3.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.th3 != null}">
                    ${theTeacher.th3.academicclasses.academicClass}
                    <c:if test="${theTeacher.th3.subject.contains('-')}">
                        ${theTeacher.th3.subject.substring(theTeacher.th3.subject.length()-2,theTeacher.th3.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.th3.subject.contains('-')}">
                            ${theTeacher.th3.subject.substring(0,theTeacher.th3.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.th3.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.th3.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.f3 != null}">
                    ${theTeacher.f3.academicclasses.academicClass}
                    <c:if test="${theTeacher.f3.subject.contains('-')}">
                        ${theTeacher.f3.subject.substring(theTeacher.f3.subject.length()-2,theTeacher.f3.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.f3.subject.contains('-')}">
                            ${theTeacher.f3.subject.substring(0,theTeacher.f3.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.f3.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.f3.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.s3 != null}">
                    ${theTeacher.s3.academicclasses.academicClass}
                    <c:if test="${theTeacher.s3.subject.contains('-')}">
                        ${theTeacher.s3.subject.substring(theTeacher.s3.subject.length()-2,theTeacher.s3.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.s3.subject.contains('-')}">
                            ${theTeacher.s3.subject.substring(0,theTeacher.s3.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.s3.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.s3.classroom.classroom}
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
                <c:when test="${theTeacher.m4 != null}">
                    ${theTeacher.m4.academicclasses.academicClass}
                    <c:if test="${theTeacher.m4.subject.contains('-')}">
                        ${theTeacher.m4.subject.substring(theTeacher.m4.subject.length()-2,theTeacher.m4.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.m4.subject.contains('-')}">
                            ${theTeacher.m4.subject.substring(0,theTeacher.m4.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.m4.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.m4.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.tue4 != null}">
                    ${theTeacher.tue4.academicclasses.academicClass}
                    <c:if test="${theTeacher.tue4.subject.contains('-')}">
                        ${theTeacher.tue4.subject.substring(theTeacher.tue4.subject.length()-2,theTeacher.tue4.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.tue4.subject.contains('-')}">
                            ${theTeacher.tue4.subject.substring(0,theTeacher.tue4.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.tue4.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.tue4.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.w4 != null}">
                    ${theTeacher.w4.academicclasses.academicClass}
                    <c:if test="${theTeacher.w4.subject.contains('-')}">
                        ${theTeacher.w4.subject.substring(theTeacher.w4.subject.length()-2,theTeacher.w4.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.w4.subject.contains('-')}">
                            ${theTeacher.w4.subject.substring(0,theTeacher.w4.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.w4.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.w4.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.th4 != null}">
                    ${theTeacher.th4.academicclasses.academicClass}
                    <c:if test="${theTeacher.th4.subject.contains('-')}">
                        ${theTeacher.th4.subject.substring(theTeacher.th4.subject.length()-2,theTeacher.th4.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.th4.subject.contains('-')}">
                            ${theTeacher.th4.subject.substring(0,theTeacher.th4.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.th4.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.th4.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.f4 != null}">
                    ${theTeacher.f4.academicclasses.academicClass}
                    <c:if test="${theTeacher.f4.subject.contains('-')}">
                        ${theTeacher.f4.subject.substring(theTeacher.f4.subject.length()-2,theTeacher.f4.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.f4.subject.contains('-')}">
                            ${theTeacher.f4.subject.substring(0,theTeacher.f4.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.f4.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.f4.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.s4 != null}">
                    ${theTeacher.s4.academicclasses.academicClass}
                    <c:if test="${theTeacher.s4.subject.contains('-')}">
                        ${theTeacher.s4.subject.substring(theTeacher.s4.subject.length()-2,theTeacher.s4.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.s4.subject.contains('-')}">
                            ${theTeacher.s4.subject.substring(0,theTeacher.s4.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.s4.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.s4.classroom.classroom}
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
                <c:when test="${theTeacher.m5 != null}">
                    ${theTeacher.m5.academicclasses.academicClass}
                    <c:if test="${theTeacher.m5.subject.contains('-')}">
                        ${theTeacher.m5.subject.substring(theTeacher.m5.subject.length()-2,theTeacher.m5.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.m5.subject.contains('-')}">
                            ${theTeacher.m5.subject.substring(0,theTeacher.m5.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.m5.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.m5.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.tue5 != null}">
                    ${theTeacher.tue5.academicclasses.academicClass}
                    <c:if test="${theTeacher.tue5.subject.contains('-')}">
                        ${theTeacher.tue5.subject.substring(theTeacher.tue5.subject.length()-2,theTeacher.tue5.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.tue5.subject.contains('-')}">
                            ${theTeacher.tue5.subject.substring(0,theTeacher.tue5.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.tue5.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.tue5.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.w5 != null}">
                    ${theTeacher.w5.academicclasses.academicClass}
                    <c:if test="${theTeacher.w5.subject.contains('-')}">
                        ${theTeacher.w5.subject.substring(theTeacher.w5.subject.length()-2,theTeacher.w5.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.w5.subject.contains('-')}">
                            ${theTeacher.w5.subject.substring(0,theTeacher.w5.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.w5.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.w5.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.th5 != null}">
                    ${theTeacher.th5.academicclasses.academicClass}
                    <c:if test="${theTeacher.th5.subject.contains('-')}">
                        ${theTeacher.th5.subject.substring(theTeacher.th5.subject.length()-2,theTeacher.th5.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.th5.subject.contains('-')}">
                            ${theTeacher.th5.subject.substring(0,theTeacher.th5.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.th5.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.th5.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.f5 != null}">
                    ${theTeacher.f5.academicclasses.academicClass}
                    <c:if test="${theTeacher.f5.subject.contains('-')}">
                        ${theTeacher.f5.subject.substring(theTeacher.f5.subject.length()-2,theTeacher.f5.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.f5.subject.contains('-')}">
                            ${theTeacher.f5.subject.substring(0,theTeacher.f5.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.f5.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.f5.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.s5 != null}">
                    ${theTeacher.s5.academicclasses.academicClass}
                    <c:if test="${theTeacher.s5.subject.contains('-')}">
                        ${theTeacher.s5.subject.substring(theTeacher.s5.subject.length()-2,theTeacher.s5.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.s5.subject.contains('-')}">
                            ${theTeacher.s5.subject.substring(0,theTeacher.s5.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.s5.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.s5.classroom.classroom}
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
                <c:when test="${theTeacher.m6 != null}">
                    ${theTeacher.m6.academicclasses.academicClass}
                    <c:if test="${theTeacher.m6.subject.contains('-')}">
                        ${theTeacher.m6.subject.substring(theTeacher.m6.subject.length()-2,theTeacher.m6.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.m6.subject.contains('-')}">
                            ${theTeacher.m6.subject.substring(0,theTeacher.m6.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.m6.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.m6.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.tue6 != null}">
                    ${theTeacher.tue6.academicclasses.academicClass}
                    <c:if test="${theTeacher.tue6.subject.contains('-')}">
                        ${theTeacher.tue6.subject.substring(theTeacher.tue6.subject.length()-2,theTeacher.tue6.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.tue6.subject.contains('-')}">
                            ${theTeacher.tue6.subject.substring(0,theTeacher.tue6.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.tue6.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.tue6.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.w6 != null}">
                    ${theTeacher.w6.academicclasses.academicClass}
                    <c:if test="${theTeacher.w6.subject.contains('-')}">
                        ${theTeacher.w6.subject.substring(theTeacher.w6.subject.length()-2,theTeacher.w6.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.w6.subject.contains('-')}">
                            ${theTeacher.w6.subject.substring(0,theTeacher.w6.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.w6.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.w6.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.th6 != null}">
                    ${theTeacher.th6.academicclasses.academicClass}
                    <c:if test="${theTeacher.th6.subject.contains('-')}">
                        ${theTeacher.th6.subject.substring(theTeacher.th6.subject.length()-2,theTeacher.th6.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.th6.subject.contains('-')}">
                            ${theTeacher.th6.subject.substring(0,theTeacher.th6.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.th6.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.th6.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.f6 != null}">
                    ${theTeacher.f6.academicclasses.academicClass}
                    <c:if test="${theTeacher.f6.subject.contains('-')}">
                        ${theTeacher.f6.subject.substring(theTeacher.f6.subject.length()-2,theTeacher.f6.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.f6.subject.contains('-')}">
                            ${theTeacher.f6.subject.substring(0,theTeacher.f6.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.f6.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.f6.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
        <td colspan="2">
            <c:choose>
                <c:when test="${theTeacher.s6 != null}">
                    ${theTeacher.s6.academicclasses.academicClass}
                    <c:if test="${theTeacher.s6.subject.contains('-')}">
                        ${theTeacher.s6.subject.substring(theTeacher.s6.subject.length()-2,theTeacher.s6.subject.length())}
                    </c:if>
                    <br/>
                    <c:choose>
                        <c:when test="${theTeacher.s6.subject.contains('-')}">
                            ${theTeacher.s6.subject.substring(0,theTeacher.s6.subject.length()-2)}
                        </c:when>
                        <c:otherwise>
                            ${theTeacher.s6.subject}
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    ${theTeacher.s6.classroom.classroom}
                </c:when>
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </td>
    </tr>

</table>
</body>
</html>