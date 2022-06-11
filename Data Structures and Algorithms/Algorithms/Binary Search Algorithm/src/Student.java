// Student Object

import java.util.Random;

public class Student {

    private String firstName;
    private String lastName;
    private String major;
    private int age;
    private double gpa;
    private String studentID;

    public Student(String firstName, String lastName, String major, int age, double gpa){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.gpa = gpa;
        this.studentID = createID();
    }

    public String createID(){
        Random random = new Random();

        int digits = random.nextInt(900) + 100;
        char fn = firstName.charAt(0);
        char ln = lastName.charAt(0);

        String id = "" + fn + ln + digits;
        return id;
    }

    public void getStats(){
        System.out.println("-----------------------------------");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
        System.out.println("-----------------------------------");
    }

    public String getID(){
        return studentID;
    }

}
