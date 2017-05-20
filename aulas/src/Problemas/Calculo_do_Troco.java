package Problemas;

import java.util.Scanner;

public class Calculo_do_Troco {

	
	public static void main(String[] args) {
		
	
		
		int  dinheiro, total;
		int troco;
		int nota100 = 0, nota50 = 0 ,nota20 = 0 , nota10 = 0, nota5 = 0, nota2 =0;
		
		Scanner ss = new Scanner(System.in);
		System.out.println("Digite valor do dinheiro entregue R$: ");
		dinheiro = ss.nextInt();
		
		System.out.println("Digite o total a pagar R$: ");
		total = ss.nextInt();
		
		troco = dinheiro - total;
		
		System.out.println("Troco R$: "+ troco);
		
		while  (troco >=100){
			nota100 = nota100 + 1;
		   troco  = troco - 100;
		}
		
		while  (troco >=50){
			nota50 = nota50 + 1;
		   troco  = troco - 50;
		}
		while (troco>=20){
		   nota20 = nota20 + 1;
		   troco = troco - 20;
		}
		while  (troco>=10){
		   nota10 =  nota10 + 1;
		   troco = troco - 10;
		}
		while  (troco>=5){
		   nota5 = nota5 +1;
		   troco = troco - 5;
		}
		while(troco>=2){
		   nota2 = nota2 + 1;
		   troco = troco - 2;
	}
		
		System.out.println("R$ 100: "+ nota100);
		System.out.println("R$ 50: "+ nota50);
		System.out.println("R$ 20: "+ nota20);
		System.out.println("R$ 10: "+ nota10);
		System.out.println("R$ 5: "+ nota5);
		System.out.println("R$ 2: "+ nota2);

	}
	
	

}
