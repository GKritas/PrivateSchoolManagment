package Entities;

import java.util.Scanner;

public class Trainer {
    public static Scanner scanner = new Scanner(System.in);

    private static int nextTrainerId = 1;
    private int trainerId;
    private String firstName;
    private String lastName;
    private String subject;

    private Course course;

    public Trainer(String firstName, String lastName, String subject) {
        this.trainerId = nextTrainerId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public Trainer() {
        this.trainerId = nextTrainerId++;
    }

    public void printTrainer() {
        System.out.printf("%-5s%-15s%-15s%-40s", trainerId, firstName, lastName, subject);
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getTrainerId() {
        return trainerId;
    }
    // #endregion
}
