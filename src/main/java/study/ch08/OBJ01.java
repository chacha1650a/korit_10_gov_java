package study.ch08;

public class OBJ01 {
    public static void main(String[] args) {
        /*
         100명의 학생 정보를 저장.
         이름 , 나이
         */

        class student { // 구조체
            String name; // 필드
            int age; // 필드

            void printInfo() {
                System.out.println("name: " + name);
                System.out.println("age: " + age);
            } // 메서드

            void increaseAge() {
                System.out.println("나이 한살 더 먹기");
                age++;
            } // 메서드
        }

       student st = new student(); //객체(Object) 생성 - 메모리 할당
        st.name = "김대훈"; // st 변수에 이름 값 저장
        st.age = 20; // st 변수에 나이 값 저장
        st.printInfo(); // student 클래스 내의 printInfo 메서드 호출
        st.increaseAge(); // student 클래스 내의 increaseAge 메서드 호출
        st.printInfo();
        st.printInfo();

        student st2 = new student(); // st와는 또 다른 객체이기에 새로운 메모리 할당
        st2.name = "김대훈2";
        st2.age = 21;

        // 메서드 : 객체의 행동(기능)을 정의하는 함수 - 클래스 내부 선언
        // 리턴타입 메서드명(변수) { 실행문; }


    }
}
