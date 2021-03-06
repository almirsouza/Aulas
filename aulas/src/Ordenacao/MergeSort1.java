package Ordenacao;

public class MergeSort1 {
	
	
	public static void main(String args[]){
	
	}
	
	
	
	 static void merge(int[] A, int p, int q, int r) {
	        int[] aux = new int[r - p + 1];
	        int a = p;
	        int b = q + 1;
	        int h = 0;
	        while (a <= q && b <= r) {
	            if (A[a] < A[b]) {
	                aux[h++] = A[a++];
	            } else {
	                aux[h++] = A[b++];
	            }
	        }
	        while (a <= q) {
	            aux[h++] = A[a++];
	        }
	        while (b <= r) {
	            aux[h++] = A[b++];
	        }
	        for (h = 0; h < aux.length; h++) {
	            A[p++] = aux[h];
	        }
	    }

	    static void mergeSort(int[] A, int p, int r) {
	        int q = (p + r) / 2;
	        if (p < r) {
	            mergeSort(A, p, q);
	            mergeSort(A, q + 1, r);
	            merge(A, p, q, r);
	        }
	    }

}
