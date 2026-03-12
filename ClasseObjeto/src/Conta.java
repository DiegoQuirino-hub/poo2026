public class Conta {
    public int numeroConta,agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status = true;

    public Conta(){

    }
    // CONSTRUTOR
    public Conta(int numeroConta, int agencia, String nomeCliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }
    //MÉTODOS
    public void depositar(float valor){
        if (this.status == true){
            this.saldo = this.saldo + valor;
            System.out.println("Depósito Realizado com Sucesso ");
            System.out.println("Novo Saldo: " + this.saldo);
        }else{
            System.out.println("Conta Encerrada, não é possível depositar.");
        }
    }
    public void sacar(float valor){
        if(this.status == false){
            System.out.println("Conta encerrada, não é possível sacar ");
        }
        else if (saldo < valor) {
            System.out.println("Saldo insuficiente");
            System.out.println("Saldo atual R$ " + this.saldo);
        }
        else{
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso");
            System.out.println("Saldo atual R$ " + this.saldo);
        }
    }
    public void EncerrarConta(){
        if(this.saldo == 0){
            this.status = false;
            System.out.println("Conta encerrada.");
        }
        else{
            System.out.println("Não é possível encerrar a conta.");
            System.out.println("Seu saldo atual é R$ " + this.saldo);
            System.out.println("Retire o dinheiro antes de encerrar a conta.");
        }
    }
    public String toString(){

        return " ------DADOS DA CONTA------ \n" +
                "Número da Conta: " + this.numeroConta + "\n"+
                "Agência: " + this.agencia + "\n"+
                "Nome Cliente: " + this.nomeCliente + "\n"+
                "Saldo: R$ " + this.saldo + "\n"+
                "Situação " + (this.status ? "Ativa": "Desativada");
    }
}


