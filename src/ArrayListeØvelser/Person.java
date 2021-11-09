package ArrayListeØvelser;

import java.util.ArrayList;

public class Person {

  private String firstName;
  private String lastName;
  private String house;

  public Person(String firstName, String lastName, String house) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.house = house;

  }
  public String toString() {
    return
        firstName +
            lastName +
            house;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getHouse() {
    return house;
  }

  public void setHouse(String house) {
    this.house = house;

  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
