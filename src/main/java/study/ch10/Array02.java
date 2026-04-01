package study.ch10;

public class Array02 {
    public static void main(String[] args) {
        int[] iArr = new int[] { 1, 2, 3, 4, 5 };
        char[] cArr = new char[] { 'a', 'b', 'c' };
        boolean[] bArr = new boolean[] { true, false, true, false };
        double[] dArr = new double[] { 1.0, 3.14, 5.5 };
        String[] sArr = new String[] { "김대훈", "김중훈", "김소훈" };

        class Student {
            private String name;

            Student() {}

            Student(String name) {
                this.name = name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            void Action() {
                System.out.println(name);
            }
        }

        // 아래와 같은 클래스를 배열로 만들면 인덱스 값에는 객체가 들어가야 한다.
        Student[] students = {
                new Student("김대훈"),
                new Student("김중훈"),
                new Student("김소훈")
        };

        students[2].Action();

        // 물론 배열이기에 인덱스 참조도 가능하다.
        Student[] students2 = {new Student(), new Student(), new Student()};
        students2[0].setName("김대훈");
        students2[1].setName("김중훈");
        students2[2].setName("김소훈");

        students2[2].Action();
    }
}
