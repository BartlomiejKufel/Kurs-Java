package Zadania;

public class Trojkat extends Figura{

    private int a;
    private int b;
    private int c;
    private int h;

    public Trojkat(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public void obliczPole() {
        System.out.println("Pole: "+((a*h)/2));
    }

    @Override
    public void obliczObwod() {
        System.out.println("Obwod: "+(a+b+c));
    }
}
