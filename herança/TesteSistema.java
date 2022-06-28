package herança;

public class TesteSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Admnistrador adm = new Admnistrador();
		adm.setSenha(2222);
		
		
		Designer d = new Designer();
		d.setSenha(3333);
		
		
		SistemInterno si = new SistemInterno();
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		
		si.autentica(cliente);
		si.autentica(g);
		si.autentica(adm);
	
	}
	
}
