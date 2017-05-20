package Ordenacao;

public class BubbleSort {
 
	    
	    public static void main(String [] args){
	    
	        
	        
	        int [] vetor = {10,18,9,25,17,32,23,45,6}; 
	        
	        
	        
	        OrdenacaoBubble(vetor);
	    }
	    
	    
	    
	    
	    
	    public static void OrdenacaoBubble(int[] vetor) {
	    	
	    	int i, j , aux;
	    	
	    	
	    	System.out.print("Vetor desordenado: ");
	    	for(i = 0; i <vetor.length; i++){
	    		System.out.print(" "+vetor[i]);
	    	}
	    	
	    	System.out.println(" ");
	    	
	        for(i = 0; i < vetor.length; i ++){
	        	
	        	
                
                for(j = 0; j < vetor.length - 1  ;j++){
                    
                	
                	
                    if(vetor[j] > vetor[j+1]){
                        
                    	 
                    	
                    	aux = vetor[j];        
                        vetor[j] = vetor[j+1];    
                        vetor[j+1] = aux;  
                        
                       
                    
                    }
                   
                }
            }
			
	        
	       
	        System.out.print("Vetor organizado:");
	        for(i = 0; i <vetor.length; i++){
	    		System.out.print(" "+vetor[i]);
	    	}
		

	}

	    
	}
	


