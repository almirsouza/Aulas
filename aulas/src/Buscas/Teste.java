package Buscas;
import java.util.Scanner;

 // inicio versão 1.0
public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 int[] vetor = {5, 10, 12, 22, 38, 50, 75};
		 
			Scanner ss = new Scanner(System.in);
			
			System.out.print("Digite numero que deseja fazer a busca: ");
			int num;
			num = ss.nextInt();
			
		   System.out.print(" "+buscaBinaria(vetor, num)); 
		   
		   

	}


public static int buscaBinaria(int[] vetor, int numeroProcurado) {
    int fim = vetor.length - 1;
    int inicio = 0;
    
    for (int i = 0; i < fim; i++) {
    
    	 // Inicio versão 1.1
		for(int ii = inicio; ii<= fim;ii++){
			
			System.out.print(" + "+vetor[ii]);
		}
		System.out.print("\n");
		// Fim da versão 1.1
    	
        if(fim < inicio){
        	
            return -1;
            
        } 
        else{ //inicio
        	
        	
        	
        	
            int meio = (fim + inicio) / 2;
            
            if (vetor[meio] == numeroProcurado){
                return meio;
            } 
            else if(vetor[meio] < numeroProcurado){
            	
            	inicio = meio + 1;
            	
            	 
            		
            } 
            else {
            	fim = meio - 1;
            	
            }
            
           
            
        }//fim
        
        
        
        
       
        
    }
    return -1;
};
}

//Fim da versão 1.0
