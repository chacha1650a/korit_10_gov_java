package study.ch18;

import study.ch17.User;

class Person {

}

class Student extends Person{

}

class HighStudent extends Student {

}

public class Wildcard {
    // ? extends Object
    // 상한 제한이 없는 와일드카드(Object)
    public static void print(SuccessResponse<?> sr) {
        System.out.println(sr);
    }

    // 와일드 카드에서는 오버로딩을 사용할 수 없음.
    // 와일드 카드에서 상속을 사용하면 상한선이 정해진다.

    // 상한 제한 와일드카드
    public static void print2(SuccessResponse<? extends Student> sr) {
        System.out.println(sr);
    }

    // 하한 제한 와일드카드
    public static void print3(SuccessResponse<? super Student> sr) {
        System.out.println(sr);
    }

    public static void main(String[] args) {
        // 해당 변수들에도 직접 와일드카드 사용이 가능하나 어떤 타입이 들어올지 모르기에
        // 다운캐스팅을 해줘야 한다는 점을 유의 해야한다.
        SuccessResponse<User> sr1 = new SuccessResponse<>(200, User.builder().build());
        SuccessResponse<String> sr2 = new SuccessResponse<>(201, "그냥 문자열");

        Wildcard.print(sr1);
        Wildcard.print(sr2);

//        Wildcard.print2(new SuccessResponse<Person>(200, new Person())); 상한 제약에 걸림
        Wildcard.print2(new SuccessResponse<>(200, new Student()));
//        Wildcard.print3(new SuccessResponse<HighStudent>(200, new HighStudent())); 하한 제약에 걸림


    }
}
