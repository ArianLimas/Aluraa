package br.com.alura.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		int[] idades  = new int[5]; //inicializa o array com os valores padrões
		
		
for(int i = 0; i< idades.length; i++) {
	
	idades[i] = i * i;

}
for(int i = 0; i < idades.length; i++) {
	System.out.println(idades[i]);
}

	}

}
