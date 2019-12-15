package coursessystem;

import java.util.Scanner;

public class Room {

    private int Roomnumber;
    private int Roomseats;
    public Scanner in = new Scanner(System.in);

    public Room() {

    }

    public void addRoom() {
        System.out.println("enter room number : ");
        Roomnumber = in.nextInt();
        System.out.println("enter room seats : ");
        Roomseats = in.nextInt();

    }

    public void showRooms() {
        System.out.println(Roomnumber + "\t" + Roomseats);
    }

    public int getRoomnumber() {
        return Roomnumber;
    }

    public void setRoomnumber(int Roomnumber) {
        this.Roomnumber = Roomnumber;
    }

    public int getRoomseats() {
        return Roomseats;
    }

    public void setRoomseats(int Roomseats) {
        this.Roomseats = Roomseats;
    }

}
