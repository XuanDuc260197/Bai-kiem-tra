package entities;

public class Casher extends Human {
    private static  int autoID;
    private int id;
    private String ConstractDate;

    public Casher(String name, String address, int phonenumber, int id, String constractDate) {
        super(name, address, phonenumber);
        this.id = ++autoID;
        ConstractDate = constractDate;
    }

    public static int getIdCounter() {
        return autoID;
    }

    public static void setIdCounter(int idCounter) {
        Casher.autoID = autoID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConstractDate() {
        return ConstractDate;
    }

    public void setConstractDate(String constractDate) {
        ConstractDate = constractDate;
    }

    @Override
    public String toString() {
        return "Casher{" +
                "id=" + id +
                ", ConstractDate='" + ConstractDate + '\'' +
                '}';
    }
}
