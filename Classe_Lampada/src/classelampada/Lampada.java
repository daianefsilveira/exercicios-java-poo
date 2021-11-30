package classelampada;

public class Lampada {

    public boolean acesa;
    public int potencia;

    void acender() {
        acesa = true;
    }

    void apagar() {
        acesa = false;
    }

    void informarSituacao() {
        if (acesa) {
            System.out.println("A luz está acesa!");
        } else {
            System.out.println("A luz está apagada!");
        }
    }

    void mudarSituacao() { //uso de métodos dentro de métodos da própria classe
        if (acesa) {
            apagar();
        } else {
            acender();
        }
    }

    void informarPotencia() {
        System.out.println("A potência da lâmpada é " + potencia);
    }
}
