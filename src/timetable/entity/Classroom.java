package timetable.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Classroom {
    private String classroom;
    private Lectures m1;
    private Lectures m2;
    private Lectures m3;
    private Lectures m4;
    private Lectures m5;
    private Lectures m6;
    private Lectures tue1;
    private Lectures tue2;
    private Lectures tue3;
    private Lectures tue4;
    private Lectures tue5;
    private Lectures tue6;
    private Lectures w1;
    private Lectures w2;
    private Lectures w3;
    private Lectures w4;
    private Lectures w5;
    private Lectures w6;
    private Lectures th1;
    private Lectures th2;
    private Lectures th3;
    private Lectures th4;
    private Lectures th5;
    private Lectures th6;
    private Lectures f1;
    private Lectures f2;
    private Lectures f3;
    private Lectures f4;
    private Lectures f5;
    private Lectures f6;
    private Lectures s1;
    private Lectures s2;
    private Lectures s3;
    private Lectures s4;
    private Lectures s5;
    private Lectures s6;
    private Integer isVar;

    @Id
    @Column(name = "Classroom")
    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @OneToOne
    @JoinColumn(name = "m1")
    public Lectures getM1() {
        return m1;
    }

    public void setM1(Lectures m1) {
        this.m1 = m1;
    }

    @OneToOne
    @JoinColumn(name = "m2")
    public Lectures getM2() {
        return m2;
    }

    public void setM2(Lectures m2) {
        this.m2 = m2;
    }

    @OneToOne
    @JoinColumn(name = "m3")
    public Lectures getM3() {
        return m3;
    }

    public void setM3(Lectures m3) {
        this.m3 = m3;
    }

    @OneToOne
    @JoinColumn(name = "m4")
    public Lectures getM4() {
        return m4;
    }

    public void setM4(Lectures m4) {
        this.m4 = m4;
    }

    @OneToOne
    @JoinColumn(name = "m5")
    public Lectures getM5() {
        return m5;
    }

    public void setM5(Lectures m5) {
        this.m5 = m5;
    }

    @OneToOne
    @JoinColumn(name = "m6")
    public Lectures getM6() {
        return m6;
    }

    public void setM6(Lectures m6) {
        this.m6 = m6;
    }

    @OneToOne
    @JoinColumn(name = "tue1")
    public Lectures getTue1() {
        return tue1;
    }

    public void setTue1(Lectures tue1) {
        this.tue1 = tue1;
    }

    @OneToOne
    @JoinColumn(name = "tue2")
    public Lectures getTue2() {
        return tue2;
    }

    public void setTue2(Lectures tue2) {
        this.tue2 = tue2;
    }

    @OneToOne
    @JoinColumn(name = "tue3")
    public Lectures getTue3() {
        return tue3;
    }

    public void setTue3(Lectures tue3) {
        this.tue3 = tue3;
    }

    @OneToOne
    @JoinColumn(name = "tue4")
    public Lectures getTue4() {
        return tue4;
    }

    public void setTue4(Lectures tue4) {
        this.tue4 = tue4;
    }

    @OneToOne
    @JoinColumn(name = "tue5")
    public Lectures getTue5() {
        return tue5;
    }

    public void setTue5(Lectures tue5) {
        this.tue5 = tue5;
    }

    @OneToOne
    @JoinColumn(name = "tue6")
    public Lectures getTue6() {
        return tue6;
    }

    public void setTue6(Lectures tue6) {
        this.tue6 = tue6;
    }

    @OneToOne
    @JoinColumn(name = "w1")
    public Lectures getW1() {
        return w1;
    }

    public void setW1(Lectures w1) {
        this.w1 = w1;
    }

    @OneToOne
    @JoinColumn(name = "w2")
    public Lectures getW2() {
        return w2;
    }

    public void setW2(Lectures w2) {
        this.w2 = w2;
    }

    @OneToOne
    @JoinColumn(name = "w3")
    public Lectures getW3() {
        return w3;
    }

    public void setW3(Lectures w3) {
        this.w3 = w3;
    }

    @OneToOne
    @JoinColumn(name = "w4")
    public Lectures getW4() {
        return w4;
    }

    public void setW4(Lectures w4) {
        this.w4 = w4;
    }

    @OneToOne
    @JoinColumn(name = "w5")
    public Lectures getW5() {
        return w5;
    }

    public void setW5(Lectures w5) {
        this.w5 = w5;
    }

    @OneToOne
    @JoinColumn(name = "w6")
    public Lectures getW6() {
        return w6;
    }

    public void setW6(Lectures w6) {
        this.w6 = w6;
    }

    @OneToOne
    @JoinColumn(name = "th1")
    public Lectures getTh1() {
        return th1;
    }

    public void setTh1(Lectures th1) {
        this.th1 = th1;
    }

    @OneToOne
    @JoinColumn(name = "th2")
    public Lectures getTh2() {
        return th2;
    }

    public void setTh2(Lectures th2) {
        this.th2 = th2;
    }

    @OneToOne
    @JoinColumn(name = "th3")
    public Lectures getTh3() {
        return th3;
    }

    public void setTh3(Lectures th3) {
        this.th3 = th3;
    }

    @OneToOne
    @JoinColumn(name = "th4")
    public Lectures getTh4() {
        return th4;
    }

    public void setTh4(Lectures th4) {
        this.th4 = th4;
    }

    @OneToOne
    @JoinColumn(name = "th5")
    public Lectures getTh5() {
        return th5;
    }

    public void setTh5(Lectures th5) {
        this.th5 = th5;
    }

    @OneToOne
    @JoinColumn(name = "th6")
    public Lectures getTh6() {
        return th6;
    }

    public void setTh6(Lectures th6) {
        this.th6 = th6;
    }

    @OneToOne
    @JoinColumn(name = "f1")
    public Lectures getF1() {
        return f1;
    }

    public void setF1(Lectures f1) {
        this.f1 = f1;
    }

    @OneToOne
    @JoinColumn(name = "f2")
    public Lectures getF2() {
        return f2;
    }

    public void setF2(Lectures f2) {
        this.f2 = f2;
    }

    @OneToOne
    @JoinColumn(name = "f3")
    public Lectures getF3() {
        return f3;
    }

    public void setF3(Lectures f3) {
        this.f3 = f3;
    }

    @OneToOne
    @JoinColumn(name = "f4")
    public Lectures getF4() {
        return f4;
    }

    public void setF4(Lectures f4) {
        this.f4 = f4;
    }

    @OneToOne
    @JoinColumn(name = "f5")
    public Lectures getF5() {
        return f5;
    }

    public void setF5(Lectures f5) {
        this.f5 = f5;
    }

    @OneToOne
    @JoinColumn(name = "f6")
    public Lectures getF6() {
        return f6;
    }

    public void setF6(Lectures f6) {
        this.f6 = f6;
    }

    @OneToOne
    @JoinColumn(name = "s1")
    public Lectures getS1() {
        return s1;
    }

    public void setS1(Lectures s1) {
        this.s1 = s1;
    }

    @OneToOne
    @JoinColumn(name = "s2")
    public Lectures getS2() {
        return s2;
    }

    public void setS2(Lectures s2) {
        this.s2 = s2;
    }

    @OneToOne
    @JoinColumn(name = "s3")
    public Lectures getS3() {
        return s3;
    }

    public void setS3(Lectures s3) {
        this.s3 = s3;
    }

    @OneToOne
    @JoinColumn(name = "s4")
    public Lectures getS4() {
        return s4;
    }

    public void setS4(Lectures s4) {
        this.s4 = s4;
    }

    @OneToOne
    @JoinColumn(name = "s5")
    public Lectures getS5() {
        return s5;
    }

    public void setS5(Lectures s5) {
        this.s5 = s5;
    }

    @OneToOne
    @JoinColumn(name = "s6")
    public Lectures getS6() {
        return s6;
    }

    public void setS6(Lectures s6) {
        this.s6 = s6;
    }

    @Column(name = "isVar")
    public Integer getIsVar() {
        return isVar;
    }

    public void setIsVar(Integer isVar) {
        this.isVar = isVar;
    }


    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom1 = (Classroom) o;
        return Objects.equals(classroom, classroom1.classroom) &&
                Objects.equals(m1, classroom1.m1) &&
                Objects.equals(m2, classroom1.m2) &&
                Objects.equals(m3, classroom1.m3) &&
                Objects.equals(m4, classroom1.m4) &&
                Objects.equals(m5, classroom1.m5) &&
                Objects.equals(m6, classroom1.m6) &&
                Objects.equals(tue1, classroom1.tue1) &&
                Objects.equals(tue2, classroom1.tue2) &&
                Objects.equals(tue3, classroom1.tue3) &&
                Objects.equals(tue4, classroom1.tue4) &&
                Objects.equals(tue5, classroom1.tue5) &&
                Objects.equals(tue6, classroom1.tue6) &&
                Objects.equals(w1, classroom1.w1) &&
                Objects.equals(w2, classroom1.w2) &&
                Objects.equals(w3, classroom1.w3) &&
                Objects.equals(w4, classroom1.w4) &&
                Objects.equals(w5, classroom1.w5) &&
                Objects.equals(w6, classroom1.w6) &&
                Objects.equals(th1, classroom1.th1) &&
                Objects.equals(th2, classroom1.th2) &&
                Objects.equals(th3, classroom1.th3) &&
                Objects.equals(th4, classroom1.th4) &&
                Objects.equals(th5, classroom1.th5) &&
                Objects.equals(th6, classroom1.th6) &&
                Objects.equals(f1, classroom1.f1) &&
                Objects.equals(f2, classroom1.f2) &&
                Objects.equals(f3, classroom1.f3) &&
                Objects.equals(f4, classroom1.f4) &&
                Objects.equals(f5, classroom1.f5) &&
                Objects.equals(f6, classroom1.f6) &&
                Objects.equals(s1, classroom1.s1) &&
                Objects.equals(s2, classroom1.s2) &&
                Objects.equals(s3, classroom1.s3) &&
                Objects.equals(s4, classroom1.s4) &&
                Objects.equals(s5, classroom1.s5) &&
                Objects.equals(s6, classroom1.s6);
    }

    @Override
    public int hashCode() {

        return Objects.hash(classroom, m1, m2, m3, m4, m5, m6, tue1, tue2, tue3, tue4, tue5, tue6, w1, w2, w3, w4, w5, w6, th1, th2, th3, th4, th5, th6, f1, f2, f3, f4, f5, f6, s1, s2, s3, s4, s5, s6);
    }

}
