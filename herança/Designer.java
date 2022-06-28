package herança;
// herente é um funcionário, ou genrente 
//editorVideo herda da classe funcionario

// abstract no método = não tem implementação
public class Designer extends Funcionario {


	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do desginer");
		return 200;

	}


}
