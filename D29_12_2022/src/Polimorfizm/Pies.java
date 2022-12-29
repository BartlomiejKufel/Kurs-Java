package Polimorfizm;

public class Pies extends Zwierze{
    public Pies(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public void idzDoPrzodu(){
        System.out.println("Pies idzie");
    }
}
