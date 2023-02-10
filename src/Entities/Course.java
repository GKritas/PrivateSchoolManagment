package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {

    private static int nextId = 0;
    private int ID = 1;
    private String title;
    private String stream;
    private String type;
    private LocalDate start_date;
    private LocalDate end_date;

    private List<Student> students = new ArrayList<Student>();
    private List<Trainer> trainers = new ArrayList<Trainer>();
    private List<Assignment> assignments = new ArrayList<Assignment>();

    public Course(String title, String stream, String type, LocalDate start_date, LocalDate end_date) {
        this.ID = ++nextId;
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public Course() {
        this.ID = ++nextId;
    }

    public void printCourse() {
        System.out.printf("%-5s%-50s%-20s%-15s%-15s%-15s", ID, title, stream, type, start_date, end_date);
        System.out.println();
    }

    // #region Setter Getters
    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
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
