package services;

import entities.Casher;

import java.util.Scanner;

public class ServiceDisplayInfo {
    public Casher inputInfo(Scanner sc ){
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        System.out.println("Enter Phonenumber: ");
        Integer phonenumber = Integer.parseInt(sc.nextLine());
        System.out.println("ID: ");
        Integer id = Integer.parseInt(sc.nextLine());
        System.out.println("ConstractDate: ");
        String constractDate = sc.nextLine();
        return new Casher(name, address, phonenumber, id, constractDate);
    }

}
