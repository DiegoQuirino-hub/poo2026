package FolhaPagamento;

public class Desenvolvedor {
    protected String nome;
    protected double salarioBase;

    public Desenvolvedor(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void codar() {
        System.out.println("Desenvolvedor codando...");
    }

    public double calcularBonus() {
        return salarioBase * 0.05; // 5% de bônus padrão
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
