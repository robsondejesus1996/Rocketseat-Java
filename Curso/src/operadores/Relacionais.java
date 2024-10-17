package operadores;

public class Relacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        int idadeIza = 1;
        boolean maiorDeIdade = idadeIza >=18;
        System.out.println("Isa é maior de idade: " + maiorDeIdade);
        System.out.println("Isa é maior de idade: " + (maiorDeIdade ? "SIM" : "NAO"));

        if(numero1 > numero2){
            System.out.println("Numero 1 maior que numero 2");
        }

        if(numero1 < numero2){
            System.out.println("Numero 1 menor que numero 2");
        }
        if(numero1 >= numero2){
            System.out.println("Numero 1 maior ou igual que numero 2");
        }
        if(numero1 <= numero2){
            System.out.println("Numero 1 menor ou igual que numero 2");

        }
    }
}
