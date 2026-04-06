package study.ch16;

import lombok.AllArgsConstructor;
import lombok.Getter;

// 내부 클래스(BB) - 이때 BB는 AA의 인스턴스 클래스가 된다.(Inner Class)
class AA {

    @Getter
    @AllArgsConstructor
    static class BB {
        private String name;
    }

    @Getter
    @AllArgsConstructor
    class CC {
        private String text;
    }
}

public class Static04 {
    public static void main(String[] args) {
        AA a = new AA();
        AA.BB b = new AA.BB("이름");
        AA.CC c = (new AA()).new CC("문자열"); // 이미 생성되어 있는 a로 CC를 생성 가능
        AA.CC c2 = a.new CC("문자열");
        b.getName();
        c.getText();
    }
}
