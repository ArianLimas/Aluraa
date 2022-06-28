package introduçãoOO;

public class TestaMetodo {

	public static void main(String[] args) {

		// criando objeto usuario

		Conta contaDoPaulo = new Conta();

		// atribuindo saldo a conta do usuario paulo
		contaDoPaulo.saldo = 100;

		// adicionando dinehiro a conta do paulo
		contaDoPaulo.deposita(50);
		// mostrando saldo atual
		System.out.println(contaDoPaulo.saldo);
		// sacando dinheiro da conta do paulo
		contaDoPaulo.saca(20);
		// imprimindo o saldo atual
		System.out.println(contaDoPaulo.saldo);
		// criando variável pra mostrar se tinha dado true ou false
		boolean conseguiRetirar = contaDoPaulo.saca(20);
		System.out.println(conseguiRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");
		}

		System.out.println("O saldo da marcela eh R$:" + contaDaMarcela.saldo);
		System.out.println("O saldo da conta do Paulo é R$" + contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
	}

}
