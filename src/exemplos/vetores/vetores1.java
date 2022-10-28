package exemplos.vetores;

import java.util.Scanner;

public class vetores1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com a quantidade de valores a serem informados: ");
		int n = sc.nextInt();

		int[] vet = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Numero: ");
			vet[i] = sc.nextInt();
		}

		System.out.println("Numero menos de 0");
		for (int i : vet) {
			if (i < 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
