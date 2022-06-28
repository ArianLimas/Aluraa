package introduçãoOO;

public class TestaSacaNegativo {
	
	public static void main(String[] args) {
		
	 Conta conta = new Conta();
	 conta.deposita(200);
	 System.out.println(conta.getSaldo());
	 
	 conta.numero = 1377;
	 System.out.println(conta.numero);
	}
	
	

}
