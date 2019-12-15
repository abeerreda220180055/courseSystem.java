package coursessystem;

import java.util.ArrayList;
import java.util.Scanner;

public class certificate {

    private String certificatecode;
    private ArrayList<String> stuudentslist = new ArrayList<>();
    private String Coursename;
    private String Coursecode;

    public Scanner input = new Scanner(System.in);

    public certificate() {
    }

    public void addcertificate(int position, ArrayList<Courses> c) {
        System.out.println("ener certificate code : ");
        certificatecode = input.next();
      Coursename = c.get(position).getCoursename();
      Coursecode = c.get(position).getCoursecode();

        System.out.println("done .. ");
    }

    public void addcertificatetoStudent(int position, ArrayList<Student> s) {
      stuudentslist.add(s.get(position).getName());
        System.out.println("done"); 
    }

 
    

    public void showData() {
      for (String s : stuudentslist){
          System.out.println(s +"\t\t" +Coursename);
      }
    }
    
   

    public String getCertificatecode() {
        return certificatecode;
    }

    public void setCertificatecode(String certificatecode) {
        this.certificatecode = certificatecode;
    }

    public ArrayList<String> getStuudentslist() {
        return stuudentslist;
    }

    public void setStuudentslist(ArrayList<String> stuudentslist) {
        this.stuudentslist = stuudentslist;
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

}
