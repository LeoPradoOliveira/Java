package Funcionarios;
public class Funcionario{
    private String nome;
    private String cpf;
    private double salario;
    private Data dataEntrada = new Data();

    public void mostra(){
        System.out.print("\nNome: " + this.nome + "\nCPF: " + this.cpf + "\nSalario: " + this.salario + "\nData de entrada: ");
        this.dataEntrada.mostra();
    }

    public void pegaDados(String nome, String cpf, double salario, int d, int m, int a){
        this.nome = nome; this.cpf = cpf;
        this.salario = salario; this.dataEntrada.pegaDados(d,m,a);
    }
}