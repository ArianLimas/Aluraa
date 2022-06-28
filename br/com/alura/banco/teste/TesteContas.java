package br.com.alura.banco.teste;

import br.com.alura.banco.especial.ContaEspecial;
import br.com.alura.banco.modelo.ContaCorrente;
import br.com.alura.banco.modelo.ContaPoupanca;
import br.com.alura.banco.modelo.SaldoInsuficienteException;

// ctrl shifit o atalho para importar tudo sozinho
public class TesteContas {
//br.com.alura.banco.teste.TesteContas

	public static void main(String[] args) throws SaldoInsuficienteException {

		ContaEspecial ce = new ContaEspecial(123, 5555);
		ce.getSaldo();
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);

		System.out.println("Saldo atual de cc é : " + cc.getSaldo());

		System.out.println("Saldo atual de cp é : " + cp.getSaldo());

	}
}
