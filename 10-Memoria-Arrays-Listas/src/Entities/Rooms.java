package Entities;

public class Rooms {
  private String name;
  private String email;
  private int roomNumber;

  public Rooms(String name, String email, int roomNumber) {
    this.name = name;
    this.email = email;
    this.roomNumber = roomNumber;
  }

  public String getName() {
    return name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public int getRoomNumber() {
    return roomNumber;
  }

  public String toString() {
    return(
        roomNumber + ": " + name + ", " + email
        );
  }

}
