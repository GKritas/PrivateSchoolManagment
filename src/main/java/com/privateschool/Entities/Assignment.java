package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment {
    public static Scanner scanner = new Scanner(System.in);

    private static int nextAssignmentId = 1;
    private int assignmentId;
    private String title;
    private String description;
    private LocalDate subDateTime;
    private int oralMark;
    private int totalMark;

    private Course course;
    private List<Student> students = new ArrayList<Student>();

    public Assignment(String title, String description, LocalDate subDateTime) {
        this.assignmentId = nextAssignmentId++;
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
    }

    public Assignment() {
        this.assignmentId = nextAssignmentId++;
    }

    public void printAssignment() {
        System.out.printf("%-5s%-15s%-40s%-15s", assignmentId, title, description, subDateTime);
        System.out.println();
    }

    // #region Setters Getters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(LocalDate subDateTime) {
        this.subDateTime = subDateTime;
    }

    public int getOralMark() {
        return oralMark;
    }

    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    // #endregion
}
