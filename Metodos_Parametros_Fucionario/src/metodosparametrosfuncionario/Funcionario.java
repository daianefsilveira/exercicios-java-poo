package metodosparametrosfuncionario;

public class Funcionario {

    public String nome;
    public String sobrenome;
    public int horasTrabalhadas;
    public float valorPorHora;

    public String nomeCompleto() {
        return nome + " " + sobrenome;
    }

    public float calcularSalario() {
        return (horasTrabalhadas * valorPorHora);
    }

    public void incrementarHoras(int horas) {
        horasTrabalhadas += horas;
    }
}
