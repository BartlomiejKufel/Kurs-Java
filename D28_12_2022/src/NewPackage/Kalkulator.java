package NewPackage;

public class Kalkulator {
    private double wynik;

    public Kalkulator() {
        this.wynik = 0;
    }

    public void dodaj(double num1, double num2){
        wynik = num1+num2;
        System.out.println("Wynik dodawania to: "+wynik);
    }
    public void odejmij(double num1, double num2){
        wynik = num1 - num2;
        System.out.println("Wynik odejmowania to: "+wynik);
    }
    public void pomnoz(double num1, double num2){
        wynik = num1 * num2;
        System.out.println("Wynik mnożenia to: "+wynik);
    }

    public void podziel(double num1, double num2){
        wynik = num1 / num2;
        System.out.println("Wynik dzielenia to: "+wynik);
    }
}
