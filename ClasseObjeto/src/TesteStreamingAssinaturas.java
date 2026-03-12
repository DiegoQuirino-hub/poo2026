public class TesteStreamingAssinaturas {
    public static void main (String[] args) {
        StreamingAssinaturas conta1 = new StreamingAssinaturas("José Paulo", "Premium");
        System.out.println(conta1);
        System.out.println();

        conta1.assistirFilme("Homem Aranha");
        System.out.println();

        System.out.println(conta1);
        System.out.println();

        StreamingAssinaturas conta2 = new StreamingAssinaturas("Maria José", "Básico");
        System.out.println(conta2);
        System.out.println();

        conta2.assistirFilme("Homem de Ferro");
        System.out.println();

        conta2.cancelarAssinatura();
        System.out.println();

        conta2.assistirFilme("Vingadores");
        System.out.println();

        System.out.println(conta2);
        }
    }
