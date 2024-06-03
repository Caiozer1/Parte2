package Modelagem;

public class Ordem {

	public static int buscasequencial(int []vetor, int elemento){
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]== elemento) {
				return i;
			}
		}
		
		return -1;
		
	}
}
