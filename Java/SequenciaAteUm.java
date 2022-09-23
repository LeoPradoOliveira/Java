import java.util.Locale;
import java.util.Scanner;

public class SequenciaAteUm
{
    public static Scanner scanf = new Scanner(System.in);
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);

        System.out.println("Digite um numero inteiro: ");
        int numeroX = scanf.nextInt();

        while(numeroX != 1)
        {
            System.out.print(numeroX + " -> ");
            if(numeroX % 2 == 0)
            {
                numeroX /= 2;
            }else
            {
                numeroX = numeroX*3 + 1;
            }
        }
        System.out.println(numeroX);

    }
}