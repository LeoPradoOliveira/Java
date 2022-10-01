package Funcionarios;
public class Main {    
    public static void main(String[] args) {
        Funcionario c1 = new Funcionario();
        Funcionario c2 = new Funcionario();

        c1.pegaDados("Jorge", "126.870.966-28", 9999.99, 01,01,0001);
        c2.pegaDados("Jorge", "126.870.966-28", 9999.99, 01,01,0001);
        Funcionario c3 = c1;
        System.out.print("\nC1");
        c1.mostra();
        System.out.print("\nC2");
        c2.mostra();
        System.out.print("\nC3");
        c3.mostra();

        System.out.println();
        
        if (c1 == c2){
            System.out.println("Contratado 1 e Contratado 2 são iguais");
        } else {
            System.out.println("Contratado 1 e Contratado 2 são diferentes");
        }

        if (c1 == c3){
            System.out.println("Contratado 1 e Contratado 3 são iguais");
        } else {
            System.out.println("Contratado 1 e Contratado 3 são diferentes");
        }
    }
}