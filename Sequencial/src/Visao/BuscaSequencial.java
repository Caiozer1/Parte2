package Visao;

import Modelagem.Ordem;
public class BuscaSequencial {

	public static void main(String[] args) {
		 
		int []vetor={44,16,83,27,17,41,24,25,20,55};
		int elementoParaEncontrar=93;
	    int resultado=buscasequencial(vetor,elementoParaEncontrar);
		if (resultado!=-1) {
			System.out.println("Elemento encontrado no indice" +resultado);
		}else{
			System.out.println("elemento não encontrado");
		}
			
		}

	private static int buscasequencial(int[] vetor, int elementoParaEncontrar) {
		// TODO Auto-generated method stub
		return 0;
	}


	}

