public class PlacarEletronico {
    String timeCasa, timeVisitane;
    int pontosCasa, pontosVisitante, periodoQuarto;

    public PlacarEletronico(){

    }
    public PlacarEletronico(String timeCasa,timeVisitante){
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }
    public void registrarPonto(String time, int tipo){
        if(time=="Casa"){
            if(tipo==1){
                this.pontosCasa += 1;
                System.out.println(timeCasa + "Marcou 1 ponto de lance livre");
            }else if(tipo==2){
                this.pontosCasa += 2;
                System.out.println(timeCasa + "Marcou 2 pontos");
            }else if(tipo==3){
                this.pontosCasa += 3;
                System.out.println(timeCasa + "Marcou 3 pontos. É de trêsssss");
            }
        }else if(time==timeVisitane){
            if(tipo==1){
                this.pontosVisitante += 1;
                System.out.println(timeVisitane + "Marcou 1 ponto de lance livre");
            }else if(tipo==2){
                this.pontosVisitante += 2;
                System.out.println(timeVisitane + "Marcou 2 pontos");
            }else if(tipo==3){
                this.pontosVisitante += 3;
                System.out.println(timeVisitane + "Marcou 3 pontos. É de trêsssss");
            }
        }
    }
    public void periodoQuarto(){
        if(this.periodoQuarto < 4){
            this.periodoQuarto += 1;
            System.out.println("Iniciando o " + periodoQuarto + "quarto");
        }
        else{
            System.out.println("O jogo terminou!");
            System.out.println("Resultado final: " + timeCasa + "" + pontosCasa + "X" + timeVisitane + "" + pontosVisitante);
        }
    }
}
