package ClasseAssociacao;

import java.time.LocalDateTime;

public class TestaVooPassageiro {
    public static void main(){
        Passageiro p1 = new Passageiro("0000000000","Diego");
        LocalDateTime data = LocalDateTime.of(2026,7,15,15,30);
        Voo V1 = new Voo(1, "Sao Paulo","Buenos Aires", data);
    }

}
