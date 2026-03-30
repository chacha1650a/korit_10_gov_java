package study.ch07.Example;

public class Ex30 {
    public static void main(String[] args) {
        // 코드 A
        int x = 100;
        while (x < 5) {
            System.out.println("A 실행");
            x++;
        }

        // 코드 B
        int y = 100;
        do {
            System.out.println("B 실행");
            y++;
        } while (y < 5);
    }
} // 두 코드의 차이점 : 둘 다 같은 조건인 (변수 < 5) 라는 조건이며 각각 x , y에 초기화 된 변수가
  // 5보다 큰 값임으로 코드가 실행되지 않는게 정상이지만. do-while문은 값이 false면 무조건 실행하지 않는
  // while문과는 다르게 최초 1회는 무조건 실행한다는 특징이 있기에 B실행이 출력 된다.
