package study.ch17;

public class UserService {
    private UserRepository UserRepository;

    public UserService(UserRepository userRepository) {
        this.UserRepository = UserRepository;
    }

    public int signup(String usernames, String passwords) {
        // 성공 : 200, 실패 : 400(중복아이디), 500(공간부족)
        int status = 200;

        User foundUser = UserRepository.findByUsername(usernames);
        if (foundUser != null) {
            return 400;
        }
//        User newUser = new User(0L, usernames, passwords);
        User newUser = User.builder()
                .username(usernames)
                .password(passwords)
                .build();
        boolean isSuccess = UserRepository.addUser(newUser);
        if (isSuccess) {
            return 500;
        }

        UserRepository.printUsers();
        return 200;
    }
}
