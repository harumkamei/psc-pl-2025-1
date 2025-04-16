public class Pessoa {                                                          // instancias = objetos

    private String nome;
    private int idade;
    private double altura; 
    private String email;
 
    public Pessoa(String nome, int idade, double altura, String email) {      // parametros no metodo construtor | parametros tem que ser satisfeitos (falado) | construtor inicializa o objeto

        this.nome = nome;                                                    // this faz a diferenciação de parametros de atributos da classe | pega contexto geral
        this.idade = idade; 
        this.altura = altura; 
        this.email = email; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
