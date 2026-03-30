package study.ch06;

public class Main {
    public static void main(String[] args) {

        // switch case문: 위의 조건부터 순차 실행되는 조건문으로
        // 해당 case에서 조건을 만족할 경우 break;로 switch 조건문을 중단 시킬 수 있다.

        char c = 'a';

        switch (c) {
            case 'a' :
                System.out.println("a를 선택하셨습니다.");
                break; // 해당 break; 조건이 없을 시 아래 코드도 전부 실행됨.
            case 'b' :
                System.out.println("b를 선택하셨습니다");
                break;
            case 'c' :
                System.out.println("c를 선택하셨습니다");
                break;
            case 'd' :
                System.out.println("d를 선택하셨습니다");
                break;
        }



    }
}
