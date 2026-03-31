package study.ch08;

public class Practice {
    public static void main(String[] args) {

        class program { // 프로그램 클래스 정의


            void Action(int startDan, int startNum) { // 실제 구구단 실행 메서드 정의

                int endNum = 10;
                int firstNumSkip = 0;

                System.out.print("----------------\n"); // 단 시작 전 줄 나눔 출력
                for(int i = startDan; i < endNum; i++) {

                    if (i == firstNumSkip) { // 초기 실행 0값 스킵
                        continue;
                    }

                    for(int j = startNum; j < endNum; j++) {
                        if (j == firstNumSkip) {
                            continue;
                        }
                        int result = i * j;
                        System.out.println(i + " * " + j + " = " + result);

                    }
                    System.out.print("----------------"); // 단 종료후 for문 탈출 & 줄 나눔 출력
                    System.out.println();
                }
            }

        }

        program p1 = new program(); // 새로운 객체 생성
        p1.Action(5 , 1); // p1 객체에 Action() 메서드를 참조

    }
}
