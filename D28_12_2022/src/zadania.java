public class zadania {
    //napisz 6 zadań na metody
    public static void main(String[] args) {
        System.out.println(zadanie2());
        System.out.println(zadanie4("to", "jest", "bardzo", "głupie"));
        System.out.println(zadanie12(6));

    }

    public static String zadanie4(String word1, String word2, String word3, String word4){
        String result =word1+" "+word2+" "+word3+" "+word4;
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

}
