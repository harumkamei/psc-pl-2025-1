public class Carro {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo(); 

         int numeroDePortas;                  

         veiculo.setAno(2018); 
         System.out.println(veiculo.getAno()); 

         veiculo.setMarca("Hyundai"); 
         System.out.println(veiculo.getMarca());

         veiculo.setModelo("ix35");
         System.out.println(veiculo.getModelo());

    }
    
}
