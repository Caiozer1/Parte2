package Sequencia;

public class BuscaSequencial {

	public static void main(String[] args) {
		 
		int []vetor={54,26,93,17,77,31,44,55,20,65};
		int elementoParaEncontrar=93;
	    int resultado=buscasequencial(vetor,elementoParaEncontrar);
		if (resultado!=-1) {
			System.out.println("Elemento encontrado no indice" +resultado);
		}else{
			System.out.println("elemento não encontrado");
		}
			
		}
		public static int buscasequencial(int []vetor, int elemento){
			for(int i=0;i<vetor.length;i++) {
				if(vetor[i]== elemento) {
					return i;
				}
			}
			
			return -1;
			
		}
		
	}
	


