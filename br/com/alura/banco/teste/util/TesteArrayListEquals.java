package br.com.alura.banco.teste.util;

import java.util.ArrayList;

import br.com.alura.banco.modelo.Conta;
import br.com.alura.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		
		
//		Conta cc1 = new ContaCorrente(22, 22);
//		Conta cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		// ele só armazena contas
		//Generics
		
		ArrayList <Conta> lista = new ArrayList<Conta>();
	
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		System.out.println();
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe cc2? : "+ existe);
		for(Conta conta : lista){
			System.out.println(conta);
		
		}
		
		
	
		
	
	}

}
