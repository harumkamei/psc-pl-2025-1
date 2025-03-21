import javax.swing.JOptionPane; 

public class exemploIF {
    public static void main(String[] args){

    int numero = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(" Digite um número "));

     if( numero > 0){
        JOptionPane.showMessageDialog( null, " o número " + numero + " é positivo ");
     }

     else{
        JOptionPane.showMessageDialog( null, " o número " + numero + " é negativo ");
     }
    }
}