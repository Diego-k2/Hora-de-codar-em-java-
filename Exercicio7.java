import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		double numAnt = 0;
		double soma = 0;
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite um numero: ");
			double num = entrada.nextDouble();
			
			if(num >  numAnt) {
				soma += num;
			}
			numAnt = num;
		}
		
		
		System.out.println(soma);
		entrada.close();
	}
}
