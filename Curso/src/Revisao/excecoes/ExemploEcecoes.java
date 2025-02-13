package Revisao.excecoes;

import java.text.NumberFormat;

public class ExemploEcecoes {
    public static void main(String[] args) {
//        try{
//            Double valor = Double.valueOf("175");
//            valor = NumberFormat.getInstance().parse("a1.75");
//            System.out.println(valor);
//
//        }catch (NumberFormatException ex){
//            System.out.println("Número invalido");
//            ex.printStackTrace();
//
//        }


       try{
           Number valor = NumberFormat.getInstance().parse("a1.75");
           Double vd = valor.doubleValue();
           System.out.println(vd);
       }catch (Exception e){
           e.printStackTrace();
       }

    }
}
