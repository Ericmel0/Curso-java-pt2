package exercicio_lista;

import java.util.Scanner;
import  java.util.List;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("qual a quantidade de funcionários?");
        int quant = sc.nextInt();
        sc.nextLine();
        for(int quantFunc = 0; quantFunc < quant; quantFunc++){
            Funcionario funci = new Funcionario();
            System.out.println("digite o id:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("digite o nome:");
            String nome = sc.nextLine();
            System.out.println("digite o salario:");
            double salario = sc.nextDouble();
            sc.nextLine();
            funci.setId(id);
            funci.setNome(nome);
            funci.setSalario(salario);
            funcionarios.add(funci);
        }
        for(Funcionario f : funcionarios){
            System.out.println(f);
        }
    }

}
