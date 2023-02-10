package Service;

import java.time.LocalDate;
import java.util.Scanner;

import Database.MyDatabase;
import Entities.Student;
import HelpingFunctions.HelpingFunctions;
import View.View;

public class StudentService {
    public static Scanner scanner = new Scanner(System.in);

    public static void createStudent(MyDatabase db) {

        int input;
        Student s = new Student();
        System.out.print("Enter First Name: ");
        s.setFirstName(scanner.nextLine());
        System.out.print("Enter Last Name: ");
        s.setLastName(scanner.nextLine());
        System.out.print("Enter Date Of Birth(YYYY-MM-DD): ");
        s.setDateOfBirth(LocalDate.parse(scanner.nextLine()));
        System.out.print("Enter Tuition Fees: ");
        s.setTuitionFees(Double.parseDouble(scanner.nextLine()));
        HelpingFunctions.cls();

        while (true) {
            View.showCourses(db.getCourses(), "");

            if (s.getCourses().isEmpty())
                System.out.println("Select which course you want to participate or press 0 to continue: ");
            else
                System.out.println("Select another course or 0 to continue: ");
            input = Integer.parseInt(scanner.nextLine());
            HelpingFunctions.cls();
            if (input == 0)
                break;
            // Relate Course with student
            s.getCourses().add(db.getCourses().get(input - 1));
            db.getCourses().get(input - 1).getStudents().add(s);
            System.out.println("You enrolled for " + db.getCourses().get(input - 1).getTitle());

            View.showAssignments(db.getCourses().get(input - 1).getAssignments(), "Course Assignments");
            if (s.getAssignments().isEmpty())
                System.out.println("Select which assignment you want to take or press 0 to continue: ");
            else
                System.out.println("Select another assignment or 0 to continue: ");
            input = Integer.parseInt(scanner.nextLine());
            HelpingFunctions.cls();
            if (input == 0)
                break;
            // Relate Assignment with Student
            s.getAssignments().add(db.getAssignments().get(input - 1));
            db.getAssignments().get(input - 1).getStudents().add(s);
        }
        db.getStudents().add(s);
        System.out.println("Student has been Registered!!!");
    }
}
