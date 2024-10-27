package entities;

import services.ServiceDisplayInfo;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSale {
    Scanner sc = new Scanner(System.in);
    private String name;
    private ArrayList<Product> listProductsSold;

    public String setName(String name){
        ServiceDisplayInfo serviceDisplayInfo = new ServiceDisplayInfo();
        Casher casher= serviceDisplayInfo.inputInfo(sc);
        this.name=casher.getName();
        return this.name;
    }

    public String getName() {
        return name;
    }
    public void setTypeProduct(ArrayList<Product> listProductsSold) {
        this.listProductsSold = listProductsSold;
    }

    /*cac ham tren su dung de set input cac gia tri vao trong bien thuoc tinh cua class*/
    public ArrayList<Product> getListProductsSold() {
        for(Product )
    }

    @Override
    public String toString() {
        return "ListSale{" +
                "sc=" + sc +
                ", name='" + name + '\'' +
                ", listProductsSold=" + listProductsSold +
                '}';
    }
}
