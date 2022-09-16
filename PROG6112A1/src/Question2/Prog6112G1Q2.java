package Question2;

// Base Class Vehicle
class Vehicle {

    // Private Fields
    private final String brand;
    private final String color;
    private final String year;
    private final String model;


    // Parameterized Constructor
    public Vehicle(String brand, String color, String year, String model) {
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    // public method to print details
    public void printDetails() {
        System.out.println("\t\tManufacturer: " + brand);
        System.out.println("\t\tModel: " + model);
        System.out.println("\t\tColor: " + color);
        System.out.println("\t\tYear: " + year);

    }

}

// Derived Class Car
class Car extends Vehicle {

    // Private field
    private final String bodyStyle;
    private final String price;

    // Parameterized Constructor
    public Car(String brand, String color, String year, String model, String bodyStyle,  String price) {
        super(brand, color, year, model);  //calling parent class constructor
        this.bodyStyle = bodyStyle;
        this.price = price;
    }

    public void carDetails() {  //details of car
        printDetails();         //calling method from parent class
        System.out.println("\t\tBody Style: " + bodyStyle);
        System.out.println("\t\tPrice: " + price);
    }

}

