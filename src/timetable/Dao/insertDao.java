package timetable.Dao;

import timetable.entity.Classroom;
import timetable.entity.Subject;
import timetable.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class insertDao {

    private SessionFactory sessionFactory;

    insertDao() {

    }

    @Autowired
    public insertDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public List<Teacher> getFreeTeachersForInsertionLecture(String dayOfWeek){
        List<Teacher> teachers;

        switch (dayOfWeek) {
            case "m1":
                teachers = getFreeTeachersm1();
                break;
            case "m2":
                teachers = getFreeTeachersm2();
                break;
            case "m3":
                teachers = getFreeTeachersm3();
                break;
            case "m4":
                teachers = getFreeTeachersm4();
                break;
            case "m5":
                teachers = getFreeTeachersm5();
                break;
            case "m6":
                teachers = getFreeTeachersm6();
                break;
            case "tue1":
                teachers = getFreeTeacherstue1();
                break;
            case "tue2":
                teachers = getFreeTeacherstue2();
                break;
            case "tue3":
                teachers = getFreeTeacherstue3();
                break;
            case "tue4":
                teachers = getFreeTeacherstue4();
                break;
            case "tue5":
                teachers = getFreeTeacherstue5();
                break;
            case "tue6":
                teachers = getFreeTeacherstue6();
                break;
            case "w1":
                teachers = getFreeTeachersw1();
                break;
            case "w2":
                teachers = getFreeTeachersw2();
                break;
            case "w3":
                teachers = getFreeTeachersw3();
                break;
            case "w4":
                teachers = getFreeTeachersw4();
                break;
            case "w5":
                teachers = getFreeTeachersw5();
                break;
            case "w6":
                teachers = getFreeTeachersw6();
                break;
            case "th1":
                teachers = getFreeTeachersth1();
                break;
            case "th2":
                teachers = getFreeTeachersth2();
                break;
            case "th3":
                teachers = getFreeTeachersth3();
                break;
            case "th4":
                teachers = getFreeTeachersth4();
                break;
            case "th5":
                teachers = getFreeTeachersth5();
                break;
            case "th6":
                teachers = getFreeTeachersth6();
                break;
            case "f1":
                teachers = getFreeTeachersf1();
                break;
            case "f2":
                teachers = getFreeTeachersf2();
                break;
            case "f3":
                teachers = getFreeTeachersf3();
                break;
            case "f4":
                teachers = getFreeTeachersf4();
                break;
            case "f5":
                teachers = getFreeTeachersf5();
                break;
            case "f6":
                teachers = getFreeTeachersf6();
                break;
            case "s1":
                teachers = getFreeTeacherss1();
                break;
            case "s2":
                teachers = getFreeTeacherss2();
                break;
            case "s3":
                teachers = getFreeTeacherss3();
                break;
            case "s4":
                teachers = getFreeTeacherss4();
                break;
            case "s5":
                teachers = getFreeTeacherss5();
                break;
            case "s6":
                teachers = getFreeTeacherss6();
                break;
            default:
                teachers = null;
                break;
        }
        
        return teachers;
    }
    
    @Transactional
    public List<Teacher> getFreeTeachersm1(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.m1 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersm2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.m2 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersm3(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.m3 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersm4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.m4 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersm5(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.m5 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersm6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.m6 = null" , Teacher.class).getResultList();
    }


    @Transactional
    public List<Teacher> getFreeTeacherstue1(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.tue1 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeacherstue2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.tue2 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeacherstue3(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.tue3 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeacherstue4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.tue4 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeacherstue5(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.tue5 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeacherstue6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.tue6 = null" , Teacher.class).getResultList();
    }



    @Transactional
    public List<Teacher> getFreeTeachersw1(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.w1 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersw2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.w2 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersw3(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.w3 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersw4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.w4 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersw5(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.w5 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersw6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.w6 = null" , Teacher.class).getResultList();
    }


    @Transactional
    public List<Teacher> getFreeTeachersth1(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.th1 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersth2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.th2 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersth3(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.th3 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersth4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.th4 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersth5(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.th5 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersth6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.th6 = null" , Teacher.class).getResultList();
    }


    @Transactional
    public List<Teacher> getFreeTeachersf1(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.f1 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersf2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.f2 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersf3(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.f3 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersf4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.f4 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersf5(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.f5 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeachersf6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.f6 = null" , Teacher.class).getResultList();
    }


    @Transactional
    public List<Teacher> getFreeTeacherss1(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.s1 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeacherss2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.s2 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeacherss3(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.s3 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeacherss4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.s4 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeacherss5(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.s5 = null" , Teacher.class).getResultList();
    }
    @Transactional
    public List<Teacher> getFreeTeacherss6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.s6 = null" , Teacher.class).getResultList();
    }














    @Transactional
    public List<Teacher> getFreeTeachersForInsertionLab(String dayOfWeek  , String nextDayOfWeek){
        List<Teacher> teachers;
        
        if (dayOfWeek.equals("m1") && nextDayOfWeek.equals("m2")){
            teachers = getFreeTeachersm1m2();
        } else if (dayOfWeek.equals("m3") && nextDayOfWeek.equals("m4")){
            teachers = getFreeTeachersm3m4();
        } else if (dayOfWeek.equals("m5") && nextDayOfWeek.equals("m6")){
            teachers = getFreeTeachersm5m6();
        } else if (dayOfWeek.equals("tue1") && nextDayOfWeek.equals("tue2")){
            teachers = getFreeTeacherstue1tue2();
        } else if (dayOfWeek.equals("tue3") && nextDayOfWeek.equals("tue4")){
            teachers = getFreeTeacherstue3tue4();
        } else if (dayOfWeek.equals("tue5") && nextDayOfWeek.equals("tue6")){
            teachers = getFreeTeacherstue5tue6();
        } else if (dayOfWeek.equals("w1") && nextDayOfWeek.equals("w2")){
            teachers = getFreeTeachersw1w2();
        } else if (dayOfWeek.equals("w3") && nextDayOfWeek.equals("w4")){
            teachers = getFreeTeachersw3w4();
        } else if (dayOfWeek.equals("w5") && nextDayOfWeek.equals("w6")){
            teachers = getFreeTeachersw5w6();
        } else if (dayOfWeek.equals("th1") && nextDayOfWeek.equals("th2")){
            teachers = getFreeTeachersth1th2();
        } else if (dayOfWeek.equals("th3") && nextDayOfWeek.equals("th4")){
            teachers = getFreeTeachersth3th4();
        } else if (dayOfWeek.equals("th5") && nextDayOfWeek.equals("th6")){
            teachers = getFreeTeachersth5th6();
        } else if (dayOfWeek.equals("f1") && nextDayOfWeek.equals("f2")){
            teachers = getFreeTeachersf1f2();
        } else if (dayOfWeek.equals("f3") && nextDayOfWeek.equals("f4")){
            teachers = getFreeTeachersf3f4();
        } else if (dayOfWeek.equals("f5") && nextDayOfWeek.equals("f6")){
            teachers = getFreeTeachersf5f6();
        } else if (dayOfWeek.equals("s1") && nextDayOfWeek.equals("s2")){
            teachers = getFreeTeacherss1s2();
        } else if (dayOfWeek.equals("s3") && nextDayOfWeek.equals("s4")){
            teachers = getFreeTeacherss3s4();
        } else if (dayOfWeek.equals("s5") && nextDayOfWeek.equals("s6")){
            teachers = getFreeTeacherss5s6();
        } else {
            teachers = null;
        }
        
        return teachers;
    }

    @Transactional
    public List<Teacher> getFreeTeachersm1m2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.m1 = null and t.m2 = null " , Teacher.class).getResultList();
    }
    
    @Transactional
    public List<Teacher> getFreeTeachersm3m4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.m3 = null and t.m4 = null " , Teacher.class).getResultList();
    }

    @Transactional
    public List<Teacher> getFreeTeachersm5m6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.m5 = null and t.m6 = null " , Teacher.class).getResultList();
    }

    
    
    @Transactional
    public List<Teacher> getFreeTeacherstue1tue2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.tue1 = null and t.tue2 = null " , Teacher.class).getResultList();
    }

    @Transactional
    public List<Teacher> getFreeTeacherstue3tue4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.tue3 = null and t.tue4 = null " , Teacher.class).getResultList();
    }

    @Transactional
    public List<Teacher> getFreeTeacherstue5tue6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.tue5 = null and t.tue6 = null " , Teacher.class).getResultList();
    }


    @Transactional
    public List<Teacher> getFreeTeachersw1w2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.w1 = null and t.w2 = null " , Teacher.class).getResultList();
    }

    @Transactional
    public List<Teacher> getFreeTeachersw3w4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.w3 = null and t.w4 = null " , Teacher.class).getResultList();
    }

    @Transactional
    public List<Teacher> getFreeTeachersw5w6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.w5 = null and t.w6 = null " , Teacher.class).getResultList();
    }


    @Transactional
    public List<Teacher> getFreeTeachersth1th2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.th1 = null and t.th2 = null " , Teacher.class).getResultList();
    }

    @Transactional
    public List<Teacher> getFreeTeachersth3th4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.th3 = null and t.th4 = null " , Teacher.class).getResultList();
    }

    @Transactional
    public List<Teacher> getFreeTeachersth5th6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.th5 = null and t.th6 = null " , Teacher.class).getResultList();
    }


    @Transactional
    public List<Teacher> getFreeTeachersf1f2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.f1 = null and t.f2 = null " , Teacher.class).getResultList();
    }

    @Transactional
    public List<Teacher> getFreeTeachersf3f4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.f3 = null and t.f4 = null " , Teacher.class).getResultList();
    }

    @Transactional
    public List<Teacher> getFreeTeachersf5f6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.f5 = null and t.f6 = null " , Teacher.class).getResultList();
    }


    @Transactional
    public List<Teacher> getFreeTeacherss1s2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.s1 = null and t.s2 = null " , Teacher.class).getResultList();
    }

    @Transactional
    public List<Teacher> getFreeTeacherss3s4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.s3 = null and t.s4 = null " , Teacher.class).getResultList();
    }

    @Transactional
    public List<Teacher> getFreeTeacherss5s6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Teacher t where t.s5 = null and t.s6 = null " , Teacher.class).getResultList();
    }




























































    @Transactional
    public List<Classroom> getFreeClassesForInsertionLecture(String dayOfWeek){
        List<Classroom> classrooms;

        switch (dayOfWeek) {
            case "m1":
                classrooms = getFreeclassroomsm1();
                break;
            case "m2":
                classrooms = getFreeclassroomsm2();
                break;
            case "m3":
                classrooms = getFreeclassroomsm3();
                break;
            case "m4":
                classrooms = getFreeclassroomsm4();
                break;
            case "m5":
                classrooms = getFreeclassroomsm5();
                break;
            case "m6":
                classrooms = getFreeclassroomsm6();
                break;
            case "tue1":
                classrooms = getFreeclassroomstue1();
                break;
            case "tue2":
                classrooms = getFreeclassroomstue2();
                break;
            case "tue3":
                classrooms = getFreeclassroomstue3();
                break;
            case "tue4":
                classrooms = getFreeclassroomstue4();
                break;
            case "tue5":
                classrooms = getFreeclassroomstue5();
                break;
            case "tue6":
                classrooms = getFreeclassroomstue6();
                break;
            case "w1":
                classrooms = getFreeclassroomsw1();
                break;
            case "w2":
                classrooms = getFreeclassroomsw2();
                break;
            case "w3":
                classrooms = getFreeclassroomsw3();
                break;
            case "w4":
                classrooms = getFreeclassroomsw4();
                break;
            case "w5":
                classrooms = getFreeclassroomsw5();
                break;
            case "w6":
                classrooms = getFreeclassroomsw6();
                break;
            case "th1":
                classrooms = getFreeclassroomsth1();
                break;
            case "th2":
                classrooms = getFreeclassroomsth2();
                break;
            case "th3":
                classrooms = getFreeclassroomsth3();
                break;
            case "th4":
                classrooms = getFreeclassroomsth4();
                break;
            case "th5":
                classrooms = getFreeclassroomsth5();
                break;
            case "th6":
                classrooms = getFreeclassroomsth6();
                break;
            case "f1":
                classrooms = getFreeclassroomsf1();
                break;
            case "f2":
                classrooms = getFreeclassroomsf2();
                break;
            case "f3":
                classrooms = getFreeclassroomsf3();
                break;
            case "f4":
                classrooms = getFreeclassroomsf4();
                break;
            case "f5":
                classrooms = getFreeclassroomsf5();
                break;
            case "f6":
                classrooms = getFreeclassroomsf6();
                break;
            case "s1":
                classrooms = getFreeclassroomss1();
                break;
            case "s2":
                classrooms = getFreeclassroomss2();
                break;
            case "s3":
                classrooms = getFreeclassroomss3();
                break;
            case "s4":
                classrooms = getFreeclassroomss4();
                break;
            case "s5":
                classrooms = getFreeclassroomss5();
                break;
            case "s6":
                classrooms = getFreeclassroomss6();
                break;
            default:
                classrooms = null;
                break;
        }

        return classrooms;
    }

    @Transactional
    public List<Classroom> getFreeclassroomsm1(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.m1 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsm2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.m2 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsm3(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.m3 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsm4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.m4 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsm5(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.m5 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsm6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.m6 = null" , Classroom.class).getResultList();
    }


    @Transactional
    public List<Classroom> getFreeclassroomstue1(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.tue1 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomstue2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.tue2 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomstue3(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.tue3 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomstue4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.tue4 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomstue5(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.tue5 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomstue6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.tue6 = null" , Classroom.class).getResultList();
    }



    @Transactional
    public List<Classroom> getFreeclassroomsw1(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.w1 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsw2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.w2 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsw3(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.w3 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsw4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.w4 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsw5(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.w5 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsw6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.w6 = null" , Classroom.class).getResultList();
    }


    @Transactional
    public List<Classroom> getFreeclassroomsth1(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.th1 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsth2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.th2 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsth3(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.th3 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsth4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.th4 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsth5(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.th5 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsth6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.th6 = null" , Classroom.class).getResultList();
    }


    @Transactional
    public List<Classroom> getFreeclassroomsf1(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.f1 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsf2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.f2 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsf3(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.f3 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsf4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.f4 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsf5(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.f5 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomsf6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.f6 = null" , Classroom.class).getResultList();
    }


    @Transactional
    public List<Classroom> getFreeclassroomss1(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.s1 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomss2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.s2 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomss3(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.s3 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomss4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.s4 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomss5(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.s5 = null" , Classroom.class).getResultList();
    }
    @Transactional
    public List<Classroom> getFreeclassroomss6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.s6 = null" , Classroom.class).getResultList();
    }







    @Transactional
    public List<Classroom> getFreeClassroomsForInsertionLab(String dayOfWeek  , String nextDayOfWeek){
        List<Classroom> Classrooms;

        if (dayOfWeek.equals("m1") && nextDayOfWeek.equals("m2")){
            Classrooms = getFreeClassroomsm1m2();
        } else if (dayOfWeek.equals("m3") && nextDayOfWeek.equals("m4")){
            Classrooms = getFreeClassroomsm3m4();
        } else if (dayOfWeek.equals("m5") && nextDayOfWeek.equals("m6")){
            Classrooms = getFreeClassroomsm5m6();
        } else if (dayOfWeek.equals("tue1") && nextDayOfWeek.equals("tue2")){
            Classrooms = getFreeClassroomstue1tue2();
        } else if (dayOfWeek.equals("tue3") && nextDayOfWeek.equals("tue4")){
            Classrooms = getFreeClassroomstue3tue4();
        } else if (dayOfWeek.equals("tue5") && nextDayOfWeek.equals("tue6")){
            Classrooms = getFreeClassroomstue5tue6();
        } else if (dayOfWeek.equals("w1") && nextDayOfWeek.equals("w2")){
            Classrooms = getFreeClassroomsw1w2();
        } else if (dayOfWeek.equals("w3") && nextDayOfWeek.equals("w4")){
            Classrooms = getFreeClassroomsw3w4();
        } else if (dayOfWeek.equals("w5") && nextDayOfWeek.equals("w6")){
            Classrooms = getFreeClassroomsw5w6();
        } else if (dayOfWeek.equals("th1") && nextDayOfWeek.equals("th2")){
            Classrooms = getFreeClassroomsth1th2();
        } else if (dayOfWeek.equals("th3") && nextDayOfWeek.equals("th4")){
            Classrooms = getFreeClassroomsth3th4();
        } else if (dayOfWeek.equals("th5") && nextDayOfWeek.equals("th6")){
            Classrooms = getFreeClassroomsth5th6();
        } else if (dayOfWeek.equals("f1") && nextDayOfWeek.equals("f2")){
            Classrooms = getFreeClassroomsf1f2();
        } else if (dayOfWeek.equals("f3") && nextDayOfWeek.equals("f4")){
            Classrooms = getFreeClassroomsf3f4();
        } else if (dayOfWeek.equals("f5") && nextDayOfWeek.equals("f6")){
            Classrooms = getFreeClassroomsf5f6();
        } else if (dayOfWeek.equals("s1") && nextDayOfWeek.equals("s2")){
            Classrooms = getFreeClassroomss1s2();
        } else if (dayOfWeek.equals("s3") && nextDayOfWeek.equals("s4")){
            Classrooms = getFreeClassroomss3s4();
        } else if (dayOfWeek.equals("s5") && nextDayOfWeek.equals("s6")){
            Classrooms = getFreeClassroomss5s6();
        } else {
            Classrooms = null;
        }

        return Classrooms;
    }

    @Transactional
    public List<Classroom> getFreeClassroomsm1m2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.m1 = null and t.m2 = null " , Classroom.class).getResultList();
    }

    @Transactional
    public List<Classroom> getFreeClassroomsm3m4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.m3 = null and t.m4 = null " , Classroom.class).getResultList();
    }

    @Transactional
    public List<Classroom> getFreeClassroomsm5m6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.m5 = null and t.m6 = null " , Classroom.class).getResultList();
    }



    @Transactional
    public List<Classroom> getFreeClassroomstue1tue2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.tue1 = null and t.tue2 = null " , Classroom.class).getResultList();
    }

    @Transactional
    public List<Classroom> getFreeClassroomstue3tue4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.tue3 = null and t.tue4 = null " , Classroom.class).getResultList();
    }

    @Transactional
    public List<Classroom> getFreeClassroomstue5tue6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.tue5 = null and t.tue6 = null " , Classroom.class).getResultList();
    }


    @Transactional
    public List<Classroom> getFreeClassroomsw1w2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.w1 = null and t.w2 = null " , Classroom.class).getResultList();
    }

    @Transactional
    public List<Classroom> getFreeClassroomsw3w4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.w3 = null and t.w4 = null " , Classroom.class).getResultList();
    }

    @Transactional
    public List<Classroom> getFreeClassroomsw5w6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.w5 = null and t.w6 = null " , Classroom.class).getResultList();
    }


    @Transactional
    public List<Classroom> getFreeClassroomsth1th2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.th1 = null and t.th2 = null " , Classroom.class).getResultList();
    }

    @Transactional
    public List<Classroom> getFreeClassroomsth3th4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.th3 = null and t.th4 = null " , Classroom.class).getResultList();
    }

    @Transactional
    public List<Classroom> getFreeClassroomsth5th6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.th5 = null and t.th6 = null " , Classroom.class).getResultList();
    }


    @Transactional
    public List<Classroom> getFreeClassroomsf1f2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.f1 = null and t.f2 = null " , Classroom.class).getResultList();
    }

    @Transactional
    public List<Classroom> getFreeClassroomsf3f4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.f3 = null and t.f4 = null " , Classroom.class).getResultList();
    }

    @Transactional
    public List<Classroom> getFreeClassroomsf5f6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.f5 = null and t.f6 = null " , Classroom.class).getResultList();
    }


    @Transactional
    public List<Classroom> getFreeClassroomss1s2(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.s1 = null and t.s2 = null " , Classroom.class).getResultList();
    }

    @Transactional
    public List<Classroom> getFreeClassroomss3s4(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.s3 = null and t.s4 = null " , Classroom.class).getResultList();
    }

    @Transactional
    public List<Classroom> getFreeClassroomss5s6(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Classroom t where t.s5 = null and t.s6 = null " , Classroom.class).getResultList();
    }





    @Transactional
    public List<Subject> getSubjectsForAcademicsemester(String semester){
        List<Subject> subjects;

        Session session = sessionFactory.getCurrentSession();

        subjects = session.createQuery("from Subject s where s.academicSemester like :semester" , Subject.class).setParameter("semester" ,semester).getResultList();

        return subjects;
    }


}
