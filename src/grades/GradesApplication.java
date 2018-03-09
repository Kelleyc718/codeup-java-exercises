package grades;

import util.Input;

import java.util.*;


public class GradesApplication {
    private static Input userInput = new Input();
    private static HashMap<String, Student> students = studentList();

    public static void main(String[] args) {
        System.out.println("\nWelcome!\n");
        boolean yesNo;
        do {
            studentPrinter(students);
            yesNo = userInput.yesNo();
        } while (yesNo);
        System.out.println("Thanks for visiting.");
    }

    public static HashMap<String, Student> studentList() {
        Student neil = new Student("Neil");
        neil.addGrade(89);
        neil.addGrade(79);
        neil.addGrade(69);
        neil.addGrade(59);

        Student okembe = new Student("Okembe");
        okembe.addGrade(49);
        okembe.addGrade(49);
        okembe.addGrade(49);
        okembe.addGrade(49);

        Student nicole = new Student("Nicole");
        nicole.addGrade(94);
        nicole.addGrade(94);
        nicole.addGrade(94);
        nicole.addGrade(94);

        Student chris = new Student("Chris");
        chris.addGrade(100);
        chris.addGrade(100);
        chris.addGrade(100);
        chris.addGrade(100);

        HashMap<String, Student> students = new HashMap<>();
        students.put("doogeyHowser", neil);
        students.put("mutumbo", okembe);
        students.put("navkell", nicole);
        students.put("kelleyc718", chris);

        return students;
    }

    private static void studentPrinter(HashMap<String, Student> students) {
        System.out.println("\nHere are the GitHub usernames of our students: \n");
        for (String key : students.keySet()) {
            System.out.print("| " + key + " | ");
        }
        System.out.print(" | all | \n");
        System.out.println("\nWhat student would you like information on?\n");
        String studentSearch = userInput.getString();

        if (studentSearch.equalsIgnoreCase("all")) {
            listAll();
            printCSV();
        } else if (students.containsKey(studentSearch)) {
            studentFound(studentSearch);
        } else {
            System.out.println("\nStudent does not exist\n");
        }
        System.out.println("\nWant to see another student?\n");
    }

    public static void listAll() {
        for (Map.Entry<String, Student> allStudents : students.entrySet()) {
            System.out.println("\nName: " + allStudents.getValue().getName() + " - GitHub Username: " + allStudents.getKey());
            System.out.println("Current Average: " + allStudents.getValue().getGradeAverage() + "\n");
            System.out.println(allStudents.getValue().grades());
        }
    }

    public static void studentFound (String studentSearch) {
        System.out.println("\nName: " + students.get(studentSearch).getName() + " - GitHub Username: " + studentSearch + "\nCurrent Average: " + students.get(studentSearch).getGradeAverage());
    }

    public static void printCSV () {
        for (Map.Entry<String, Student> allStudents : students.entrySet()) {
            System.out.printf(allStudents.getValue().getName() + ", " + allStudents.getKey() + ", " + allStudents.getValue().getGradeAverage() + "\n");
        }
    }
}
