package Interface;

public class Main {
    public static void main(String[] args) {
        Zwierze zw1 = new Kot("Kitka", 20.2);
        zw1.biegnij();
        zw1.wydajDzwiek();

        Zwierze zw2 = new Pies("Scooby Doo", 300);
        zw2.biegnij();
        zw2.wydajDzwiek();

    }
}
