package study.ch06;

public class Practice {
    public static void main(String[] args) {

        String name = "김대훈";

        if (name.equals("김대훈")) {
            System.out.println("본인이 맞습니다.");
        } else if (name.contains("대훈")) {
            System.out.println("성씨가 다릅니다.");
        } else {
            System.out.println("본인이 아닙니다.");
        }

    }
}
