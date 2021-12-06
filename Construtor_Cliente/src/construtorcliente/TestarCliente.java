package construtorcliente;

import java.util.Scanner;

public class TestarCliente {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Cliente novoCliente = new Cliente();
        System.out.println("Informe o nome do cliente: ");
        novoCliente.setNome(ler.nextLine());
        System.out.println("Informe o endereço: ");
        novoCliente.setEndereco(ler.nextLine());
        System.out.println("Informe a renda: ");
        novoCliente.setRenda(ler.nextFloat());

        novoCliente.exibirNome();
        novoCliente.exibirRenda();        

        System.out.println("####################");

        ler.nextLine();
        System.out.println("Informe o nome do cliente: ");
        String nome = ler.nextLine();
        System.out.println("Informe o endereço: ");
        String endereco = ler.nextLine();
        System.out.println("Informe a renda ");
        float renda = ler.nextFloat();

        Cliente outroCliente = new Cliente(nome, endereco, renda);

        outroCliente.exibirNome();
        outroCliente.exibirRenda();
    }
}
