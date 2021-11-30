package classepessoa;

public class TestarPessoa {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa(); 
        p.nome = "Daiane";
        p.idade = 37;
        p.dizerONome();
        p.dizerAIdade();
        p.fazerAniversario();
        System.out.println("Festa de aniversário!!!");
        p.dizerAIdade();
        System.out.println("--");
        
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Daniel";
        pessoa.idade = 33;
        pessoa.dizerONome();
        pessoa.dizerAIdade();
    }
}
