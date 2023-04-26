import java.util.Scanner;

public class ProgramaParaUsar4Operacoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, fim;
		
		
		do {
		
			System.out.println("Informe um valor:");
			num1 = sc.nextInt();
			
			System.out.println("Qual a operação desejada? ( +, -, *, / )");
			String OP = sc.next();
			
			System.out.println("Informe outro valor:");
			num2 = sc.nextInt();			
			
		switch (OP) {
		case "+":
			
			int soma = num1 + num2;
			System.out.println("A soma é: " + soma);
			if(soma == 0) {
				if(soma % 2 == 0) {
					System.out.println("O valor é par");
				}else if(soma %2 != 0) {
					System.out.println("O valor é impar");
				}
				
				System.out.println("O valor é igual a 0");
			}else if(soma < 0) {
				if(soma % 2 == 0) {
					System.out.println("O valor é par");
				}else if (soma %2 != 0) {
					System.out.println("O valor é impar");
				}
				
				System.out.println("O valor é menor que 0");
				
			}else if(soma > 0) {
				if(soma % 2 == 0) {
					System.out.println("O valor é par");
				}else if(soma %2 != 0) {
					System.out.println("O valor é impar");
				}
				
				System.out.println("O valor é maior que 0");
				
			}
			
			break;
			
		case "-":
			
			int sub = num1 - num2;
			System.out.println("A subtração é: " + sub);
			if(sub == 0) {
				if(sub % 2 == 0) {
					System.out.println("O valor é par");
				}else if(sub %2 != 0) {
					System.out.println("O valor é impar");
				}
				
				System.out.println("O valor é igual a 0");
			}else if(sub < 0) {
				if(sub % 2 == 0) {
					System.out.println("O valor é par");
				}else if (sub %2 != 0) {
					System.out.println("O valor é impar");
				}
				
				System.out.println("O valor é menor que 0");
				
			}else if(sub > 0) {
				if(sub % 2 == 0) {
					System.out.println("O valor é par");
				}else if(sub %2 != 0) {
					System.out.println("O valor é impar");
				}
				
				System.out.println("O valor é maior que 0");
				
			}
				break;
				
		
		case "*":
			
			int multi = num1 * num2;
			System.out.println("A multiplicação é: " + multi);
			if(multi == 0) {
				if(multi % 2 == 0) {
					System.out.println("O valor é par");
				}else if(multi %2 != 0) {
					System.out.println("O valor é impar");
				}
				
				System.out.println("O valor é igual a 0");
			}else if(multi < 0) {
				if(multi % 2 == 0) {
					System.out.println("O valor é par");
				}else if (multi %2 != 0) {
					System.out.println("O valor é impar");
				}
				
				System.out.println("O valor é menor que 0");
				
			}else if(multi > 0) {
				if(multi % 2 == 0) {
					System.out.println("O valor é par");
				}else if(multi %2 != 0) {
					System.out.println("O valor é impar");
				}
				
				System.out.println("O valor é maior que 0");
				
			}
			break;
			
		case "/":
			
			int div = num1 / num2;
			System.out.println("A divisão é: " + div);
			if(div == 0) {
				if(div % 2 == 0) {
					System.out.println("O valor é par");
				}else if(div %2 != 0) {
					System.out.println("O valor é impar");
				}
				
				System.out.println("O valor é igual a 0");
			}else if(div < 0) {
				if(div % 2 == 0) {
					System.out.println("O valor é par");
				}else if (div %2 != 0) {
					System.out.println("O valor é impar");
				}
				
				System.out.println("O valor é menor que 0");
				
			}else if(div > 0) {
				if(div % 2 == 0) {
					System.out.println("O valor é par");
				}else if(div %2 != 0) {
					System.out.println("O valor é impar");
				}
				
				System.out.println("O valor é maior que 0");
				
			}
			break;
			
		default:
			System.out.println("Operação inválida!!! ");
			System.out.println("O caractere '" + OP + "' não é uma operação aritimética válida! ");
			
		}
		System.out.println("====================================================================");
		System.out.println("Insira qualquer valor para continuar ou -999 para finalizar o programa.");
		fim = sc.nextInt();
		System.out.println("====================================================================");
		
		} while(fim != -999);
		System.out.println("Programa finalzado, até a próxima!");
	
		sc.close();
	}
}