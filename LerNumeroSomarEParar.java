import java.util.Scanner;

public class LerNumeroSomarEParar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0, valor = 0;
		
		do {
			System.out.println("Informe um numero para soma ou tecle 0 para sair");
			valor = sc.nextInt();
			soma += valor;
			System.out.println("A soma é: "+ soma);
		}
		while (valor != 0);
		System.out.println("O programa acabou. ");

		sc.close();
	}

}
