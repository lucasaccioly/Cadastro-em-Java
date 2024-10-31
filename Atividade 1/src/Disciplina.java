public class Disciplina {
    private String nome;
    private Aluno aluno;
    private Professor professor;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrarAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void ministrarDisciplina(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "Nome='" + nome + '\'' +
                ", Aluno=" + aluno.getNome() +
                ", Professor=" + professor.getNome() +
                '}';
    }
}