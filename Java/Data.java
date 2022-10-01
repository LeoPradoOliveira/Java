package Funcionarios;

public class Data {
    private int d;
    private int m;
    private int a;

    void pegaDados(int d, int m, int a){
        this.d = d;
        this.m = m;
        this.a = a;
    }

    void mostra(){
        System.out.print(String.format("%02d", this.d));
        System.out.print(String.format("/%02d", this.m));
        System.out.println(String.format("/%04d", this.a));
    }
}
