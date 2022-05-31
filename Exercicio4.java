import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {	
	
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha uma opção \n1-Retangulo \n2-Quadradado \n3-Losango \n4-Trapézio \n5-Paralelogramo \n6-Triangulo \n7-Circulo");
		int opCalc = entrada.nextInt();
		
		switch(opCalc) {
		case 1:
			System.out.println("Digite a altura");
			double altura = entrada.nextDouble();
			System.out.println("Digite a base");
			double base = entrada.nextDouble();
			
			System.out.println("A area do retangulo é: " + base * altura);
			break;
		case 2:	
			System.out.println("Digite o valor de lado");
			double lado = entrada.nextDouble();
			System.out.println("A area do quadradado e: " + Math.pow(lado, 2));
			break;
		case 3:
			System.out.println("Digite o valor da diagonal maior");
			double dMaior = entrada.nextDouble();
			System.out.println("Digite o valor da diagonal menor");
			double dMenor = entrada.nextDouble();
			System.out.println("A area do quadradado e: " + ((dMaior * dMenor)/2));
			break;
		case 4: 
			System.out.println("Digite o valor da base maior");
			double bMaior = entrada.nextDouble();
			System.out.println("Digite o valor da base menor");
			double bMenor = entrada.nextDouble();
			System.out.println("Digite o valor da altura");
			altura = entrada.nextDouble();
			System.out.println("A area do quadradado e: " + (((bMaior + bMenor)* altura)/2));
			break;
		case 5:
			System.out.println("Digite a altura");
			altura = entrada.nextDouble();
			System.out.println("Digite a base");
			base = entrada.nextDouble();
			System.out.println("A area do paralelogramo é: " + base * altura);
			break;
		case 6: 
			System.out.println("Digite a altura");
			altura = entrada.nextDouble();
			System.out.println("Digite a base");
			base = entrada.nextDouble();
			System.out.println("A area do triangulo é: " + (base * altura)/2);
			break;
		case 7: 
			System.out.println("Digite o raio");
			double raio = entrada.nextDouble();
			System.out.println("A area da circunferencia é: " + Math.PI * raio);
			break;
		default:
			System.out.println("Opção invalida");
		}
		entrada.close();
		
	}
}
