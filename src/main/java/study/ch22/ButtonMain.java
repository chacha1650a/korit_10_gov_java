package study.ch22;

class HomeButton implements ButtonClick{
    @Override
    public void onclick() {
        System.out.println("홈으로 이동");
    }
}

class BackButton implements ButtonClick {
    @Override
    public void onclick() {
        System.out.println("뒤로 이동");
    }
}

class LoginButton implements ButtonClick {
    @Override
    public void onclick() {
        System.out.println("로그인 요청");
    }
}

public class ButtonMain {
    public static void main(String[] args) {
        ButtonClick btn1 = new HomeButton();
        ButtonClick btn2 = new BackButton();
        ButtonClick btn3 = new LoginButton();
        ButtonClick btn4 = new ButtonClick() {
            @Override
            public void onclick() {
                System.out.println("로그인 요청");
            }
        };

        // 인터페이스에 추상 메서드가 2개이면 람다식을 사용 할 수 없다.
        ButtonClick btn5 = () -> System.out.println("로그인 요청");

        btn1.onclick();
        btn2.onclick();
        btn3.onclick();
        btn4.onclick();
        System.out.println(10 + 20);
    }
}
