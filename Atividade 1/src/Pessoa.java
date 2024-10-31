public abstract class Pessoa {
    protected String nome;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void quemSouEu() {
        System.out.println("Eu sou uma pessoa.");
    }

    public abstract void responsabilidade();

    @Override
    public String toString() {
        return "Pessoa{" + "nome='" + nome + '\'' + '}';
    }
}