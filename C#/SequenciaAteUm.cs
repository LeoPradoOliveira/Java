using System;

public class SequenciaAteUm{
    static void Main(string[] args)
    {
        System.Console.WriteLine("Digite um numero inteiro: ");
        int x = Convert.ToInt32(Console.ReadLine());

        while(x != 1)
        {
            Console.Write(x + " -> ");
            if(x % 2 == 0)
            {
                x /= 2;
            }else
            {
                x = x*3 + 1;
            }
        }
        System.Console.Write(x);
    }
}