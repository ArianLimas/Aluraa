package heran�a;

public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente Arian = new Gerente();
		Arian.setNome("Arian de limas");
		Arian.setCpf("75557-55");
		Arian.setSalario(5690.00);

		System.out.println("O nome do funcion�rio � " + Arian.getNome());
		System.out.println("O cpf do funcion�rio " + Arian.getNome() + " �: " + Arian.getCpf());
		System.out.println();
		System.out.println("O sal�rio do cpf " + Arian.getCpf() + " � de " + Arian.getSalario());
		;
		System.out.println("A bonefica��o � de : "+Arian.getBonificacao());
		
		
		Arian.salario = 1; 
		System.out.println(Arian.salario);
		
		System.out.println(Arian.getBonificacao());
		
		
//		Cliente cliente = new Cliente();
//		cliente.setSalario(200);
//		System.out.println(cliente.getSalario());
		
	}

}
