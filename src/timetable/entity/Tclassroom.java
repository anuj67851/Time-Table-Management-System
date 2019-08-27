package timetable.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tclassroom {
    private String classroom;

    @Id
    @Column(name = "Classroom")
    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tclassroom that = (Tclassroom) o;
        return Objects.equals(classroom, that.classroom);
    }

    @Override
    public int hashCode() {

        return Objects.hash(classroom);
    }
}
