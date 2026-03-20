public class TestaAcademico {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(1, "João Silva", "2023001", "Engenharia");
        Aluno aluno2 = new Aluno(2, "Maria Santos", "2023002", "Engenharia");

        System.out.println("ALUNOS CRIADOS");
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println();

        Disciplina disciplina = new Disciplina(1, "Programação Orientada a Objetos", "Prof. Daniel");

        disciplina.matricularAluno(aluno1);
        disciplina.matricularAluno(aluno2);

        System.out.println("ALUNOS MATRICULADOS");
        for (Aluno a : disciplina.getAlunos()) {
            System.out.println(a);
        }
        System.out.println();

        disciplina.criarAvaliacao(1, "Prova Semestral");

        Avaliacao prova = disciplina.getAvaliacoes().get(0);

        prova.adicionarQuestao(1, "O que é encapsulamento?", 2.5f);
        prova.adicionarQuestao(2, "Explique herança em OOP", 3.5f);
        prova.adicionarQuestao(3, "Qual a diferença entre classe e objeto?", 4.0f);

        System.out.println("QUESTÕES ADICIONADAS");
        for (Questao q : prova.getQuestoes()) {
            System.out.println(q);
        }
        System.out.println();

        System.out.println("ESTRUTURA COMPLETA DA DISCIPLINA");
        System.out.println(disciplina);
    }
}
