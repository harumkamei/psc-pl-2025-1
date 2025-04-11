public class Veiculo {

    // encapsulamento + protege = private.

    private int ano;
    private String modelo;
    private String marca;
    private double velocidadeAtual;
    private double combustivel;
    private boolean motorLigado;

    // botão direito, sourch actions, apply geters and setters, selecionando todos as opções.
    // void = ARMAZENA E GUARDA == SEM RETORNO DE RESPOSTA.

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    public double getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
    public boolean isMotorLigado() {
        return motorLigado;
    }
    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    } 

    public void ligarMotor() {
        if ( !motorLigado) {                           // o "!" é uma negação.
            motorLigado = true;
            System.out.println("Motor ligado.");
        } else {
            System.out.println("O motor já está ligado.");
        }
    }

    public void desligarMotor() {
        if (motorLigado) {
            motorLigado = false;
            System.out.println("Motor desligado.");
        } else {
            System.out.println("O motor já está desligado.");
        }
    }

    public void acelerar(double incremento) { // incrementar é aumentar, ou seja, aumenta a velocidade. 
        if (motorLigado) {
            if (combustivel > 0) {
                velocidadeAtual += incremento;
                combustivel += incremento * 0.1; // consome combustível proporcialmente à aceleração 
                System.out.println("Acelerando velocidade atual" + velocidadeAtual + " km/h. Combustível restante: " + combustivel + " litros");
            } else {
                System.out.println("Combustível insuficiente para acelerar");
            }
        }
    }

    public void frear(double decremento) { // drecrementar pode ocorrer de ser menor de zero
        if (motorLigado) {
            velocidadeAtual -= decremento;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
            System.out.println("Freando velocidade atual." + velocidadeAtual + " km/h");
        } else {
            System.out.println("O veículo já está parado.");
        }
    }

    public void exibirInformacoes() {

        System.out.println("Marca:" + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade atual :" + velocidadeAtual);
        System.out.println("Combustível: " + combustivel + " litros.");
        System.out.println("Motor ligado: " + (motorLigado ? "Sim" : "Não"));
    }
}