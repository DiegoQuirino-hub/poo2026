package ClasseAssociacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(){
      Passageiro  pa1 = new Passageiro("1234","Joao");
        LocalDateTime data = LocalDateTime.of(2026,9,10,19,00,00);
        Voo v1 = new Voo(1,"Brasil","Canada",data);

        Reserva r1 = new Reserva(111, LocalDateTime.now(),10,pa1, v1);
    }
}
