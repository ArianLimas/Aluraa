package ComposišaoDeObjetos;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100); 
		
		
		contaDoPaulo.titular = new Cliente();
		System.out.println(contaDoPaulo.titular.nome);
		
		contaDoPaulo.titular.nome = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular.nome);
		
		
	}

}
