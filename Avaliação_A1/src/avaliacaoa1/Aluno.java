package avaliacaoa1;

import java.util.Scanner;

public class Aluno {

    private int matricula;
    private String nome;
    private float nota1;
    private float nota2;
    private float nota3;
    private static int auxMatricula;
    
    Scanner ler = new Scanner(System.in);

    public Aluno(String nome) {
        this.nome = nome;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        setMatricula(gerarMatricula());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    private static int gerarMatricula() {

        return ++auxMatricula;
    }

    public void exibirDados() {
        System.out.println("\nMatricula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.println("Notas: ");
        System.out.println("Nota 1: " + getNota1());
        System.out.println("Nota 2: " + getNota2());
        System.out.println("Nota 3: " + getNota3());
        System.out.println("Média: " + calcularMedia(getNota1(), getNota2(), getNota3()));  
        float media = (nota1 + nota2 + nota3) / 3;
        if (verificarAprovacao(media) == true) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }

    public void lancarNotas() {
        System.out.println("Informe a nota 1: "); 
        nota1 = ler.nextFloat();       
        System.out.println("Informe a nota 2: "); 
        nota2 = ler.nextFloat(); 
        System.out.println("Informe a nota 3: ");
        nota3 = ler.nextFloat(); 
        System.out.println("Notas lançadas com sucesso!");
    }

    private float calcularMedia(float nota1, float nota2, float nota3) {
      
        return (nota1 + nota2 + nota3) / 3;
    }

    private boolean verificarAprovacao(float notaFinal) {
        if (notaFinal >= 7) {           
            return true;
        } else {
           return false;
        }
    }
}
