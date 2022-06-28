 package herançaParte2;

public class FuncionarioTesteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FuncionarioTeste Arian = new FuncionarioTeste();
		FuncionarioTeste f2 = new FuncionarioTeste();
		FuncionarioTeste f3 = new FuncionarioTeste();

		Arian.setSalario(1000.0);
		Arian.setNome("Arian de limas");
		
		f2.setNome("Jonas");
		f2.setSalario(1200.0);
		f2.setTipo(1);

		f3.setNome("Guilherme");
		f3.setSalario(1500.00);
		f3.setTipo(2);
		
		
	
		// arin tipo 0
		System.out.println();
		System.out.println(Arian.getNome());
		System.out.println(Arian.getTipo());
		System.out.println(Arian.getBonificacao());
		System.out.println(Arian.getSalario());

		// f2 tipo 1
		System.out.println();
		System.out.println(f2.getNome());
		System.out.println(f2.getTipo());
		System.out.println(f2.getBonificacao());
		System.out.println(f2.getSalario());

		// f3 tipo 2
		System.out.println();
		System.out.println(f3.getNome());
		System.out.println(f3.getTipo());
		System.out.println(f3.getBonificacao());
		System.out.println(f3.getSalario());

	}

}
