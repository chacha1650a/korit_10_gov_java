package ex3.view;

import ex3.router.RouterPath;
import ex3.router.Routes;
import ex3.util.Input;

public class AccountView implements View{
    @Override
    public void render() {
        accountMenu();
        String cmd = Input.nextLine();
        if ("1.".equals(cmd)) {
            System.out.println("계좌 생성을 진행합니다.");
        }

        if ("b".equals(cmd)) {
            RouterPath.current = Routes.Home.name();
        }
    }

    private void accountMenu() {
        System.out.println("=====<< ACCOUNT >>=====");
        System.out.println("1. 계좌 생성");
        System.out.println("b. 뒤로 가기");
        System.out.println("====================");
        System.out.println();
    }
}
