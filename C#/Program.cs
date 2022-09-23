using System;

public class Fibonacci
{
    static void Main(string[] args){
        long fibonacci = 1;
        long fibonacci2 = 1;
        int N = 50;

        System.Console.WriteLine(fibonacci + "");
        while(N!=0)
        {
            System.Console.WriteLine(fibonacci);
            fibonacci += fibonacci2;
            fibonacci2 = fibonacci - fibonacci2;
            N--;
        }
    }
}