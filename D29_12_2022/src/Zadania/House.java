package Zadania;

public class House extends Building{

    private String resident;
    public House(String address, double temperature, String size, String resident) {
        super(address, temperature, size);
        this.resident = resident;
    }
}
