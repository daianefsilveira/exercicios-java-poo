package metodosparametrosfuncionario;

public class TestarFuncionario {

    public static void main(String[] args) {

        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.nome = "Luis";
        novoFuncionario.sobrenome = "Silva";
        novoFuncionario.horasTrabalhadas = 10;
        novoFuncionario.valorPorHora = (float) 25.50;

        System.out.println("Nome do funcionário: " + novoFuncionario.nomeCompleto());
        System.out.println("Salário a receber: R$ " + novoFuncionario.calcularSalario());
        novoFuncionario.incrementarHoras(8);
        System.out.println("Valor em horas extras: R$ " + (8 * novoFuncionario.valorPorHora));
        System.out.println("Salário com extras: R$ " + novoFuncionario.calcularSalario());
        novoFuncionario.calcularSalario();

    }
}
