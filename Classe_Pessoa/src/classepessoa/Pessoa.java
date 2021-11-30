
package classepessoa;

public class Pessoa {

    public String nome;
    public int idade;

    public void dizerONome() {
        System.out.println("Olá, meu nome é " + nome);
    }

    public void dizerAIdade() {
        System.out.println("Eu tenho " + idade + " anos ");
    }

    public void fazerAniversario() {
        idade++;
    }
}

