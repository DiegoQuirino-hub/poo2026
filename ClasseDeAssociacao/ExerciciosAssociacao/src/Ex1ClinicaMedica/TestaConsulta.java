package Ex1ClinicaMedica;

import java.time.LocalDateTime;

public class TestaConsulta {
    static void main(String[] args) {

        Medico medico = new Medico(1,"Dr. Joao","Pneumologista");
        Paciente paciente = new Paciente(105,360852469,"Carmelia Santos");
        LocalDateTime data = LocalDateTime.of(2026,05,20,15,30);
        Consulta consulta = new Consulta(data,600.00,medico,paciente);

        System.out.println("Clínica Médica Viver");
        System.out.println(medico);
        System.out.println(paciente + "\n");
        System.out.println(consulta + "\n");
    }
}
