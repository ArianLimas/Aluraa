package br.com.alura.banco.modelo;

public class GuadadorDeContas {
	
	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuadadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
		
	}
	public void adiciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}
	public int getQuantidadeDeElementos() {
		// TODO Auto-generated method stub
		return this.posicaoLivre;
	}
	public Conta getReferencia(int pos) {
		// TODO Auto-generated method stub
		return this.referencias[pos];
	}
	

}
