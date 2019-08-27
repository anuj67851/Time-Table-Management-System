<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 20-Jul-18
  Time: 6:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Insertion</title>
    <style>
        td table {
            height: 100px;
            width: 150px;
            border-collapse: collapse;
        }

        table {
            text-align: center;
            border-collapse: collapse;
            padding: 0;
        }
    </style>
    <script>
        function setnull(b) {
            document.getElementById(b).innerHTML = "<tr><td colspan='3'>NIL</td></tr><tr><td colspan='3'>NIL</td></tr>";
        }

        // MONDAY
        function fourchangerm1m2() {
            document.getElementById("MON_1").innerHTML = "${fourm1m2}";
        }

        function twochangerm1m2() {
            document.getElementById("MON_1").innerHTML = "${twom1m2}";
        }

        function fourchangerm3m4() {
            document.getElementById("MON_2").innerHTML = "${fourm3m4}";
        }

        function twochangerm3m4() {
            document.getElementById("MON_2").innerHTML = "${twom3m4}";
        }

        function fourchangerm5m6() {
            document.getElementById("MON_3").innerHTML = "${fourm5m6}";
        }

        function twochangerm5m6() {
            document.getElementById("MON_3").innerHTML = "${twom5m6}";
        }


        //TUESDAY

        function fourchangertue1tue2() {
            document.getElementById("TUE_1").innerHTML = "${fourtue1tue2}";
        }

        function twochangertue1tue2() {
            document.getElementById("TUE_1").innerHTML = "${twotue1tue2}";
        }

        function fourchangertue3tue4() {
            document.getElementById("TUE_2").innerHTML = "${fourtue3tue4}";
        }

        function twochangertue3tue4() {
            document.getElementById("TUE_2").innerHTML = "${twotue3tue4}";
        }

        function fourchangertue5tue6() {
            document.getElementById("TUE_3").innerHTML = "${fourtue5tue6}";
        }

        function twochangertue5tue6() {
            document.getElementById("TUE_3").innerHTML = "${twotue5tue6}";
        }

        //WEDNESDAY

        function fourchangerw1w2() {
            document.getElementById("WED_1").innerHTML = "${fourw1w2}";
        }

        function twochangerw1w2() {
            document.getElementById("WED_1").innerHTML = "${twow1w2}";
        }

        function fourchangerw3w4() {
            document.getElementById("WED_2").innerHTML = "${fourw3w4}";
        }

        function twochangerw3w4() {
            document.getElementById("WED_2").innerHTML = "${twow3w4}";
        }

        function fourchangerw5w6() {
            document.getElementById("WED_3").innerHTML = "${fourw5w6}";
        }

        function twochangerw5w6() {
            document.getElementById("WED_3").innerHTML = "${twow5w6}";
        }


        //THURSDAY

        function fourchangerth1th2() {
            document.getElementById("THU_1").innerHTML = "${fourth1th2}";
        }

        function twochangerth1th2() {
            document.getElementById("THU_1").innerHTML = "${twoth1th2}";
        }

        function fourchangerth3th4() {
            document.getElementById("THU_2").innerHTML = "${fourth3th4}";
        }

        function twochangerth3th4() {
            document.getElementById("THU_2").innerHTML = "${twoth3th4}";
        }

        function fourchangerth5th6() {
            document.getElementById("THU_3").innerHTML = "${fourth5th6}";
        }

        function twochangerth5th6() {
            document.getElementById("THU_3").innerHTML = "${twoth5th6}";
        }

        //FRIDAY

        function fourchangerf1f2() {
            document.getElementById("FRI_1").innerHTML = "${fourf1f2}";
        }

        function twochangerf1f2() {
            document.getElementById("FRI_1").innerHTML = "${twof1f2}";
        }

        function fourchangerf3f4() {
            document.getElementById("FRI_2").innerHTML = "${fourf3f4}";
        }

        function twochangerf3f4() {
            document.getElementById("FRI_2").innerHTML = "${twof3f4}";
        }

        function fourchangerf5f6() {
            document.getElementById("FRI_3").innerHTML = "${fourf5f6}";
        }

        function twochangerf5f6() {
            document.getElementById("FRI_3").innerHTML = "${twof5f6}";
        }


        //SATURDAY

        function fourchangers1s2() {
            document.getElementById("SAT_1").innerHTML = "${fours1s2}";
        }

        function twochangers1s2() {
            document.getElementById("SAT_1").innerHTML = "${twos1s2}";
        }

        function fourchangers3s4() {
            document.getElementById("SAT_2").innerHTML = "${fours3s4}";
        }

        function twochangers3s4() {
            document.getElementById("SAT_2").innerHTML = "${twos3s4}";
        }

        function fourchangers5s6() {
            document.getElementById("SAT_3").innerHTML = "${fours5s6}";
        }

        function twochangers5s6() {
            document.getElementById("SAT_3").innerHTML = "${twos5s6}";
        }


    </script>
</head>
<body>

    <center><h3>Leave Subject Fields Empty to set Lecture as Free Lecture Or Labs</h3></center>
    <center><h3>Leave The Third Alternate Teacher Field Empty in Labs to set Alternate Teacher as None</h3></center>
    <form action="<c:url value='/insertData'/>" method="post">
        <table border="5" align="center">
            <tr>
                <td>HRS</td>
                <td colspan="3">MON</td>
                <td colspan="3">TUE</td>
                <td colspan="3">WED</td>
                <td colspan="3">THU</td>
                <td colspan="3">FRI</td>
                <td colspan="3">SAT</td>
            </tr>
            <tr>
                <td rowspan="3">9:10 to 11:10</td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="MON_1">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="TUE_1">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="WED_1">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="THU_1">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="FRI_1">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="SAT_1">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr></tr>
            <tr>
                <td><input type="button" onclick="fourchangerm1m2()" value="Lab"></td>
                <td><input type="button" onclick="twochangerm1m2()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('MON_1')" value="Null"></td>
                <td><input type="button" onclick="fourchangertue1tue2()" value="Lab"></td>
                <td><input type="button" onclick="twochangertue1tue2()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('TUE_1')" value="Null"></td>
                <td><input type="button" onclick="fourchangerw1w2()" value="Lab"></td>
                <td><input type="button" onclick="twochangerw1w2()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('WED_1')" value="Null"></td>
                <td><input type="button" onclick="fourchangerth1th2()" value="Lab"></td>
                <td><input type="button" onclick="twochangerth1th2()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('THU_1')" value="Null"></td>
                <td><input type="button" onclick="fourchangerf1f2()" value="Lab"></td>
                <td><input type="button" onclick="twochangerf1f2()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('FRI_1')" value="Null"></td>
                <td><input type="button" onclick="fourchangers1s2()" value="Lab"></td>
                <td><input type="button" onclick="twochangers1s2()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('SAT_1')" value="Null"></td>
            </tr>


            <tr>
                <td rowspan="1">11:10 to 12:10</td>
                <td colspan="18">RECESS</td>
            </tr>


            <tr>
                <td rowspan="3">12:10 to 2:10</td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="MON_2">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="TUE_2">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="WED_2">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="THU_2">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="FRI_2">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="SAT_2">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr></tr>
            <tr>
                <td><input type="button" onclick="fourchangerm3m4()" value="Lab"></td>
                <td><input type="button" onclick="twochangerm3m4()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('MON_2')" value="Null"></td>
                <td><input type="button" onclick="fourchangertue3tue4()" value="Lab"></td>
                <td><input type="button" onclick="twochangertue3tue4()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('TUE_2')" value="Null"></td>
                <td><input type="button" onclick="fourchangerw3w4()" value="Lab"></td>
                <td><input type="button" onclick="twochangerw3w4()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('WED_2')" value="Null"></td>
                <td><input type="button" onclick="fourchangerth3th4()" value="Lab"></td>
                <td><input type="button" onclick="twochangerth3th4()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('THU_2')" value="Null"></td>
                <td><input type="button" onclick="fourchangerf3f4()" value="Lab"></td>
                <td><input type="button" onclick="twochangerf3f4()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('FRI_2')" value="Null"></td>
                <td><input type="button" onclick="fourchangers3s4()" value="Lab"></td>
                <td><input type="button" onclick="twochangers3s4()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('SAT_2')" value="Null"></td>
            </tr>
            <tr>
                <td rowspan="1">2:10 to 2:20</td>
                <td colspan="18">RECESS</td>
            </tr>


            <tr>
                <td rowspan="3">2:20 to 4:20</td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="MON_3">

                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="TUE_3">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="WED_3">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="THU_3">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="FRI_3">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
                <td rowspan="2" colspan="3">
                    <table border="1" id="SAT_3">
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                        <tr>
                            <td colspan="3">NIL</td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr></tr>
            <tr>
                <td><input type="button" onclick="fourchangerm5m6()" value="Lab"></td>
                <td><input type="button" onclick="twochangerm5m6()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('MON_3')" value="Null"></td>
                <td><input type="button" onclick="fourchangertue5tue6()" value="Lab"></td>
                <td><input type="button" onclick="twochangertue5tue6()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('TUE_3')" value="Null"></td>
                <td><input type="button" onclick="fourchangerw5w6()" value="Lab"></td>
                <td><input type="button" onclick="twochangerw5w6()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('WED_3')" value="Null"></td>
                <td><input type="button" onclick="fourchangerth5th6()" value="Lab"></td>
                <td><input type="button" onclick="twochangerth5th6()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('THU_3')" value="Null"></td>
                <td><input type="button" onclick="fourchangerf5f6()" value="Lab"></td>
                <td><input type="button" onclick="twochangerf5f6()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('FRI_3')" value="Null"></td>
                <td><input type="button" onclick="fourchangers5s6()" value="Lab"></td>
                <td><input type="button" onclick="twochangers5s6()" value="Lecture"></td>
                <td><input type="button" onclick="setnull('SAT_3')" value="Null"></td>
            </tr>
        </table>

        <input type="hidden" name="aclass" value="${aclass}">

        <br/><br/>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
