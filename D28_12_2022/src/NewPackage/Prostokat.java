package NewPackage;

public class Prostokat {
    private int dlugoscBoku1;
    private int dlugoscBoku2;

    public Prostokat(int dlugoscBoku1, int dlugoscBoku2) {
        this.dlugoscBoku1 = dlugoscBoku1;
        this.dlugoscBoku2 = dlugoscBoku2;
    }

    public void obliczPole(){
        int pole = dlugoscBoku1*dlugoscBoku2;
        System.out.println("Pole prostokąta wynosi: " + pole);
    }

    public void obliczObwód(){
        int obw =((dlugoscBoku1*2)+(dlugoscBoku2*2));
        System.out.println("Obwód prostokąta wynosi: " + obw);

    }
}
