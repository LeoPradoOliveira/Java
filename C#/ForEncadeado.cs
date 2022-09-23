using System;

public class ForEncadeado{
    static void Main(string[] args){

        Console.WriteLine("Digite um numero inteiro: ");
        int x = Convert.ToInt32(Console.ReadLine());

        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= i; j++){
                Console.Write(i * j + " ");
            }
        Console.WriteLine();
        }
    }
}