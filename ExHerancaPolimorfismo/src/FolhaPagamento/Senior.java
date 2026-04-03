package FolhaPagamento;

public class Senior extends Desenvolvedor {

    public Senior(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void codar() {
        System.out.println("Senior codando e revisando código de outros...");
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.20;
    }

    @Override
    public String toString() {
        return "Senior{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", bonus=" + String.format("%.2f", calcularBonus()) +
                '}';
    }
}
