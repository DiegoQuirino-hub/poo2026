package Ex3TimeBasquete;

import java.util.ArrayList;

public class Time {
    private int id;
    private String nome;
    private String tecnico;
    private ArrayList<Atleta> atletas;

    public Time() {
    }

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    public void contratarAtleta(Atleta a) {
        atletas.add(a);
        System.out.println(a.getNome() + " foi contratado pelo time " + this.nome);
    }

    public void liberarAtleta(Atleta a) {
        atletas.remove(a);
        System.out.println(a.getNome() + " foi liberado do time " + this.nome);
    }

    public void listarAtletas() {
        System.out.println("\n📋 Atletas do time " + nome + ":");
        if (atletas.isEmpty()) {
            System.out.println("   Nenhum atleta contratado ainda.");
        } else {
            for (Atleta a : atletas) {
                System.out.println("   - " + a);
            }
        }
    }

    @Override
    public String toString() {
        return "Time:\n" +
                "  ID: " + id + "\n" +
                "  Nome: " + nome + "\n" +
                "  Técnico: " + tecnico + "\n" +
                "  Total de Atletas: " + atletas.size();
    }
}
