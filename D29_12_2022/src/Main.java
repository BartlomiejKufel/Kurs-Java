public class Main {
    public static void main(String[] args) {
        Hamburger hm = new Hamburger(5.50,"Pomidor", "Sałata", "Razowa", "Mały");
        System.out.println(hm.toString());

        HamburgerXXL hmXXL = new HamburgerXXL(10,"Ser", "Ogórek", "Pszenna");
        System.out.println(hmXXL.toString());
    }
}