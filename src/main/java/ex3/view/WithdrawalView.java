package ex3.view;

import ex3.router.RouterPath;
import ex3.router.Routes;
import ex3.util.Input;

public class WithdrawalView implements View{
    @Override
    public void render() {
        withdrawalView();
        String cmd = Input.nextLine();
        if ("b".equals(cmd)) {
            RouterPath.current = Routes.Home.name();
        }
    }

    private void withdrawalView() {
        System.out.println("=====<< ACCOUNT >>=====");
        System.out.println("1. 출금");
        System.out.println("b. 뒤로 가기");
        System.out.println("====================");
        System.out.println();
    }
}
