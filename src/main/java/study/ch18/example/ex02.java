//package study.ch18.example;
//
//class MyClass {
//    int instanceVar = 10;
//    static int staticVar = 20;
//
//    static void staticMethod() {
//        System.out.println(staticVar);    // ①
//        System.out.println(instanceVar);  // ②
//        instanceMethod();                 // ③
//        System.out.println(this);         // ④
//    }
//
//    void instanceMethod() {
//        System.out.println(staticVar);    // ⑤
//        staticMethod();                   // ⑥
//    }
//}


// 컴파일 오류 : 2~4번에서 컴파일 오류가 날 것이다. instanceVar는 static 필드에서 외부로 참조가 불가능하며
// 다른 메서드인 instanceMethod에도 접근이 불가하다. static은 클래스에 단 한개만 존재한다는 특성 외에도
// 인스턴스 메서드와 달리 this를 사용할 수 없기에 컴파일 오류가 날 것이다.
