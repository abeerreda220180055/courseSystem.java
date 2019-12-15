package coursessystem;

import java.util.Scanner;

public class Teacher extends person{
  public Scanner in = new Scanner (System.in);
  
    private String TeacherEmail;
   
    public Teacher() {
    }
      
        @Override
       public void add(){
        System.out.println("enter Teacher name  : ");
         name = in.nextLine();
        System.out.println("enter Teacher ID : ");
         id = in.next();
        System.out.println("Enter Teacher gender : ");
         Gender = in.next();
        System.out.println("enter Teacher Email : ");
         TeacherEmail=in.next();
        
        System.out.println("Teacher added succefully");
        
    }

  @Override
    public void Showlist (){
        System.out.println(name + "\t" + id + "\t" +Gender + "\t" + TeacherEmail + "\t"+ coursename  );
    }


    public String getTeacherEmail() {
        return TeacherEmail;
    }

    public void setTeacherEmail(String TeacherEmail) {
        this.TeacherEmail = TeacherEmail;
    }

}
