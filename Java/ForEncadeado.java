import java.util.Locale;
import java.util.Scanner;

public class ForEncadeado {
    public static Scanner scanf = new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Digite um numero inteiro: ");
        int numeroX = scanf.nextInt();

        for(int i = 1; i <= numeroX; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}