import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = entrada.nextInt();
		
		if (num > 0){
			System.out.println("Maior que zero");
		} else if (num < 0 ) {
			System.out.println("Menor que zero");
		} else {
			System.out.println("é igual a zero");
		}
		
		entrada.close();
	}
}
