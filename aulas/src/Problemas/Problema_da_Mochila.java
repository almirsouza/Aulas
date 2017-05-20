package Problemas;

public class Problema_da_Mochila {
	

	
	
	    public static void main(String[] args) throws Exception {
	        int valores[] = {10, 40, 30, 50};
	        int itens[] = {5, 4, 6, 3};
	        //tamanhao da matriz numPeso +1
	        int numPeso = 5;
	        System.out.println(arrumaMochila(valores, itens, numPeso));
	    }
	    
	    
	    public static int arrumaMochila(int val[], int itens[], int pesoColuna) {
	    	// Obtém o número total de itens.
	    	int itemLinha = itens.length;  
	    	// Criar uma matriz. Items  estão nas linhas e pesos com em colunas +1
	        int[][] matriz = new int[itemLinha + 1][pesoColuna + 1]; 


	     // E se a capacidade da mochila for 0 / Defina todas as colunas na linha 0 como sendo 0
	        for (int coluna = 0; coluna <= pesoColuna; coluna++) {
	        	matriz[0][coluna] = 0;
	        }

	     // E se não houver itens em casa. Preencha a primeira linha com 0
	        //Defina toda a linha na linha 0 como sendo 0
	        for (int linha = 0; linha <= itemLinha; linha++) {
	        	matriz[linha][0] = 0;
	        }
	        
	      //preencher os valores linha a linha
	        for (int itemAtual =1;itemAtual<=itemLinha;itemAtual++){

	        	// Os itens atuais têm peso menor ou igual ao peso em movimento
	            for (int peso = 1; peso <= pesoColuna; peso++){
	               
	            	// Dado um peso, verifique se o valor do item atual + valor do item que poderíamos pagar com o peso restante
	                if (itens[itemAtual-1]<=peso){
	                  
	                	// é maior que o valor sem o próprio item atual
	                	matriz[itemAtual][peso]=Math.max (val[itemAtual-1]+matriz[itemAtual-1][peso-itens[itemAtual-1]], matriz[itemAtual-1][peso]);
	                }
	                else {
	                	//Se o peso do item atual for maior do que o peso atual, basta reencaminhar o valor sem o item atual
	                	matriz[itemAtual][peso]=matriz[itemAtual-1][peso];
	                }
	            }
	        }
	       
	        
	        //Imprimir a matriz
	        for (int[] rows : matriz) {
	            for (int col : rows) {
	                System.out.format("%5d", col);
	            }
	            System.out.println();
	        }
	        return matriz[itemLinha][pesoColuna];
	    }
	}
