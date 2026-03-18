public class TestaArCondicionado {
    public static void main(String[] args) {
        System.out.println("TESTE 1: Construtor Vazio\n");
        ArCondicionado ar1 = new ArCondicionado();
        System.out.println(ar1);

        System.out.println("TESTE 2: Construtor com Parâmetro\n");
        ArCondicionado ar2 = new ArCondicionado("Samsung", "Inverter", 24, true);
        System.out.println(ar2);

        System.out.println("TESTE 3: Tentando Definir Temperatura Inválida \n");
        ar2.setTemperatura(35);
        ar2.setTemperatura(10);
        ar2.setTemperatura(22);
        System.out.println(ar2);

        System.out.println("TESTE 4: Tentando Definir Marca Inválida \n");
        ar2.setMarca("LG");
        ar2.setMarca("Electrolux");
        System.out.println(ar2);

        System.out.println("TESTE 5: Ativando Modo Turbo");
        ar2.ativarModoTurbo();
        System.out.println(ar2);

        System.out.println("TESTE 6: Ativando Modo Turbo Novamente \n");
        ar2.ativarModoTurbo();
        System.out.println(ar2);
    }
}