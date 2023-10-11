public class Car {
  int id;
  String make;
  String model;
  int yearOfManufacture;
  String color;
  double price;
  int registrationNumber;

  Car(int id, String make, String model, int yearOfManufacture, String color, double price, int registrationNumber) {
    this.id = id;
    this.make = make;
    this.model = model;
    this.yearOfManufacture = yearOfManufacture;
    this.color = color;
    this.price = price;
    this.registrationNumber = registrationNumber;
  }

  public String description() {
    return " Id: " + id + " make: " + make + " model: " + model + " Year of Manufacture: " + yearOfManufacture
        + " color: " + color + " price: " + price + " registration number: " + registrationNumber;
  }
}
