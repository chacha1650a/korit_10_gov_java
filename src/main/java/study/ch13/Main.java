package study.ch13;

abstract class Person {
    private String lastName;
    private String firstName;

    public abstract void showName();
    public void showName2() {

    }
}

interface Person2 {
    // 아래 변수들에는 Static이 적용 되어 있다.
    public String firstName = "";
    public String lastName = "";


    public abstract void showName();

    // Java 8 버전 이후로는 일반 메서드 정의 가능 - default 사용 필수
    default void showName2() {

    }
}

class Student extends Person {
    @Override
    public void showName() {

    }
}

class Student2 implements Person2 {
    @Override
    public void showName() {

    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Student(); // 추상 클래스
        Person2 p2 = new Student2(); // 인터페이스
    }
}
