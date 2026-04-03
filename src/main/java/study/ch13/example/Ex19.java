package study.ch13.example;

interface ButtonClickListener {
    void OnClick(String buttonName);
}

class Button {
    String name;
    ButtonClickListener listener;

    Button(String name) {
        this.name = name;
    }

    void setListener(ButtonClickListener listener) {
        this.listener = listener;
    }

    void click() {
        if (listener != null) listener.OnClick(name);
    }
}

class AlertListener implements ButtonClickListener {
    @Override
    public void OnClick(String buttonName) {
        System.out.println("[경고] : " + buttonName + "이 눌렸습니다");
    }
}

class LogListener implements ButtonClickListener {
    @Override
    public void OnClick(String buttonName) {
        System.out.println("[로그] : " + buttonName + "이 눌렸습니다");
    }
}

public class Ex19 {
    public static void main(String[] args) {
        Button btn = new Button("저장");
        btn.setListener(btn.listener);
        btn.click();
    }
}
