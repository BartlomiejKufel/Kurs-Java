package Zadania;

public class Main {
    public static void main(String[] args) {
        Figura kw = new Kwadrat(6);
        kw.obliczObwod();
        kw.obliczPole();

        Figura tr = new Trojkat(7,7,9,4);
        tr.obliczPole();
        tr.obliczObwod();
    }
}
