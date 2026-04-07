package study.ch19;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleArrayList {
    @Getter
    private String[] strs;

    public SimpleArrayList() {
        strs = new String[0];

    }

    public void add(String str) {
        String[] newStrs = new String[strs.length + 1];
        for (int i = 0; i < strs.length; i++) {
            newStrs[i] = strs[i];
        }
        newStrs[strs.length] = str;
        this.strs = newStrs;

    }

    // 크기를 넘어서는 인덱스 위치에 추가는 불가능
    public void add (int index, String str) {
        if (strs.length < 1) {
            return;
        }

        String[] newString = new String[strs.length + 1];

        for (int i = 0; i < strs.length; i++) {
            int currentIndex = i < index ? i : i + 1;
            newString[currentIndex] = strs[i];
        }
        newString[index] = str;
        strs = newString;

    }

    public void pop() {
        if (strs.length < 1) {
            return;
        }
        String[] newStrs = new String[strs.length - 1];

        for (int i = 0; i < newStrs.length; i++) {
            newStrs[i] = strs[i];
        }
        this.strs = newStrs;
    }

    public void removeString(String str) {
        int foundIndex = -1;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(str)) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex == -1) {
            return;
        }
        remove(foundIndex);
    }

    public void remove(int index) {
        String[] newString = new String[strs.length - 1];

        for (int i = 0; i < newString.length; i++) {
            int removeIndex = i < index ? i : i + 1;
            newString[i] = strs[removeIndex];
        }
        strs = newString;
    }

}
class SimpleArrayListMain {
    public static void main(String[] args) {
        SimpleArrayList list = new SimpleArrayList();
        list.add("김대훈");
        list.add("김중훈");
        list.add("김소훈");
        System.out.println(Arrays.toString(list.getStrs()));
        list.pop();
        System.out.println(Arrays.toString(list.getStrs()));

        list.add("test");
        list.add("test");
        list.add("test");
        list.remove(2);
        System.out.println(Arrays.toString(list.getStrs()));

        list.removeString("test");
        System.out.println(Arrays.toString(list.getStrs()));
    }
}

