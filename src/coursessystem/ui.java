package coursessystem;

import java.util.ArrayList;
import java.util.Scanner;


public class ui {

    public ArrayList<Student> s = new ArrayList<>();
    public ArrayList<Courses> c = new ArrayList<>();
    public ArrayList<Teacher> t = new ArrayList<>();
    public ArrayList<Room> r = new ArrayList<>();
    public ArrayList<certificate> cer = new ArrayList<>();

    public Scanner input = new Scanner(System.in);

    public ui() {
    }
    
    public void main() {

        int close = 1;

        while (close == 1) {
            System.out.println("______*student main*______\n1-add Student.\t2-show students\t3-register student"
                    + "\n______*teacher main*______\n4-add teacher \t5-show teacher.\t6-register teacher"
                    + "\n______*course main*______\n7-add course.\t8-show course."
                    + "\n______*room main*_________\n9-add room \t10-show room."
                    + "\n______*certificate main*______\n11-add certificate \t12-register certificate.\n13-show Data.\t14-courses info");

            System.out.println("\nenter your choice : ");
            String choice = input.next();
            switch (choice) {
                case "1": {
                    s.add(new Student());
                    int count = s.size() - 1;
                    s.get(count).add();

                }
                break;

                case "2": {
                    for (int i = 0; i < s.size(); i++) {

                        s.get(i).Showlist();
                    }
                }
                break;
                case "3": {

                    int j = searchStudent();
                    if (j != -1) {
                        System.out.println("register course .. enter course code : ");
                        String code = input.next();
                        for (int i = 0; i < c.size(); i++) {
                            if (code.equals(c.get(i).getCoursecode())) {
                                s.get(j).setCoursename(c.get(i).getCoursename());
                                System.out.println("added student and course.");
                            }
                        }
                    }

                }
                break;

                case "4": {
                    t.add(new Teacher());
                    t.get(t.size() - 1).add();
                    System.out.println("register course .. enter course code : ");
                    String code = input.next();
                    for (int i = 0; i < c.size(); i++) {
                        if (code.equals(c.get(i).getCoursecode())) {
                            t.get(t.size() - 1).setCoursename(c.get(i).getCoursename());
                            System.out.println("added teacher and course.");

                        }
                    }
                }
                break;
                case "5": {
                    for (int i = 0; i < t.size(); i++) {
                        t.get(i).Showlist();

                    }

                }
                break;
                case "6": {
                    int j = searchTeacher();
                    if (j != -1) {
                        System.out.println("register course .. enter course code : ");
                        String code = input.next();
                        for (int i = 0; i < c.size(); i++) {
                            if (code.equals(c.get(i).getCoursecode())) {
                                t.get(j).setCoursename(c.get(i).getCoursename());
                                System.out.println("added Teacher and course.");
                            }
                        }
                    }

                }
                break;
                case "7": {
                    c.add(new Courses());
                    c.get(c.size() - 1).addCourse();

                }
                break;
                case "8": {
                    for (int i = 0; i < c.size(); i++) {
                        c.get(i).ShowCourselist();
                    }

                }
                break;
                case "9": {
                    r.add(new Room());
                    r.get(r.size() - 1).addRoom();
                }
                break;
                case "10": {
                    for (int i = 0; i < r.size(); i++) {
                        r.get(i).showRooms();
                    }

                }
                case "11": {
                    int j;

                    System.out.println(" enter course code : ");
                    String id = input.next();
                    for (j = 0; j < c.size(); j++) {
                        if (id.equals(c.get(j).getCoursecode())) {
                            cer.add(new certificate());
                            cer.get(cer.size() - 1).addcertificate(j, c);

                        }

                    }
                }
                break;

                case "12": {
                    System.out.println("enter course name : ");
                    String name = input.next();
                    int i;
                    for (i = 0; i < cer.size(); i++) {
                        if (name.equals(cer.get(i).getCoursename())) {
                            int j = searchStudent();
                            if (j != -1) {
                                cer.get(i).addcertificatetoStudent(j, s);
                            }

                        }
                    }

                }
                break;
                case "13": {
                    for (int i = 0; i < cer.size(); i++) {
                        cer.get(i).showData();
                    }

                }
                break;
                case "14": {
                    for (int i = 0; i < cer.size(); i++) {
                        cer.get(i).toString();
                    }

                }
                break;

                default: {
                    System.out.println("input not found try again !");
                }

            }
            System.out.println("Press 1 to continue \n"
                    + "press 2 to exit");
            close = input.nextInt();
        }

    }

    public int searchStudent() {
        int j;
        boolean flag = false;
        System.out.println(" enter student id : ");
        String id = input.next();

        for (j = 0; j < s.size(); j++) {
            if (id.equals(s.get(j).getId())) {
                flag = true;
                System.out.println("found");
                break;
            }
        }

        if (flag == true) {
            return j;
        } else {

            return -1;

        }

    }

    public int searchTeacher() {
        int j;
        boolean flag = false;

        System.out.println(" enter Teacher id : ");
        String id = input.next();
        for (j = 0; j < t.size(); j++) {
            if (id.equals(t.get(j).getId())) {
                flag = true;
                break;
            }
        }
        return (flag == false) ? -1 : j;
    }

}
