package Zadania;

public class Building {
    private String address;
    private double temperature;
    private String size;

    public Building(String address) {
        this.address = address;
    }

    public Building(String address, String size) {
        new Building(address);
        this.size = size;
    }

    public Building(String address, double temperature, String size) {
        new Building(address,size);
        this.temperature=temperature;
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", temperature=" + temperature +
                ", size='" + size + '\'' +
                '}';
    }
}
