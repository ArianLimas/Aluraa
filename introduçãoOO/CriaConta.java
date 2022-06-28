package introduçãoOO;

public class CriaConta {
	public static void main(String[] args) {
		
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.00;
		primeiraConta.titular = "Fulano";
		
		
		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta.titular);
		
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
	
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("O saldo da primeira conta : "+ primeiraConta.saldo);
		System.out.println("O saldo da segunda conta : "+ segundaConta.saldo);

		
		
		if(primeiraConta == segundaConta) {
			System.out.println("São as mesmas contas");
		}else {
			System.out.println("contas diferentes");
		}
	}

}
