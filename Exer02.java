package exermatrizes;

import java.util.Random;

public class Exer02 {

	
	
	/* Gere e imprima uma matriz M 10x10 , com valores aleatorios de 0-9.
	 * Depois indique qual o maior e menor valor da linha 5
	 * e o maior e menor valor da coluna 7*/
	
	
	
	public static void main(String[] args) {
	
		Random random = new Random();
		
		int[][] numerosAleatorios = new int[10][10];
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = random.nextInt(100);
				
			}
		}
		
		

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
		
		
		int menorL5 = Integer.MAX_VALUE;
		int maiorL5 = Integer.MIN_VALUE;
		
		for (int i = 0; i < numerosAleatorios[5].length; i++) {
			if(numerosAleatorios[5][i] > maiorL5){
				maiorL5 = numerosAleatorios[5][i];
			}
			if(numerosAleatorios[5][i] < menorL5){
				menorL5 = numerosAleatorios[5][i];
			}
		}
	
		System.out.println();
		System.out.println("Maior valor da linha 5 : " +maiorL5);
		System.out.println("Menor valor da linha 5 : " +menorL5);
		
		
		int menorC7 = Integer.MAX_VALUE;
		int maiorC7 = Integer.MIN_VALUE;
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			if(numerosAleatorios[i][7] > maiorC7){
				maiorC7 = numerosAleatorios[i][7]; 
			}
			if(numerosAleatorios[i][7] < menorC7){
				menorC7 = numerosAleatorios[i][7];
			}
		}
		System.out.println();
		System.out.println("Maior valor da coluna 7 : " +maiorC7);
		System.out.println("Menor valor da coluna 7 : " +menorC7);
		
	}

	
	
	
	
}
