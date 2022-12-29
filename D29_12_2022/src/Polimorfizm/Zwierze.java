package Polimorfizm;

public class Zwierze {
    private String nazwa;
    private int wiek;

    public Zwierze(String nazwa, int wiek) {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }

    public void idzDoPrzodu(){
        System.out.println("Zwierze idzie");
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWiek() {
        return wiek;
    }
}
