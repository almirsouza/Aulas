package Buscas;

public class BuscaBinaria {
	
	public static void main(String[] args){
		int vet[]={1,4,6,7,8,9,80,90};
		
		System.out.println(buscaBinaria(vet,1));
		
		
		
	}
	
	
	
public static int buscaBinaria(int[] vetor, int numProc) {
		
	    int inicio = 0;
		int fim = vetor.length - 1;
		int resultado = -1;
		
	
		
		while (inicio <= fim) {
			
			
			
			int meio = (inicio + fim) / 2;
			
			
			
			
			
			if(vetor[meio] == numProc) {
				resultado = meio;
				fim = -1;
				
				
			} 
			else if (numProc > vetor[meio]) {
				inicio = meio + 1;
				
			} 
			else {
				fim = meio - 1;
				
			}
			
			
		}
		
		
		
		return resultado;
		
		
		
		
		
		
		
	}

}
