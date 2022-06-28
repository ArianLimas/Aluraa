package Encapsulado;

public class TestaValores {
	public static void main(String[] args) {

		Conta conta = new Conta(1337, 24226);

		// conta está inconsistente
		// conta.setAgencia(-50);
		// conta.setNumero(-330);

		System.out.println(conta.getAgencia());

		conta.setAgencia(123123);
		Conta conta2 = new Conta(13, 226);

		Conta conta3 = new Conta(137, 246);
		System.out.println(Conta.getTotal());

	}

}
