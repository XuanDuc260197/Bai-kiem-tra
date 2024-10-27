package entities;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private static int autoID;
    private int productID;
    private String productName;
    private String price;
    private int quantity;
    private String typeProducts;

    public Product(int productID, String productName, String price, int quantity, String typeProducts) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.typeProducts = typeProducts;
    }

    public static int getAutoID() {
        return autoID;
    }

    public static void setAutoID(int autoID) {
        Product.autoID = autoID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTypeProducts() {
        return typeProducts;
    }

    public void setTypeProducts(String typeProducts) {
        this.typeProducts = typeProducts;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", price='" + price + '\'' +
                ", quantity=" + quantity +
                ", typeProducts='" + typeProducts + '\'' +
                '}';
    }
}
