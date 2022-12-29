package Interface;

public class Pies implements Zwierze{
    private String nazwa;
    private double szybkosc;

    public Pies(String nazwa, double szybkosc) {
        this.nazwa = nazwa;
        this.szybkosc = szybkosc;
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("hau hau");
    }

    @Override
    public void biegnij() {
        System.out.println("Pies "+ nazwa+ " biegnie z szybkoscia: "+szybkosc);
    }
}
