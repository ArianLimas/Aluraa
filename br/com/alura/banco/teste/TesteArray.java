package br.com.alura.banco.teste;

import br.com.alura.banco.modelo.Conta;
import br.com.alura.banco.modelo.ContaCorrente;
import br.com.alura.banco.modelo.GuadadorDeContas;

public class TesteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GuadadorDeContas guardador = new GuadadorDeContas();

		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		guardador.adiciona(cc2);

		Conta cc3 = new ContaCorrente(21, 245);
		guardador.adiciona(cc3);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		
		Conta ref = guardador.getReferencia(1);
		
		System.out.println();
		System.out.println("Pegando no vetor agencia e o numero da  "+guardador.getReferencia(1));
		
		System.out.println();
		System.out.println(tamanho);
		
		
		System.out.println(ref.getNumero());
	
	}

}
