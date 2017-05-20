package recursividade;

import java.util.Scanner;

public class MaiorElementoVetor {

	
	public static void main(String[] args) {
		
		

		int [] vetor = {10,18,9,25,17,32,23,45,6}; 

		
	   System.out.print("Maior Elemento Vetor: "+encontrarMaiorNumero(9,vetor)); 
		

	}
	
	public static int encontrarMaiorNumero (int QuantElemVetor, int vetor[]) { 
		if (QuantElemVetor == 1){
	      return vetor[0];
	   } else {
	      int x = encontrarMaiorNumero (QuantElemVetor-1, vetor);
	      if (x > vetor[QuantElemVetor-1]){
	         return x;
	      }else{
	         return vetor[QuantElemVetor-1]; 
	      }
	      }
	}
	

}
