package Ex5PcComponentes;

public class TestaComputador {
    static void main(String[] args) {
        Projeto computador1 = new Projeto(1, "Dell", "Intel", "Core i7-13700K", 5.4);

        Projeto computador2 = new Projeto(2, "Apple MacBook", "Apple", "M2 Pro", 3.5);

        System.out.println("SISTEMA DE COMPUTADORES\n");
        System.out.println(computador1);
        System.out.println("\n" + computador2);

    }
}
