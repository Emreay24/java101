package OgrencıSıtem;
import java.util.ArrayList;

public class Student {
    private String name;
    private String stuNo;
    private int classes;
    private Course course1;
    private Course course2;
    private Course course3;
    private double average;
    private boolean isPass;

    public Student(String name, String stuNo, int classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(double note1, double note2, double note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.course1.setNote(note1);
        }
        if (note2 >= 0 && note2 <= 100) {
            this.course2.setNote(note2);
        }
        if (note3 >= 0 && note3 <= 100) {
            this.course3.setNote(note3);
        }
    }

    public void calcAvarage() {
        this.average = (
                (this.course1.getNote() * (1 - this.course1.getVerbalWeight())) +
                        (this.course2.getNote() * (1 - this.course2.getVerbalWeight())) +
                        (this.course3.getNote() * (1 - this.course3.getVerbalWeight()))
        );
    }

    public void isPass() {
        if (this.average > 55) {
            this.isPass = true;
        } else {
            this.isPass = false;
        }
    }

    public void printNote() {
        System.out.println("Student: " + this.name);
        System.out.println(this.course1.getName() + " note: " + this.course1.getNote());
        System.out.println(this.course2.getName() + " note: " + this.course2.getNote());
        System.out.println(this.course3.getName() + " note: " + this.course3.getNote());
        System.out.println("Average: " + this.average);
        System.out.println("Passing status: " + (this.isPass ? "Passed" : "Failed"));
    }
}
