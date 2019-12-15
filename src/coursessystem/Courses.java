
package coursessystem;

import java.util.Scanner;


public class Courses {
    public Scanner in = new Scanner (System.in);
    private String Coursename;
    private String Coursecode;

    public Courses() {
    }
  public void addCourse(){
        System.out.println("enter  course name  : ");
        Coursename = in.nextLine();
        System.out.println("enter course code : ");
        Coursecode = in.next();
        System.out.println("Courses added succefully");
    }
    public void ShowCourselist (){
        System.out.println(Coursename + "\t" + Coursecode );
    }
    public String getCoursename() {
        return Coursename;
    }

    public void setCoursename(String Coursename) {
        this.Coursename = Coursename;
    }

    public String getCoursecode() {
        return Coursecode;
    }

    public void setCoursecode(String Coursecode) {
        this.Coursecode = Coursecode;
    }

    void addcourse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
