public class StreamingAssinaturas {
    public String usuario, plano, ultimoFilmeAssistido;
    public float mensalidade;
    public boolean ativo;

    public StreamingAssinaturas(){

    }
    public StreamingAssinaturas(String usuario, String plano){
        this.usuario = usuario;
        this.plano = plano;
        if(this.plano == "Básico"){
            this.mensalidade = 25.90F;
        }
        else if(this.plano == "Premium"){
            this.mensalidade = 45.90F;
        }
        else if(this.plano == "Família"){
            this.mensalidade = 60.90F;
        }
        this.ativo = true;
        this.ultimoFilmeAssistido ="";
    }

    public void assistirFilme(String nomeFilme){
        if(ativo){
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        }
        else{
            System.out.println("Sua conta está suspensa. Pague a assinatura para continuar.");
        }
    }
    public void cancelarAssinatura(){
        this.ativo = false;
        System.out.println("Assinatura Cancelada.");
    }
    public String toString(){
        String status = ativo ? "Ativa": "Suspensa";
        return "-----DADOS DA CONTA-----\n" +
                "Usuário: " + usuario + "\n"+
                "Plano: " + plano + "\n" +
                "Mensalidade R$" + mensalidade +"\n"+
                "Status: " + ativo +"\n"+
                "Último Filme: " + ultimoFilmeAssistido;
    }
}
