package br.com.alura.banco.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.banco.modelo.Conta;
import br.com.alura.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		// ele só armazena contas
		//Generics
		Collection<Conta> lista = new ArrayList<Conta>();
		
//		opção 1 List<Conta> lista = new ArrayList<Conta>();
//		opção 2 List<Conta> lista = new Vector <Conta>();
//		opção 3 List<Conta> lista = new LinkedList<Conta>();
//	
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		System.out.println();
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		System.out.println();
		System.out.println(lista.size());
		
		
		Conta ref =  ((ArrayList<Conta>) lista).get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println(((ArrayList<Conta>) lista).get(0));
		System.out.println("Tamanho da lista: "+ lista.size());
	
		
		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);
		
		System.out.println();
		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);
		
		
		for(int i = 0 ; i < lista.size(); i++) {
			
			Object oRef = ((ArrayList<Conta>) lista).get(i);
			System.out.println(oRef);
		}
		System.out.println("======");
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	
	}

}
