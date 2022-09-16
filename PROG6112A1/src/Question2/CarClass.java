package Question2;

import java.util.Scanner;

public class CarClass {

    public static void main(String[] args) {
        //An array to store the data of cars available for sale
        String[][] cars_for_sale = {
            {"Datsun", "Fairlady 240Z", "Sports car", "1969", "Midnight Blue", "$58,000"},
            {"Datsun", "120Y", "Coupé", "1971", "Marine Blue", "$74,000"},
            {"Chevrolet", "C3 Covette Stringray ", "Convertible", "1970", "Riverside Gold Metallic", "$89,500"},
            {"Toyota", "Supra MK3", "Sedan", "1998", "Matte Black", "$72,700"},
            {"Toyota", "Trueno AE86", "Hatchback", "1983", "Two-Tone Black", "$44,900"}
        };
//MEnu
        System.out.println("Welcome to Gran Turismo Auto");
        System.out.println("View Availabe vehicles");
        System.out.println("1.View all vehicles");
        System.out.println("2.View vehicles by make");
        System.out.print("Enter your option: ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {

            for (int i = 0; i < cars_for_sale.length; i++) {
                System.out.print(i + 1);
                Car elantraSedan = new Car(cars_for_sale[i][0], cars_for_sale[i][4],
                        cars_for_sale[i][3], cars_for_sale[i][1], cars_for_sale[i][2], cars_for_sale[i][5]); //creation of car Object
                elantraSedan.carDetails(); //calling method to print details
            }
        } else if (option == 2) {
            System.out.println("1.View Datsun cars");
            System.out.println("2.View Chevrolet cars");
            System.out.println("3.View Toyota cars");
            System.out.print("Enter you option: ");
            int myoption = sc.nextInt();
            switch (myoption) {
                case 1: {
                    int count = 1;
                    for (String[] cars_for_sale1 : cars_for_sale) {
                        if ("Datsun".equals(cars_for_sale1[0])) {
                            System.out.print(count);
                            Car elantraSedan = new Car(cars_for_sale1[0], cars_for_sale1[4], cars_for_sale1[3], cars_for_sale1[1], cars_for_sale1[2], cars_for_sale1[5]); //creation of car Object
                            elantraSedan.carDetails(); //calling method to print details
                            count = count + 1;
                        }
                    }
                    break;
                }
                case 2: {
                    int count = 1;
                    for (String[] cars_for_sale1 : cars_for_sale) {
                        if ("Chevrolet".equals(cars_for_sale1[0])) {
                            System.out.print(count);
                            Car elantraSedan = new Car(cars_for_sale1[0], cars_for_sale1[4], cars_for_sale1[3], cars_for_sale1[1], cars_for_sale1[2], cars_for_sale1[5]); //creation of car Object
                            elantraSedan.carDetails(); //calling method to print details
                            count = count + 1;
                        }
                    }
                    break;
                }
                case 3: {
                    int count = 1;
                    for (String[] cars_for_sale1 : cars_for_sale) {
                        if ("Toyota".equals(cars_for_sale1[0])) {
                            System.out.print(count);
                            Car elantraSedan = new Car(cars_for_sale1[0], cars_for_sale1[4], cars_for_sale1[3], cars_for_sale1[1], cars_for_sale1[2], cars_for_sale1[5]); //creation of car Object
                            elantraSedan.carDetails(); //calling method to print details
                            count = count + 1;
                        }
                    }
                    break;
                }
                default:
                    System.out.println("Invalid option, please try again");
                    break;
            }
        } else {
            System.out.println("Invalid option please try again");
        }
    }
}