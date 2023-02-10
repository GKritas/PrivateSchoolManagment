package View;

import java.util.List;

import Entities.Assignment;
import Entities.Course;
import Entities.Student;
import Entities.Trainer;
import HelpingFunctions.HelpingFunctions;

public class View {
    public static void mainMenu() {
        HelpingFunctions.cls();
        System.out.println();
        System.out.printf("%-60s", "========= Welcome to Kritas School ==========");
        System.out.println();
        System.out.println("1 - Register");
        System.out.println("2 - Show Entries");
        System.out.println("E - Exit");

    }

    public static void createMenu() {
        System.out.println("----- What you want to Register -----");
        System.out.println("1 - Student");
        System.out.println("2 - Trainer");
        System.out.println("3 - Assignment");
        System.out.println("4 - Course");
        System.out.println("0 - Back");
    }

    public static void showmenu() {

        System.out.printf("%-40s%-40s", "1 - Show All Students", "6 - Show The Trainers Per Course");
        System.out.println();
        System.out.printf("%-40s%-40s", "2 - Show All Trainers", "7 - Show The Assignments Per Course");
        System.out.println();
        System.out.printf("%-40s%-40s", "3 - Show All Assignments", "8 - Show The Assignments Per Student");
        System.out.println();
        System.out.printf("%-40s%-40s", "4 - Show All Courses", "9 - Show The Students With More Than 1 Courses");
        System.out.println();
        System.out.printf("%-40s%-40s", "5 - Show All Students Per Course", "0 - Back");
        System.out.println();
    }

    public static void showStudents(List<Student> students, String message) {
        System.out.println(message);
        System.out.printf("%-5s%-15s%-15s%-20s%-15s", "ID", "First Name", "Last Name", "Date of Birth", "Tuition Fees");
        System.out.println();
        for (Student student : students) {
            student.printStudent();
        }
    }

    public static void showTrainers(List<Trainer> trainers, String message) {
        System.out.println(message);
        System.out.printf("%-5s%-15s%-15s%-40s", "ID", "First Name", "Last Name", "Subject");
        System.out.println();
        for (Trainer trainer : trainers) {
            trainer.printTrainer();
        }
    }

    public static void showAssignments(List<Assignment> assignments, String message) {
        System.out.println(message);
        System.out.printf("%-5s%-15s%-40s%-15s", "ID", "Title", "Description", "DeadLine");
        System.out.println();
        for (Assignment assignment : assignments) {
            assignment.printAssignment();
        }
    }

    public static void showCourses(List<Course> courses, String message) {
        System.out.println(message);
        System.out.printf("%-5s%-50s%-20s%-15s%-15s%-15s", "ID", "Title", "Stream", "Type", "Starts", "Ends");
        System.out.println();
        for (Course course : courses) {
            course.printCourse();
        }
    }

    public static void showStudentsPerCourse(List<Course> courses, String message) {
        System.out.println(message);
        for (Course course : courses) {
            System.out.println(course.getTitle());
            for (Student student : course.getStudents()) {
                student.printStudent();
            }
        }
    }

    public static void showTrainersPerCourse(List<Course> courses, String message) {
        System.out.println(message);
        for (Course course : courses) {
            System.out.println(course.getTitle());
            for (Trainer trainer : course.getTrainers()) {
                trainer.printTrainer();
            }
        }
    }

    public static void showAssignmentsPerCourse(List<Course> courses, String message) {
        System.out.println(message);
        for (Course course : courses) {
            System.out.println(course.getTitle());
            for (Assignment assignment : course.getAssignments()) {
                assignment.printAssignment();
            }
        }
    }

    public static void showAssignmentsPerStudent(List<Student> students, String message) {
        System.out.println(message);
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
            for (Assignment assignment : student.getAssignments()) {
                assignment.printAssignment();
            }
        }
    }

    public static void showStudentssWithMoreAssignments(List<Student> students, String message) {
        System.out.println(message);
        for (Student student : students) {
            if (student.getAssignments().size() > 1) {
                System.out.println(student.getFirstName() + " " + student.getLastName() + " has "
                        + student.getAssignments().size() + " assignments");
            }
        }
    }
}
