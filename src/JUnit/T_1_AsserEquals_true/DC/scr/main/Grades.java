package JUnit.T_1_AsserEquals_true.DC.scr.main;

public class Grades {

    public char grade(int points) {
        if (points >= 90) {
            return 'A';
        } else if (points >= 80) {
            return 'B';
        } else if (points >= 70) {
            return 'C';
        } else if (points >= 60) {
            return 'D';
        } else if (points >= 50) {
            return 'E';
        } else {
            return 'F';

        }
    }
}