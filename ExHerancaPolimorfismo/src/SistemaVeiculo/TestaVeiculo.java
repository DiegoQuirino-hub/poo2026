package SistemaVeiculo;

public class TestaVeiculo {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE VEÍCULOS ===\n");

        Aviao aviao = new Aviao("Airbus", "A380", 900, 12000);
        CarroEletrico carro = new CarroEletrico("Tesla", "Model 3", 200, 500);

        System.out.println("Teste 1: Avião");
        Veiculo veiculo = aviao;
        veiculo.mover();
        veiculo.abastecer();

        System.out.println("\nTeste 2: Carro Elétrico");
        veiculo = carro;
        veiculo.mover();
        veiculo.abastecer();

        System.out.println("\nTeste 3: Chamadas diretas");
        aviao.mover();
        aviao.abastecer();

        System.out.println();
        carro.mover();
        carro.abastecer();
    }
}
