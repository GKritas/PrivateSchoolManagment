package Service;

import java.util.Scanner;

import Database.MyDatabase;
import Entities.Trainer;
import HelpingFunctions.HelpingFunctions;
import View.View;

public class TrainerService {
    public static Scanner scanner = new Scanner(System.in);

    public static void createTrainer(MyDatabase db) {
        int input;
        Trainer t = new Trainer();
        System.out.println("Enter First Name: ");
        t.setFirstName(scanner.nextLine());
        System.out.println("Enter Last Name: ");
        t.setLastName(scanner.nextLine());
        System.out.println("Enter subject: ");
        t.setSubject(scanner.nextLine());
        HelpingFunctions.cls();

        View.showCourses(db.getCourses(), "All Courses");

        System.out.println("Select a course that you want to teach or 0 to continue: ");
        input = Integer.parseInt(scanner.nextLine());
        HelpingFunctions.cls();
        if (input != 0) {
            // Relate Course with Trainer
            t.setCourse(db.getCourses().get(input - 1));
            db.getCourses().get(input - 1).getTrainers().add(t);
        }
        db.getTrainers().add(t);
    }
}
