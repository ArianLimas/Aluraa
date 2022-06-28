package herança;

public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente Arian = new Gerente();
		Arian.setNome("Arian de limas");
		Arian.setCpf("75557-55");
		Arian.setSalario(5690.00);

		System.out.println("O nome do funcionário é " + Arian.getNome());
		System.out.println("O cpf do funcionário " + Arian.getNome() + " é: " + Arian.getCpf());
		System.out.println();
		System.out.println("O salário do cpf " + Arian.getCpf() + " é de " + Arian.getSalario());
		;
		System.out.println("A boneficação é de : "+Arian.getBonificacao());
		
		
		Arian.salario = 1; 
		System.out.println(Arian.salario);
		
		System.out.println(Arian.getBonificacao());
		
		
//		Cliente cliente = new Cliente();
//		cliente.setSalario(200);
//		System.out.println(cliente.getSalario());
		
	}

}
