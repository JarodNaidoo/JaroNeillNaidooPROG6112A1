package Question1;

import java.util.ArrayList;
import java.util.Scanner;

class Product {

    private String code;
    private String description;
    private double price;

    // the constructor
    public Product() {
        this.code = "";
        this.description = "";
        this.price = 0;
    }

    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }
    //@return the code

    public String getCode() {
        return code;
    }
    //@param code the code to set

    public void setCode(String code) {
        this.code = code;
    }
    //@return the description

    public String getDescription() {
        return description;
    }
    // @param description the description to set

    public void setDescription(String description) {
        this.description = description;
    }
    // @return the price

    public double getPrice() {
        return price;
    }
    // @param price the price to set

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product code: " + this.code + "\n" + "Product description: " + this.description + "\n"
                + "Product price: " + this.price + "\n";

    }
}

public class prog6112a1 {

    private static int getProductByCode(ArrayList<Product> products, String code) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCode().compareTo(code) == 0) {
                return i;
            }
        }
        return -1;
    }
    //Main method	 
    //@param args

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ch = -1;
        System.out.print("(1) to launch menu or any other key to exit: ");
        ch = input.nextInt();
        if (ch == 1) {
            ArrayList<Product> products = new ArrayList<Product>();
            String code;
            String description;
            double price;

            while (ch != 6) {
                System.out.println("(1) Capture a new product.");
                System.out.println("(2) Search for a product.");
                System.out.println("(3) Update a product.");
                System.out.println("(4) Delete a product.");
                System.out.println("(5) Print report.");
                System.out.println("(6) Exit Application");
                System.out.print("Your choice: ");
                ch = input.nextInt();
                switch (ch) {
                    case 1: {
                        input.nextLine();
                        System.out.print("Enter product code: ");
                        code = input.nextLine();
                        System.out.print("Enter product description: ");
                        description = input.nextLine();
                        System.out.print("Enter product price: ");
                        price = input.nextDouble();
                        Product newProduct = new Product(code, description, price);
                        products.add(newProduct);
                        System.out.println("\nProduct has been added.\n");
                    }
                    break;
                    case 2: {
                        input.nextLine();
                        System.out.print("Enter product code to display: ");
                        code = input.nextLine();
                        int index = getProductByCode(products, code);
                        if (index != -1) {
                            System.out.println(products.get(index).toString());
                        } else {
                            System.out.println("\nWrong product ID.\n");
                        }
                    }
                    break;
                    case 3: {
                        input.nextLine();
                        System.out.print("Enter product code to edit: ");
                        code = input.nextLine();
                        int index = getProductByCode(products, code);
                        if (index != -1) {
                            System.out.print("Enter a new product description: ");
                            description = input.nextLine();
                            System.out.print("Enter a new product price: ");
                            price = input.nextDouble();
                            Product newProduct = new Product(code, description, price);
                            products.remove(index);
                            products.add(index, newProduct);
                            System.out.println("\nProduct has been updated.\n");
                        } else {
                            System.out.println("\nWrong product ID.\n");
                        }
                    }
                    break;
                    case 4: {
                        input.nextLine();
                        System.out.print("Enter product code to delete: ");
                        code = input.nextLine();
                        int index = getProductByCode(products, code);
                        if (index != -1) {
                            products.remove(index);
                            System.out.println("\nProduct has been deleted.\n");
                        } else {
                            System.out.println("\nWrong product ID.\n");
                        }
                    }
                    break;
                    case 5: {
                        for (int i = 0; i < products.size(); i++) {
                            System.out.println(products.get(i).toString() + "\n");
                        }
                    }
                    break;
                    case 6: {
                        // exit
                    }
                    break;

                    default: {
                        System.out.println("Wrong menu item.");
                    }
                    break;
                }
            }
        }
        input.close();
    }
}
