package Polimorfizm;

public class Kot extends Zwierze{

    public Kot(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public void idzDoPrzodu(){
        System.out.println("Kot idzie");
    }
}
