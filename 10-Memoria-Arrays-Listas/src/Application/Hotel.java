package Application;

import Entities.Rooms;

import java.util.Locale;
import java.util.Scanner;

public class Hotel {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    System.out.print("How many rooms will be rented? ");
    int n = input.nextInt();
    Rooms[] guests = new Rooms[n];

    for(int i = 0; i < guests.length; i++) {
      input.nextLine();
      System.out.printf("Rent #%d:\n", i+1);
      System.out.print("Name: ");
      String name = input.nextLine();
      System.out.print("Email: ");
      String email = input.next();
      System.out.print("Room: ");
      int roomNumber = input.nextInt();

      guests[i] = new Rooms(name, email, roomNumber);
    }

    System.out.println();
    System.out.println("Busy Rooms: ");
    for(int i = 0; i < guests.length; i++) {
      if(guests[i].getName() != null) {
        System.out.println(guests[i].toString());

      }
    }


  }
}
