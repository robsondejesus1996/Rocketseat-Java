package poo.comparacao;

public class ComparacaoApp {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = Integer.parseInt("128");

        System.out.println(i1.equals(i2));


        String robson = "ROBSON";
        String string1 = new String("Robson");


        System.out.println(string1.equalsIgnoreCase(robson));
    }
}
