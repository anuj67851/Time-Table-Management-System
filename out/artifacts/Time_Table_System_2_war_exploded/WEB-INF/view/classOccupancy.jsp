<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Classroom</title>
    <style>
        td {
            text-align: center;
            height: 50px;
            width: 50px;
        }
        table{
            table-layout: auto;
            width: ${(allClass.size()+2)*5}%;
        }
    </style>
</head>
<body>
<table border="1">
    <tr>
        <td rowspan="1">DAY</td>
        <td rowspan="1">TIME</td>
        <c:forEach var="tempClass" items="${allClass}">
            <td>${tempClass.classroom}</td>
        </c:forEach>
    </tr>

    <!--Monday-->

    <tr>
        <td rowspan="8">MON</td>
        <td>9:10 to 10:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.m1 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.m1.academicclasses.academicClass}
                        <c:if test="${tempClass.m1.subject.contains('-')}">
                            ${tempClass.m1.subject.substring(tempClass.m1.subject.length()-2,tempClass.m1.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.m1.subject.contains('-')}">
                                ${tempClass.m1.subject.substring(0,tempClass.m1.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.m1.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.m1.teacher.code}
                        <c:if test="${tempClass.m1.altTeacher != null}">
                            <br>+ <br>${tempClass.m1.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>10:10 to 11:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.m2 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.m2.academicclasses.academicClass}
                        <c:if test="${tempClass.m2.subject.contains('-')}">
                            ${tempClass.m2.subject.substring(tempClass.m2.subject.length()-2,tempClass.m2.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.m2.subject.contains('-')}">
                                ${tempClass.m2.subject.substring(0,tempClass.m2.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.m2.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.m2.teacher.code}
                        <c:if test="${tempClass.m2.altTeacher != null}">
                            <br>+ <br>${tempClass.m2.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>11:10 to 12:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>12:10 to 1:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.m3 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.m3.academicclasses.academicClass}
                        <c:if test="${tempClass.m3.subject.contains('-')}">
                            ${tempClass.m3.subject.substring(tempClass.m3.subject.length()-2,tempClass.m3.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.m3.subject.contains('-')}">
                                ${tempClass.m3.subject.substring(0,tempClass.m3.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.m3.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.m3.teacher.code}
                        <c:if test="${tempClass.m3.altTeacher != null}">
                            <br>+ <br>${tempClass.m3.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>1:10 to 2:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.m4 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.m4.academicclasses.academicClass}
                        <c:if test="${tempClass.m4.subject.contains('-')}">
                            ${tempClass.m4.subject.substring(tempClass.m4.subject.length()-2,tempClass.m4.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.m4.subject.contains('-')}">
                                ${tempClass.m4.subject.substring(0,tempClass.m4.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.m4.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.m4.teacher.code}
                        <c:if test="${tempClass.m4.altTeacher != null}">
                            <br>+ <br>${tempClass.m4.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:10 to 2:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 3:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.m5 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.m5.academicclasses.academicClass}
                        <c:if test="${tempClass.m5.subject.contains('-')}">
                            ${tempClass.m5.subject.substring(tempClass.m5.subject.length()-2,tempClass.m5.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.m5.subject.contains('-')}">
                                ${tempClass.m5.subject.substring(0,tempClass.m5.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.m5.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.m5.teacher.code}
                        <c:if test="${tempClass.m5.altTeacher != null}">
                            <br>+ <br>${tempClass.m5.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 4:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.m6 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.m6.academicclasses.academicClass}
                        <c:if test="${tempClass.m6.subject.contains('-')}">
                            ${tempClass.m6.subject.substring(tempClass.m6.subject.length()-2,tempClass.m6.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.m6.subject.contains('-')}">
                                ${tempClass.m6.subject.substring(0,tempClass.m6.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.m6.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.m6.teacher.code}
                        <c:if test="${tempClass.m6.altTeacher != null}">
                            <br>+ <br>${tempClass.m6.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>

    <tr style="height: 10px;"></tr>


    <!--Tuesday-->

    <tr>
        <td rowspan="8">TUE</td>
        <td>9:10 to 10:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.tue1 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.tue1.academicclasses.academicClass}
                        <c:if test="${tempClass.tue1.subject.contains('-')}">
                            ${tempClass.tue1.subject.substring(tempClass.tue1.subject.length()-2,tempClass.tue1.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.tue1.subject.contains('-')}">
                                ${tempClass.tue1.subject.substring(0,tempClass.tue1.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.tue1.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.tue1.teacher.code}
                        <c:if test="${tempClass.tue1.altTeacher != null}">
                            <br>+ <br>${tempClass.tue1.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>10:10 to 11:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.tue2 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.tue2.academicclasses.academicClass}
                        <c:if test="${tempClass.tue2.subject.contains('-')}">
                            ${tempClass.tue2.subject.substring(tempClass.tue2.subject.length()-2,tempClass.tue2.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.tue2.subject.contains('-')}">
                                ${tempClass.tue2.subject.substring(0,tempClass.tue2.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.tue2.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.tue2.teacher.code}
                        <c:if test="${tempClass.tue2.altTeacher != null}">
                            <br>+ <br>${tempClass.tue2.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>11:10 to 12:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>12:10 to 1:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.tue3 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.tue3.academicclasses.academicClass}
                        <c:if test="${tempClass.tue3.subject.contains('-')}">
                            ${tempClass.tue3.subject.substring(tempClass.tue3.subject.length()-2,tempClass.tue3.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.tue3.subject.contains('-')}">
                                ${tempClass.tue3.subject.substring(0,tempClass.tue3.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.tue3.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.tue3.teacher.code}
                        <c:if test="${tempClass.tue3.altTeacher != null}">
                            <br>+ <br>${tempClass.tue3.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>1:10 to 2:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.tue4 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.tue4.academicclasses.academicClass}
                        <c:if test="${tempClass.tue4.subject.contains('-')}">
                            ${tempClass.tue4.subject.substring(tempClass.tue4.subject.length()-2,tempClass.tue4.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.tue4.subject.contains('-')}">
                                ${tempClass.tue4.subject.substring(0,tempClass.tue4.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.tue4.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.tue4.teacher.code}
                        <c:if test="${tempClass.tue4.altTeacher != null}">
                            <br>+ <br>${tempClass.tue4.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:10 to 2:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 3:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.tue5 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.tue5.academicclasses.academicClass}
                        <c:if test="${tempClass.tue5.subject.contains('-')}">
                            ${tempClass.tue5.subject.substring(tempClass.tue5.subject.length()-2,tempClass.tue5.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.tue5.subject.contains('-')}">
                                ${tempClass.tue5.subject.substring(0,tempClass.tue5.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.tue5.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.tue5.teacher.code}
                        <c:if test="${tempClass.tue5.altTeacher != null}">
                            <br>+ <br>${tempClass.tue5.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 4:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.tue6 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.tue6.academicclasses.academicClass}
                        <c:if test="${tempClass.tue6.subject.contains('-')}">
                            ${tempClass.tue6.subject.substring(tempClass.tue6.subject.length()-2,tempClass.tue6.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.tue6.subject.contains('-')}">
                                ${tempClass.tue6.subject.substring(0,tempClass.tue6.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.tue6.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.tue6.teacher.code}
                        <c:if test="${tempClass.tue6.altTeacher != null}">
                            <br>+ <br>${tempClass.tue6.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>

    <tr style="height: 10px;"></tr>

    <!--Wednesday-->

    <tr>
        <td rowspan="8">WED</td>
        <td>9:10 to 10:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.w1 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.w1.academicclasses.academicClass}
                        <c:if test="${tempClass.w1.subject.contains('-')}">
                            ${tempClass.w1.subject.substring(tempClass.w1.subject.length()-2,tempClass.w1.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.w1.subject.contains('-')}">
                                ${tempClass.w1.subject.substring(0,tempClass.w1.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.w1.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.w1.teacher.code}
                        <c:if test="${tempClass.w1.altTeacher != null}">
                            <br>+ <br>${tempClass.w1.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>10:10 to 11:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.w2 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.w2.academicclasses.academicClass}
                        <c:if test="${tempClass.w2.subject.contains('-')}">
                            ${tempClass.w2.subject.substring(tempClass.w2.subject.length()-2,tempClass.w2.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.w2.subject.contains('-')}">
                                ${tempClass.w2.subject.substring(0,tempClass.w2.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.w2.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.w2.teacher.code}
                        <c:if test="${tempClass.w2.altTeacher != null}">
                            <br>+ <br>${tempClass.w2.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>11:10 to 12:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>12:10 to 1:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.w3 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.w3.academicclasses.academicClass}
                        <c:if test="${tempClass.w3.subject.contains('-')}">
                            ${tempClass.w3.subject.substring(tempClass.w3.subject.length()-2,tempClass.w3.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.w3.subject.contains('-')}">
                                ${tempClass.w3.subject.substring(0,tempClass.w3.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.w3.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.w3.teacher.code}
                        <c:if test="${tempClass.w3.altTeacher != null}">
                            <br>+ <br>${tempClass.w3.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>1:10 to 2:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.w4 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.w4.academicclasses.academicClass}
                        <c:if test="${tempClass.w4.subject.contains('-')}">
                            ${tempClass.w4.subject.substring(tempClass.w4.subject.length()-2,tempClass.w4.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.w4.subject.contains('-')}">
                                ${tempClass.w4.subject.substring(0,tempClass.w4.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.w4.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.w4.teacher.code}
                        <c:if test="${tempClass.w4.altTeacher != null}">
                            <br>+ <br>${tempClass.w4.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:10 to 2:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 3:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.w5 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.w5.academicclasses.academicClass}
                        <c:if test="${tempClass.w5.subject.contains('-')}">
                            ${tempClass.w5.subject.substring(tempClass.w5.subject.length()-2,tempClass.w5.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.w5.subject.contains('-')}">
                                ${tempClass.w5.subject.substring(0,tempClass.w5.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.w5.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.w5.teacher.code}
                        <c:if test="${tempClass.w5.altTeacher != null}">
                            <br>+ <br>${tempClass.w5.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 4:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.w6 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.w6.academicclasses.academicClass}
                        <c:if test="${tempClass.w6.subject.contains('-')}">
                            ${tempClass.w6.subject.substring(tempClass.w6.subject.length()-2,tempClass.w6.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.w6.subject.contains('-')}">
                                ${tempClass.w6.subject.substring(0,tempClass.w6.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.w6.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.w6.teacher.code}
                        <c:if test="${tempClass.w6.altTeacher != null}">
                            <br>+ <br>${tempClass.w6.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>

    <tr style="height: 10px;"></tr>

    <!--Thursday-->

    <tr>
        <td rowspan="8">THU</td>
        <td>9:10 to 10:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.th1 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.th1.academicclasses.academicClass}
                        <c:if test="${tempClass.th1.subject.contains('-')}">
                            ${tempClass.th1.subject.substring(tempClass.th1.subject.length()-2,tempClass.th1.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.th1.subject.contains('-')}">
                                ${tempClass.th1.subject.substring(0,tempClass.th1.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.th1.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.th1.teacher.code}
                        <c:if test="${tempClass.th1.altTeacher != null}">
                            <br>+ <br>${tempClass.th1.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>10:10 to 11:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.th2 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.th2.academicclasses.academicClass}
                        <c:if test="${tempClass.th2.subject.contains('-')}">
                            ${tempClass.th2.subject.substring(tempClass.th2.subject.length()-2,tempClass.th2.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.th2.subject.contains('-')}">
                                ${tempClass.th2.subject.substring(0,tempClass.th2.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.th2.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.th2.teacher.code}
                        <c:if test="${tempClass.th2.altTeacher != null}">
                            <br>+ <br>${tempClass.th2.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>11:10 to 12:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>12:10 to 1:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.th3 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.th3.academicclasses.academicClass}
                        <c:if test="${tempClass.th3.subject.contains('-')}">
                            ${tempClass.th3.subject.substring(tempClass.th3.subject.length()-2,tempClass.th3.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.th3.subject.contains('-')}">
                                ${tempClass.th3.subject.substring(0,tempClass.th3.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.th3.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.th3.teacher.code}
                        <c:if test="${tempClass.th3.altTeacher != null}">
                            <br>+ <br>${tempClass.th3.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>1:10 to 2:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.th4 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.th4.academicclasses.academicClass}
                        <c:if test="${tempClass.th4.subject.contains('-')}">
                            ${tempClass.th4.subject.substring(tempClass.th4.subject.length()-2,tempClass.th4.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.th4.subject.contains('-')}">
                                ${tempClass.th4.subject.substring(0,tempClass.th4.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.th4.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.th4.teacher.code}
                        <c:if test="${tempClass.th4.altTeacher != null}">
                            <br>+ <br>${tempClass.th4.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:10 to 2:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 3:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.th5 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.th5.academicclasses.academicClass}
                        <c:if test="${tempClass.th5.subject.contains('-')}">
                            ${tempClass.th5.subject.substring(tempClass.th5.subject.length()-2,tempClass.th5.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.th5.subject.contains('-')}">
                                ${tempClass.th5.subject.substring(0,tempClass.th5.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.th5.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.th5.teacher.code}
                        <c:if test="${tempClass.th5.altTeacher != null}">
                            <br>+ <br>${tempClass.th5.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 4:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.th6 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.th6.academicclasses.academicClass}
                        <c:if test="${tempClass.th6.subject.contains('-')}">
                            ${tempClass.th6.subject.substring(tempClass.th6.subject.length()-2,tempClass.th6.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.th6.subject.contains('-')}">
                                ${tempClass.th6.subject.substring(0,tempClass.th6.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.th6.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.th6.teacher.code}
                        <c:if test="${tempClass.th6.altTeacher != null}">
                            <br>+ <br>${tempClass.th6.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>

    <tr style="height: 10px;"></tr>

    <!--Friday-->

    <tr>
        <td rowspan="8">FRI</td>
        <td>9:10 to 10:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.f1 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.f1.academicclasses.academicClass}
                        <c:if test="${tempClass.f1.subject.contains('-')}">
                            ${tempClass.f1.subject.substring(tempClass.f1.subject.length()-2,tempClass.f1.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.f1.subject.contains('-')}">
                                ${tempClass.f1.subject.substring(0,tempClass.f1.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.f1.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.f1.teacher.code}
                        <c:if test="${tempClass.f1.altTeacher != null}">
                            <br>+ <br>${tempClass.f1.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>10:10 to 11:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.f2 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.f2.academicclasses.academicClass}
                        <c:if test="${tempClass.f2.subject.contains('-')}">
                            ${tempClass.f2.subject.substring(tempClass.f2.subject.length()-2,tempClass.f2.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.f2.subject.contains('-')}">
                                ${tempClass.f2.subject.substring(0,tempClass.f2.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.f2.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.f2.teacher.code}
                        <c:if test="${tempClass.f2.altTeacher != null}">
                            <br>+ <br>${tempClass.f2.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>11:10 to 12:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>12:10 to 1:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.f3 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.f3.academicclasses.academicClass}
                        <c:if test="${tempClass.f3.subject.contains('-')}">
                            ${tempClass.f3.subject.substring(tempClass.f3.subject.length()-2,tempClass.f3.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.f3.subject.contains('-')}">
                                ${tempClass.f3.subject.substring(0,tempClass.f3.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.f3.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.f3.teacher.code}
                        <c:if test="${tempClass.f3.altTeacher != null}">
                            <br>+ <br>${tempClass.f3.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>1:10 to 2:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.f4 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.f4.academicclasses.academicClass}
                        <c:if test="${tempClass.f4.subject.contains('-')}">
                            ${tempClass.f4.subject.substring(tempClass.f4.subject.length()-2,tempClass.f4.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.f4.subject.contains('-')}">
                                ${tempClass.f4.subject.substring(0,tempClass.f4.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.f4.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.f4.teacher.code}
                        <c:if test="${tempClass.f4.altTeacher != null}">
                            <br>+ <br>${tempClass.f4.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:10 to 2:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 3:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.f5 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.f5.academicclasses.academicClass}
                        <c:if test="${tempClass.f5.subject.contains('-')}">
                            ${tempClass.f5.subject.substring(tempClass.f5.subject.length()-2,tempClass.f5.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.f5.subject.contains('-')}">
                                ${tempClass.f5.subject.substring(0,tempClass.f5.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.f5.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.f5.teacher.code}
                        <c:if test="${tempClass.f5.altTeacher != null}">
                            <br>+ <br>${tempClass.f5.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 4:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.f6 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.f6.academicclasses.academicClass}
                        <c:if test="${tempClass.f6.subject.contains('-')}">
                            ${tempClass.f6.subject.substring(tempClass.f6.subject.length()-2,tempClass.f6.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.f6.subject.contains('-')}">
                                ${tempClass.f6.subject.substring(0,tempClass.f6.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.f6.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.f6.teacher.code}
                        <c:if test="${tempClass.f6.altTeacher != null}">
                            <br>+ <br>${tempClass.f6.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>

    <tr style="height: 10px;"></tr>

    <!--Saturday-->

    <tr>
        <td rowspan="8">SAT</td>
        <td>9:10 to 10:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.s1 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.s1.academicclasses.academicClass}
                        <c:if test="${tempClass.s1.subject.contains('-')}">
                            ${tempClass.s1.subject.substring(tempClass.s1.subject.length()-2,tempClass.s1.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.s1.subject.contains('-')}">
                                ${tempClass.s1.subject.substring(0,tempClass.s1.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.s1.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.s1.teacher.code}
                        <c:if test="${tempClass.s1.altTeacher != null}">
                            <br>+ <br>${tempClass.s1.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>10:10 to 11:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.s2 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.s2.academicclasses.academicClass}
                        <c:if test="${tempClass.s2.subject.contains('-')}">
                            ${tempClass.s2.subject.substring(tempClass.s2.subject.length()-2,tempClass.s2.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.s2.subject.contains('-')}">
                                ${tempClass.s2.subject.substring(0,tempClass.s2.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.s2.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.s2.teacher.code}
                        <c:if test="${tempClass.s2.altTeacher != null}">
                            <br>+ <br>${tempClass.s2.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>11:10 to 12:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>12:10 to 1:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.s3 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.s3.academicclasses.academicClass}
                        <c:if test="${tempClass.s3.subject.contains('-')}">
                            ${tempClass.s3.subject.substring(tempClass.s3.subject.length()-2,tempClass.s3.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.s3.subject.contains('-')}">
                                ${tempClass.s3.subject.substring(0,tempClass.s3.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.s3.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.s3.teacher.code}
                        <c:if test="${tempClass.s3.altTeacher != null}">
                            <br>+ <br>${tempClass.s3.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>1:10 to 2:10</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.s4 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.s4.academicclasses.academicClass}
                        <c:if test="${tempClass.s4.subject.contains('-')}">
                            ${tempClass.s4.subject.substring(tempClass.s4.subject.length()-2,tempClass.s4.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.s4.subject.contains('-')}">
                                ${tempClass.s4.subject.substring(0,tempClass.s4.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.s4.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.s4.teacher.code}
                        <c:if test="${tempClass.s4.altTeacher != null}">
                            <br>+ <br>${tempClass.s4.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:10 to 2:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <td style="background-color: lightslategray;"></td>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 3:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.s5 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.s5.academicclasses.academicClass}
                        <c:if test="${tempClass.s5.subject.contains('-')}">
                            ${tempClass.s5.subject.substring(tempClass.s5.subject.length()-2,tempClass.s5.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.s5.subject.contains('-')}">
                                ${tempClass.s5.subject.substring(0,tempClass.s5.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.s5.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.s5.teacher.code}
                        <c:if test="${tempClass.s5.altTeacher != null}">
                            <br>+ <br>${tempClass.s5.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    <tr>
        <td>2:20 to 4:20</td>
        <c:forEach var="tempClass" items="${allClass}">
            <c:choose>
                <c:when test="${tempClass.s6 == null}">
                    <td></td>
                </c:when>
                <c:otherwise>
                    <td>${tempClass.s6.academicclasses.academicClass}
                        <c:if test="${tempClass.s6.subject.contains('-')}">
                            ${tempClass.s6.subject.substring(tempClass.s6.subject.length()-2,tempClass.s6.subject.length())}
                        </c:if>
                        <br/>
                        <c:choose>
                            <c:when test="${tempClass.s6.subject.contains('-')}">
                                ${tempClass.s6.subject.substring(0,tempClass.s6.subject.length()-2)}
                            </c:when>
                            <c:otherwise>
                                ${tempClass.s6.subject}
                            </c:otherwise>
                        </c:choose>
                        <br/>
                            ${tempClass.s6.teacher.code}
                        <c:if test="${tempClass.s6.altTeacher != null}">
                            <br>+ <br>${tempClass.s6.altTeacher.code}
                        </c:if>
                    </td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
    
</table>
</body>
</html>