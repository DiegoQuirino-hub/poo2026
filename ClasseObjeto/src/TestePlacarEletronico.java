public class TestePlacarEletronico {
    public static void main(String[] args) {
    PlacarEletronico jogo = new PlacarEletronico("Franca","Flamengo");
        System.out.println(jogo);
        System.out.println();

        System.out.println("PRIMEIRO QUARTO");
        jogo.registrarPonto("Casa",  2);
        jogo.registrarPonto("Visitante", 3 );
        jogo.registrarPonto("Casa",  1);
        System.out.println(jogo);
        System.out.println();
    }
}