package main.conta;

public interface IConta {
	
	void depositar(double valor);
	
	void sacar(double valor);

	void transferir(double valor, conta contaDesino);
	
	void imprimirExtrato();
}
