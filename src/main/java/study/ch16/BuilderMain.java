package study.ch16;

import lombok.Builder;

// 어노테이션 지원
@Builder
class UserEntity2 {
    private String username;
    private String password;
    private String name;
    private String email;
    private String address;
}

public class BuilderMain {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity("abc", "1234", "김대훈", "01058797023a@gmail.com");
        UserEntity userEntity2 = new UserEntity("abc", null, null, "01058797023a@gmail.com");

        UserEntity userEntity3 = new UserEntity();
        userEntity3.setUsername("bbb");
        userEntity3.setPassword("1010");
        UserEntity userEntity4 = UserEntity.builder().
                username("ccc").
                password("1111").
                name("김중훈").
                email("Java@gmail.com").
                build();

        UserEntity2 userEntity5 = UserEntity2.builder().
                username("ddd").
                password("1650").
                name("김소훈").
                email("JVM@gmail.com").
                address("부산광역시 동래구 명륜동").
                build();
    }
}
