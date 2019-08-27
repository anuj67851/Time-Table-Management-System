package timetable.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tteacher {
    private String code;

    @Id
    @Column(name = "Code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tteacher tteacher = (Tteacher) o;
        return Objects.equals(code, tteacher.code);
    }

    @Override
    public int hashCode() {

        return Objects.hash(code);
    }
}
