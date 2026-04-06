package study.ch18;

import study.ch17.User;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        ErrorResponse er = new ErrorResponse(400, User.builder().build());

        User user = (User) er.getBody();
        System.out.println(user.getUsername());

        System.out.println(((User) er.getBody()).getUsername());

        // 제네릭을 사용하면 해당 변수 내의 자료형 타입을 바꿔줄 수 있다
        // 원래 sr.getBody();를 사용하려면 다운캐스팅이 필요하지만 제네릭을 사용한다면
        // 자동으로 다운캐스팅을 해줌.
        SuccessResponse<User> sr = new SuccessResponse<>(200, User.builder().build());
        User user2 = sr.getBody();
        System.out.println(user2.getUsername());

        ErrorResponse.print(User.builder().username("test").password("1234").build());
        ErrorResponse.print(10);
        ErrorResponse.print("문자열 데이터");

        String result = ErrorResponse.print2(10, "반환 데이터");
        System.out.println(result);

        // 제네릭에선 일반 자료형 대신 Wrapper 자료형을 써야 사용이 가능하다
        SuccessResponse<String> sr2 = new SuccessResponse<>(200, "성공");
        SuccessResponse<Integer> sr3 = new SuccessResponse<>(200, 100000);
        SuccessResponse<Double> sr4 = new SuccessResponse<>(200, 115.2);
        SuccessResponse<Character> sr5 = new SuccessResponse<>(200, 'D');
        SuccessResponse<Boolean> sr6 = new SuccessResponse<>(200, true);

        Integer i = sr3.getBody();
    }
}
