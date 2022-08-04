package main.conta;

import java.util.ArrayList;
import java.util.List;


public abstract class conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 0001;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	
	
	
	public conta() {
		
		this.agencia = conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	@Override
	public void transferir(double valor, conta contaDestino) {
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	
	
	protected void imprimirInfosComuns() {
		
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

};


