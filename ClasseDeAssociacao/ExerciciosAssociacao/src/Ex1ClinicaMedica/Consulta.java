package Ex1ClinicaMedica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime data;
    private double ValorConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(LocalDateTime data, double valorConsulta, Medico medico, Paciente paciente) {
        this.data = data;
        ValorConsulta = valorConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public double getValorConsulta() {
        return ValorConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setValorConsulta(double valorConsulta) {
        ValorConsulta = valorConsulta;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy às HH'h'm");
        return "Consulta{" +
                "data = " + data.format(formatoBR) +
                ", ValorConsulta = R$ " + ValorConsulta +
                ", medico = " + medico +
                ", paciente = " + paciente +
                '}';
    }
}

