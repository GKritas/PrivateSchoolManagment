package Service;

import java.time.LocalDate;
import java.util.Scanner;

import Database.MyDatabase;
import Entities.Course;

public class CourseService {
    public static Scanner scanner = new Scanner(System.in);

    public static void createCourse(MyDatabase db) {

        Course c = new Course();
        System.out.println("Enter Title of the course: ");
        c.setTitle(scanner.nextLine());
        System.out.println("Enter the stream of the course: ");
        c.setStream(scanner.nextLine());
        System.out.println("Enter the Type of the course: ");
        c.setType(scanner.nextLine());
        System.out.println("Enter the Date of Start(YYYY-MM-DD): ");
        c.setStart_date(LocalDate.parse(scanner.nextLine()));
        System.out.println("Enter the Date of End: ");
        c.setEnd_date(LocalDate.parse(scanner.nextLine()));

        db.getCourses().add(c);
    }
}
