package FolhaPagamento;

public class TestaPagamento {
    public static void main(String[] args) {
        System.out.println("=== FOLHA DE PAGAMENTO - POLIMORFISMO COM VETORES ===\n");

        Desenvolvedor[] desenvolvedores = new Desenvolvedor[4];

        desenvolvedores[0] = new Junior("Ana Silva", 3000.00);
        desenvolvedores[1] = new Pleno("Carlos Santos", 5000.00);
        desenvolvedores[2] = new Senior("Maria Oliveira", 8000.00);
        desenvolvedores[3] = new Desenvolvedor("João Genérico", 4000.00);

        System.out.println("--- USANDO FOR ---\n");
        for (int i = 0; i < desenvolvedores.length; i++) {
            System.out.println("Posição " + i + ":");
            desenvolvedores[i].codar();
            System.out.println("Bônus: R$ " + String.format("%.2f", desenvolvedores[i].calcularBonus()));
            System.out.println(desenvolvedores[i].toString());
            System.out.println();
        }

        System.out.println("\nUSANDO FOREACH\n");
        int posicao = 0;
        for (Desenvolvedor dev : desenvolvedores) {
            System.out.println("Posição " + posicao + ":");
            dev.codar();
            System.out.println("Bônus: R$ " + String.format("%.2f", dev.calcularBonus()));
            System.out.println(dev.toString());
            System.out.println();
            posicao++;
        }
    }
}