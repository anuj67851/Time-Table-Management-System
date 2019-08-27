package timetable.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import timetable.entity.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.List;

@Repository
public class insertTimeTableData {

    private SessionFactory sessionFactory;

    @Autowired
    public insertTimeTableData(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void insertTimetable(HttpServletRequest request) {

        List<String> parameterNames = Collections.list(request.getParameterNames());
        Session session = sessionFactory.getCurrentSession();
        String aclass = request.getParameter("aclass");

        Lectures lecture;
        Teacher teacher;
        Teacher altTeacher;
        Classroom classroom;
        //Labs

        if (parameterNames.contains("m1_m2_1_subject") && !request.getParameter("m1_m2_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m1_m2_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m1_m2_1_classroom")));
            lecture.setHours("m1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m1_m2_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("m1_m2_1_altTeacher").equals("") && request.getParameter("m1_m2_1_altTeacher") != null && !request.getParameter("m1_m2_1_altTeacher").equals("m1_m2_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("m1_m2_1_altTeacher"));
                altTeacher.setM1(lecture);
                altTeacher.setM2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("m1_m2_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m1_m2_1_teacher"));
            teacher.setM1(lecture);
            teacher.setM2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m1_m2_1_classroom"));
            classroom.setM1(lecture);
            classroom.setM2(lecture);
            session.save(classroom);

            if(request.getParameter("m1_m2_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM1(lecture);
                classroom.setM2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM1(lecture);
                classroom.setM2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m1_m2_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM1(lecture);
                classroom.setM2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM1(lecture);
                classroom.setM2(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("m1_m2_2_subject") && !request.getParameter("m1_m2_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m1_m2_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m1_m2_2_classroom")));
            lecture.setHours("m1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m1_m2_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("m1_m2_2_altTeacher").equals("") && request.getParameter("m1_m2_2_altTeacher") != null && !request.getParameter("m1_m2_2_altTeacher").equals("m1_m2_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("m1_m2_2_altTeacher"));
                altTeacher.setM1(lecture);
                altTeacher.setM2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("m1_m2_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m1_m2_2_teacher"));
            teacher.setM1(lecture);
            teacher.setM2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m1_m2_2_classroom"));
            classroom.setM1(lecture);
            classroom.setM2(lecture);
            session.save(classroom);

            if(request.getParameter("m1_m2_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM1(lecture);
                classroom.setM2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM1(lecture);
                classroom.setM2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m1_m2_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM1(lecture);
                classroom.setM2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM1(lecture);
                classroom.setM2(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("m1_m2_3_subject") && !request.getParameter("m1_m2_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m1_m2_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m1_m2_3_classroom")));
            lecture.setHours("m1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m1_m2_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("m1_m2_3_altTeacher").equals("") && request.getParameter("m1_m2_3_altTeacher") != null && !request.getParameter("m1_m2_3_altTeacher").equals("m1_m2_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("m1_m2_3_altTeacher"));
                altTeacher.setM1(lecture);
                altTeacher.setM2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("m1_m2_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m1_m2_3_teacher"));
            teacher.setM1(lecture);
            teacher.setM2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m1_m2_3_classroom"));
            classroom.setM1(lecture);
            classroom.setM2(lecture);
            session.save(classroom);

            if(request.getParameter("m1_m2_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM1(lecture);
                classroom.setM2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM1(lecture);
                classroom.setM2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m1_m2_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM1(lecture);
                classroom.setM2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM1(lecture);
                classroom.setM2(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("m1_m2_4_subject") && !request.getParameter("m1_m2_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m1_m2_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m1_m2_4_classroom")));
            lecture.setHours("m1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m1_m2_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("m1_m2_4_altTeacher").equals("") && request.getParameter("m1_m2_4_altTeacher") != null && !request.getParameter("m1_m2_4_altTeacher").equals("m1_m2_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("m1_m2_4_altTeacher"));
                altTeacher.setM1(lecture);
                altTeacher.setM2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("m1_m2_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m1_m2_4_teacher"));
            teacher.setM1(lecture);
            teacher.setM2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m1_m2_4_classroom"));
            classroom.setM1(lecture);
            classroom.setM2(lecture);
            session.save(classroom);


            if(request.getParameter("m1_m2_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM1(lecture);
                classroom.setM2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM1(lecture);
                classroom.setM2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m1_m2_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM1(lecture);
                classroom.setM2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM1(lecture);
                classroom.setM2(lecture);
                session.save(classroom);
            }

        }



        if (parameterNames.contains("m3_m4_1_subject") && !request.getParameter("m3_m4_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m3_m4_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m3_m4_1_classroom")));
            lecture.setHours("m3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m3_m4_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("m3_m4_1_altTeacher").equals("") && request.getParameter("m3_m4_1_altTeacher") != null && !request.getParameter("m3_m4_1_altTeacher").equals("m3_m4_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("m3_m4_1_altTeacher"));
                altTeacher.setM3(lecture);
                altTeacher.setM4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("m3_m4_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m3_m4_1_teacher"));
            teacher.setM3(lecture);
            teacher.setM4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m3_m4_1_classroom"));
            classroom.setM3(lecture);
            classroom.setM4(lecture);
            session.save(classroom);

            if(request.getParameter("m3_m4_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM3(lecture);
                classroom.setM4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM3(lecture);
                classroom.setM4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m3_m4_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM3(lecture);
                classroom.setM4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM3(lecture);
                classroom.setM4(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("m3_m4_2_subject") && !request.getParameter("m3_m4_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m3_m4_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m3_m4_2_classroom")));
            lecture.setHours("m3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m3_m4_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("m3_m4_2_altTeacher").equals("") && request.getParameter("m3_m4_2_altTeacher") != null && !request.getParameter("m3_m4_2_altTeacher").equals("m3_m4_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("m3_m4_2_altTeacher"));
                altTeacher.setM3(lecture);
                altTeacher.setM4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("m3_m4_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m3_m4_2_teacher"));
            teacher.setM3(lecture);
            teacher.setM4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m3_m4_2_classroom"));
            classroom.setM3(lecture);
            classroom.setM4(lecture);
            session.save(classroom);

            if(request.getParameter("m3_m4_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM3(lecture);
                classroom.setM4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM3(lecture);
                classroom.setM4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m3_m4_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM3(lecture);
                classroom.setM4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM3(lecture);
                classroom.setM4(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("m3_m4_3_subject") && !request.getParameter("m3_m4_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m3_m4_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m3_m4_3_classroom")));
            lecture.setHours("m3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m3_m4_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("m3_m4_3_altTeacher").equals("") && request.getParameter("m3_m4_3_altTeacher") != null && !request.getParameter("m3_m4_3_altTeacher").equals("m3_m4_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("m3_m4_3_altTeacher"));
                altTeacher.setM3(lecture);
                altTeacher.setM4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("m3_m4_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m3_m4_3_teacher"));
            teacher.setM3(lecture);
            teacher.setM4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m3_m4_3_classroom"));
            classroom.setM3(lecture);
            classroom.setM4(lecture);
            session.save(classroom);

            if(request.getParameter("m3_m4_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM3(lecture);
                classroom.setM4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM3(lecture);
                classroom.setM4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m3_m4_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM3(lecture);
                classroom.setM4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM3(lecture);
                classroom.setM4(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("m3_m4_4_subject") && !request.getParameter("m3_m4_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m3_m4_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m3_m4_4_classroom")));
            lecture.setHours("m3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m3_m4_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("m3_m4_4_altTeacher").equals("") && request.getParameter("m3_m4_4_altTeacher") != null && !request.getParameter("m3_m4_4_altTeacher").equals("m3_m4_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("m3_m4_4_altTeacher"));
                altTeacher.setM3(lecture);
                altTeacher.setM4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("m3_m4_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m3_m4_4_teacher"));
            teacher.setM3(lecture);
            teacher.setM4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m3_m4_4_classroom"));
            classroom.setM3(lecture);
            classroom.setM4(lecture);
            session.save(classroom);


            if(request.getParameter("m3_m4_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM3(lecture);
                classroom.setM4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM3(lecture);
                classroom.setM4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m3_m4_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM3(lecture);
                classroom.setM4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM3(lecture);
                classroom.setM4(lecture);
                session.save(classroom);
            }

        }


        if (parameterNames.contains("m5_m6_1_subject") && !request.getParameter("m5_m6_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m5_m6_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m5_m6_1_classroom")));
            lecture.setHours("m5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m5_m6_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("m5_m6_1_altTeacher").equals("") && request.getParameter("m5_m6_1_altTeacher") != null && !request.getParameter("m5_m6_1_altTeacher").equals("m5_m6_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("m5_m6_1_altTeacher"));
                altTeacher.setM5(lecture);
                altTeacher.setM6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("m5_m6_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m5_m6_1_teacher"));
            teacher.setM5(lecture);
            teacher.setM6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m5_m6_1_classroom"));
            classroom.setM5(lecture);
            classroom.setM6(lecture);
            session.save(classroom);

            if(request.getParameter("m5_m6_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM5(lecture);
                classroom.setM6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM5(lecture);
                classroom.setM6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m5_m6_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM5(lecture);
                classroom.setM6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM5(lecture);
                classroom.setM6(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("m5_m6_2_subject") && !request.getParameter("m5_m6_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m5_m6_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m5_m6_2_classroom")));
            lecture.setHours("m5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m5_m6_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("m5_m6_2_altTeacher").equals("") && request.getParameter("m5_m6_2_altTeacher") != null && !request.getParameter("m5_m6_2_altTeacher").equals("m5_m6_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("m5_m6_2_altTeacher"));
                altTeacher.setM5(lecture);
                altTeacher.setM6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("m5_m6_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m5_m6_2_teacher"));
            teacher.setM5(lecture);
            teacher.setM6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m5_m6_2_classroom"));
            classroom.setM5(lecture);
            classroom.setM6(lecture);
            session.save(classroom);

            if(request.getParameter("m5_m6_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM5(lecture);
                classroom.setM6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM5(lecture);
                classroom.setM6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m5_m6_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM5(lecture);
                classroom.setM6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM5(lecture);
                classroom.setM6(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("m5_m6_3_subject") && !request.getParameter("m5_m6_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m5_m6_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m5_m6_3_classroom")));
            lecture.setHours("m5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m5_m6_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("m5_m6_3_altTeacher").equals("") && request.getParameter("m5_m6_3_altTeacher") != null && !request.getParameter("m5_m6_3_altTeacher").equals("m5_m6_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("m5_m6_3_altTeacher"));
                altTeacher.setM5(lecture);
                altTeacher.setM6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("m5_m6_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m5_m6_3_teacher"));
            teacher.setM5(lecture);
            teacher.setM6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m5_m6_3_classroom"));
            classroom.setM5(lecture);
            classroom.setM6(lecture);
            session.save(classroom);

            if(request.getParameter("m5_m6_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM5(lecture);
                classroom.setM6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM5(lecture);
                classroom.setM6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m5_m6_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM5(lecture);
                classroom.setM6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM5(lecture);
                classroom.setM6(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("m5_m6_4_subject") && !request.getParameter("m5_m6_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m5_m6_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m5_m6_4_classroom")));
            lecture.setHours("m5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m5_m6_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("m5_m6_4_altTeacher").equals("") && request.getParameter("m5_m6_4_altTeacher") != null && !request.getParameter("m5_m6_4_altTeacher").equals("m5_m6_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("m5_m6_4_altTeacher"));
                altTeacher.setM5(lecture);
                altTeacher.setM6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("m5_m6_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m5_m6_4_teacher"));
            teacher.setM5(lecture);
            teacher.setM6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m5_m6_4_classroom"));
            classroom.setM5(lecture);
            classroom.setM6(lecture);
            session.save(classroom);


            if(request.getParameter("m5_m6_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM5(lecture);
                classroom.setM6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM5(lecture);
                classroom.setM6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m5_m6_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM5(lecture);
                classroom.setM6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM5(lecture);
                classroom.setM6(lecture);
                session.save(classroom);
            }

        }

        //Tuesday

        if (parameterNames.contains("tue1_tue2_1_subject") && !request.getParameter("tue1_tue2_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue1_tue2_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue1_tue2_1_classroom")));
            lecture.setHours("tue1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue1_tue2_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("tue1_tue2_1_altTeacher").equals("") && request.getParameter("tue1_tue2_1_altTeacher") != null && !request.getParameter("tue1_tue2_1_altTeacher").equals("tue1_tue2_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("tue1_tue2_1_altTeacher"));
                altTeacher.setTue1(lecture);
                altTeacher.setTue2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("tue1_tue2_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue1_tue2_1_teacher"));
            teacher.setTue1(lecture);
            teacher.setTue2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue1_tue2_1_classroom"));
            classroom.setTue1(lecture);
            classroom.setTue2(lecture);
            session.save(classroom);

            if(request.getParameter("tue1_tue2_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue1(lecture);
                classroom.setTue2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue1(lecture);
                classroom.setTue2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue1_tue2_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue1(lecture);
                classroom.setTue2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue1(lecture);
                classroom.setTue2(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("tue1_tue2_2_subject") && !request.getParameter("tue1_tue2_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue1_tue2_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue1_tue2_2_classroom")));
            lecture.setHours("tue1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue1_tue2_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("tue1_tue2_2_altTeacher").equals("") && request.getParameter("tue1_tue2_2_altTeacher") != null && !request.getParameter("tue1_tue2_2_altTeacher").equals("tue1_tue2_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("tue1_tue2_2_altTeacher"));
                altTeacher.setTue1(lecture);
                altTeacher.setTue2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("tue1_tue2_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue1_tue2_2_teacher"));
            teacher.setTue1(lecture);
            teacher.setTue2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue1_tue2_2_classroom"));
            classroom.setTue1(lecture);
            classroom.setTue2(lecture);
            session.save(classroom);

            if(request.getParameter("tue1_tue2_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue1(lecture);
                classroom.setTue2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue1(lecture);
                classroom.setTue2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue1_tue2_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue1(lecture);
                classroom.setTue2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue1(lecture);
                classroom.setTue2(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("tue1_tue2_3_subject") && !request.getParameter("tue1_tue2_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue1_tue2_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue1_tue2_3_classroom")));
            lecture.setHours("tue1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue1_tue2_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("tue1_tue2_3_altTeacher").equals("") && request.getParameter("tue1_tue2_3_altTeacher") != null && !request.getParameter("tue1_tue2_3_altTeacher").equals("tue1_tue2_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("tue1_tue2_3_altTeacher"));
                altTeacher.setTue1(lecture);
                altTeacher.setTue2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("tue1_tue2_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue1_tue2_3_teacher"));
            teacher.setTue1(lecture);
            teacher.setTue2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue1_tue2_3_classroom"));
            classroom.setTue1(lecture);
            classroom.setTue2(lecture);
            session.save(classroom);

            if(request.getParameter("tue1_tue2_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue1(lecture);
                classroom.setTue2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue1(lecture);
                classroom.setTue2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue1_tue2_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue1(lecture);
                classroom.setTue2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue1(lecture);
                classroom.setTue2(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("tue1_tue2_4_subject") && !request.getParameter("tue1_tue2_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue1_tue2_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue1_tue2_4_classroom")));
            lecture.setHours("tue1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue1_tue2_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("tue1_tue2_4_altTeacher").equals("") && request.getParameter("tue1_tue2_4_altTeacher") != null && !request.getParameter("tue1_tue2_4_altTeacher").equals("tue1_tue2_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("tue1_tue2_4_altTeacher"));
                altTeacher.setTue1(lecture);
                altTeacher.setTue2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("tue1_tue2_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue1_tue2_4_teacher"));
            teacher.setTue1(lecture);
            teacher.setTue2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue1_tue2_4_classroom"));
            classroom.setTue1(lecture);
            classroom.setTue2(lecture);
            session.save(classroom);


            if(request.getParameter("tue1_tue2_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue1(lecture);
                classroom.setTue2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue1(lecture);
                classroom.setTue2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue1_tue2_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue1(lecture);
                classroom.setTue2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue1(lecture);
                classroom.setTue2(lecture);
                session.save(classroom);
            }

        }



        if (parameterNames.contains("tue3_tue4_1_subject") && !request.getParameter("tue3_tue4_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue3_tue4_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue3_tue4_1_classroom")));
            lecture.setHours("tue3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue3_tue4_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("tue3_tue4_1_altTeacher").equals("") && request.getParameter("tue3_tue4_1_altTeacher") != null && !request.getParameter("tue3_tue4_1_altTeacher").equals("tue3_tue4_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("tue3_tue4_1_altTeacher"));
                altTeacher.setTue3(lecture);
                altTeacher.setTue4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("tue3_tue4_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue3_tue4_1_teacher"));
            teacher.setTue3(lecture);
            teacher.setTue4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue3_tue4_1_classroom"));
            classroom.setTue3(lecture);
            classroom.setTue4(lecture);
            session.save(classroom);

            if(request.getParameter("tue3_tue4_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue3(lecture);
                classroom.setTue4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue3(lecture);
                classroom.setTue4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue3_tue4_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue3(lecture);
                classroom.setTue4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue3(lecture);
                classroom.setTue4(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("tue3_tue4_2_subject") && !request.getParameter("tue3_tue4_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue3_tue4_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue3_tue4_2_classroom")));
            lecture.setHours("tue3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue3_tue4_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("tue3_tue4_2_altTeacher").equals("") && request.getParameter("tue3_tue4_2_altTeacher") != null && !request.getParameter("tue3_tue4_2_altTeacher").equals("tue3_tue4_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("tue3_tue4_2_altTeacher"));
                altTeacher.setTue3(lecture);
                altTeacher.setTue4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("tue3_tue4_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue3_tue4_2_teacher"));
            teacher.setTue3(lecture);
            teacher.setTue4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue3_tue4_2_classroom"));
            classroom.setTue3(lecture);
            classroom.setTue4(lecture);
            session.save(classroom);

            if(request.getParameter("tue3_tue4_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue3(lecture);
                classroom.setTue4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue3(lecture);
                classroom.setTue4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue3_tue4_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue3(lecture);
                classroom.setTue4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue3(lecture);
                classroom.setTue4(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("tue3_tue4_3_subject") && !request.getParameter("tue3_tue4_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue3_tue4_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue3_tue4_3_classroom")));
            lecture.setHours("tue3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue3_tue4_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("tue3_tue4_3_altTeacher").equals("") && request.getParameter("tue3_tue4_3_altTeacher") != null && !request.getParameter("tue3_tue4_3_altTeacher").equals("tue3_tue4_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("tue3_tue4_3_altTeacher"));
                altTeacher.setTue3(lecture);
                altTeacher.setTue4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("tue3_tue4_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue3_tue4_3_teacher"));
            teacher.setTue3(lecture);
            teacher.setTue4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue3_tue4_3_classroom"));
            classroom.setTue3(lecture);
            classroom.setTue4(lecture);
            session.save(classroom);

            if(request.getParameter("tue3_tue4_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue3(lecture);
                classroom.setTue4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue3(lecture);
                classroom.setTue4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue3_tue4_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue3(lecture);
                classroom.setTue4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue3(lecture);
                classroom.setTue4(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("tue3_tue4_4_subject") && !request.getParameter("tue3_tue4_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue3_tue4_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue3_tue4_4_classroom")));
            lecture.setHours("tue3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue3_tue4_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("tue3_tue4_4_altTeacher").equals("") && request.getParameter("tue3_tue4_4_altTeacher") != null && !request.getParameter("tue3_tue4_4_altTeacher").equals("tue3_tue4_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("tue3_tue4_4_altTeacher"));
                altTeacher.setTue3(lecture);
                altTeacher.setTue4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("tue3_tue4_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue3_tue4_4_teacher"));
            teacher.setTue3(lecture);
            teacher.setTue4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue3_tue4_4_classroom"));
            classroom.setTue3(lecture);
            classroom.setTue4(lecture);
            session.save(classroom);


            if(request.getParameter("tue3_tue4_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue3(lecture);
                classroom.setTue4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue3(lecture);
                classroom.setTue4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue3_tue4_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue3(lecture);
                classroom.setTue4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue3(lecture);
                classroom.setTue4(lecture);
                session.save(classroom);
            }

        }


        if (parameterNames.contains("tue5_tue6_1_subject") && !request.getParameter("tue5_tue6_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue5_tue6_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue5_tue6_1_classroom")));
            lecture.setHours("tue5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue5_tue6_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("tue5_tue6_1_altTeacher").equals("") && request.getParameter("tue5_tue6_1_altTeacher") != null && !request.getParameter("tue5_tue6_1_altTeacher").equals("tue5_tue6_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("tue5_tue6_1_altTeacher"));
                altTeacher.setTue5(lecture);
                altTeacher.setTue6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("tue5_tue6_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue5_tue6_1_teacher"));
            teacher.setTue5(lecture);
            teacher.setTue6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue5_tue6_1_classroom"));
            classroom.setTue5(lecture);
            classroom.setTue6(lecture);
            session.save(classroom);

            if(request.getParameter("tue5_tue6_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue5(lecture);
                classroom.setTue6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue5(lecture);
                classroom.setTue6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue5_tue6_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue5(lecture);
                classroom.setTue6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue5(lecture);
                classroom.setTue6(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("tue5_tue6_2_subject") && !request.getParameter("tue5_tue6_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue5_tue6_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue5_tue6_2_classroom")));
            lecture.setHours("tue5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue5_tue6_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("tue5_tue6_2_altTeacher").equals("") && request.getParameter("tue5_tue6_2_altTeacher") != null && !request.getParameter("tue5_tue6_2_altTeacher").equals("tue5_tue6_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("tue5_tue6_2_altTeacher"));
                altTeacher.setTue5(lecture);
                altTeacher.setTue6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("tue5_tue6_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue5_tue6_2_teacher"));
            teacher.setTue5(lecture);
            teacher.setTue6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue5_tue6_2_classroom"));
            classroom.setTue5(lecture);
            classroom.setTue6(lecture);
            session.save(classroom);

            if(request.getParameter("tue5_tue6_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue5(lecture);
                classroom.setTue6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue5(lecture);
                classroom.setTue6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue5_tue6_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue5(lecture);
                classroom.setTue6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue5(lecture);
                classroom.setTue6(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("tue5_tue6_3_subject") && !request.getParameter("tue5_tue6_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue5_tue6_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue5_tue6_3_classroom")));
            lecture.setHours("tue5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue5_tue6_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("tue5_tue6_3_altTeacher").equals("") && request.getParameter("tue5_tue6_3_altTeacher") != null && !request.getParameter("tue5_tue6_3_altTeacher").equals("tue5_tue6_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("tue5_tue6_3_altTeacher"));
                altTeacher.setTue5(lecture);
                altTeacher.setTue6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("tue5_tue6_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue5_tue6_3_teacher"));
            teacher.setTue5(lecture);
            teacher.setTue6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue5_tue6_3_classroom"));
            classroom.setTue5(lecture);
            classroom.setTue6(lecture);
            session.save(classroom);

            if(request.getParameter("tue5_tue6_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue5(lecture);
                classroom.setTue6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue5(lecture);
                classroom.setTue6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue5_tue6_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue5(lecture);
                classroom.setTue6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue5(lecture);
                classroom.setTue6(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("tue5_tue6_4_subject") && !request.getParameter("tue5_tue6_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue5_tue6_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue5_tue6_4_classroom")));
            lecture.setHours("tue5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue5_tue6_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("tue5_tue6_4_altTeacher").equals("") && request.getParameter("tue5_tue6_4_altTeacher") != null && !request.getParameter("tue5_tue6_4_altTeacher").equals("tue5_tue6_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("tue5_tue6_4_altTeacher"));
                altTeacher.setTue5(lecture);
                altTeacher.setTue6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("tue5_tue6_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue5_tue6_4_teacher"));
            teacher.setTue5(lecture);
            teacher.setTue6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue5_tue6_4_classroom"));
            classroom.setTue5(lecture);
            classroom.setTue6(lecture);
            session.save(classroom);


            if(request.getParameter("tue5_tue6_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue5(lecture);
                classroom.setTue6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue5(lecture);
                classroom.setTue6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue5_tue6_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue5(lecture);
                classroom.setTue6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue5(lecture);
                classroom.setTue6(lecture);
                session.save(classroom);
            }

        }
        


        //Wednesday

        if (parameterNames.contains("w1_w2_1_subject") && !request.getParameter("w1_w2_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w1_w2_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w1_w2_1_classroom")));
            lecture.setHours("w1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w1_w2_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("w1_w2_1_altTeacher").equals("") && request.getParameter("w1_w2_1_altTeacher") != null && !request.getParameter("w1_w2_1_altTeacher").equals("w1_w2_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("w1_w2_1_altTeacher"));
                altTeacher.setW1(lecture);
                altTeacher.setW2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("w1_w2_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w1_w2_1_teacher"));
            teacher.setW1(lecture);
            teacher.setW2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w1_w2_1_classroom"));
            classroom.setW1(lecture);
            classroom.setW2(lecture);
            session.save(classroom);

            if(request.getParameter("w1_w2_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW1(lecture);
                classroom.setW2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW1(lecture);
                classroom.setW2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w1_w2_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW1(lecture);
                classroom.setW2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW1(lecture);
                classroom.setW2(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("w1_w2_2_subject") && !request.getParameter("w1_w2_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w1_w2_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w1_w2_2_classroom")));
            lecture.setHours("w1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w1_w2_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("w1_w2_2_altTeacher").equals("") && request.getParameter("w1_w2_2_altTeacher") != null && !request.getParameter("w1_w2_2_altTeacher").equals("w1_w2_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("w1_w2_2_altTeacher"));
                altTeacher.setW1(lecture);
                altTeacher.setW2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("w1_w2_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w1_w2_2_teacher"));
            teacher.setW1(lecture);
            teacher.setW2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w1_w2_2_classroom"));
            classroom.setW1(lecture);
            classroom.setW2(lecture);
            session.save(classroom);

            if(request.getParameter("w1_w2_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW1(lecture);
                classroom.setW2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW1(lecture);
                classroom.setW2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w1_w2_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW1(lecture);
                classroom.setW2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW1(lecture);
                classroom.setW2(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("w1_w2_3_subject") && !request.getParameter("w1_w2_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w1_w2_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w1_w2_3_classroom")));
            lecture.setHours("w1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w1_w2_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("w1_w2_3_altTeacher").equals("") && request.getParameter("w1_w2_3_altTeacher") != null && !request.getParameter("w1_w2_3_altTeacher").equals("w1_w2_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("w1_w2_3_altTeacher"));
                altTeacher.setW1(lecture);
                altTeacher.setW2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("w1_w2_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w1_w2_3_teacher"));
            teacher.setW1(lecture);
            teacher.setW2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w1_w2_3_classroom"));
            classroom.setW1(lecture);
            classroom.setW2(lecture);
            session.save(classroom);

            if(request.getParameter("w1_w2_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW1(lecture);
                classroom.setW2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW1(lecture);
                classroom.setW2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w1_w2_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW1(lecture);
                classroom.setW2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW1(lecture);
                classroom.setW2(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("w1_w2_4_subject") && !request.getParameter("w1_w2_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w1_w2_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w1_w2_4_classroom")));
            lecture.setHours("w1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w1_w2_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("w1_w2_4_altTeacher").equals("") && request.getParameter("w1_w2_4_altTeacher") != null && !request.getParameter("w1_w2_4_altTeacher").equals("w1_w2_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("w1_w2_4_altTeacher"));
                altTeacher.setW1(lecture);
                altTeacher.setW2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("w1_w2_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w1_w2_4_teacher"));
            teacher.setW1(lecture);
            teacher.setW2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w1_w2_4_classroom"));
            classroom.setW1(lecture);
            classroom.setW2(lecture);
            session.save(classroom);


            if(request.getParameter("w1_w2_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW1(lecture);
                classroom.setW2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW1(lecture);
                classroom.setW2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w1_w2_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW1(lecture);
                classroom.setW2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW1(lecture);
                classroom.setW2(lecture);
                session.save(classroom);
            }

        }



        if (parameterNames.contains("w3_w4_1_subject") && !request.getParameter("w3_w4_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w3_w4_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w3_w4_1_classroom")));
            lecture.setHours("w3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w3_w4_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("w3_w4_1_altTeacher").equals("") && request.getParameter("w3_w4_1_altTeacher") != null && !request.getParameter("w3_w4_1_altTeacher").equals("w3_w4_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("w3_w4_1_altTeacher"));
                altTeacher.setW3(lecture);
                altTeacher.setW4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("w3_w4_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w3_w4_1_teacher"));
            teacher.setW3(lecture);
            teacher.setW4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w3_w4_1_classroom"));
            classroom.setW3(lecture);
            classroom.setW4(lecture);
            session.save(classroom);

            if(request.getParameter("w3_w4_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW3(lecture);
                classroom.setW4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW3(lecture);
                classroom.setW4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w3_w4_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW3(lecture);
                classroom.setW4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW3(lecture);
                classroom.setW4(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("w3_w4_2_subject") && !request.getParameter("w3_w4_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w3_w4_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w3_w4_2_classroom")));
            lecture.setHours("w3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w3_w4_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("w3_w4_2_altTeacher").equals("") && request.getParameter("w3_w4_2_altTeacher") != null && !request.getParameter("w3_w4_2_altTeacher").equals("w3_w4_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("w3_w4_2_altTeacher"));
                altTeacher.setW3(lecture);
                altTeacher.setW4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("w3_w4_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w3_w4_2_teacher"));
            teacher.setW3(lecture);
            teacher.setW4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w3_w4_2_classroom"));
            classroom.setW3(lecture);
            classroom.setW4(lecture);
            session.save(classroom);

            if(request.getParameter("w3_w4_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW3(lecture);
                classroom.setW4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW3(lecture);
                classroom.setW4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w3_w4_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW3(lecture);
                classroom.setW4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW3(lecture);
                classroom.setW4(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("w3_w4_3_subject") && !request.getParameter("w3_w4_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w3_w4_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w3_w4_3_classroom")));
            lecture.setHours("w3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w3_w4_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("w3_w4_3_altTeacher").equals("") && request.getParameter("w3_w4_3_altTeacher") != null && !request.getParameter("w3_w4_3_altTeacher").equals("w3_w4_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("w3_w4_3_altTeacher"));
                altTeacher.setW3(lecture);
                altTeacher.setW4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("w3_w4_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w3_w4_3_teacher"));
            teacher.setW3(lecture);
            teacher.setW4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w3_w4_3_classroom"));
            classroom.setW3(lecture);
            classroom.setW4(lecture);
            session.save(classroom);

            if(request.getParameter("w3_w4_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW3(lecture);
                classroom.setW4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW3(lecture);
                classroom.setW4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w3_w4_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW3(lecture);
                classroom.setW4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW3(lecture);
                classroom.setW4(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("w3_w4_4_subject") && !request.getParameter("w3_w4_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w3_w4_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w3_w4_4_classroom")));
            lecture.setHours("w3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w3_w4_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("w3_w4_4_altTeacher").equals("") && request.getParameter("w3_w4_4_altTeacher") != null && !request.getParameter("w3_w4_4_altTeacher").equals("w3_w4_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("w3_w4_4_altTeacher"));
                altTeacher.setW3(lecture);
                altTeacher.setW4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("w3_w4_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w3_w4_4_teacher"));
            teacher.setW3(lecture);
            teacher.setW4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w3_w4_4_classroom"));
            classroom.setW3(lecture);
            classroom.setW4(lecture);
            session.save(classroom);


            if(request.getParameter("w3_w4_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW3(lecture);
                classroom.setW4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW3(lecture);
                classroom.setW4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w3_w4_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW3(lecture);
                classroom.setW4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW3(lecture);
                classroom.setW4(lecture);
                session.save(classroom);
            }

        }


        if (parameterNames.contains("w5_w6_1_subject") && !request.getParameter("w5_w6_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w5_w6_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w5_w6_1_classroom")));
            lecture.setHours("w5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w5_w6_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("w5_w6_1_altTeacher").equals("") && request.getParameter("w5_w6_1_altTeacher") != null && !request.getParameter("w5_w6_1_altTeacher").equals("w5_w6_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("w5_w6_1_altTeacher"));
                altTeacher.setW5(lecture);
                altTeacher.setW6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("w5_w6_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w5_w6_1_teacher"));
            teacher.setW5(lecture);
            teacher.setW6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w5_w6_1_classroom"));
            classroom.setW5(lecture);
            classroom.setW6(lecture);
            session.save(classroom);

            if(request.getParameter("w5_w6_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW5(lecture);
                classroom.setW6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW5(lecture);
                classroom.setW6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w5_w6_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW5(lecture);
                classroom.setW6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW5(lecture);
                classroom.setW6(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("w5_w6_2_subject") && !request.getParameter("w5_w6_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w5_w6_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w5_w6_2_classroom")));
            lecture.setHours("w5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w5_w6_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("w5_w6_2_altTeacher").equals("") && request.getParameter("w5_w6_2_altTeacher") != null && !request.getParameter("w5_w6_2_altTeacher").equals("w5_w6_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("w5_w6_2_altTeacher"));
                altTeacher.setW5(lecture);
                altTeacher.setW6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("w5_w6_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w5_w6_2_teacher"));
            teacher.setW5(lecture);
            teacher.setW6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w5_w6_2_classroom"));
            classroom.setW5(lecture);
            classroom.setW6(lecture);
            session.save(classroom);

            if(request.getParameter("w5_w6_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW5(lecture);
                classroom.setW6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW5(lecture);
                classroom.setW6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w5_w6_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW5(lecture);
                classroom.setW6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW5(lecture);
                classroom.setW6(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("w5_w6_3_subject") && !request.getParameter("w5_w6_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w5_w6_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w5_w6_3_classroom")));
            lecture.setHours("w5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w5_w6_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("w5_w6_3_altTeacher").equals("") && request.getParameter("w5_w6_3_altTeacher") != null && !request.getParameter("w5_w6_3_altTeacher").equals("w5_w6_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("w5_w6_3_altTeacher"));
                altTeacher.setW5(lecture);
                altTeacher.setW6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("w5_w6_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w5_w6_3_teacher"));
            teacher.setW5(lecture);
            teacher.setW6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w5_w6_3_classroom"));
            classroom.setW5(lecture);
            classroom.setW6(lecture);
            session.save(classroom);

            if(request.getParameter("w5_w6_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW5(lecture);
                classroom.setW6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW5(lecture);
                classroom.setW6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w5_w6_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW5(lecture);
                classroom.setW6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW5(lecture);
                classroom.setW6(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("w5_w6_4_subject") && !request.getParameter("w5_w6_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w5_w6_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w5_w6_4_classroom")));
            lecture.setHours("w5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w5_w6_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("w5_w6_4_altTeacher").equals("") && request.getParameter("w5_w6_4_altTeacher") != null && !request.getParameter("w5_w6_4_altTeacher").equals("w5_w6_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("w5_w6_4_altTeacher"));
                altTeacher.setW5(lecture);
                altTeacher.setW6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("w5_w6_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w5_w6_4_teacher"));
            teacher.setW5(lecture);
            teacher.setW6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w5_w6_4_classroom"));
            classroom.setW5(lecture);
            classroom.setW6(lecture);
            session.save(classroom);


            if(request.getParameter("w5_w6_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW5(lecture);
                classroom.setW6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW5(lecture);
                classroom.setW6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w5_w6_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW5(lecture);
                classroom.setW6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW5(lecture);
                classroom.setW6(lecture);
                session.save(classroom);
            }

        }

        
        //Thursday


        if (parameterNames.contains("th1_th2_1_subject") && !request.getParameter("th1_th2_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th1_th2_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th1_th2_1_classroom")));
            lecture.setHours("th1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th1_th2_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("th1_th2_1_altTeacher").equals("") && request.getParameter("th1_th2_1_altTeacher") != null && !request.getParameter("th1_th2_1_altTeacher").equals("th1_th2_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("th1_th2_1_altTeacher"));
                altTeacher.setTh1(lecture);
                altTeacher.setTh2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("th1_th2_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th1_th2_1_teacher"));
            teacher.setTh1(lecture);
            teacher.setTh2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th1_th2_1_classroom"));
            classroom.setTh1(lecture);
            classroom.setTh2(lecture);
            session.save(classroom);

            if(request.getParameter("th1_th2_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh1(lecture);
                classroom.setTh2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh1(lecture);
                classroom.setTh2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th1_th2_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh1(lecture);
                classroom.setTh2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh1(lecture);
                classroom.setTh2(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("th1_th2_2_subject") && !request.getParameter("th1_th2_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th1_th2_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th1_th2_2_classroom")));
            lecture.setHours("th1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th1_th2_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("th1_th2_2_altTeacher").equals("") && request.getParameter("th1_th2_2_altTeacher") != null && !request.getParameter("th1_th2_2_altTeacher").equals("th1_th2_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("th1_th2_2_altTeacher"));
                altTeacher.setTh1(lecture);
                altTeacher.setTh2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("th1_th2_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th1_th2_2_teacher"));
            teacher.setTh1(lecture);
            teacher.setTh2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th1_th2_2_classroom"));
            classroom.setTh1(lecture);
            classroom.setTh2(lecture);
            session.save(classroom);

            if(request.getParameter("th1_th2_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh1(lecture);
                classroom.setTh2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh1(lecture);
                classroom.setTh2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th1_th2_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh1(lecture);
                classroom.setTh2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh1(lecture);
                classroom.setTh2(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("th1_th2_3_subject") && !request.getParameter("th1_th2_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th1_th2_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th1_th2_3_classroom")));
            lecture.setHours("th1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th1_th2_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("th1_th2_3_altTeacher").equals("") && request.getParameter("th1_th2_3_altTeacher") != null && !request.getParameter("th1_th2_3_altTeacher").equals("th1_th2_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("th1_th2_3_altTeacher"));
                altTeacher.setTh1(lecture);
                altTeacher.setTh2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("th1_th2_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th1_th2_3_teacher"));
            teacher.setTh1(lecture);
            teacher.setTh2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th1_th2_3_classroom"));
            classroom.setTh1(lecture);
            classroom.setTh2(lecture);
            session.save(classroom);

            if(request.getParameter("th1_th2_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh1(lecture);
                classroom.setTh2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh1(lecture);
                classroom.setTh2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th1_th2_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh1(lecture);
                classroom.setTh2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh1(lecture);
                classroom.setTh2(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("th1_th2_4_subject") && !request.getParameter("th1_th2_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th1_th2_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th1_th2_4_classroom")));
            lecture.setHours("th1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th1_th2_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("th1_th2_4_altTeacher").equals("") && request.getParameter("th1_th2_4_altTeacher") != null && !request.getParameter("th1_th2_4_altTeacher").equals("th1_th2_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("th1_th2_4_altTeacher"));
                altTeacher.setTh1(lecture);
                altTeacher.setTh2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("th1_th2_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th1_th2_4_teacher"));
            teacher.setTh1(lecture);
            teacher.setTh2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th1_th2_4_classroom"));
            classroom.setTh1(lecture);
            classroom.setTh2(lecture);
            session.save(classroom);


            if(request.getParameter("th1_th2_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh1(lecture);
                classroom.setTh2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh1(lecture);
                classroom.setTh2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th1_th2_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh1(lecture);
                classroom.setTh2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh1(lecture);
                classroom.setTh2(lecture);
                session.save(classroom);
            }

        }



        if (parameterNames.contains("th3_th4_1_subject") && !request.getParameter("th3_th4_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th3_th4_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th3_th4_1_classroom")));
            lecture.setHours("th3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th3_th4_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("th3_th4_1_altTeacher").equals("") && request.getParameter("th3_th4_1_altTeacher") != null && !request.getParameter("th3_th4_1_altTeacher").equals("th3_th4_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("th3_th4_1_altTeacher"));
                altTeacher.setTh3(lecture);
                altTeacher.setTh4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("th3_th4_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th3_th4_1_teacher"));
            teacher.setTh3(lecture);
            teacher.setTh4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th3_th4_1_classroom"));
            classroom.setTh3(lecture);
            classroom.setTh4(lecture);
            session.save(classroom);

            if(request.getParameter("th3_th4_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh3(lecture);
                classroom.setTh4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh3(lecture);
                classroom.setTh4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th3_th4_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh3(lecture);
                classroom.setTh4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh3(lecture);
                classroom.setTh4(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("th3_th4_2_subject") && !request.getParameter("th3_th4_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th3_th4_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th3_th4_2_classroom")));
            lecture.setHours("th3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th3_th4_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("th3_th4_2_altTeacher").equals("") && request.getParameter("th3_th4_2_altTeacher") != null && !request.getParameter("th3_th4_2_altTeacher").equals("th3_th4_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("th3_th4_2_altTeacher"));
                altTeacher.setTh3(lecture);
                altTeacher.setTh4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("th3_th4_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th3_th4_2_teacher"));
            teacher.setTh3(lecture);
            teacher.setTh4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th3_th4_2_classroom"));
            classroom.setTh3(lecture);
            classroom.setTh4(lecture);
            session.save(classroom);

            if(request.getParameter("th3_th4_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh3(lecture);
                classroom.setTh4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh3(lecture);
                classroom.setTh4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th3_th4_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh3(lecture);
                classroom.setTh4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh3(lecture);
                classroom.setTh4(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("th3_th4_3_subject") && !request.getParameter("th3_th4_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th3_th4_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th3_th4_3_classroom")));
            lecture.setHours("th3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th3_th4_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("th3_th4_3_altTeacher").equals("") && request.getParameter("th3_th4_3_altTeacher") != null && !request.getParameter("th3_th4_3_altTeacher").equals("th3_th4_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("th3_th4_3_altTeacher"));
                altTeacher.setTh3(lecture);
                altTeacher.setTh4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("th3_th4_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th3_th4_3_teacher"));
            teacher.setTh3(lecture);
            teacher.setTh4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th3_th4_3_classroom"));
            classroom.setTh3(lecture);
            classroom.setTh4(lecture);
            session.save(classroom);

            if(request.getParameter("th3_th4_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh3(lecture);
                classroom.setTh4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh3(lecture);
                classroom.setTh4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th3_th4_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh3(lecture);
                classroom.setTh4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh3(lecture);
                classroom.setTh4(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("th3_th4_4_subject") && !request.getParameter("th3_th4_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th3_th4_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th3_th4_4_classroom")));
            lecture.setHours("th3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th3_th4_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("th3_th4_4_altTeacher").equals("") && request.getParameter("th3_th4_4_altTeacher") != null && !request.getParameter("th3_th4_4_altTeacher").equals("th3_th4_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("th3_th4_4_altTeacher"));
                altTeacher.setTh3(lecture);
                altTeacher.setTh4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("th3_th4_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th3_th4_4_teacher"));
            teacher.setTh3(lecture);
            teacher.setTh4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th3_th4_4_classroom"));
            classroom.setTh3(lecture);
            classroom.setTh4(lecture);
            session.save(classroom);


            if(request.getParameter("th3_th4_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh3(lecture);
                classroom.setTh4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh3(lecture);
                classroom.setTh4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th3_th4_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh3(lecture);
                classroom.setTh4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh3(lecture);
                classroom.setTh4(lecture);
                session.save(classroom);
            }

        }


        if (parameterNames.contains("th5_th6_1_subject") && !request.getParameter("th5_th6_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th5_th6_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th5_th6_1_classroom")));
            lecture.setHours("th5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th5_th6_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("th5_th6_1_altTeacher").equals("") && request.getParameter("th5_th6_1_altTeacher") != null && !request.getParameter("th5_th6_1_altTeacher").equals("th5_th6_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("th5_th6_1_altTeacher"));
                altTeacher.setTh5(lecture);
                altTeacher.setTh6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("th5_th6_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th5_th6_1_teacher"));
            teacher.setTh5(lecture);
            teacher.setTh6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th5_th6_1_classroom"));
            classroom.setTh5(lecture);
            classroom.setTh6(lecture);
            session.save(classroom);

            if(request.getParameter("th5_th6_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh5(lecture);
                classroom.setTh6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh5(lecture);
                classroom.setTh6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th5_th6_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh5(lecture);
                classroom.setTh6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh5(lecture);
                classroom.setTh6(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("th5_th6_2_subject") && !request.getParameter("th5_th6_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th5_th6_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th5_th6_2_classroom")));
            lecture.setHours("th5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th5_th6_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("th5_th6_2_altTeacher").equals("") && request.getParameter("th5_th6_2_altTeacher") != null && !request.getParameter("th5_th6_2_altTeacher").equals("th5_th6_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("th5_th6_2_altTeacher"));
                altTeacher.setTh5(lecture);
                altTeacher.setTh6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("th5_th6_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th5_th6_2_teacher"));
            teacher.setTh5(lecture);
            teacher.setTh6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th5_th6_2_classroom"));
            classroom.setTh5(lecture);
            classroom.setTh6(lecture);
            session.save(classroom);

            if(request.getParameter("th5_th6_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh5(lecture);
                classroom.setTh6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh5(lecture);
                classroom.setTh6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th5_th6_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh5(lecture);
                classroom.setTh6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh5(lecture);
                classroom.setTh6(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("th5_th6_3_subject") && !request.getParameter("th5_th6_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th5_th6_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th5_th6_3_classroom")));
            lecture.setHours("th5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th5_th6_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("th5_th6_3_altTeacher").equals("") && request.getParameter("th5_th6_3_altTeacher") != null && !request.getParameter("th5_th6_3_altTeacher").equals("th5_th6_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("th5_th6_3_altTeacher"));
                altTeacher.setTh5(lecture);
                altTeacher.setTh6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("th5_th6_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th5_th6_3_teacher"));
            teacher.setTh5(lecture);
            teacher.setTh6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th5_th6_3_classroom"));
            classroom.setTh5(lecture);
            classroom.setTh6(lecture);
            session.save(classroom);

            if(request.getParameter("th5_th6_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh5(lecture);
                classroom.setTh6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh5(lecture);
                classroom.setTh6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th5_th6_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh5(lecture);
                classroom.setTh6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh5(lecture);
                classroom.setTh6(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("th5_th6_4_subject") && !request.getParameter("th5_th6_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th5_th6_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th5_th6_4_classroom")));
            lecture.setHours("th5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th5_th6_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("th5_th6_4_altTeacher").equals("") && request.getParameter("th5_th6_4_altTeacher") != null && !request.getParameter("th5_th6_4_altTeacher").equals("th5_th6_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("th5_th6_4_altTeacher"));
                altTeacher.setTh5(lecture);
                altTeacher.setTh6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("th5_th6_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th5_th6_4_teacher"));
            teacher.setTh5(lecture);
            teacher.setTh6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th5_th6_4_classroom"));
            classroom.setTh5(lecture);
            classroom.setTh6(lecture);
            session.save(classroom);


            if(request.getParameter("th5_th6_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh5(lecture);
                classroom.setTh6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh5(lecture);
                classroom.setTh6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th5_th6_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh5(lecture);
                classroom.setTh6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh5(lecture);
                classroom.setTh6(lecture);
                session.save(classroom);
            }

        }
       


        //Friday


        if (parameterNames.contains("f1_f2_1_subject") && !request.getParameter("f1_f2_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f1_f2_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f1_f2_1_classroom")));
            lecture.setHours("f1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f1_f2_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("f1_f2_1_altTeacher").equals("") && request.getParameter("f1_f2_1_altTeacher") != null && !request.getParameter("f1_f2_1_altTeacher").equals("f1_f2_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("f1_f2_1_altTeacher"));
                altTeacher.setF1(lecture);
                altTeacher.setF2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("f1_f2_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f1_f2_1_teacher"));
            teacher.setF1(lecture);
            teacher.setF2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f1_f2_1_classroom"));
            classroom.setF1(lecture);
            classroom.setF2(lecture);
            session.save(classroom);

            if(request.getParameter("f1_f2_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF1(lecture);
                classroom.setF2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF1(lecture);
                classroom.setF2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f1_f2_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF1(lecture);
                classroom.setF2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF1(lecture);
                classroom.setF2(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("f1_f2_2_subject") && !request.getParameter("f1_f2_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f1_f2_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f1_f2_2_classroom")));
            lecture.setHours("f1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f1_f2_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("f1_f2_2_altTeacher").equals("") && request.getParameter("f1_f2_2_altTeacher") != null && !request.getParameter("f1_f2_2_altTeacher").equals("f1_f2_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("f1_f2_2_altTeacher"));
                altTeacher.setF1(lecture);
                altTeacher.setF2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("f1_f2_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f1_f2_2_teacher"));
            teacher.setF1(lecture);
            teacher.setF2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f1_f2_2_classroom"));
            classroom.setF1(lecture);
            classroom.setF2(lecture);
            session.save(classroom);

            if(request.getParameter("f1_f2_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF1(lecture);
                classroom.setF2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF1(lecture);
                classroom.setF2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f1_f2_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF1(lecture);
                classroom.setF2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF1(lecture);
                classroom.setF2(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("f1_f2_3_subject") && !request.getParameter("f1_f2_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f1_f2_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f1_f2_3_classroom")));
            lecture.setHours("f1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f1_f2_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("f1_f2_3_altTeacher").equals("") && request.getParameter("f1_f2_3_altTeacher") != null && !request.getParameter("f1_f2_3_altTeacher").equals("f1_f2_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("f1_f2_3_altTeacher"));
                altTeacher.setF1(lecture);
                altTeacher.setF2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("f1_f2_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f1_f2_3_teacher"));
            teacher.setF1(lecture);
            teacher.setF2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f1_f2_3_classroom"));
            classroom.setF1(lecture);
            classroom.setF2(lecture);
            session.save(classroom);

            if(request.getParameter("f1_f2_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF1(lecture);
                classroom.setF2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF1(lecture);
                classroom.setF2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f1_f2_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF1(lecture);
                classroom.setF2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF1(lecture);
                classroom.setF2(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("f1_f2_4_subject") && !request.getParameter("f1_f2_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f1_f2_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f1_f2_4_classroom")));
            lecture.setHours("f1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f1_f2_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("f1_f2_4_altTeacher").equals("") && request.getParameter("f1_f2_4_altTeacher") != null && !request.getParameter("f1_f2_4_altTeacher").equals("f1_f2_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("f1_f2_4_altTeacher"));
                altTeacher.setF1(lecture);
                altTeacher.setF2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("f1_f2_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f1_f2_4_teacher"));
            teacher.setF1(lecture);
            teacher.setF2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f1_f2_4_classroom"));
            classroom.setF1(lecture);
            classroom.setF2(lecture);
            session.save(classroom);


            if(request.getParameter("f1_f2_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF1(lecture);
                classroom.setF2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF1(lecture);
                classroom.setF2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f1_f2_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF1(lecture);
                classroom.setF2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF1(lecture);
                classroom.setF2(lecture);
                session.save(classroom);
            }

        }



        if (parameterNames.contains("f3_f4_1_subject") && !request.getParameter("f3_f4_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f3_f4_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f3_f4_1_classroom")));
            lecture.setHours("f3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f3_f4_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("f3_f4_1_altTeacher").equals("") && request.getParameter("f3_f4_1_altTeacher") != null && !request.getParameter("f3_f4_1_altTeacher").equals("f3_f4_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("f3_f4_1_altTeacher"));
                altTeacher.setF3(lecture);
                altTeacher.setF4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("f3_f4_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f3_f4_1_teacher"));
            teacher.setF3(lecture);
            teacher.setF4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f3_f4_1_classroom"));
            classroom.setF3(lecture);
            classroom.setF4(lecture);
            session.save(classroom);

            if(request.getParameter("f3_f4_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF3(lecture);
                classroom.setF4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF3(lecture);
                classroom.setF4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f3_f4_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF3(lecture);
                classroom.setF4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF3(lecture);
                classroom.setF4(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("f3_f4_2_subject") && !request.getParameter("f3_f4_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f3_f4_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f3_f4_2_classroom")));
            lecture.setHours("f3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f3_f4_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("f3_f4_2_altTeacher").equals("") && request.getParameter("f3_f4_2_altTeacher") != null && !request.getParameter("f3_f4_2_altTeacher").equals("f3_f4_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("f3_f4_2_altTeacher"));
                altTeacher.setF3(lecture);
                altTeacher.setF4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("f3_f4_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f3_f4_2_teacher"));
            teacher.setF3(lecture);
            teacher.setF4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f3_f4_2_classroom"));
            classroom.setF3(lecture);
            classroom.setF4(lecture);
            session.save(classroom);

            if(request.getParameter("f3_f4_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF3(lecture);
                classroom.setF4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF3(lecture);
                classroom.setF4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f3_f4_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF3(lecture);
                classroom.setF4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF3(lecture);
                classroom.setF4(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("f3_f4_3_subject") && !request.getParameter("f3_f4_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f3_f4_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f3_f4_3_classroom")));
            lecture.setHours("f3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f3_f4_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("f3_f4_3_altTeacher").equals("") && request.getParameter("f3_f4_3_altTeacher") != null && !request.getParameter("f3_f4_3_altTeacher").equals("f3_f4_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("f3_f4_3_altTeacher"));
                altTeacher.setF3(lecture);
                altTeacher.setF4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("f3_f4_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f3_f4_3_teacher"));
            teacher.setF3(lecture);
            teacher.setF4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f3_f4_3_classroom"));
            classroom.setF3(lecture);
            classroom.setF4(lecture);
            session.save(classroom);

            if(request.getParameter("f3_f4_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF3(lecture);
                classroom.setF4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF3(lecture);
                classroom.setF4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f3_f4_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF3(lecture);
                classroom.setF4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF3(lecture);
                classroom.setF4(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("f3_f4_4_subject") && !request.getParameter("f3_f4_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f3_f4_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f3_f4_4_classroom")));
            lecture.setHours("f3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f3_f4_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("f3_f4_4_altTeacher").equals("") && request.getParameter("f3_f4_4_altTeacher") != null && !request.getParameter("f3_f4_4_altTeacher").equals("f3_f4_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("f3_f4_4_altTeacher"));
                altTeacher.setF3(lecture);
                altTeacher.setF4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("f3_f4_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f3_f4_4_teacher"));
            teacher.setF3(lecture);
            teacher.setF4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f3_f4_4_classroom"));
            classroom.setF3(lecture);
            classroom.setF4(lecture);
            session.save(classroom);


            if(request.getParameter("f3_f4_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF3(lecture);
                classroom.setF4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF3(lecture);
                classroom.setF4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f3_f4_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF3(lecture);
                classroom.setF4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF3(lecture);
                classroom.setF4(lecture);
                session.save(classroom);
            }

        }


        if (parameterNames.contains("f5_f6_1_subject") && !request.getParameter("f5_f6_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f5_f6_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f5_f6_1_classroom")));
            lecture.setHours("f5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f5_f6_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("f5_f6_1_altTeacher").equals("") && request.getParameter("f5_f6_1_altTeacher") != null && !request.getParameter("f5_f6_1_altTeacher").equals("f5_f6_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("f5_f6_1_altTeacher"));
                altTeacher.setF5(lecture);
                altTeacher.setF6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("f5_f6_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f5_f6_1_teacher"));
            teacher.setF5(lecture);
            teacher.setF6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f5_f6_1_classroom"));
            classroom.setF5(lecture);
            classroom.setF6(lecture);
            session.save(classroom);

            if(request.getParameter("f5_f6_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF5(lecture);
                classroom.setF6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF5(lecture);
                classroom.setF6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f5_f6_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF5(lecture);
                classroom.setF6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF5(lecture);
                classroom.setF6(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("f5_f6_2_subject") && !request.getParameter("f5_f6_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f5_f6_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f5_f6_2_classroom")));
            lecture.setHours("f5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f5_f6_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("f5_f6_2_altTeacher").equals("") && request.getParameter("f5_f6_2_altTeacher") != null && !request.getParameter("f5_f6_2_altTeacher").equals("f5_f6_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("f5_f6_2_altTeacher"));
                altTeacher.setF5(lecture);
                altTeacher.setF6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("f5_f6_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f5_f6_2_teacher"));
            teacher.setF5(lecture);
            teacher.setF6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f5_f6_2_classroom"));
            classroom.setF5(lecture);
            classroom.setF6(lecture);
            session.save(classroom);

            if(request.getParameter("f5_f6_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF5(lecture);
                classroom.setF6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF5(lecture);
                classroom.setF6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f5_f6_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF5(lecture);
                classroom.setF6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF5(lecture);
                classroom.setF6(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("f5_f6_3_subject") && !request.getParameter("f5_f6_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f5_f6_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f5_f6_3_classroom")));
            lecture.setHours("f5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f5_f6_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("f5_f6_3_altTeacher").equals("") && request.getParameter("f5_f6_3_altTeacher") != null && !request.getParameter("f5_f6_3_altTeacher").equals("f5_f6_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("f5_f6_3_altTeacher"));
                altTeacher.setF5(lecture);
                altTeacher.setF6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("f5_f6_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f5_f6_3_teacher"));
            teacher.setF5(lecture);
            teacher.setF6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f5_f6_3_classroom"));
            classroom.setF5(lecture);
            classroom.setF6(lecture);
            session.save(classroom);

            if(request.getParameter("f5_f6_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF5(lecture);
                classroom.setF6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF5(lecture);
                classroom.setF6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f5_f6_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF5(lecture);
                classroom.setF6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF5(lecture);
                classroom.setF6(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("f5_f6_4_subject") && !request.getParameter("f5_f6_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f5_f6_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f5_f6_4_classroom")));
            lecture.setHours("f5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f5_f6_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("f5_f6_4_altTeacher").equals("") && request.getParameter("f5_f6_4_altTeacher") != null && !request.getParameter("f5_f6_4_altTeacher").equals("f5_f6_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("f5_f6_4_altTeacher"));
                altTeacher.setF5(lecture);
                altTeacher.setF6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("f5_f6_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f5_f6_4_teacher"));
            teacher.setF5(lecture);
            teacher.setF6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f5_f6_4_classroom"));
            classroom.setF5(lecture);
            classroom.setF6(lecture);
            session.save(classroom);


            if(request.getParameter("f5_f6_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF5(lecture);
                classroom.setF6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF5(lecture);
                classroom.setF6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f5_f6_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF5(lecture);
                classroom.setF6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF5(lecture);
                classroom.setF6(lecture);
                session.save(classroom);
            }

        }
        


        //Saturday


        if (parameterNames.contains("s1_s2_1_subject") && !request.getParameter("s1_s2_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s1_s2_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s1_s2_1_classroom")));
            lecture.setHours("s1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s1_s2_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("s1_s2_1_altTeacher").equals("") && request.getParameter("s1_s2_1_altTeacher") != null && !request.getParameter("s1_s2_1_altTeacher").equals("s1_s2_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("s1_s2_1_altTeacher"));
                altTeacher.setS1(lecture);
                altTeacher.setS2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("s1_s2_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s1_s2_1_teacher"));
            teacher.setS1(lecture);
            teacher.setS2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s1_s2_1_classroom"));
            classroom.setS1(lecture);
            classroom.setS2(lecture);
            session.save(classroom);

            if(request.getParameter("s1_s2_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS1(lecture);
                classroom.setS2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS1(lecture);
                classroom.setS2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s1_s2_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS1(lecture);
                classroom.setS2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS1(lecture);
                classroom.setS2(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("s1_s2_2_subject") && !request.getParameter("s1_s2_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s1_s2_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s1_s2_2_classroom")));
            lecture.setHours("s1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s1_s2_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("s1_s2_2_altTeacher").equals("") && request.getParameter("s1_s2_2_altTeacher") != null && !request.getParameter("s1_s2_2_altTeacher").equals("s1_s2_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("s1_s2_2_altTeacher"));
                altTeacher.setS1(lecture);
                altTeacher.setS2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("s1_s2_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s1_s2_2_teacher"));
            teacher.setS1(lecture);
            teacher.setS2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s1_s2_2_classroom"));
            classroom.setS1(lecture);
            classroom.setS2(lecture);
            session.save(classroom);

            if(request.getParameter("s1_s2_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS1(lecture);
                classroom.setS2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS1(lecture);
                classroom.setS2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s1_s2_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS1(lecture);
                classroom.setS2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS1(lecture);
                classroom.setS2(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("s1_s2_3_subject") && !request.getParameter("s1_s2_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s1_s2_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s1_s2_3_classroom")));
            lecture.setHours("s1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s1_s2_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("s1_s2_3_altTeacher").equals("") && request.getParameter("s1_s2_3_altTeacher") != null && !request.getParameter("s1_s2_3_altTeacher").equals("s1_s2_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("s1_s2_3_altTeacher"));
                altTeacher.setS1(lecture);
                altTeacher.setS2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("s1_s2_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s1_s2_3_teacher"));
            teacher.setS1(lecture);
            teacher.setS2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s1_s2_3_classroom"));
            classroom.setS1(lecture);
            classroom.setS2(lecture);
            session.save(classroom);

            if(request.getParameter("s1_s2_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS1(lecture);
                classroom.setS2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS1(lecture);
                classroom.setS2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s1_s2_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS1(lecture);
                classroom.setS2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS1(lecture);
                classroom.setS2(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("s1_s2_4_subject") && !request.getParameter("s1_s2_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s1_s2_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s1_s2_4_classroom")));
            lecture.setHours("s1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s1_s2_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("s1_s2_4_altTeacher").equals("") && request.getParameter("s1_s2_4_altTeacher") != null && !request.getParameter("s1_s2_4_altTeacher").equals("s1_s2_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("s1_s2_4_altTeacher"));
                altTeacher.setS1(lecture);
                altTeacher.setS2(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("s1_s2_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s1_s2_4_teacher"));
            teacher.setS1(lecture);
            teacher.setS2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s1_s2_4_classroom"));
            classroom.setS1(lecture);
            classroom.setS2(lecture);
            session.save(classroom);


            if(request.getParameter("s1_s2_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS1(lecture);
                classroom.setS2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS1(lecture);
                classroom.setS2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s1_s2_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS1(lecture);
                classroom.setS2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS1(lecture);
                classroom.setS2(lecture);
                session.save(classroom);
            }

        }



        if (parameterNames.contains("s3_s4_1_subject") && !request.getParameter("s3_s4_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s3_s4_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s3_s4_1_classroom")));
            lecture.setHours("s3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s3_s4_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("s3_s4_1_altTeacher").equals("") && request.getParameter("s3_s4_1_altTeacher") != null && !request.getParameter("s3_s4_1_altTeacher").equals("s3_s4_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("s3_s4_1_altTeacher"));
                altTeacher.setS3(lecture);
                altTeacher.setS4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("s3_s4_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s3_s4_1_teacher"));
            teacher.setS3(lecture);
            teacher.setS4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s3_s4_1_classroom"));
            classroom.setS3(lecture);
            classroom.setS4(lecture);
            session.save(classroom);

            if(request.getParameter("s3_s4_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS3(lecture);
                classroom.setS4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS3(lecture);
                classroom.setS4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s3_s4_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS3(lecture);
                classroom.setS4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS3(lecture);
                classroom.setS4(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("s3_s4_2_subject") && !request.getParameter("s3_s4_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s3_s4_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s3_s4_2_classroom")));
            lecture.setHours("s3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s3_s4_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("s3_s4_2_altTeacher").equals("") && request.getParameter("s3_s4_2_altTeacher") != null && !request.getParameter("s3_s4_2_altTeacher").equals("s3_s4_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("s3_s4_2_altTeacher"));
                altTeacher.setS3(lecture);
                altTeacher.setS4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("s3_s4_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s3_s4_2_teacher"));
            teacher.setS3(lecture);
            teacher.setS4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s3_s4_2_classroom"));
            classroom.setS3(lecture);
            classroom.setS4(lecture);
            session.save(classroom);

            if(request.getParameter("s3_s4_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS3(lecture);
                classroom.setS4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS3(lecture);
                classroom.setS4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s3_s4_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS3(lecture);
                classroom.setS4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS3(lecture);
                classroom.setS4(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("s3_s4_3_subject") && !request.getParameter("s3_s4_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s3_s4_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s3_s4_3_classroom")));
            lecture.setHours("s3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s3_s4_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("s3_s4_3_altTeacher").equals("") && request.getParameter("s3_s4_3_altTeacher") != null && !request.getParameter("s3_s4_3_altTeacher").equals("s3_s4_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("s3_s4_3_altTeacher"));
                altTeacher.setS3(lecture);
                altTeacher.setS4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("s3_s4_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s3_s4_3_teacher"));
            teacher.setS3(lecture);
            teacher.setS4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s3_s4_3_classroom"));
            classroom.setS3(lecture);
            classroom.setS4(lecture);
            session.save(classroom);

            if(request.getParameter("s3_s4_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS3(lecture);
                classroom.setS4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS3(lecture);
                classroom.setS4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s3_s4_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS3(lecture);
                classroom.setS4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS3(lecture);
                classroom.setS4(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("s3_s4_4_subject") && !request.getParameter("s3_s4_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s3_s4_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s3_s4_4_classroom")));
            lecture.setHours("s3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s3_s4_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("s3_s4_4_altTeacher").equals("") && request.getParameter("s3_s4_4_altTeacher") != null && !request.getParameter("s3_s4_4_altTeacher").equals("s3_s4_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("s3_s4_4_altTeacher"));
                altTeacher.setS3(lecture);
                altTeacher.setS4(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("s3_s4_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s3_s4_4_teacher"));
            teacher.setS3(lecture);
            teacher.setS4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s3_s4_4_classroom"));
            classroom.setS3(lecture);
            classroom.setS4(lecture);
            session.save(classroom);


            if(request.getParameter("s3_s4_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS3(lecture);
                classroom.setS4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS3(lecture);
                classroom.setS4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s3_s4_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS3(lecture);
                classroom.setS4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS3(lecture);
                classroom.setS4(lecture);
                session.save(classroom);
            }

        }


        if (parameterNames.contains("s5_s6_1_subject") && !request.getParameter("s5_s6_1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s5_s6_1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s5_s6_1_classroom")));
            lecture.setHours("s5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s5_s6_1_teacher")));
            lecture.setNumhours(2);

            if (!request.getParameter("s5_s6_1_altTeacher").equals("") && request.getParameter("s5_s6_1_altTeacher") != null && !request.getParameter("s5_s6_1_altTeacher").equals("s5_s6_1_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("s5_s6_1_altTeacher"));
                altTeacher.setS5(lecture);
                altTeacher.setS6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("s5_s6_1_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s5_s6_1_teacher"));
            teacher.setS5(lecture);
            teacher.setS6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s5_s6_1_classroom"));
            classroom.setS5(lecture);
            classroom.setS6(lecture);
            session.save(classroom);

            if(request.getParameter("s5_s6_1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS5(lecture);
                classroom.setS6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS5(lecture);
                classroom.setS6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s5_s6_1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS5(lecture);
                classroom.setS6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS5(lecture);
                classroom.setS6(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("s5_s6_2_subject") && !request.getParameter("s5_s6_2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s5_s6_2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s5_s6_2_classroom")));
            lecture.setHours("s5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s5_s6_2_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("s5_s6_2_altTeacher").equals("") && request.getParameter("s5_s6_2_altTeacher") != null && !request.getParameter("s5_s6_2_altTeacher").equals("s5_s6_2_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("s5_s6_2_altTeacher"));
                altTeacher.setS5(lecture);
                altTeacher.setS6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("s5_s6_2_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s5_s6_2_teacher"));
            teacher.setS5(lecture);
            teacher.setS6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s5_s6_2_classroom"));
            classroom.setS5(lecture);
            classroom.setS6(lecture);
            session.save(classroom);

            if(request.getParameter("s5_s6_2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS5(lecture);
                classroom.setS6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS5(lecture);
                classroom.setS6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s5_s6_2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS5(lecture);
                classroom.setS6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS5(lecture);
                classroom.setS6(lecture);
                session.save(classroom);
            }


        }

        if (parameterNames.contains("s5_s6_3_subject") && !request.getParameter("s5_s6_3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s5_s6_3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s5_s6_3_classroom")));
            lecture.setHours("s5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s5_s6_3_teacher")));

            lecture.setNumhours(2);
            if (!request.getParameter("s5_s6_3_altTeacher").equals("") && request.getParameter("s5_s6_3_altTeacher") != null && !request.getParameter("s5_s6_3_altTeacher").equals("s5_s6_3_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("s5_s6_3_altTeacher"));
                altTeacher.setS5(lecture);
                altTeacher.setS6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("s5_s6_3_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s5_s6_3_teacher"));
            teacher.setS5(lecture);
            teacher.setS6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s5_s6_3_classroom"));
            classroom.setS5(lecture);
            classroom.setS6(lecture);
            session.save(classroom);

            if(request.getParameter("s5_s6_3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS5(lecture);
                classroom.setS6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS5(lecture);
                classroom.setS6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s5_s6_3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS5(lecture);
                classroom.setS6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS5(lecture);
                classroom.setS6(lecture);
                session.save(classroom);
            }

        }

        if (parameterNames.contains("s5_s6_4_subject") && !request.getParameter("s5_s6_4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s5_s6_4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s5_s6_4_classroom")));
            lecture.setHours("s5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s5_s6_4_teacher")));

            lecture.setNumhours(2);

            if (!request.getParameter("s5_s6_4_altTeacher").equals("") && request.getParameter("s5_s6_4_altTeacher") != null && !request.getParameter("s5_s6_4_altTeacher").equals("s5_s6_4_teacher")){
                altTeacher = session.get(Teacher.class , request.getParameter("s5_s6_4_altTeacher"));
                altTeacher.setS5(lecture);
                altTeacher.setS6(lecture);
                lecture.setAltTeacher(session.get(Tteacher.class , request.getParameter("s5_s6_4_altTeacher")));
            }

            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s5_s6_4_teacher"));
            teacher.setS5(lecture);
            teacher.setS6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s5_s6_4_classroom"));
            classroom.setS5(lecture);
            classroom.setS6(lecture);
            session.save(classroom);


            if(request.getParameter("s5_s6_4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS5(lecture);
                classroom.setS6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS5(lecture);
                classroom.setS6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s5_s6_4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS5(lecture);
                classroom.setS6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS5(lecture);
                classroom.setS6(lecture);
                session.save(classroom);
            }

        }


























        //Lectures

        if (parameterNames.contains("m1_subject") && !request.getParameter("m1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m1_classroom")));
            lecture.setHours("m1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m1_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m1_teacher"));
            teacher.setM1(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m1_classroom"));
            classroom.setM1(lecture);
            session.save(classroom);

            if(request.getParameter("m1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM1(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM1(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM1(lecture);
                session.save(classroom);
                
                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM1(lecture);
                session.save(classroom);
            }
        }


        if (parameterNames.contains("m2_subject") && !request.getParameter("m2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m2_classroom")));
            lecture.setHours("m2");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m2_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m2_teacher"));
            teacher.setM2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m2_classroom"));
            classroom.setM2(lecture);
            session.save(classroom);

            if(request.getParameter("m2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM2(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("m3_subject") && !request.getParameter("m3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m3_classroom")));
            lecture.setHours("m3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m3_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m3_teacher"));
            teacher.setM3(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m3_classroom"));
            classroom.setM3(lecture);
            session.save(classroom);

            if(request.getParameter("m3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM3(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM3(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM3(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM3(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("m4_subject") && !request.getParameter("m4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m4_classroom")));
            lecture.setHours("m4");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m4_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m4_teacher"));
            teacher.setM4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m4_classroom"));
            classroom.setM4(lecture);
            session.save(classroom);

            if(request.getParameter("m4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM4(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("m5_subject") && !request.getParameter("m5_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m5_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m5_classroom")));
            lecture.setHours("m5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m5_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m5_teacher"));
            teacher.setM5(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m5_classroom"));
            classroom.setM5(lecture);
            session.save(classroom);

            if(request.getParameter("m5_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM5(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM5(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m5_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM5(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM5(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("m6_subject") && !request.getParameter("m6_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("m6_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("m6_classroom")));
            lecture.setHours("m6");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("m6_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("m6_teacher"));
            teacher.setM6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("m6_classroom"));
            classroom.setM6(lecture);
            session.save(classroom);

            if(request.getParameter("m6_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setM6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setM6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("m6_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setM6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setM6(lecture);
                session.save(classroom);
            }
        }
        
        
        
        //Tuesday
        if (parameterNames.contains("tue1_subject") && !request.getParameter("tue1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue1_classroom")));
            lecture.setHours("tue1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue1_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue1_teacher"));
            teacher.setTue1(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue1_classroom"));
            classroom.setTue1(lecture);
            session.save(classroom);

            if(request.getParameter("tue1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue1(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue1(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue1(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue1(lecture);
                session.save(classroom);
            }
        }


        if (parameterNames.contains("tue2_subject") && !request.getParameter("tue2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue2_classroom")));
            lecture.setHours("tue2");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue2_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue2_teacher"));
            teacher.setTue2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue2_classroom"));
            classroom.setTue2(lecture);
            session.save(classroom);

            if(request.getParameter("tue2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue2(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("tue3_subject") && !request.getParameter("tue3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue3_classroom")));
            lecture.setHours("tue3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue3_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue3_teacher"));
            teacher.setTue3(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue3_classroom"));
            classroom.setTue3(lecture);
            session.save(classroom);

            if(request.getParameter("tue3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue3(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue3(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue3(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue3(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("tue4_subject") && !request.getParameter("tue4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue4_classroom")));
            lecture.setHours("tue4");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue4_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue4_teacher"));
            teacher.setTue4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue4_classroom"));
            classroom.setTue4(lecture);
            session.save(classroom);

            if(request.getParameter("tue4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue4(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("tue5_subject") && !request.getParameter("tue5_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue5_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue5_classroom")));
            lecture.setHours("tue5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue5_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue5_teacher"));
            teacher.setTue5(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue5_classroom"));
            classroom.setTue5(lecture);
            session.save(classroom);

            if(request.getParameter("tue5_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue5(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue5(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue5_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue5(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue5(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("tue6_subject") && !request.getParameter("tue6_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("tue6_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("tue6_classroom")));
            lecture.setHours("tue6");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("tue6_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("tue6_teacher"));
            teacher.setTue6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("tue6_classroom"));
            classroom.setTue6(lecture);
            session.save(classroom);

            if(request.getParameter("tue6_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTue6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTue6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("tue6_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTue6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTue6(lecture);
                session.save(classroom);
            }
        }
        
        //Wednesday

        if (parameterNames.contains("w1_subject") && !request.getParameter("w1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w1_classroom")));
            lecture.setHours("w1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w1_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w1_teacher"));
            teacher.setW1(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w1_classroom"));
            classroom.setW1(lecture);
            session.save(classroom);

            if(request.getParameter("w1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW1(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW1(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW1(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW1(lecture);
                session.save(classroom);
            }
        }


        if (parameterNames.contains("w2_subject") && !request.getParameter("w2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w2_classroom")));
            lecture.setHours("w2");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w2_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w2_teacher"));
            teacher.setW2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w2_classroom"));
            classroom.setW2(lecture);
            session.save(classroom);

            if(request.getParameter("w2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW2(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("w3_subject") && !request.getParameter("w3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w3_classroom")));
            lecture.setHours("w3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w3_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w3_teacher"));
            teacher.setW3(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w3_classroom"));
            classroom.setW3(lecture);
            session.save(classroom);

            if(request.getParameter("w3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW3(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW3(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW3(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW3(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("w4_subject") && !request.getParameter("w4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w4_classroom")));
            lecture.setHours("w4");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w4_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w4_teacher"));
            teacher.setW4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w4_classroom"));
            classroom.setW4(lecture);
            session.save(classroom);

            if(request.getParameter("w4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW4(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("w5_subject") && !request.getParameter("w5_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w5_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w5_classroom")));
            lecture.setHours("w5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w5_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w5_teacher"));
            teacher.setW5(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w5_classroom"));
            classroom.setW5(lecture);
            session.save(classroom);

            if(request.getParameter("w5_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW5(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW5(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w5_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW5(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW5(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("w6_subject") && !request.getParameter("w6_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("w6_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("w6_classroom")));
            lecture.setHours("w6");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("w6_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("w6_teacher"));
            teacher.setW6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("w6_classroom"));
            classroom.setW6(lecture);
            session.save(classroom);

            if(request.getParameter("w6_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setW6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setW6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("w6_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setW6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setW6(lecture);
                session.save(classroom);
            }
        }
        
        
        //Thursday

        if (parameterNames.contains("th1_subject") && !request.getParameter("th1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th1_classroom")));
            lecture.setHours("th1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th1_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th1_teacher"));
            teacher.setTh1(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th1_classroom"));
            classroom.setTh1(lecture);
            session.save(classroom);

            if(request.getParameter("th1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh1(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh1(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh1(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh1(lecture);
                session.save(classroom);
            }
        }


        if (parameterNames.contains("th2_subject") && !request.getParameter("th2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th2_classroom")));
            lecture.setHours("th2");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th2_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th2_teacher"));
            teacher.setTh2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th2_classroom"));
            classroom.setTh2(lecture);
            session.save(classroom);

            if(request.getParameter("th2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh2(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("th3_subject") && !request.getParameter("th3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th3_classroom")));
            lecture.setHours("th3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th3_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th3_teacher"));
            teacher.setTh3(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th3_classroom"));
            classroom.setTh3(lecture);
            session.save(classroom);

            if(request.getParameter("th3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh3(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh3(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh3(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh3(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("th4_subject") && !request.getParameter("th4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th4_classroom")));
            lecture.setHours("th4");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th4_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th4_teacher"));
            teacher.setTh4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th4_classroom"));
            classroom.setTh4(lecture);
            session.save(classroom);

            if(request.getParameter("th4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh4(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("th5_subject") && !request.getParameter("th5_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th5_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th5_classroom")));
            lecture.setHours("th5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th5_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th5_teacher"));
            teacher.setTh5(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th5_classroom"));
            classroom.setTh5(lecture);
            session.save(classroom);

            if(request.getParameter("th5_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh5(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh5(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th5_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh5(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh5(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("th6_subject") && !request.getParameter("th6_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("th6_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("th6_classroom")));
            lecture.setHours("th6");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("th6_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("th6_teacher"));
            teacher.setTh6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("th6_classroom"));
            classroom.setTh6(lecture);
            session.save(classroom);

            if(request.getParameter("th6_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setTh6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setTh6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("th6_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setTh6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setTh6(lecture);
                session.save(classroom);
            }
        }
        
        //Friday

        if (parameterNames.contains("f1_subject") && !request.getParameter("f1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f1_classroom")));
            lecture.setHours("f1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f1_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f1_teacher"));
            teacher.setF1(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f1_classroom"));
            classroom.setF1(lecture);
            session.save(classroom);

            if(request.getParameter("f1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF1(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF1(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF1(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF1(lecture);
                session.save(classroom);
            }
        }


        if (parameterNames.contains("f2_subject") && !request.getParameter("f2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f2_classroom")));
            lecture.setHours("f2");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f2_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f2_teacher"));
            teacher.setF2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f2_classroom"));
            classroom.setF2(lecture);
            session.save(classroom);

            if(request.getParameter("f2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF2(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("f3_subject") && !request.getParameter("f3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f3_classroom")));
            lecture.setHours("f3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f3_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f3_teacher"));
            teacher.setF3(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f3_classroom"));
            classroom.setF3(lecture);
            session.save(classroom);

            if(request.getParameter("f3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF3(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF3(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF3(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF3(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("f4_subject") && !request.getParameter("f4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f4_classroom")));
            lecture.setHours("f4");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f4_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f4_teacher"));
            teacher.setF4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f4_classroom"));
            classroom.setF4(lecture);
            session.save(classroom);

            if(request.getParameter("f4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF4(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("f5_subject") && !request.getParameter("f5_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f5_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f5_classroom")));
            lecture.setHours("f5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f5_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f5_teacher"));
            teacher.setF5(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f5_classroom"));
            classroom.setF5(lecture);
            session.save(classroom);

            if(request.getParameter("f5_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF5(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF5(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f5_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF5(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF5(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("f6_subject") && !request.getParameter("f6_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("f6_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("f6_classroom")));
            lecture.setHours("f6");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("f6_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("f6_teacher"));
            teacher.setF6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("f6_classroom"));
            classroom.setF6(lecture);
            session.save(classroom);

            if(request.getParameter("f6_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setF6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setF6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("f6_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setF6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setF6(lecture);
                session.save(classroom);
            }
        }
        
        //Saturday

        if (parameterNames.contains("s1_subject") && !request.getParameter("s1_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s1_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s1_classroom")));
            lecture.setHours("s1");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s1_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s1_teacher"));
            teacher.setS1(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s1_classroom"));
            classroom.setS1(lecture);
            session.save(classroom);

            if(request.getParameter("s1_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS1(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS1(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s1_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS1(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS1(lecture);
                session.save(classroom);
            }
        }


        if (parameterNames.contains("s2_subject") && !request.getParameter("s2_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s2_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s2_classroom")));
            lecture.setHours("s2");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s2_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s2_teacher"));
            teacher.setS2(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s2_classroom"));
            classroom.setS2(lecture);
            session.save(classroom);

            if(request.getParameter("s2_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS2(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s2_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS2(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS2(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("s3_subject") && !request.getParameter("s3_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s3_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s3_classroom")));
            lecture.setHours("s3");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s3_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s3_teacher"));
            teacher.setS3(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s3_classroom"));
            classroom.setS3(lecture);
            session.save(classroom);

            if(request.getParameter("s3_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS3(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS3(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s3_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS3(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS3(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("s4_subject") && !request.getParameter("s4_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s4_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s4_classroom")));
            lecture.setHours("s4");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s4_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s4_teacher"));
            teacher.setS4(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s4_classroom"));
            classroom.setS4(lecture);
            session.save(classroom);

            if(request.getParameter("s4_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS4(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s4_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS4(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS4(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("s5_subject") && !request.getParameter("s5_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s5_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s5_classroom")));
            lecture.setHours("s5");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s5_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s5_teacher"));
            teacher.setS5(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s5_classroom"));
            classroom.setS5(lecture);
            session.save(classroom);

            if(request.getParameter("s5_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS5(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS5(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s5_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS5(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS5(lecture);
                session.save(classroom);
            }
        }

        if (parameterNames.contains("s6_subject") && !request.getParameter("s6_subject").equals("")) {


            lecture = new Lectures();
            lecture.setAcademicclasses(session.get(Academicclasses.class, aclass));
            lecture.setSubject(request.getParameter("s6_subject"));
            lecture.setClassroom(session.get(Tclassroom.class, request.getParameter("s6_classroom")));
            lecture.setHours("s6");
            lecture.setTeacher(session.get(Tteacher.class, request.getParameter("s6_teacher")));
            lecture.setNumhours(1);
            session.save(lecture);

            teacher = session.get(Teacher.class, request.getParameter("s6_teacher"));
            teacher.setS6(lecture);
            session.save(teacher);

            classroom = session.get(Classroom.class, request.getParameter("s6_classroom"));
            classroom.setS6(lecture);
            session.save(classroom);

            if(request.getParameter("s6_classroom").equalsIgnoreCase("CC-II")){
                classroom = session.get(Classroom.class,"CC-IIA");
                classroom.setS6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IIB");
                classroom.setS6(lecture);
                session.save(classroom);
            }

            if(request.getParameter("s6_classroom").equalsIgnoreCase("CC-I")){
                classroom = session.get(Classroom.class,"CC-IA");
                classroom.setS6(lecture);
                session.save(classroom);

                classroom = session.get(Classroom.class,"CC-IB");
                classroom.setS6(lecture);
                session.save(classroom);
            }
        }
       
    }
}


