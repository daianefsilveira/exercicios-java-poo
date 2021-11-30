package classelampada;

public class TestarLampada {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();
        
        lampada.acesa = true;
        lampada.potencia = 110;
        
        lampada.acender();
        lampada.informarSituacao();
        lampada.apagar();       
        lampada.informarSituacao();
        lampada.mudarSituacao();
        lampada.informarSituacao();
        lampada.informarPotencia();

    }

}
