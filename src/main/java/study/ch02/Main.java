package study.ch02;

public class Main {
    public static void main(String[] args) {
        // 문자열(문자들의 나열) : String
        // String : 문자열의 개념과 생성 방법
        // 문자열 연결 : + 연산자와 concat 메서드
        // 주요 메서드 : length , charAt , substring , indexOf
        // 문자열 비교 == 과 equals의 차이
        // 문자열 변환 : 숫자 <-> 문자열, 대소문자 변환
        // String 포맷팅 : printf와 String.format

        String name = "김대훈";
        System.out.println(name);
        // 주석 : 소스 코드 중간중간 메모를 남길 때 사용
        String name2 =/* "김" + "대" + */"훈" + 2; // 리터럴 상수 2는 문자열로 자동 승격
        System.out.println(name2 + "\n");
        System.out.print("김\t");
        System.out.print("대");
        System.out.print("훈");

    }
}
