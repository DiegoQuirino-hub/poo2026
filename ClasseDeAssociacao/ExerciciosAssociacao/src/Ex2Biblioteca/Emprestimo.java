package Ex2Biblioteca;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private LocalDateTime DataEmprestimo, DataDevolucao;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo() {
    }

    public Emprestimo(LocalDateTime dataEmprestimo, LocalDateTime dataDevolucao, Leitor leitor, Livro livro) {
        DataEmprestimo = dataEmprestimo;
        DataDevolucao = dataDevolucao;
        this.leitor = leitor;
        this.livro = livro;
    }

    public Livro getLivro() {
        return livro;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public LocalDateTime getDataDevolucao() {
        return DataDevolucao;
    }

    public LocalDateTime getDataEmprestimo() {
        return DataEmprestimo;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        DataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        DataDevolucao = dataDevolucao;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy às HH'h'm");
        return "Emprestimo{" +
                "DataEmprestimo =" + DataEmprestimo.format(formatoBR) +
                ", DataDevolucao =" + DataDevolucao.format(formatoBR) +
                ", leitor =" + leitor +
                ", livro =" + livro +
                '}';
    }
}
