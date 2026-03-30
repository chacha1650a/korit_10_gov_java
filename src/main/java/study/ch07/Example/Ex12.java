package study.ch07.Example;

public class Ex12 {
    public static void main(String[] args) {
        int num = 2;
        switch (num) {
            case 1 :
                System.out.println("A");
            case 2 :
                System.out.println("B");
            case 3 :
                System.out.println("C");
            case 4 :
                System.out.println("D");
        }
    }
} // 실행 결과 : num의 값은 2로 초기화 되어서 case 2에 해당 되어 B가 출력되지만
  // break; 문이 누락 되었기에 나머지 C , D 값도 밑에 같이 출력 됨
