package ufpb.br.SelectionSort;

public class SelectionSort {

	public int[] selectionSort(int[] A) {
		
		for (int i = 0; i < A.length - 1; i++) {
			int indiceDoMenor = i;
			
			for (int j = i + 1; j < A.length; j++) {
				
				if (A[j] < A[indiceDoMenor]) {
					indiceDoMenor = j;
				}
			}
			
			indiceDoMenor = A[i];
			A[i] = A[indiceDoMenor];
		}

		return A;

	}

	public static void main(String[] args) {
		SelectionSort c = new SelectionSort();

		int lista[] = { 1, 5, 2, 4, 8, 5 };

		int[] ondem = c.selectionSort(lista);
		System.out.println("vida");
		for (int i : ondem) {
			System.out.println(i);
		}
	}

}
