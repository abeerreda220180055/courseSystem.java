
package coursessystem;

import java.util.Scanner;

public class person {

    protected String name;
    protected String id;
    protected String PhoneNum;
    protected String Gender;
    protected String coursename;
    protected Scanner in = new Scanner(System.in);

  

    public person() {
    }
  public void add() {
        System.out.println("enter  name  : ");
        name = in.nextLine();
        System.out.println("enter  ID : ");
        id = in.next();
         System.out.print("Enter phone number");
         PhoneNum=in.next();
        System.out.println("Enter  gender : ");
        Gender = in.next();
        System.out.println(" added succefully");

    }
  public void Showlist (){
        System.out.println(name + "\t" + id + "\t" + Gender );
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
}
