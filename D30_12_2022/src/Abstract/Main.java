package Abstract;

public class Main {
    public static void main(String[] args) {
        Zwierze zw1 = new Pies("Ares", 8);
        zw1.biegnij();
        zw1.wydajDzwiek();

        Zwierze zw2 = new Kot("Pusia", 7);
        zw2.biegnij();
        zw2.wydajDzwiek();

        Zwierze zw3 = new Krokodyl("Krokodyl zwyczajny", 10);
        zw3.biegnij();
        zw3.wydajDzwiek();


    }

}
