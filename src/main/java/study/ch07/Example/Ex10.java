package study.ch07.Example;

public class Ex10 {
    public static void main(String[] args) {

        double bmi = 20.0;

        if (bmi >= 30.0) {
            System.out.println("비만");
        } else if (bmi < 30.0 && bmi >= 25.0) {
            System.out.println("과체중");
        } else if (bmi < 25.0 && bmi >= 18.5) {
            System.out.println("정상");
        } else if (bmi < 18.5){
            System.out.println("저체중");
        }
    }
}
