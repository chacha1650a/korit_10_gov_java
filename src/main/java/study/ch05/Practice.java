package study.ch05;

public class Practice {
    public static void main(String[] args) {

        int height = 140;
        int age = 7;

        if (age >= 7 && height >= 140) {
            System.out.println("탑승 가능입니다.");
        } else {
            if (age < 7) {
                System.out.println("나이는 7세 이상이어야합니다.");
            } else {
                System.out.println("키는 140cm 이상이어야합니다.");
            }
            System.out.println("탑승 불가능입니다.");
        }
    }
}
