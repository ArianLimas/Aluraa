package br.com.alura.banco.teste;

import br.com.alura.banco.modelo.Conta;
import br.com.alura.banco.modelo.ContaCorrente;
import br.com.alura.banco.modelo.SaldoInsuficienteException;

public class TesteSaca extends Exception {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);

		try {
			conta.deposita(200.0);
			conta.saca(210.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());

			System.out.println(conta.getSaldo());
		}
	}

}
