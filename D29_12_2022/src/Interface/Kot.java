package Interface;

public class Kot implements Zwierze{
    private String nazwa;
    private double szybkosc;

    public Kot(String nazwa, double szybkosc) {
        this.nazwa = nazwa;
        this.szybkosc = szybkosc;
    }


    @Override
    public void wydajDzwiek() {
        System.out.println("miau miau");
    }

    @Override
    public void biegnij() {
        System.out.println("Kot "+nazwa+" biegnie z szybkoscia: "+szybkosc);
    }
}
