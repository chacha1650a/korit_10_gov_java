package ex1.model;

public class Student {
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;

    int getTotal(int korScore, int engScore, int mathScore) {
        int totalScore = 0;

        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;

        totalScore = korScore + engScore + mathScore;
        return totalScore;
    }

    void average(int korScore, int engScore, int mathScore) {
        double avg = 0;

        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;


    }
}
