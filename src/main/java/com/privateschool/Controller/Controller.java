package Controller;

import java.util.Scanner;

import Database.MyDatabase;
import HelpingFunctions.HelpingFunctions;
import Service.AssignmentService;
import Service.CourseService;
import Service.StudentService;
import Service.TrainerService;
import View.View;

public class Controller {
    public static Scanner scanner = new Scanner(System.in);

    public static void mainMenuController(MyDatabase db) {
        String input;
        do {
            View.mainMenu();
            input = HelpingFunctions.userInput();
            HelpingFunctions.cls();

            switch (input) {
                case "1":
                    createMenuController(db);
                    break;
                case "2":
                    showMenuController(db);
                    break;
                default:
            }
        } while (!input.equals("E") && !input.equals("e"));
    }

    public static void createMenuController(MyDatabase db) {
        int input;
        do {
            View.createMenu();
            input = Integer.parseInt(HelpingFunctions.userInput());
            HelpingFunctions.cls();
            switch (input) {
                case 1:
                    StudentService.createStudent(db);
                    break;
                case 2:
                    TrainerService.createTrainer(db);
                    break;
                case 3:
                    AssignmentService.createAssignment(db);
                    break;
                case 4:
                    CourseService.createCourse(db);
                    break;
                default:
            }
        } while (input != 0);
    }

    public static void showMenuController(MyDatabase db) {
        int input;
        do {
            View.showmenu();
            input = Integer.parseInt(HelpingFunctions.userInput());
            HelpingFunctions.cls();

            switch (input) {
                case 1:
                    View.showStudents(db.getStudents(), "All Students");
                    break;
                case 2:
                    View.showTrainers(db.getTrainers(), "All Trainers");
                    break;
                case 3:
                    View.showAssignments(db.getAssignments(), "All Assignments");
                    break;
                case 4:
                    View.showCourses(db.getCourses(), "All Courses");
                    break;
                case 5:
                    View.showStudentsPerCourse(db.getCourses(), "Students Per Course");
                    break;
                case 6:
                    View.showTrainersPerCourse(db.getCourses(), "Trainers Per Course");
                    break;
                case 7:
                    View.showAssignmentsPerCourse(db.getCourses(), "Assignments Per Course");
                    break;
                case 8:
                    View.showAssignmentsPerStudent(db.getStudents(), "Assignments Per Student");
                    break;
                case 9:
                    View.showStudentssWithMoreAssignments(db.getStudents(), "Students With More Than 1 Assignment");
                    break;
                case 0:
                    break;
                default:
            }
        } while (input != 0);

    }
}
