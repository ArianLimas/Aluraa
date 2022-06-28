package heran�a;

// n�o pode instanciar essa classe, pois � abstrata
public abstract class Funcionario {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	private String nome;
	private String cpf;
	protected double salario;
	// protected = publico para os filhos, mas para outras classes n�o

	// metodo sem corpo, n�o h� implementa��o,
	// pois � abstrato, os filhos precisam do
	// m�todo pra implementar

	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
