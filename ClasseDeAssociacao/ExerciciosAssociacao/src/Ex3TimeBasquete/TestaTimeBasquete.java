package Ex3TimeBasquete;

public class TestaTimeBasquete {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta(1, "LeBron James", "Ala");
        Atleta atleta2 = new Atleta(2, "Kyrie Irving", "Armador");
        Atleta atleta3 = new Atleta(3, "Anthony Davis", "Pivô");

        System.out.println("CRIAÇÃO DE ATLETAS");
        System.out.println(atleta1);
        System.out.println(atleta2);
        System.out.println(atleta3);

        Time time = new Time(1, "Franca Basquete", "Helinho Garcia");

        System.out.println("\nTIME CRIADO");
        System.out.println(time);

        System.out.println("\nCONTRATAÇÕES");
        time.contratarAtleta(atleta1);
        time.contratarAtleta(atleta2);
        time.contratarAtleta(atleta3);

        time.listarAtletas();

        System.out.println("\nANULANDO O TIME");
        System.out.println("Antes: " + time.getNome() + " tinha " + time.getAtletas().size() + " atletas");
        time = null;
        System.out.println("Depois: O time foi anulado!");


        System.out.println("\nPROVA: ATLETAS CONTINUAM EXISTINDO");
        System.out.println("Os atletas ainda existem? Vamos verificar:");
        System.out.println(atleta1);
        System.out.println(atleta2);
        System.out.println(atleta3);

    }
}