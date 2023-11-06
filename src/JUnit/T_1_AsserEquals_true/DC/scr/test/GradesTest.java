package JUnit.T_1_AsserEquals_true.DC.scr.test;

import JUnit.T_1_AsserEquals_true.DC.scr.main.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradesTest {

    @Test
    void GradeA() {
        Grades grades = new Grades();
        assertEquals('A', grades.grade(95));
    }
    @Test
    void GradeB() {
        Grades grades = new Grades();
        assertEquals('B', grades.grade(85));
    }
    @Test
    void GradeC() {
        Grades grades = new Grades();
        assertEquals('C', grades.grade(75));
    }
    @Test
    void GradeD() {
        Grades grades = new Grades();
        assertEquals('D', grades.grade(65));
    }
    @Test
    void GradeE() {
        Grades grades = new Grades();
        assertEquals('E', grades.grade(55));
    }
    @Test
    void GradeF() {
        Grades grades = new Grades();
        assertEquals('F', grades.grade(45));
    }
    @Test
    void edgeTestGradeA() {
        Grades grades = new Grades();
        assertEquals('A', grades.grade(90));
    }
    @Test
    void edgeTestGradeB() {
        Grades grades = new Grades();
        assertEquals('B', grades.grade(80));
    }
    @Test
    void edgeTestGradeC() {
        Grades grades = new Grades();
        assertEquals('C', grades.grade(70));
    }
    @Test
    void edgeTestGradeD() {
        Grades grades = new Grades();
        assertEquals('D', grades.grade(60));
    }
    @Test
    void edgeTestGradeE() {
        Grades grades = new Grades();
        assertEquals('E', grades.grade(50));
    }
    @Test
    void edgeTestGradeF() {
        Grades grades = new Grades();
        assertEquals('F', grades.grade(49));
    }



}
