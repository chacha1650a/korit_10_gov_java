package ex3.view;

import ex3.router.RouterPath;
import ex3.router.Routes;
import ex3.util.Input;

public class DepositView implements View{
    @Override
    public void render() {
        depositView();
        String cmd = Input.nextLine();
        if ("b".equals(cmd)) {
            RouterPath.current = Routes.Home.name();
        }
    }

    private void depositView() {
        System.out.println("=====<< ACCOUNT >>=====");
        System.out.println("1. 입금");
        System.out.println("b. 뒤로 가기");
        System.out.println("====================");
        System.out.println();
    }
}
