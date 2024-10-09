package tiposWrappers;

public class TiposWrappers {

    public static void main(String[] args) {

        double numeroDouble = 123.56;
        int numeroInt = (int) numeroDouble;
        System.out.println(numeroInt);

        double d = 100.0;
        int i = (int) d;
        System.out.println(i);

        String num = "100.123";

        double s = Double.parseDouble(num);
        System.out.println(s);
    }
}
