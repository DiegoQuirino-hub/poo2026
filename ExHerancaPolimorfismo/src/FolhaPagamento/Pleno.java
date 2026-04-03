package FolhaPagamento;

public class Pleno extends Desenvolvedor {

    public Pleno(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void codar() {
        System.out.println("Pleno codando de forma independente...");
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.10;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", bonus=" + String.format("%.2f", calcularBonus()) +
                '}';
    }
}
