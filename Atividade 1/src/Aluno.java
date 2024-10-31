class Aluno extends Pessoa {
    private double Nota1, Nota2, Nota3, Media, idade;

    public Aluno() {
    }

    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public void quemSouEu() {
        System.out.println("Eu sou um aluno.");
    }

    @Override
    public void responsabilidade() {

    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public double getIdade() {
        return idade;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double Nota3) {
        this.Nota3 = Nota3;
    }

    public double getMedia() {
        return Media;
    }

    public void calcularMedia() {
        Media = (Nota1 + Nota2 + Nota3) / 3;
        System.out.println("Sua média é: " + Media);
    }

    public void verificarAprovacao() {
        if (Media >= 7) {
            System.out.println("Aprovado!");
        } else if (Media >= 5.0 && Media < 7) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }

    public void detalhesAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Notas: " + Nota1 + ", " + Nota2 + ", " + Nota3);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Nome='" + nome + '\'' +
                ", Idade=" + idade +
                ", Nota1=" + Nota1 +
                ", Nota2=" + Nota2 +
                ", Nota3=" + Nota3 +
                ", Media=" + Media +
                ", Aprovado=" + (Media >= 7 ? "Sim" : "Não") +
                '}';
    }
}
