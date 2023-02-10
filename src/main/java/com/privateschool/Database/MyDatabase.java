package Database;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Entities.Assignment;
import Entities.Course;
import Entities.Student;
import Entities.Trainer;

public class MyDatabase {
    private List<Course> courses = new ArrayList<Course>();
    private List<Student> students = new ArrayList<Student>();
    private List<Trainer> trainers = new ArrayList<Trainer>();
    private List<Assignment> assignments = new ArrayList<Assignment>();

    public MyDatabase() {

        // #region Seeding Courses
        Course course1 = new Course("Data Structures and Algorithms", "Computer Science", "Online", LocalDate.now(),
                LocalDate.now().plusMonths(3));
        Course course2 = new Course("Web Development", "Computer Science", "Online", LocalDate.now(),
                LocalDate.now().plusMonths(3));
        Course course3 = new Course("Introduction to Psychology", "Psychology", "Online", LocalDate.now(),
                LocalDate.now().plusMonths(3));
        Course course4 = new Course("Global Business Environment", "Business", "Online", LocalDate.now(),
                LocalDate.now().plusMonths(3));
        Course course5 = new Course("Global Marketing", "Business", "Online", LocalDate.now(),
                LocalDate.now().plusMonths(3));
        Course course6 = new Course("International Economics", "Business", "Online", LocalDate.now(),
                LocalDate.now().plusMonths(3));
        Course course7 = new Course("Foundations of Yoga", "Wellness", "Online", LocalDate.now(),
                LocalDate.now().plusMonths(3));
        Course course8 = new Course("Meditation and Mindfulness", "Wellness", "Online", LocalDate.now(),
                LocalDate.now().plusMonths(3));
        Course course9 = new Course("Introduction to Fitness", "Wellness", "Online", LocalDate.now(),
                LocalDate.now().plusMonths(3));
        Course course10 = new Course("Nutrition for Health and Wellness", "Wellness", "Online", LocalDate.now(),
                LocalDate.now().plusMonths(3));
        // #endregion

        // #region Seeding Students
        Student student1 = new Student("John", "Doe", LocalDate.of(1999, 5, 20), 5000.0);
        Student student2 = new Student("Jane", "Doe", LocalDate.of(2000, 6, 21), 5000.0);
        Student student3 = new Student("Michael", "Johnson", LocalDate.of(1998, 7, 22), 5000.0);
        Student student4 = new Student("Sarah", "Smith", LocalDate.of(1997, 8, 23), 5000.0);
        Student student5 = new Student("David", "Brown", LocalDate.of(1996, 9, 24), 5000.0);
        Student student6 = new Student("Emily", "Davis", LocalDate.of(1995, 10, 25), 5000.0);
        Student student7 = new Student("William", "Wilson", LocalDate.of(1994, 11, 26), 5000.0);
        Student student8 = new Student("Jessica", "Anderson", LocalDate.of(1993, 12, 27), 5000.0);
        Student student9 = new Student("Matthew", "Thomas", LocalDate.of(1992, 1, 28), 5000.0);
        Student student10 = new Student("Ashley", "Jackson", LocalDate.of(1991, 2, 1), 5000.0);
        Student student11 = new Student("Jacob", "White", LocalDate.of(1990, 3, 2), 5000.0);
        Student student12 = new Student("Sophia", "Harris", LocalDate.of(1989, 4, 3), 5000.0);
        Student student13 = new Student("Alexander", "Martin", LocalDate.of(1988, 5, 4), 5000.0);
        Student student14 = new Student("Isabella", "Thompson", LocalDate.of(1987, 6, 5), 5000.0);
        Student student15 = new Student("Ethan", "Young", LocalDate.of(1986, 7, 6), 5000.0);
        Student student16 = new Student("Ava", "Allen", LocalDate.of(1985, 8, 7), 5000.0);
        Student student17 = new Student("Daniel", "King", LocalDate.of(1984, 9, 8), 5000.0);
        Student student18 = new Student("Mia", "Wright", LocalDate.of(1983, 10, 9), 5000.0);
        Student student19 = new Student("Aiden", "Scott", LocalDate.of(1982, 11, 10), 5000.0);
        Student student20 = new Student("Madison", "Green", LocalDate.of(1981, 12, 11), 5000.0);
        Student student21 = new Student("George", "Kritas", LocalDate.of(1993, 12, 5), 5000.0);
        Student student22 = new Student("Elijah", "Baker", LocalDate.of(1980, 1, 12), 5000.0);
        Student student23 = new Student("Abigail", "Adams", LocalDate.of(1979, 2, 13), 5000.0);
        Student student24 = new Student("Evelyn", "Nelson", LocalDate.of(1978, 3, 14), 5000.0);
        Student student25 = new Student("William", "Carter", LocalDate.of(1977, 4, 15), 5000.0);
        Student student26 = new Student("Harper", "Mitchell", LocalDate.of(1976, 5, 16), 5000.0);
        Student student27 = new Student("Mason", "Perez", LocalDate.of(1975, 6, 17), 5000.0);
        Student student28 = new Student("Eleanor", "Roberts", LocalDate.of(1974, 7, 18), 5000.0);
        Student student29 = new Student("Lucas", "Turner", LocalDate.of(1973, 8, 19), 5000.0);
        Student student30 = new Student("Aria", "Phillips", LocalDate.of(1972, 9, 20), 5000.0);

        student1.getCourses().add(course1);
        student2.getCourses().add(course2);
        student3.getCourses().add(course3);
        student4.getCourses().add(course4);
        student5.getCourses().add(course5);
        student6.getCourses().add(course6);
        student7.getCourses().add(course7);
        student8.getCourses().add(course8);
        student9.getCourses().add(course9);
        student10.getCourses().add(course10);
        student11.getCourses().add(course5);
        student12.getCourses().add(course10);
        student13.getCourses().add(course9);
        student14.getCourses().add(course8);
        student15.getCourses().add(course7);
        student16.getCourses().add(course6);
        student17.getCourses().add(course5);
        student18.getCourses().add(course4);
        student19.getCourses().add(course3);
        student20.getCourses().add(course2);
        student21.getCourses().add(course1);
        student22.getCourses().add(course2);
        student23.getCourses().add(course3);
        student24.getCourses().add(course4);
        student25.getCourses().add(course5);
        student26.getCourses().add(course6);
        student27.getCourses().add(course7);
        student28.getCourses().add(course8);
        student29.getCourses().add(course9);
        student30.getCourses().add(course10);

        course1.getStudents().add(student1);
        course1.getStudents().add(student21);
        course2.getStudents().add(student2);
        course2.getStudents().add(student20);
        course2.getStudents().add(student22);
        course3.getStudents().add(student3);
        course3.getStudents().add(student19);
        course3.getStudents().add(student23);
        course4.getStudents().add(student4);
        course4.getStudents().add(student18);
        course4.getStudents().add(student24);
        course5.getStudents().add(student5);
        course5.getStudents().add(student11);
        course5.getStudents().add(student17);
        course5.getStudents().add(student25);
        course6.getStudents().add(student6);
        course6.getStudents().add(student16);
        course6.getStudents().add(student26);
        course7.getStudents().add(student7);
        course7.getStudents().add(student15);
        course7.getStudents().add(student27);
        course8.getStudents().add(student8);
        course8.getStudents().add(student14);
        course8.getStudents().add(student28);
        course9.getStudents().add(student9);
        course9.getStudents().add(student13);
        course9.getStudents().add(student29);
        course10.getStudents().add(student10);
        course10.getStudents().add(student12);
        course10.getStudents().add(student30);
        // #endregion

        // #region Seeding Trainers
        Trainer trainer1 = new Trainer("John", "Smith", "Java");
        Trainer trainer2 = new Trainer("Jane", "Doe", "Python");
        Trainer trainer3 = new Trainer("Michael", "Johnson", "C++");
        Trainer trainer4 = new Trainer("Sarah", "Williams", "JavaScript");
        Trainer trainer5 = new Trainer("James", "Brown", "C#");
        Trainer trainer6 = new Trainer("Emily", "Davis", "Ruby");
        Trainer trainer7 = new Trainer("William", "Moore", "Swift");
        Trainer trainer8 = new Trainer("Jacob", "Taylor", "Kotlin");
        Trainer trainer9 = new Trainer("Ethan", "Anderson", "Scala");
        Trainer trainer10 = new Trainer("Emma", "Thomas", "PHP");

        trainer1.setCourse(course1);
        trainer2.setCourse(course2);
        trainer3.setCourse(course3);
        trainer4.setCourse(course4);
        trainer5.setCourse(course5);
        trainer6.setCourse(course6);
        trainer7.setCourse(course7);
        trainer8.setCourse(course8);
        trainer9.setCourse(course9);
        trainer10.setCourse(course10);

        course1.getTrainers().add(trainer1);
        course2.getTrainers().add(trainer2);
        course3.getTrainers().add(trainer3);
        course4.getTrainers().add(trainer4);
        course5.getTrainers().add(trainer5);
        course6.getTrainers().add(trainer6);
        course7.getTrainers().add(trainer7);
        course8.getTrainers().add(trainer8);
        course9.getTrainers().add(trainer9);
        course10.getTrainers().add(trainer10);
        // #endregion

        // #region Seeding Assignments
        Assignment assignment1 = new Assignment("Project 1", "Build a website", LocalDate.of(2022, 12, 1));
        Assignment assignment2 = new Assignment("Project 2", "Develop a mobile app", LocalDate.of(2022, 12, 15));
        Assignment assignment3 = new Assignment("Project 3", "Create a database", LocalDate.of(2023, 1, 10));
        Assignment assignment4 = new Assignment("Project 4", "Design a logo", LocalDate.of(2023, 1, 20));
        Assignment assignment5 = new Assignment("Project 5", "Write a research paper", LocalDate.of(2023, 2, 1));
        Assignment assignment6 = new Assignment("Project 6", "Build a chatbot", LocalDate.of(2023, 2, 15));
        Assignment assignment7 = new Assignment("Project 7", "Develop a game", LocalDate.of(2023, 3, 1));
        Assignment assignment8 = new Assignment("Project 8", "Create a presentation", LocalDate.of(2023, 3, 15));
        Assignment assignment9 = new Assignment("Project 9", "Design a poster", LocalDate.of(2023, 4, 1));
        Assignment assignment10 = new Assignment("Project 10", "Write a novel", LocalDate.of(2023, 4, 15));

        assignment1.setCourse(course1);
        assignment2.setCourse(course1);
        assignment3.setCourse(course1);
        assignment4.setCourse(course2);
        assignment5.setCourse(course2);
        assignment6.setCourse(course2);
        assignment7.setCourse(course3);
        assignment8.setCourse(course3);
        assignment9.setCourse(course3);
        assignment10.setCourse(course4);

        assignment1.getStudents().add(student1);
        assignment1.getStudents().add(student21);
        assignment2.getStudents().add(student1);
        assignment2.getStudents().add(student21);
        assignment3.getStudents().add(student1);
        assignment3.getStudents().add(student21);
        assignment4.getStudents().add(student2);
        assignment4.getStudents().add(student20);
        assignment4.getStudents().add(student22);
        assignment5.getStudents().add(student2);
        assignment5.getStudents().add(student20);
        assignment5.getStudents().add(student22);
        assignment6.getStudents().add(student2);
        assignment6.getStudents().add(student20);
        assignment6.getStudents().add(student22);
        assignment7.getStudents().add(student3);
        assignment7.getStudents().add(student19);
        assignment7.getStudents().add(student23);
        assignment8.getStudents().add(student3);
        assignment8.getStudents().add(student19);
        assignment8.getStudents().add(student23);
        assignment9.getStudents().add(student3);
        assignment9.getStudents().add(student19);
        assignment9.getStudents().add(student23);
        assignment10.getStudents().add(student10);
        assignment10.getStudents().add(student12);
        assignment10.getStudents().add(student30);

        course1.getAssignments().add(assignment1);
        course1.getAssignments().add(assignment2);
        course1.getAssignments().add(assignment3);
        course2.getAssignments().add(assignment4);
        course2.getAssignments().add(assignment5);
        course2.getAssignments().add(assignment6);
        course3.getAssignments().add(assignment7);
        course3.getAssignments().add(assignment8);
        course3.getAssignments().add(assignment9);
        course4.getAssignments().add(assignment10);

        student1.getAssignments().add(assignment1);
        student1.getAssignments().add(assignment2);
        student1.getAssignments().add(assignment3);
        student2.getAssignments().add(assignment4);
        student2.getAssignments().add(assignment5);
        student2.getAssignments().add(assignment6);
        student3.getAssignments().add(assignment7);
        student3.getAssignments().add(assignment8);
        student3.getAssignments().add(assignment9);
        student10.getAssignments().add(assignment10);
        student12.getAssignments().add(assignment10);
        student19.getAssignments().add(assignment7);
        student19.getAssignments().add(assignment8);
        student19.getAssignments().add(assignment9);
        student20.getAssignments().add(assignment4);
        student20.getAssignments().add(assignment5);
        student20.getAssignments().add(assignment6);
        student21.getAssignments().add(assignment1);
        student21.getAssignments().add(assignment2);
        student21.getAssignments().add(assignment3);
        student22.getAssignments().add(assignment4);
        student22.getAssignments().add(assignment5);
        student22.getAssignments().add(assignment6);
        student23.getAssignments().add(assignment7);
        student23.getAssignments().add(assignment8);
        student23.getAssignments().add(assignment9);
        student30.getAssignments().add(assignment10);

        // #endregion

        // #region Adding Courses
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);
        courses.add(course5);
        courses.add(course6);
        courses.add(course7);
        courses.add(course8);
        courses.add(course9);
        courses.add(course10);
        // #endregion

        // #region Adding Students
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);
        students.add(student16);
        students.add(student17);
        students.add(student18);
        students.add(student19);
        students.add(student20);
        students.add(student21);
        students.add(student22);
        students.add(student23);
        students.add(student24);
        students.add(student25);
        students.add(student26);
        students.add(student27);
        students.add(student28);
        students.add(student29);
        students.add(student30);

        // #endregion

        // #region Adding Trainers
        trainers.add(trainer1);
        trainers.add(trainer2);
        trainers.add(trainer3);
        trainers.add(trainer4);
        trainers.add(trainer5);
        trainers.add(trainer6);
        trainers.add(trainer7);
        trainers.add(trainer8);
        trainers.add(trainer9);
        trainers.add(trainer10);
        // #endregion

        // #region Adding Assignments
        assignments.add(assignment1);
        assignments.add(assignment2);
        assignments.add(assignment3);
        assignments.add(assignment4);
        assignments.add(assignment5);
        assignments.add(assignment6);
        assignments.add(assignment7);
        assignments.add(assignment8);
        assignments.add(assignment9);
        assignments.add(assignment10);
        // #endregion
    }

    // #region Setters Getters
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    // #endregion

}
