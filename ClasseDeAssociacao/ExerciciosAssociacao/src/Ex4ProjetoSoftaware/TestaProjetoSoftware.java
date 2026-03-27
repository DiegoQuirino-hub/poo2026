package Ex4ProjetoSoftaware;

public class TestaProjetoSoftware {
    public static void main(String[] args) {

        Programador prog1 = new Programador(1, "Alice Silva", "Java");
        Programador prog2 = new Programador(2, "Bob Santos", "Python");
        Programador prog3 = new Programador(3, "Carlos Oliveira", "Java");
        Programador prog4 = new Programador(4, "Diana Costa", "JavaScript");

        System.out.println("CRIAÇÃO DE PROGRAMADORES");
        System.out.println(prog1);
        System.out.println(prog2);
        System.out.println(prog3);
        System.out.println(prog4);

        Projeto projetoWeb = new Projeto(1, "Sistema Web de E-commerce");
        Projeto projetoMobile = new Projeto(2, "App Mobile de Delivery");

        System.out.println("\nPROJETOS CRIADOS");
        System.out.println(projetoWeb);
        System.out.println("\n" + projetoMobile);

        System.out.println("\nADICIONANDO PROGRAMADORES AO PROJETO WEB");
        projetoWeb.adicionarProgramador(prog1);
        projetoWeb.adicionarProgramador(prog2);
        projetoWeb.adicionarProgramador(prog4);

        System.out.println("\nADICIONANDO PROGRAMADORES AO PROJETO MOBILE");
        projetoMobile.adicionarProgramador(prog1);
        projetoMobile.adicionarProgramador(prog3);

        projetoWeb.listarProgramadores();
        projetoMobile.listarProgramadores();

        System.out.println("\nESTATÍSTICAS");
        System.out.println("Programadores Java no projeto Web: " +
                projetoWeb.contarProgramadoresPorLinguagem("Java"));
        System.out.println("Programadores Java no projeto Mobile: " +
                projetoMobile.contarProgramadoresPorLinguagem("Java"));

        System.out.println("\nREMOVENDO PROGRAMADOR");
        projetoWeb.removerProgramador(prog2);
        projetoWeb.listarProgramadores();

        System.out.println("\nPROVA: PROGRAMADORES CONTINUAM EXISTINDO");
        System.out.println("Bob continua existindo: " + prog2);
        System.out.println("Bob pode ser adicionado a outro projeto!");
        projetoMobile.adicionarProgramador(prog2);
        projetoMobile.listarProgramadores();
    }
}
