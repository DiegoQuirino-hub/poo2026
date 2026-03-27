package Ex5PcComponentes;

public class Projeto {
    private int id;
    private String marca;
    private Processador processador; //Colocar o private aqui processador processador

    public Projeto(int id, String marca, String marcaProcessador,
                      String modeloProcessador, double frequenciaProcessador) {
        this.id = id;
        this.marca = marca;
        this.processador = new Processador(marcaProcessador, modeloProcessador, frequenciaProcessador);// tem que instanciar aqui para fazer a dependencia
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public Processador getProcessador() {
        return processador;
    }

    @Override
    public String toString() {
        return "Projeto:\n" +
                "  ID: " + id + "\n" +
                "  Marca: " + marca + "\n" +
                "  " + processador;
    }
}