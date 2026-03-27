package Ex4ProjetoSoftaware;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores;

    public Projeto() {
    }

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programadores = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public ArrayList<Programador> getProgramadores() {
        return programadores;
    }

    public void adicionarProgramador(Programador p) {
        programadores.add(p);
        System.out.println(p.getNome() + " foi adicionado ao projeto " + this.nomeProjeto);
    }

    public void removerProgramador(Programador p) {
        if (programadores.remove(p)) {
            System.out.println(p.getNome() + " foi removido do projeto " + this.nomeProjeto);
        } else {
            System.out.println(p.getNome() + " não estava no projeto " + this.nomeProjeto);
        }
    }

    public void listarProgramadores() {
        System.out.println("\nProgramadores do projeto '" + nomeProjeto + "':");

        if (programadores.isEmpty()) {
            System.out.println("Nenhum programador adicionado ainda.");
        } else {
            for (int i = 0; i < programadores.size(); i++) {
                Programador p = programadores.get(i);
                System.out.println("   " + (i + 1) + ". " + p);
            }
            System.out.println("Total: " + programadores.size() + " programador(es)");
        }
    }

    public void listarProgramadoresModerno() {
        System.out.println("\nProgramadores do projeto '" + nomeProjeto + "':");

        if (programadores.isEmpty()) {
            System.out.println("   ⚠️  Nenhum programador adicionado ainda.");
        } else {
            int contador = 1;
            for (Programador p : programadores) {
                System.out.println("   " + contador + ". " + p);
                contador++;
            }
            System.out.println("Total: " + programadores.size() + " programador(es)");
        }
    }

    public int contarProgramadoresPorLinguagem(String linguagem) {
        int contador = 0;
        for (Programador p : programadores) {
            if (p.getLinguagemPrincipal().equalsIgnoreCase(linguagem)) {
                contador++;
            }
        }
        return contador;
    }

    @Override
    public String toString() {
        return "Projeto:\n" +
                "  ID: " + id + "\n" +
                "  Nome: " + nomeProjeto + "\n" +
                "  Total de Programadores: " + programadores.size();
    }
}
