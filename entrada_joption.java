import javax.swing.JOptionPane;

public class entrada_joption {
private static double altura;

public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Digite seu nome");
    String idade = JOptionPane.showInputDialog("Digite sua idade");


    int idadeStr = Integer.parseInt(idade);
    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));

    JOptionPane.showMessageDialog(null, "Meu nome e:" + nome + "Minha idade e:" + idadeStr + "Minha altura e:" altura);
    
    

}
