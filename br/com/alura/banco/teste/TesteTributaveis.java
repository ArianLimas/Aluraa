package br.com.alura.banco.teste;

import br.com.alura.banco.modelo.CalcuradoraDeImposto;
import br.com.alura.banco.modelo.ContaCorrente;
import br.com.alura.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);

		cc.deposita(100.0);
		SeguroDeVida seguro = new SeguroDeVida();

		CalcuradoraDeImposto ci = new CalcuradoraDeImposto();
		ci.registra(cc);
		ci.registra(seguro);

		System.out.println(ci.getTotalImposto());
	}

}
