package timetable.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Academicclasses {
    private String academicClass;
    private List<Lectures> allLectures;
    private int isCombinedClass;

    @Id
    @Column(name = "AcademicClass")
    public String getAcademicClass() {
        return academicClass;
    }

    public void setAcademicClass(String academicClass) {
        this.academicClass = academicClass;
    }

    @Basic
    @Column(name = "isCombinedClass")
    public int getIsCombinedClass() {
        return isCombinedClass;
    }

    public void setIsCombinedClass(int isCombinedClass) {
        this.isCombinedClass = isCombinedClass;
    }

    @OneToMany(mappedBy = "academicclasses" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    public List<Lectures> getLectures() {
        return allLectures;
    }

    public void setLectures(List<Lectures> allLectures) {
        this.allLectures = allLectures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Academicclasses that = (Academicclasses) o;
        return Objects.equals(academicClass, that.academicClass);
    }

    @Override
    public int hashCode() {

        return Objects.hash(academicClass);
    }
}
