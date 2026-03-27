package Ex06EdificiosApartamentos;

import java.util.ArrayList;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamentos> apartamentos;

    public Edificio() {
    }

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public void construirApartamento(int num, int andar) {
        Apartamentos apto = new Apartamentos(num, andar);
        apartamentos.add(apto);
        System.out.println("Apartamento " + num + " construído no andar " + andar);
    }

    public void listarApartamentos() {
        System.out.println("Edifício: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Apartamentos:");
        for (Apartamentos apto : apartamentos) {
            System.out.println("  - " + apto);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public ArrayList<Apartamentos> getApartamentos() {
        return apartamentos;
    }
}
