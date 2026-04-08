//package study.ch20.Example;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//import java.util.*;
//
//@Data
//@AllArgsConstructor
//class StudentManager {
//    private int id;
//    private String name;
//    private int score;
//    private Map<Integer, StudentManager> studentManagerMap;
//}
//
//interface Student {
//    void addStudents(int id, String name, int score);
//    StudentManager findById(int id);
//    List<StudentManager> findByMinScore(int min);
//    double getAverage();
//    void printAll();
//
//}
//
//@Data
//@AllArgsConstructor
//class StudentImpl implements Student {
//    private Map<Integer, Student> studentMap;
//
//    StudentImpl(int id, String name, int score) {}
//
//    public StudentImpl () {
//        studentMap = new HashMap<>();
//    }
//
//    @Override
//    public void addStudents(int id, String name, int score) {
//        studentMap.put(id, new StudentManager(id, name, score));
//    }
//
//    @Override
//    public StudentManager findById(int id) {
//        return studentMap.get(id);
//    }
//
//    @Override
//    public List<StudentManager> findByMinScore(int min) {
//        return studentMap.values().stream().
//                filter(student -> student.getScore() >= min).
//                toList();
//    }
//
//    @Override
//    public double getAverage() {
//        double avg = 0;
//        for (Student student : studentMap.values()) {
//            avg += student.getAverage();
//        }
//        return avg / studentMap.size();
//    }
//
//    @Override
//    public void printAll() {
//        studentMap.values().forEach(System.out::println);
//    }
//}
//
//
//public class Ex20 {
//    public static void main(String[] args) {
//       StudentManager studentManager = new StudentManagerImpl();
//    }
//}
