package herança;
// herente é um funcionário, ou genrente 
//editorVideo herda da classe funcionario
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do editor de vídeo");
		return 150;

	}

	

}
