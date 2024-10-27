package services;

import entities.Casher;
import entities.Product;

import java.util.Scanner;

public class ServiceProductSold {
    public Product inputInfo(Scanner sc ){
        System.out.println("Enter productID: ");
        Integer id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter productName: ");
        String productName = sc.nextLine();
        System.out.println("Enter price: ");
        Double price = Double.parseDouble(sc.nextLine());
        System.out.println("quantity: ");
        Integer quantity = Integer.parseInt(sc.nextLine());
        System.out.println("typeProducts: ");
        String typeProducts = sc.nextLine();
        return new Product(int productID, String productName, String price, int quantity, String typeProducts);
}
