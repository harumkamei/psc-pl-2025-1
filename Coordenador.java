public class Coordenador extends Pessoa {

    private int matricula; 

    public Coordenador(String nome, int idade, double altura, String email) {

        super(nome, idade, altura, email);

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

     public void exibirDados() {

        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Email: " + getEmail());
        System.out.println("Matricula: " + matricula);
    }
}
