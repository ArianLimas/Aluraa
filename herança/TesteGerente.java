package heran�a;

public class TesteGerente {

	public static void main(String[] args) {
	Gerente g1 = new Gerente();
	Autenticavel referencia = new Cliente();
	
	
	g1.setNome("Arian");
	g1.setCpf("45655-5");
	g1.setSalario(5000.0);
	
	System.out.println(g1.getNome());
	System.out.println(g1.getCpf());
	System.out.println(g1.getSalario());

	
	g1.setSenha(2222);
	boolean autenticou = g1.autentica(111);
	
	System.out.println(autenticou);
	
	System.out.println(g1.getBonificacao());

	}

}
