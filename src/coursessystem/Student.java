package coursessystem;

import java.util.Scanner;

public class Student extends person {
    public Scanner in = new Scanner(System.in);
    private String certificate;
   
    private int StudentAge;
    public Student() {
    }

    @Override
    public void add() {
        try {
            System.out.println("enter name  : ");
            name = in.nextLine();
            System.out.println("enter Student ID : ");
            id = in.next();
            System.out.println("Enter gender : ");
            Gender = in.next();
            System.out.println("enter Age : ");
            StudentAge = in.nextInt();
            System.out.println("Student added succefully");
        } catch (Exception e) {
            System.out.println("input invalid");
        }

    }

    @Override
    public void Showlist() {
        System.out.println(name + "\t" + id + "\t" + Gender + "\t" + StudentAge + "\t" + "\t" + coursename);
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int StudentAge) {
        this.StudentAge = StudentAge;
    }

}
