package grades;

import java.util.*;

public class Student {
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, List<Integer> grades) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for(int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student newStudent = new Student("Chris", List.of());
        System.out.println(newStudent.name);
        newStudent.addGrade(45);
        newStudent.addGrade(67);
        newStudent.addGrade(89);
        newStudent.addGrade(34);
        System.out.println(newStudent.grades);
        System.out.println(newStudent.getGradeAverage());
    }
}
