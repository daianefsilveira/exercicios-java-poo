package metodosparametroscontacorrente;

public class TestarContaCorrente {

    public static void main(String[] args) {

        ContaCorrente novaConta = new ContaCorrente();

        novaConta.definirSaldoInicial(1000);
        System.out.println("O seu saldo é: R$ " + novaConta.saldo);

        novaConta.sacar(500);

        novaConta.depositar(50);
        System.out.println("O seu novo saldo é: R$ " + novaConta.saldo);

        novaConta.sacar(600);
        System.out.println("O seu saldo é: " + novaConta.saldo);
    }
}
