import java.util.Scanner;

public class AreaDeFigurasGeometricas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String fim; 
		
		do {
			
			System.out.println("Qual figura deseja?");
			System.out.println("a) Quadrado: b) Retângulo: c) Triangulo: d) Losango: e) Trapézio: f) Círculo:");
			String FIGU=sc.next().toUpperCase();
			
			switch (FIGU) {
			case "A":
				
				System.out.println("Insira os lados:");
				double lado1Q=sc.nextInt();
				System.out.println("Insira o 2° lado:");
				double lado2Q=sc.nextInt();
				double areaQ = lado1Q * lado2Q;
				System.out.println("A área do quadrádo é: " + areaQ);
				
				break;
			
			case "B":
				
				System.out.println("Insira o 1° lado:");
				double lado1R=sc.nextInt();
				System.out.println("Insira o 2° lado:");
				double lado2R=sc.nextInt();
				double areaR = lado1R * lado2R;
				System.out.println("A área do quadrádo é: " + areaR);
			
				break;	
				
			case "C":
				
				System.out.println("Insira o valor da BASE do triângulo:");
				double BaseT=sc.nextInt();
				System.out.println("Insira o valor da ALTURA do triângulo:");
				double AlturaT=sc.nextInt();
				double areaT = (BaseT * AlturaT) / 2;
				System.out.println("A área do trinângulo é: " + areaT);
				
				break;
				
			case "D":
				
				System.out.println("Insira o valor da diagonal: ");
				double diagM=sc.nextInt();
				System.out.println("Insira o valor da outra diagonal: ");
				double diagm=sc.nextInt();
				double areaL = (diagM * diagm)/2;
				System.out.println("A área do logango é: " + areaL);
				
				break;
				
			case "E":
				
				System.out.println("Insira o valor de uma das bases: ");
				double baseM=sc.nextInt();
				System.out.println("Insira o valor da outra base:");
				double basem=sc.nextInt();
				System.out.println("Insira a ALTURA do trapézio:");
				double altura=sc.nextInt();
				double soma = (baseM + basem) / 2;
				double areaTr = soma*altura;
				System.out.println("A área do trapézio é: " + areaTr);
				
				break;
				
			case "F":
				
				System.out.println("Insira o raio da circunferência ou círculo:");
				double raio=sc.nextInt();
				double areaC = (3.14 * raio) * 2; 
				System.out.println("A área da circunferência ou círculo é: " + areaC);
				
				break;
				
			default:
				
				System.out.println("Opção inválida, favor selecionar as alternaticas: a, b, c ou d.");
				
			}
			System.out.println("Deseja continuar? Sim ou não: ");
			fim = sc.next();
			
		} while (fim.equalsIgnoreCase("sim"));
		System.out.println("Programa finalizado, até a próxima! ");
		
		sc.close();
	}
}
