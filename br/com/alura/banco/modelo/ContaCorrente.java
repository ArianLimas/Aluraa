package br.com.alura.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}
	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.saldo * 0.01;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return  "ContaCorrente, " + super.toString();
		}

	}
//	@OVERRIDE
//	PUBLIC STRING TOSTRING() {
//		// TODO AUTO-GENERATED METHOD STUB
//		RETURN  "CONTACORRENTE NUMERO: " + SUPER.GETNUMERO() + " AGÊNCIA : "+ SUPER.GETAGENCIA();
//	}


