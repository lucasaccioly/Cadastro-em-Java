import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Disciplina disciplina = new Disciplina();


        System.out.println("Aluno: Qual o seu nome?");
        aluno.setNome(sc.next());
        System.out.println("Aluno: Qual a sua idade?");
        aluno.setIdade(sc.nextDouble());
        System.out.println("Digite a primeira nota:");
        aluno.setNota1(sc.nextDouble());
        System.out.println("Digite a segunda nota:");
        aluno.setNota2(sc.nextDouble());
        System.out.println("Digite a terceira nota:");
        aluno.setNota3(sc.nextDouble());

        aluno.calcularMedia();
        aluno.verificarAprovacao();
        aluno.detalhesAluno();

        System.out.println("Professor: Qual o seu nome?");
        professor.setNome(sc.next());
        System.out.println("Professor: Qual a sua idade?");
        professor.setIdade(sc.nextDouble());

        System.out.println("Professor: Qual a sua especialidade?");
        professor.setEspecialidade(sc.next());

        System.out.println("Professor: Qual o seu salário?");
        professor.setSalario(sc.nextDouble());
        System.out.println("Quem é você?");
        professor.quemSouEu();
        System.out.print("Qual é a sua responsibilidade?");
        professor.responsabilidade();


        professor.calcularSalario();
        professor.aplicarBonus();


        System.out.println("Informações do Professor:");
        System.out.println(professor);

        System.out.println("Informações do Aluno:");
        System.out.println(aluno);


        System.out.print("Digite o nome da disciplina: ");
        disciplina.setNome(sc.next());

        disciplina.cadastrarAluno(aluno);
        disciplina.ministrarDisciplina(professor);

        System.out.println("Informações da Disciplina:");
        System.out.println(disciplina);
    }
}
