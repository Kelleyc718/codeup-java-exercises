package grades;

import java.util.*;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
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

    public List<Integer> grades() {
        return grades;
    }
}
