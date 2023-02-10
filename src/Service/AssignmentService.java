package Service;

import java.time.LocalDate;
import java.util.Scanner;

import Database.MyDatabase;
import Entities.Assignment;
import HelpingFunctions.HelpingFunctions;
import View.View;

public class AssignmentService {
    public static Scanner scanner = new Scanner(System.in);

    public static void createAssignment(MyDatabase db) {
        int input;
        Assignment a = new Assignment();
        System.out.println("Enter the Title of the assignment: ");
        a.setTitle(scanner.nextLine());
        System.out.println("Enter a description: ");
        a.setDescription(scanner.nextLine());
        System.out.println("Enter a DeadLine date(YYYY-MM-DD): ");
        a.setSubDateTime(LocalDate.parse(scanner.nextLine()));
        HelpingFunctions.cls();

        View.showCourses(db.getCourses(), "All Courses");

        System.out.println("Select a course that you want to enter the assignment or press 0 to continue: ");
        input = Integer.parseInt(scanner.nextLine());
        HelpingFunctions.cls();
        if (input != 0) {

            // Relate Course with Assignment
            a.setCourse(db.getCourses().get(input - 1));
            db.getCourses().get(input - 1).getAssignments().add(a);
            System.out.println("You have entered the assignment to " + db.getCourses().get(input - 1).getTitle());
        }
    }
}
