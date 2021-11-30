package metodosparametroscontacorrente;

public class ContaCorrente {
    
    String numero;
    String agencia;
    
    public float saldo;

    public void definirSaldoInicial(float valor) {
        saldo += valor;
    }

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public boolean sacar(float valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente!");
            return false;
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            return true;
        }
    }
}
