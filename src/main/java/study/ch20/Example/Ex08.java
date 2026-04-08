package study.ch20.Example;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
class Employee {
    private String name;
    private String dept;
    private int salary;
}

public class Ex08 {
    public static void main(String[] args) {
        // 전체 직원을 담을 리스트

        List<Employee> Employees = List.of(
                Employee.builder().name("김").dept("개발팀").salary(4000).build(),
                Employee.builder().name("이").dept("마케팅").salary(3500).build(),
                Employee.builder().name("박").dept("개발팀").salary(4500).build(),
                Employee.builder().name("최").dept("인사팀").salary(3000).build(),
                Employee.builder().name("정").dept("개발팀").salary(3800).build()
        );


        // 부서별 리스트
        List<Employee> devTeam = new ArrayList<>(List.of());
        List<Employee> markTeam = new ArrayList<>(List.of());
        List<Employee> persTeam = new ArrayList<>(List.of());

        for (Employee employee : Employees) {
            if ("개발팀".equals(employee.getDept())) devTeam.add(employee);
            if ("마케팅".equals(employee.getDept())) markTeam.add(employee);
            if ("인사팀".equals(employee.getDept())) persTeam.add(employee);
        }

        // 개발 팀 직원 급여
        int devTeamSalary = 0;

        for (Employee employee : devTeam) {
            devTeamSalary += employee.getSalary();
        }
        devTeamSalary = devTeamSalary / devTeam.size();

        System.out.println(devTeam);
        System.out.println(devTeamSalary);



    }
}
