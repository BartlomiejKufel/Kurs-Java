package Polimorfizm;

public class Main {

    public static void main(String[] args) {
        Zwierze zw = new Zwierze("zwierze", 3);
        zw.idzDoPrzodu();

        Zwierze zw1 = new Pies("Azor", 4);
        zw1.idzDoPrzodu();

        Zwierze zw2 = new Kot("Filemon", 3);
        zw2.idzDoPrzodu();

        Kot kot = new Kot("Bonifacy", 12);
        kot.idzDoPrzodu();

        Zwierze[] zwierzeta = new Zwierze[4];
        zwierzeta[0] = zw;
        zwierzeta[1] = zw1;
        zwierzeta[2] = zw2;
        zwierzeta[3] = kot;

        for (Zwierze z : zwierzeta){
            System.out.println(z.getNazwa());
        }


    }
}
