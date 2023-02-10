package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    public static Scanner scanner = new Scanner(System.in);

    private static int nextStudentId = 1;
    private int studentId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private double tuitionFees;

    private List<Course> courses = new ArrayList<Course>();
    private List<Assignment> assignments = new ArrayList<Assignment>();

    public Student(String firstName, String lastName, LocalDate dateOfBirth, double tuitionFees) {
        this.studentId = nextStudentId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }

    public Student() {
        this.studentId = nextStudentId++;
    }

    public void printStudent() {
        System.out.printf("%-5s%-15s%-15s%-20s%-15s", studentId, firstName, lastName, dateOfBirth, tuitionFees);
        System.out.println();
    }

    // #region Setters Getters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }
    // #endregion
}
