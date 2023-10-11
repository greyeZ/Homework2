import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        Car[] cars = { new Car(1, "Audi", "A3", 2013, "white", 21000, 43425),
                new Car(2, "BMW", "M4", 2010, "white", 60000, 67453),
                new Car(3, "Audi", "RS8", 2020, "black", 80000, 54394),
                new Car(4, "Volkswagen", "Golf", 2013, "blue", 25000, 29564) };

        writeFileGivenBrand("Audi", cars);
        writeFileGivenModel("A3", 3, cars);
        writeFileGivenPrice(23000, 2013, cars);

    }

    static void writeFileGivenBrand(String brand, Car[] cars) {
        String temp = "";
        for (int i = 0; i < cars.length; i += 1) {
            if (cars[i].make == brand) {
                temp += cars[i].description() + "\n";
            }
        }
        writeToFile("Brand", temp);
    }

    static void writeFileGivenModel(String model, int yearsInUse, Car[] cars) {
        String temp = "";
        for (int i = 0; i < cars.length; i += 1) {
            if (cars[i].model == model && cars[i].yearOfManufacture + yearsInUse < 2023) {
                temp += cars[i].description() + "\n";
            }
        }
        writeToFile("Model_YearsInUse", temp);
    }

    static void writeFileGivenPrice(double price, int yearOfManufacture, Car[] cars) {
        String temp = "";
        for (int i = 0; i < cars.length; i += 1) {
            if (cars[i].price > price && cars[i].yearOfManufacture == yearOfManufacture) {
                temp += cars[i].description() + "\n";
            }
        }
        writeToFile("Price_YearOfManufacture", temp);
    }

    static void writeToFile(String fileName, String text) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
