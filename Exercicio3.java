import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[]args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nomeUsuario = scanner.nextLine();
		System.out.println("Digite sua idade: ");
		int idadeUsuario = scanner.nextInt();
		
		System.out.println("O seu nome e " + nomeUsuario + ", voce tem " + idadeUsuario + " anos"); 

		
		scanner.close();
	}

}