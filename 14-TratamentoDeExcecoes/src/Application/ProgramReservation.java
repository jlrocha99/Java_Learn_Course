package Application;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//Bad Exception solution -> Delegamos a logica de validacao para a classe correta, classe Reservation
public class ProgramReservation {
  public static void main(String[] args) throws ParseException {
    Scanner input = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Room Number: ");
    int number = input.nextInt();
    System.out.print("Check-in date (dd/MM/yyyy): ");
    Date checkIn = sdf.parse(input.next());
    System.out.print("Check-out date (dd/MM/yyyy): ");
    Date checkOut = sdf.parse(input.next());

    if (!checkOut.after(checkIn)) {
      System.out.println("Error in reservation: Check-out date must be after check-in date");
    }
    else {
      //Reservation
      Reservation reservation = new Reservation(number, checkIn, checkOut);
      System.out.println("Reservation: " + reservation);

      System.out.println();
      System.out.println();

      //Update Reservation
      System.out.println("Enter data to update the reservation");
      System.out.print("Check-in date (dd/MM/yyyy): ");
      checkIn = sdf.parse(input.next());
      System.out.print("Check-out date (dd/MM/yyyy): ");
      checkOut = sdf.parse(input.next());

      String error = reservation.updateDates(checkIn, checkOut);
      if (error != null) {
        System.out.println("Error in reservation: " + error);
      }
      else {
        System.out.println("Reservation: " + reservation);
      }
    }
  }
}
