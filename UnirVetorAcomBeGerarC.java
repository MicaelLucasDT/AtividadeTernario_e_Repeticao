import java.util.Scanner;

public class UnirVetorAcomBeGerarC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] A = new int[2];
		int[] B = new int[3];
		int[] C = new int[5];

		System.out.println("Insira valores para o vetor A:");
		
		for (int i = 0; i <= 1; i++) {

			A[i] = sc.nextInt();
			
		}

		System.out.println("Insira valores para o vetor B:");
		
		for(int i = 0; i <= 2; i++) {
			
			B[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i <= 4; i++) {
		
			if(i < A.length) {
				
				C[i] = A[i];
			}else {
				
				C[i] = B[i - A.length];
				
			}
			
		}
	
		for(int i = 0; i <= 4; i++) {
			
			System.out.println("Os valores do vetor C é: " + C[i]);
			
		}
		
		sc.close();
	}
}
