import java.util.Scanner;
import java.util.Locale;

public class Teste{

    public static Scanner scanf = new Scanner(System.in);

    private static void recuo(){
        System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
    }

    private static void Funcao1(){

    }

    private static void Funcao2(){

    }

    private static void Funcao3(){

    }

    private static void Funcao4(){

    }

    public static void main(String[] args) {
        new Locale("pt", "BR");
        char menu = 0;

        do{
            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
            System.out.println("┃                                                    ┃");
            System.out.println("┃                  TEMPLATE DE MENU                  ┃");
            System.out.println("┃                                                    ┃");
            System.out.println("┠────────────────────────────────────────────────────┨");
            System.out.println("┃ 1 - Funcao 1                                       ┃");
            System.out.println("┃ 2 - Funcao 2                                       ┃");
            System.out.println("┃ 3 - Funcao 3                                       ┃");
            System.out.println("┃ 4 - Funcao 4                                       ┃");
            System.out.println("┃ 0 - Sair                                           ┃");
            System.out.println("┃                                                    ┃");
            System.out.print("┃ O que deseja fazer:                                ┃");
            recuo();
            menu = scanf.next().charAt(0);
            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

            switch(menu){
                case '0':
                    break;
                case '1':
                    Funcao1();
                    break;
                case '2':
                    Funcao2();
                    break;
                case '3':
                    Funcao3();
                    break;
                case '4':
                    Funcao4();
                    break;
                default:
                System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                System.out.println("┃ Inválido, opção não existe                         ┃");
                System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                    break;
            }
        }while(menu != '0');
    }
}