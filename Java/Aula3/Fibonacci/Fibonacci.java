package Aula3.Fibonacci;
public class Fibonacci
{
    public static void main(String[] args)
    {
        
        long fibonacci = 1;
        long fibonacci2 = 1;
        int N = 50;

        System.out.println(fibonacci2);
        while(N!=0)
        {
            System.out.println(fibonacci);
            fibonacci = fibonacci + fibonacci2;
            fibonacci2 = fibonacci - fibonacci2;
            N--;
        }
    }
}