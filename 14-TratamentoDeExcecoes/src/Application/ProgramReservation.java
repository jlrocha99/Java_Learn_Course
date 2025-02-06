package Application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//Very good Solution -> usando tratamento personalizado e generico para todas as excessoes e modularizando as funcoes
public class ProgramReservation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    //Codigo passivel de erro
    try {
      System.out.print("Room Number: ");
      int number = input.nextInt();
      System.out.print("Check-in date (dd/MM/yyyy): ");
      Date checkIn = sdf.parse(input.next());
      System.out.print("Check-out date (dd/MM/yyyy): ");
      Date checkOut = sdf.parse(input.next());

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

      reservation.updateDates(checkIn, checkOut);
      System.out.println("Reservation: " + reservation);
    }
    //Tratamento adequado caso qualquer erro aconteca
    //excecao que sabemos que ocorre
    catch (ParseException pe) {
      System.out.println("Invalid date format");
    }
    //excecao personalizada
    catch (DomainException de) {
      System.out.println("Error in Reservation: " + de.getMessage());
    }
    //Excessao generica para qualquer tipo de RuntimeExcepction
    catch (RuntimeException re) {
      System.out.println("Unexpected Error!");
    }
  }
}
