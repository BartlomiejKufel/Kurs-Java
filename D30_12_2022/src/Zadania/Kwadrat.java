package Zadania;

public class Kwadrat extends Figura{

    private int a;

    public Kwadrat(int a) {
        this.a = a;
    }

    @Override
    public void obliczPole() {
        System.out.println("Pole: "+(a*a));
    }

    @Override
    public void obliczObwod() {
        System.out.println("Obwod: "+(a*4));
    }
}
