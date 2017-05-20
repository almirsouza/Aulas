package recursividade;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		 
			Scanner ss = new Scanner(System.in);
			
			System.out.print("Digite numero que deseja calcular a função fatorial: ");
			int num;
			num = ss.nextInt();
			
		   System.out.print(" "+funcaoFatorial(num)); 

		

	}
	
	public static int funcaoFatorial  (int num){
		
	
		if(num <= 1){
			return 1;
		}
		else{
			return  funcaoFatorial(num - 1) * num;
		}
		
		
	}

}
