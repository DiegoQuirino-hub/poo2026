public class TestaConta {
    public static void main(String[] args){
        Conta c1 = new Conta(1234,1,"João Silva");
        System.out.println("Cliente: João Silva ");
        System.out.println(c1);
        System.out.println();

        System.out.println("Operação: Depósito R$500");
        c1.depositar(500);
        System.out.println();

        System.out.println("Operação: Sacar R$200");
        c1.sacar(200);
        System.out.println();

        System.out.println("Estado Atual da Conta: ");
        System.out.println(c1);
        System.out.println();

        Conta c2 = new Conta(5678,2, "Maria Souza");
        System.out.println("Operação: Saque R$ 50");
        c2.sacar(50);
        System.out.println();

        System.out.println("Tentando encerrar conta");
        c1.EncerrarConta();
        System.out.println();

        System.out.println("Operação: Saque R$300 reais");
        c1.sacar(300);
        System.out.println();

        System.out.println("Operação: Encerrar conta");
        c1.EncerrarConta();
        System.out.println();

        System.out.println(c1);
        System.out.println();
    }
}
