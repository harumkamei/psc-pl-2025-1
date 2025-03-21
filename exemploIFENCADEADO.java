public class exemploIFENCADEADO {
    public static void main(String[] args){
        double a1;
        double a2;
        double a3;
        double soma;

        a1 = 22; 
        a2 = 15; 
        a3 = 40;

        soma = a1 + a2 + a3; 

        if ( soma >= 7 ){
     System.out.println(" Aprovado ");
        } else if ( soma > 6){
     System.out.println(" Recuperação ");
        } else{
                 System.out.println(" Reprovado ");
        }
    }

}