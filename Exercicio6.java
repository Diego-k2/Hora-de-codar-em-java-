import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		int maior = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite um numero: ");
			int num = entrada.nextInt();
			if(num > maior) {
				maior = num;
			}
		}
		
		System.out.println("O maior numero foi: " + maior);
		entrada.close();
	}
}
