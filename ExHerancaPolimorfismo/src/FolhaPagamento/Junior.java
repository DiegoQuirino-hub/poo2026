package FolhaPagamento;

public class Junior extends Desenvolvedor {

    public Junior(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void codar() {
        System.out.println("Junior codando com supervisão...");
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.03;
    }

    @Override
    public String toString() {
        return "Junior{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", bonus=" + String.format("%.2f", calcularBonus()) +
                '}';
    }
}
