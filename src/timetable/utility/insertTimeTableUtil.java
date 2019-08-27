package timetable.utility;

import timetable.Dao.insertDao;
import timetable.entity.Classroom;
import timetable.entity.Subject;
import timetable.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class insertTimeTableUtil {

    private insertDao insertDao;

    public insertTimeTableUtil() {
    }

    @Autowired
    public void setInsertDao(timetable.Dao.insertDao insertDao) {
        this.insertDao = insertDao;
    }

//    "<tr><td>NIL</td><td>NIL</td></tr><tr><td>NIL</td><td>NIL</td></tr>";

    //m1_m2_1_subject
    //m1_m2_1_teacher
    //m1_m2_1_classroom

    public String getScriptFourChanger(String dayOfWeek , String nextDayOfWeek , String AcademicClass){
        List<Subject> subjects = insertDao.getSubjectsForAcademicsemester(AcademicClass.substring(0,AcademicClass.length()-1).toUpperCase());
        List<Classroom> classrooms = insertDao.getFreeClassroomsForInsertionLab(dayOfWeek , nextDayOfWeek);
        List<Teacher> teachers = insertDao.getFreeTeachersForInsertionLab(dayOfWeek , nextDayOfWeek);


        List<Teacher> realTeachers = new ArrayList<>();
        List<Teacher> variableTeachers = new ArrayList<>();
        for (Teacher tempTeacher : teachers){
            if (tempTeacher.getIsTeacher() == 1){
                realTeachers.add(tempTeacher);
            } else {
                variableTeachers.add(tempTeacher);
            }
        }


        StringBuilder answer = new StringBuilder("<tr>");
        answer.append("<td>");
        answer.append("<select name='").append(dayOfWeek).append("_").append(nextDayOfWeek).append("_1_subject'>");
        answer.append("<option value = ''></option>");
        for (Subject subject : subjects){
            answer.append("<option value = '").append(subject.getShortcode());
            if (subject.getElective()==0){
                answer.append("-A");
            }
            answer.append("'>");
            answer.append(subject.getShortcode());
            if (subject.getElective()==0){
                answer.append("- A");
            }
            answer.append("</option>");
        }
        answer.append("</select>");

        answer.append("<select name='").append(dayOfWeek).append("_").append(nextDayOfWeek).append("_1_teacher'>");
        answer.append("<optgroup label = 'real'>");
        for (Teacher teacher : realTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("<optgroup label = 'vars'>");
        for (Teacher teacher : variableTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("</select>");


        answer.append("<select name='").append(dayOfWeek).append("_").append(nextDayOfWeek).append("_1_altTeacher'>");
        answer.append("<option value = ''></option>");
        answer.append("<optgroup label = 'real'>");
        for (Teacher teacher : realTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("<optgroup label = 'vars'>");
        for (Teacher teacher : variableTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("</select>");

        answer.append("<select name='").append(dayOfWeek).append("_").append(nextDayOfWeek).append("_1_classroom'>");
        for (Classroom classroom : classrooms){
            answer.append("<option value = ").append(classroom.getClassroom()).append(">");
            answer.append(classroom.getClassroom());
            answer.append("</option>");
        }
        answer.append("</select>");

        answer.append("</td><td>");
        answer.append("<select name='").append(dayOfWeek).append("_").append(nextDayOfWeek).append("_2_subject'>");
        answer.append("<option value = ''></option>");
        for (Subject subject : subjects){
            answer.append("<option value = '").append(subject.getShortcode());
            if (subject.getElective()==0){
                answer.append("-B");
            }
            answer.append("'>");
            answer.append(subject.getShortcode());
            if (subject.getElective()==0){
                answer.append("- B");
            }
            answer.append("</option>");
        }
        answer.append("</select>");

        answer.append("<select name='").append(dayOfWeek).append("_").append(nextDayOfWeek).append("_2_teacher'>");
        answer.append("<optgroup label = 'real'>");
        for (Teacher teacher : realTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("<optgroup label = 'vars'>");
        for (Teacher teacher : variableTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("</select>");



        answer.append("<select name='").append(dayOfWeek).append("_").append(nextDayOfWeek).append("_2_altTeacher'>");
        answer.append("<option value = ''></option>");
        answer.append("<optgroup label = 'real'>");
        for (Teacher teacher : realTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("<optgroup label = 'vars'>");
        for (Teacher teacher : variableTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("</select>");


        answer.append("<select name='").append(dayOfWeek).append("_").append(nextDayOfWeek).append("_2_classroom'>");
        for (Classroom classroom : classrooms){
            answer.append("<option value = ").append(classroom.getClassroom()).append(">");
            answer.append(classroom.getClassroom());
            answer.append("</option>");
        }
        answer.append("</select>");

        answer.append("</td></tr><tr><td>");
        answer.append("<select name='").append(dayOfWeek).append("_").append(nextDayOfWeek).append("_3_subject'>");
        answer.append("<option value = ''></option>");
        for (Subject subject : subjects){
            answer.append("<option value = '").append(subject.getShortcode());
            if (subject.getElective()==0){
                answer.append("-C");
            }
            answer.append("'>");
            answer.append(subject.getShortcode());
            if (subject.getElective()==0){
                answer.append("- C");
            }
            answer.append("</option>");
        }
        answer.append("</select>");

        answer.append("<select name='").append(dayOfWeek).append("_").append(nextDayOfWeek).append("_3_teacher'>");
        answer.append("<optgroup label = 'real'>");
        for (Teacher teacher : realTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("<optgroup label = 'vars'>");
        for (Teacher teacher : variableTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("</select>");


        answer.append("<select name='").append(dayOfWeek).append("_").append(nextDayOfWeek).append("_3_altTeacher'>");
        answer.append("<option value = ''></option>");
        answer.append("<optgroup label = 'real'>");
        for (Teacher teacher : realTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("<optgroup label = 'vars'>");
        for (Teacher teacher : variableTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("</select>");


        answer.append("<select name='").append(dayOfWeek).append("_").append(nextDayOfWeek).append("_3_classroom'>");
        for (Classroom classroom : classrooms){
            answer.append("<option value = ").append(classroom.getClassroom()).append(">");
            answer.append(classroom.getClassroom());
            answer.append("</option>");
        }
        answer.append("</select>");

        answer.append("</td><td>");
        answer.append("<select name='").append(dayOfWeek).append("_").append(nextDayOfWeek).append("_4_subject'>");
        answer.append("<option value = ''></option>");
        for (Subject subject : subjects){
            answer.append("<option value = '").append(subject.getShortcode());
            if (subject.getElective()==0){
                answer.append("-D");
            }
            answer.append("'>");
            answer.append(subject.getShortcode());
            if (subject.getElective()==0){
                answer.append("- D");
            }
            answer.append("</option>");
        }
        answer.append("</select>");

        answer.append("<select name='").append(dayOfWeek).append("_").append(nextDayOfWeek).append("_4_teacher'>");
        answer.append("<optgroup label = 'real'>");
        for (Teacher teacher : realTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("<optgroup label = 'vars'>");
        for (Teacher teacher : variableTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("</select>");

        answer.append("<select name='").append(dayOfWeek).append("_").append(nextDayOfWeek).append("_4_altTeacher'>");
        answer.append("<option value = ''></option>");
        answer.append("<optgroup label = 'real'>");
        for (Teacher teacher : realTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("<optgroup label = 'vars'>");
        for (Teacher teacher : variableTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("</select>");


        answer.append("<select name='").append(dayOfWeek).append("_").append(nextDayOfWeek).append("_4_classroom'>");
        for (Classroom classroom : classrooms){
            answer.append("<option value = ").append(classroom.getClassroom()).append(">");
            answer.append(classroom.getClassroom());
            answer.append("</option>");
        }
        answer.append("</select>");

        answer.append("</td></tr>");


        return answer.toString();

    }


    ////////////////////////////////////////////////////////
    //<tr><td colspan='2'>NIL</td></tr><tr><td colspan='2'>NIL</td></tr>

    //m1_subject
    //m1_teacher
    //m1_classroom



    public String getScriptTwoChanger(String dayOfWeek , String nextDayofWeek , String AcademicClass){
        List<Subject> subjects = insertDao.getSubjectsForAcademicsemester(AcademicClass.substring(0,AcademicClass.length()-1).toUpperCase());
        List<Classroom> classrooms = insertDao.getFreeClassesForInsertionLecture(dayOfWeek);
        List<Teacher> teachers = insertDao.getFreeTeachersForInsertionLecture(dayOfWeek);

        List<Teacher> realTeachers = new ArrayList<>();
        List<Teacher> variableTeachers = new ArrayList<>();
        for (Teacher tempTeacher : teachers){
            if (tempTeacher.getIsTeacher() == 1){
                realTeachers.add(tempTeacher);
            } else {
                variableTeachers.add(tempTeacher);
            }
        }

        StringBuilder answer = new StringBuilder("<tr>");
        answer.append("<td colspan='2'>");

        answer.append("<select name = '").append(dayOfWeek).append("_subject'>");
        answer.append("<option value = ''></option>");
        for (Subject subject : subjects){
            answer.append("<option value = '").append(subject.getShortcode()).append("'>");
            answer.append(subject.getShortcode());
            answer.append("</option>");
        }
        answer.append("</select>");

        answer.append("<select name = '").append(dayOfWeek).append("_teacher'>");
        answer.append("<optgroup label = 'real'>");
        for (Teacher teacher : realTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("<optgroup label = 'vars'>");
        for (Teacher teacher : variableTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("</select>");

        answer.append("<select name = '").append(dayOfWeek).append("_classroom'>");
        for (Classroom classroom : classrooms){
            answer.append("<option value = ").append(classroom.getClassroom()).append(">");
            answer.append(classroom.getClassroom());
            answer.append("</option>");
        }
        answer.append("</select>");

        classrooms = insertDao.getFreeClassesForInsertionLecture(nextDayofWeek);
        teachers = insertDao.getFreeTeachersForInsertionLecture(nextDayofWeek);

        realTeachers.clear();
        variableTeachers.clear();

        for (Teacher tempTeacher : teachers){
            if (tempTeacher.getIsTeacher() == 1){
                realTeachers.add(tempTeacher);
            } else {
                variableTeachers.add(tempTeacher);
            }
        }

        answer.append("</td></tr><tr><td colspan='2'>");

        answer.append("<select name = '").append(nextDayofWeek).append("_subject'>");
        answer.append("<option value = ''></option>");
        for (Subject subject : subjects){
            answer.append("<option value = '").append(subject.getShortcode()).append("'>");
            answer.append(subject.getShortcode());
            answer.append("</option>");
        }
        answer.append("</select>");

        answer.append("<select name = '").append(nextDayofWeek).append("_teacher'>");
        answer.append("<optgroup label = 'real'>");
        for (Teacher teacher : realTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("<optgroup label = 'vars'>");
        for (Teacher teacher : variableTeachers){
            answer.append("<option value = ").append(teacher.getCode()).append(">");
            answer.append(teacher.getCode());
            answer.append("</option>");
        }
        answer.append("</optgroup>");
        answer.append("</select>");

        answer.append("<select name = '").append(nextDayofWeek).append("_classroom'>");
        for (Classroom classroom : classrooms){
            answer.append("<option value = ").append(classroom.getClassroom()).append(">");
            answer.append(classroom.getClassroom());
            answer.append("</option>");
        }
        answer.append("</select>");

        answer.append("</td></tr>");

        return answer.toString();

    }

}
