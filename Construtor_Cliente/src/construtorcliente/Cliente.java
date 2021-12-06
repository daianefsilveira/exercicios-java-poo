package construtorcliente;

public class Cliente {
   
    private String nome;
    private String endereco;
    private float renda;
    
    public Cliente() { 
    }
    
    public Cliente(String nome, String endereco, float renda) { 
        this.nome = nome; 
        this.endereco = endereco;
        this.renda = renda;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }
    
    public void exibirNome() {
        System.out.println("Cliente: " + getNome());
        exibirEndereco();
    }

    public void exibirEndereco() {
        System.out.println("Endereço: " + getEndereco());
    }

    public void exibirRenda() {
        System.out.println("Renda: R$ " + getRenda());       
        System.out.println("Limite: R$ " + exibirLimite());
    }

    public float exibirLimite() {
        if (getRenda() <= 5000) {
            return 3000;
        } else if (getRenda() <= 10000){
            return 6000;
        }else{
            return getRenda() * 0.8f;
        }
    }    
}






