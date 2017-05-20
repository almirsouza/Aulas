package Ordenacao;

public class SelectionSort{
    public static void main(String[] args){       
     System.out.println("Sistema de ordenação Selection Sort: ");
     System.out.println("Vetor desordenado: ");
     int[] vetor = {4, 3, 2, 1}; 
     
	for(int i = 0; i< vetor.length; i++){
		System.out.println(" "+vetor[i]);
		
	}   
	
	
   int menor;
   int indiceMenor; 
   for (int i = 0; i < vetor.length - 1; i++) {
            // antes de comparar, considera-se menor o valor atual do loop
         menor = vetor[i];
         indiceMenor = i;

         // compara com os outros valores do vetor
        for (int j = i + 1; j < vetor.length; j++){
                if (vetor[j] < menor){
                    menor = vetor[j];
                    indiceMenor = j;
                }
         }

         // troca os valores menor e maior
            vetor[indiceMenor] = vetor[i];
            vetor[i] = menor;
        }
        
    System.out.println("Vetor organizado:");
	for(int i = 0; i<vetor.length; i++){
		System.out.println(" "+vetor[i]);
	}
    }
}
