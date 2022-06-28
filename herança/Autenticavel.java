package herança;

//contrato Autenticavel
//quem assina o contrato, precisa implementar 
//método setSenha
//método autentica
//interface só possui métodos sem parâmetros
// classe abstrata possui métodos com parâmetros ou sem
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
