package exercício_quarto;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Runner extends Alunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alunos[] quartos = new Alunos[10];
        System.out.println("quantos quartos seram alugados?");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira os dados dos alunos: ");
        for(int i = 0; i < n; i++){
            System.out.println("nome: ");
            String nome = sc.nextLine();
            String email;
            while (true){
                System.out.println("email: ");
                email = sc.nextLine();
                String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(email);
                if (matcher.matches()) {
                    break;
                } else {
                    System.out.println("Email inválido! Digite novamente.");
                }
            }
            int quarto;
            while (true){
                System.out.println("Quarto: ");
                quarto = sc.nextInt();
                sc.nextLine();
                if (quartos[quarto] == null){
                    break;
                }else {
                    System.out.println("quarto ocupado! Digite novamente.");
                }
            }

            Alunos aluno = new Alunos();
            aluno.setNome(nome);
            aluno.setEmail(email);
            aluno.setQuarto(quarto);
            quartos[quarto] = aluno;
        }
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println("Quarto " + i + ": "
                        + quartos[i].getNome() + ", "
                        + quartos[i].getEmail());
            }
        }


    }
}
