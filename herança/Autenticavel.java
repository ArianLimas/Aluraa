package heran�a;

//contrato Autenticavel
//quem assina o contrato, precisa implementar 
//m�todo setSenha
//m�todo autentica
//interface s� possui m�todos sem par�metros
// classe abstrata possui m�todos com par�metros ou sem
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
