package Ex5PcComponentes;

public class Processador {
    private String marca;
    private String modelo;
    private double frequencia;  // em GHz

    public Processador(String marca, String modelo, double frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getFrequencia() {
        return frequencia;
    }

    @Override
    public String toString() {
        return "Processador: " + marca + " " + modelo + " (" + frequencia + " GHz)";
    }
}