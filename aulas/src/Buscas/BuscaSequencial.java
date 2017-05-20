package Buscas;

public class BuscaSequencial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int vet[]={1,4,6,7,8,9,80,90};
		
		System.out.println(buscaSequencial(vet,90));
		

	}
	
public static int buscaSequencial (int[]vetor, int valorProcurado){
		
		
		for (int i = 0 ; i < vetor.length ; i++ ){
			if (vetor [i] == valorProcurado){
				return i;
			}
		}
		
		return -1;
	}

}
