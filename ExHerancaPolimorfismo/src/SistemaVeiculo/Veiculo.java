package SistemaVeiculo;

public class Veiculo {

    protected String marca;
    protected String modelo;
    protected float velocidade;

    public Veiculo(String marca, String modelo, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void mover() {
        System.out.println("Veículo se movendo...");
    }

    // Método abastecer - comportamento padrão
    public void abastecer() {
        System.out.println("Veículo reabastecendo...");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getVelocidade() {
        return velocidade;
    }
}
