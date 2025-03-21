import javax.swing.JOptionPane;

public class Switch {
    
    public static void main(String[] args) {
                 JOptionPane.showInputDialog( null, " Digite um número " );

        int dia = 3;
        switch (dia) {
            case 1:
                         JOptionPane.showMessageDialog( null, " Domingo " );

        }
                 switch (dia) {
            case 2:
                     JOptionPane.showMessageDialog( null, " Segunda " );
                break;

                 }
         switch (dia) {
            case 3:
                     JOptionPane.showMessageDialog( null, " Terça " );
                break;
        
         }
         switch (dia) {
            case 4:
                     JOptionPane.showMessageDialog( null, " Quarta " );
                break;
         }

                 switch (dia) {
            case 5:
         JOptionPane.showMessageDialog( null, " Quinta " );
                break;
        }

                 switch (dia) {
            case 6:
                         JOptionPane.showMessageDialog( null, " Sexta " );
                break;
        }
         
                switch (dia) {
            case 7:
                        JOptionPane.showMessageDialog( null, " Sábado " );
                break;
        
            default:
                break;
        }
    }
}
