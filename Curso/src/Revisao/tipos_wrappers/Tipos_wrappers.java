package Revisao.tipos_wrappers;

import java.io.File;

public class Tipos_wrappers {
    public static void main(String[] args) {
        double numeroDouble = 123.55;
        int numeroInt = (int) numeroDouble;

        System.out.println(numeroInt);


        Double d = 100.89;
        Integer i = d.intValue();
        System.out.println(i);


        double r = 3.75;
        int s = (int) r;
        System.out.println(s);


        String num = "100";

        double t = Double.parseDouble(num);
        System.out.println(t);


        Double valorLiteral = 123.456;
        int converValorLiteral = valorLiteral.intValue();
        System.out.println(converValorLiteral);


        Integer obj = Integer.valueOf("100");
        int objValor = obj.intValue();
        System.out.println(objValor);


        File file = null;
//        Gson gson = new Gson();


    }
}
