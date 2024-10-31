public final class Professor extends Pessoa implements Remuneravel {
    private String especialidade;
    private double salario;
    private double idade;

    public Professor() {
    }

    public Professor(String nome) {
        super(nome);
    }

    // Getters e Setters
    public void setIdade(double idade) {
        this.idade = idade;
    }

    public double getIdade() {
        return idade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void quemSouEu() {
        System.out.println("Sou o professor");
    }

    @Override
    public void responsabilidade() {
        System.out.println("Ensinar");
    }

    @Override
    public void calcularSalario() {
        System.out.println("Salário atual do professor: " + salario);
    }

    @Override
    public void aplicarBonus() {
        double bonus = 500;
        salario += bonus;
        System.out.println("Bônus de " + bonus + " aplicado ao salário do professor. Novo salário: " + salario);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "Nome='" + getNome() + '\'' +
                ", Idade=" + idade +
                ", Especialidade='" + especialidade + '\'' +
                ", Salario=" + salario +
                '}';
    }
}
