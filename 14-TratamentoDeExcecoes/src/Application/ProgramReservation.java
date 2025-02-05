package Application;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//Very bad Exception Solution (it works!)
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

      //Validacao de algumas condicoes de entrada de datas na atualizacao
      Date now = new Date();
      //Alteracoes de reserva so podem acontecer em datas futuras
      if (checkIn.before(now) || checkOut.before(now)) {
        System.out.println("Error in reservation: Reservation dates for update must be future dates");
      }
      //Data de saida deve ser maior que a data de entrada
      else if (!checkOut.after(checkIn)) {
        System.out.println("Error in reservation: Check-out date must be after check-in date");
      }
      //todas as condicoes de atualizacao de reservas foram aceitas, reserva pode ser atualizada!
      else {
        reservation.updateDates(checkIn, checkOut);
        System.out.println("Reservation: " + reservation);
      }
    }
  }
}
