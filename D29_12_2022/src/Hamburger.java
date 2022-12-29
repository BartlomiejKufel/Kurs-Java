public class Hamburger {
    private double cena;
    private String dodatek1;
    private String dodatek2;
    private String rodzajBulki;
    private String rozmiar;

    public Hamburger(double cena, String dodatek1, String dodatek2, String rodzajBulki, String rozmiar) {
        this.cena = cena;
        this.dodatek1 = dodatek1;
        this.dodatek2 = dodatek2;
        this.rodzajBulki = rodzajBulki;
        this.rozmiar = rozmiar;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "cena='" + cena + '\'' +
                ", dodatek1='" + dodatek1 + '\'' +
                ", dodatek2='" + dodatek2 + '\'' +
                ", rodzajBulki='" + rodzajBulki + '\'' +
                ", rozmiar='" + rozmiar + '\'' +
                '}';
    }
}
