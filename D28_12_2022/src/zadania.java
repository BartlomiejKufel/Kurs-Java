public class zadania {
    //napisz 6 zadań na metody
    public static void main(String[] args) {
        System.out.println(zadanie2());
        System.out.println(zadanie3(12,-24));
        System.out.println(zadanie4("to", "jest", "bardzo", "*"));
        System.out.println(zadanie6(2,4));
        System.out.println(zadanie12(6));

        int[] tab = new int[]{3,1,7,8,9};
        zadanie7(tab);
        for(int x: tab){
            System.out.println(x);
        }
    }

    public static String zadanie4(String word1, String word2, String word3, String separator){
        String result =word1+separator+word2+separator+word3;
        return result;
    }

    public static int zadanie12(int num){
        int silnia=1;

        for (int i = num; i > 1; i--) {
            silnia *= i;
        }

        return silnia;
    }

    public static String zadanie2(){
        return "Im returning with some text";
    }

    public static int zadanie3(int num1, int num2){
        int result = num1+num2;

        if(result<0){
            result*=-1;
        }

        return result;
    }

    public static double zadanie6(double x, int n) {
        if(n==1)
            return x;
        if(n==0)
            return 1;
        if(n==2)
            return x*x;

        if(n%2==0)
            return zadanie6(x*x,n/2);
        else
            return x*zadanie6(x*x,n/2);
    }

    public static int[] zadanie7(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                int tmp = 0;
                if (tab[i] > tab[j]) {
                    tmp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = tmp;
                }
            }
        }
        return tab;
    }
}
