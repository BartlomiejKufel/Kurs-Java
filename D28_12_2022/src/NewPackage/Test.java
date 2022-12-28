package NewPackage;
public class Test {
    private String nazwa;
    private int waga;
    private int wzrost;

    public Test() {

    }

    public Test(String nazwa, int waga, int wzrost) {
        this.nazwa = nazwa;
        this.waga = waga;
        this.wzrost = wzrost;
    }


    public void powitanie(){
        System.out.println("Witam "+ nazwa +"!");
    }

    public void info(){
        System.out.println("Nazwa: "+nazwa);
        System.out.println("Waga: "+waga);
        System.out.println("Wzrost: "+wzrost);
    }


}
