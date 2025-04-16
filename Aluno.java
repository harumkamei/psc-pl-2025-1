public class Aluno extends Pessoa {                                                // extends = herança 
    
    private int ra;
    private double nota; 

    public Aluno(String nome, int idade, double altura, String email, int ra) {

        super(nome, idade, altura, email); 

        this.ra = ra;
        this.nota = 0.0; 

    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void exibirDados() {

        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Email: " + getEmail());
        System.out.println("RA: " + ra);
        System.out.println("Nota: " + nota);
    }
}