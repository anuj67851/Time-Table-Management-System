package timetable.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Lectures {
    private int id;
    private String subject;
    private Tteacher teacher;
    private Tclassroom classroom;
    private Academicclasses academicclasses;
    private String dayTime;
    private Integer numhours;
    private Tteacher altTeacher;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DayTime")
    public String getHours() {
        return dayTime;
    }

    public void setHours(String dayTime) {
        this.dayTime = dayTime;
    }

    @Basic
    @Column(name = "Subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "numhours")
    public Integer getNumhours() {
        return numhours;
    }

    public void setNumhours(Integer numhours) {
        this.numhours = numhours;
    }

    @OneToOne
    @JoinColumn(name = "TeacherCode")
    public Tteacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Tteacher teacher) {
        this.teacher = teacher;
    }


    @OneToOne
    @JoinColumn(name = "altTeacher")
    public Tteacher getAltTeacher() {
        return altTeacher;
    }

    public void setAltTeacher(Tteacher altTeacher) {
        this.altTeacher = altTeacher;
    }

    @OneToOne
    @JoinColumn(name = "Classroom")
    public Tclassroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Tclassroom classroom) {
        this.classroom = classroom;
    }

    @ManyToOne
    @JoinColumn(name = "academicClass")
    public Academicclasses getAcademicclasses() {
        return academicclasses;
    }

    public void setAcademicclasses(Academicclasses academicclasses) {
        this.academicclasses = academicclasses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lectures lectures = (Lectures) o;
        return id == lectures.id &&
                Objects.equals(dayTime, lectures.dayTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, dayTime);
    }
}
