package entities;

public class Human {
    private String name;
    private String Address;
    private int Phonenumber;

    public Human(String name, String address, int phonenumber) {
        this.name = name;
        Address = address;
        Phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public int getPhonenumber() {
        return Phonenumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPhonenumber(int phonenumber) {
        Phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", Phonenumber=" + Phonenumber +
                '}';
    }
}
