package br.com.alura.banco.modelo;

public class SaldoInsuficienteException extends RuntimeException{
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
		
	}

}
