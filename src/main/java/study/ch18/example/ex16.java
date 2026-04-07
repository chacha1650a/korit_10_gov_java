package study.ch18.example;
// 방식 A: Eager(즉시 로딩)
class SingletonA {
    private static final SingletonA INSTANCE = new SingletonA(); // 클래스 로드 초기에 객체 생성
    private SingletonA() { }
    public static SingletonA getInstance() { return INSTANCE; }
}

// 방식 B: Lazy(지연 로딩)
class SingletonB {
    private static SingletonB instance; // 초기 값이 null이기에 메모리 공간 절약 가능
    private SingletonB() { }
    public static SingletonB getInstance() {
        if (instance == null) instance = new SingletonB(); // instance가 null 값이면 객체 생성
        return instance;
    }
}

public class ex16 {
}
