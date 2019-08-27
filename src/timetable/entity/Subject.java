package timetable.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Subject {
    private String scode;
    private String name;
    private String shortcode;
    private String academicSemester;
    private int elective;

    @Id
    @Column(name = "scode")
    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Shortcode")
    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    @Basic
    @Column(name = "AcademicSemester")
    public String getAcademicSemester() {
        return academicSemester;
    }

    public void setAcademicSemester(String academicSemester) {
        this.academicSemester = academicSemester;
    }

    @Basic
    @Column(name = "elective")
    public int getElective() {
        return elective;
    }

    public void setElective(int elective) {
        this.elective = elective;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(scode, subject.scode) &&
                Objects.equals(name, subject.name) &&
                Objects.equals(shortcode, subject.shortcode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(scode, name, shortcode);
    }
}
