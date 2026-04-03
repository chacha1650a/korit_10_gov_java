package study.ch16;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

@Data
@AllArgsConstructor
class User {
    private Long id;
    private String name;
    private String password;

}

class userRepository {
    private final User[] users;
    private Long lastCreatedId = 0L ;

    public userRepository() {
        users = new User[100];
    }

    public boolean addUser(User user) {
        boolean isSuccess = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                user.setId(++lastCreatedId);
                users[i] = user;
                isSuccess = true;
                break;
            }
        }
        if (!isSuccess) {
            System.out.println("사용자 추가 실패");
            return isSuccess;
        }
        System.out.println("사용자 추가 성공");
        System.out.println("추가 된 사용자 정보: " + user);
        return isSuccess;
}

    public User findByUsername(String username) {
        for (User user : users) {
            if (user == null) continue;
            if (user.getPassword().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void printUsers() {
        System.out.println("사용자 전체 조회");

        for (User user : users) {
            System.out.println(user);
        }
    }
}

class UserService {
    public int signup(String usernames, String passwords) {
        // 성공 : 200, 실패 : 400(중복아이디), 500(공간부족)
        int status = 200;

        userRepository userRepository = new userRepository();
        User foundUser = userRepository.findByUsername(usernames);
        if (foundUser != null) {
            return 400;
        }
        User newUser = new User(0L, usernames, passwords);
        boolean isSuccess = userRepository.addUser(newUser);
        if (isSuccess) {
            return 500;
        }

        userRepository.printUsers();
        return 200;
    }
}

class UserController {
    public void postMapping(String usernames, String passwords) {
        UserService userService = new UserService();
        int status = userService.signup(usernames, passwords);
        switch (status) {
            case 200 :
                System.out.println("회원 등록 성공");
                break;
            case 400 :
                System.out.println("중복된 사용자 이름입니다.");
                break;
            case 500 :
                System.out.println("데이터를 더이상 추가할 수 없습니다.");
                break;
        }
    }
}

public class Static02 {
    public static void main(String[] args) {
        String[] usernames = new String[500];
        String[] passwords = new String[500];
        for (int i = 0; i < 500; i++) {
            Random random = new Random();
            usernames[i] = "";

            for (int j = 0; j < 10; j++) {
                int r = random.nextInt(26) + 97;
                usernames[i] += (char) r;
            }
            usernames[i] += "@gmail.com";
            passwords[i] = UUID.randomUUID().toString().replaceAll("-", "");
        }

        System.out.println(Arrays.toString(usernames));
        System.out.println(Arrays.toString(passwords));

        UserController userController = new UserController();
        for (int i = 0; i < 500; i++) {
            userController.postMapping(usernames[i], passwords[i]);
        }
    }
  }
