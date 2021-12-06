
package avaliacaoa1;

import java.util.Scanner;

public class TestarAluno {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        String nome = ler.nextLine();       
        
        Aluno aluno = new Aluno(nome);
        
        aluno.lancarNotas();
        aluno.exibirDados();
        
        System.out.println("########################");
        System.out.println("Informe o nome do aluno: ");
        nome = ler.nextLine();
              
        Aluno aluno2 = new Aluno(nome);
        
        aluno2.lancarNotas();
        aluno2.exibirDados();       
    }   
}
