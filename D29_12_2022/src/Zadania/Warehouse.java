package Zadania;

public class Warehouse extends Building{
    private boolean availability;
    public Warehouse(String address, double temperature, String size, boolean availability) {
        super(address, temperature, size);
        this.availability=availability;
    }
}
