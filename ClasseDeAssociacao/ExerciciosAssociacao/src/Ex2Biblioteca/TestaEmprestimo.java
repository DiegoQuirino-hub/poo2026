package Ex2Biblioteca;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;

public class TestaEmprestimo {
    static void main(String[] args) {
        Livro livro1 = new Livro(12,"Dom Casmurro","Machado de Assis");
        Leitor leitor1 = new Leitor(05,"Diego Lima");
        LocalDateTime DataEmprestimo1 = LocalDateTime.of(2026,03,26,10,15);
        LocalDateTime DataDevolucao1 = LocalDateTime.of(2026,03,30,14,00);
        Emprestimo emprestimo = new Emprestimo(DataEmprestimo1,DataDevolucao1,leitor1,livro1);

        System.out.println("BIBLIOTECA");
        System.out.println(emprestimo);
    }
}
