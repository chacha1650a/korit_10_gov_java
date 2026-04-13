package ex2.view;

import ex2.Ex2Application;
import ex2.controller.Controller;
import ex2.dto.ResponseDto;
import ex2.router.RouterPath;
import ex2.router.Routes;
import ex2.util.Input;

import java.util.Map;

public class HomeView implements View {
    public void render() {
        homeMenu();
        String cmd = Input.nextLine();
        ResponseDto<Map<String, Object>> response = Controller.homeController(cmd);
        if (response.getStatus() == 100) {
            Ex2Application.running = false;
            return;
        }
        if (response.getStatus() != 200) {
            HomeView.homeError(response.getData().get("message").toString());
            return;
        }
    }

    private void homeMenu() {
        System.out.println("=====<< HOME >>=====");
        System.out.println("1. 계좌 생성");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("4. 계좌 조회");
        System.out.println("5. 전체 목록");
        System.out.println("6. 거래 내역");
        System.out.println("q. 종료");
        System.out.println("====================");
        System.out.println();
    }

    private static void homeError(String message) {
        System.out.println("=====<< HOME ERROR >>=====");
        System.out.println("오류 내용[" + message + "]");
        System.out.println("====================");
        System.out.println();
    }
}
