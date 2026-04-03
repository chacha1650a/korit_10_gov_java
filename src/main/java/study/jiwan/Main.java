package study.jiwan;

import lombok.Data;

@Data
class Jiwan {
    private String name;
    private int wallet;
}

public class Main {
    public static void main(String[] args) {
        Jiwan jiwan = new Jiwan();
        jiwan.setName("오만원");
    }
}
