public class PlacarEletronico {
    String timeCasa, timeVisitante;
    int pontosCasa, pontosVisitante, periodoQuarto;

    public PlacarEletronico(){

    }
    public PlacarEletronico(String timeCasa, String timeVisitante){
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
                System.out.println(timeCasa + " Marcou 1 ponto de lance livre ");
            }else if(tipo==2){
                this.pontosCasa += 2;
                System.out.println(timeCasa + " Marcou 2 pontos ");
            }else if(tipo==3){
                this.pontosCasa += 3;
                System.out.println(timeCasa + " Marcou 3 pontos. É de trêsssss ");
            }
        }else if(time=="Visitante"){
            if(tipo==1){
                this.pontosVisitante += 1;
                System.out.println(timeVisitante + " Marcou 1 ponto de lance livre ");
            }else if(tipo==2){
                this.pontosVisitante += 2;
                System.out.println(timeVisitante + " Marcou 2 pontos ");
            }else if(tipo==3){
                this.pontosVisitante += 3;
                System.out.println(timeVisitante + " Marcou 3 pontos. É de trêsssss ");
            }
        }
    }
    public void periodoQuarto(){
        if(this.periodoQuarto < 4){
            this.periodoQuarto += 1;
            System.out.println(" Iniciando o " + periodoQuarto + " quarto");
        }
        else{
            System.out.println("O jogo terminou!");
            System.out.println("Resultado final: " + timeCasa + "" + pontosCasa + "X" + timeVisitante + "" + pontosVisitante);
        }
    }

    public String toString(){
        return timeCasa +" [ " + pontosCasa + " ]" + "X" + "[ " + pontosVisitante + " ] " + timeVisitante + " - Período: " + periodoQuarto + " quarto";
    }
}
