package br.com.alura.banco.modelo;

public class CalcuradoraDeImposto {

	private double totalImposto;
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
		
	}
	public double getTotalImposto() {
		return totalImposto;
	}
}
