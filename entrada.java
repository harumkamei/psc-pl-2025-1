import java.util.Scanner;


public class entrada{

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Digite seu nome");


String nome = scanner.nextLine(); 

System.out.println( "Digite sua idade");
int idade = scanner.nextInt();

System.out.println( "Ola" + nome);

System.out.println(  " Ola" + nome + " voce tem" + idade + "anos, seja bem vindo"); 

      }

}