package br.com.alura.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
//		int[] idades = new int[5];
//		String[] nomes = new String[5];
		int idade = 29; // Integer
		
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		// em vez de criar new, add um método
		Integer idadeRef = Integer.valueOf(29); // autoboxing
		int valor = idadeRef.intValue(); // unboxing
		System.out.println(idadeRef.doubleValue());

		String s = args[0]; // "10"
//		Integer numero = Integer.valueOf(s);
//		System.out.println(numero);

		// String -> primitivo
		int numero = Integer.parseInt(s);
		System.out.println(numero);

		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); // Autoboxing versão 1.2 +-
//		System.out.println(idades);

	}

}
