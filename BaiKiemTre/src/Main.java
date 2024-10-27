import entities.Casher;
import entities.ListSale;
import entities.Product;
import entities.TypeProduct;
import services.ServiceDisplayInfo;
import services.ServiceProductSold;
import services.ServicesDataInfo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceDisplayInfo serviceDisplayInfo = new ServiceDisplayInfo();
        Casher casher= serviceDisplayInfo.inputInfo(sc);
        System.out.println(casher);
        ServicesDataInfo servicesDataInfo = new ServicesDataInfo();
        ArrayList<Casher> cashers= servicesDataInfo.Data(Casher casher);
        System.out.println(cashers);
        ArrayList<Product> typeProducts=new ArrayList<Product>();
        ServiceProductSold serviceProductSold=new ServiceProductSold();
        Product product= serviceProductSold.inputInfo(sc);
        typeProducts.add(product);
        ListSale listSale=new ListSale();
        listSale.setTypeProduct(typeProducts);
        listSale.setName(casher.getName());
    }
}