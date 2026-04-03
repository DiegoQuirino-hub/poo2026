package SistemaVeiculo;

public class Aviao extends Veiculo {

    private float altitudeMax;
    private float altitudeAtual;

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
        this.altitudeAtual = 0;
    }

    @Override
    public void mover() {
        this.altitudeAtual = altitudeMax;
        System.out.println("Avião voando a " + velocidade + " km/h e " + altitudeAtual + " metros");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo com querosene de aviação");
    }
}