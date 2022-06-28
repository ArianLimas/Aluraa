package br.com.alura.banco.teste;

import br.com.alura.banco.modelo.Conta;
import br.com.alura.banco.modelo.ContaCorrente;
import br.com.alura.banco.modelo.ContaPoupanca;
import herança.Cliente;

public class TesteObject {
	
	public static void main(String[] args) {
		
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
//		
		ContaCorrente cc= new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		Cliente cliente = new Cliente();
		
		System.out.println(cc.toString());
		System.out.println(cp);
		
		println(cp);
	}
	
	static void println() {}
	static void println(int a) {}
	static void println(boolean valor) {}
	static void println(Object referencia) {}

}
