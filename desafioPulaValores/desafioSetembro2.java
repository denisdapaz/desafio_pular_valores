package desafioSetembro2;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class desafioSetembro2 {

	public static void main(String[] args) {

		// @SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a quantidade de números o tamannho do Array:  ");
		int tamanhoDoArray = teclado.nextInt();
		long inicio = new Date().getTime();
		int[] array = new int[tamanhoDoArray];
		for (int i = 0; i < tamanhoDoArray; i++) {
			array[i] = i + 1;
		}

		System.out.println("Digite a quantidade de pulos: ");
		int pulos = teclado.nextInt();

		pulaValor(array, pulos);
		long fim = new Date().getTime();
		System.out.println("ms: " + (fim - inicio));
		System.out.println(Arrays.toString(array));

		teclado.close();
	}

	public static void pulaValor(int[] numeros, int pulos) {

		if (pulos < 0) {
			int quantidadeArray = numeros.length;

			for (int i = 0; i > pulos; i--) {
				int espacoArmazenado = numeros[0];

				for (int j = 0; j < quantidadeArray - 1; j++) {
					numeros[j] = numeros[j + 1];
				}

				numeros[quantidadeArray - 1] = espacoArmazenado;

			}

		} else {
			int quantidadeArray = numeros.length;
			for (int i = 0; i < pulos; i++) {
				int espacoArmazendo = numeros[quantidadeArray - 1];

				for (int j = quantidadeArray - 1; j > 0; j--) {
					numeros[j] = numeros[j - 1];

				}
				numeros[0] = espacoArmazendo;
			}

		}

	}

}
