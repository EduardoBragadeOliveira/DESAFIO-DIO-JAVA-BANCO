package main.contaPoupança;

import java.util.ArrayList;

import main.conta.conta;

public class contaPoupanca extends conta {

	ArrayList <Cliente> clientesBanco = new ArrayList<>();
	
	public void setDadosClientes(String nome, Integer cpf, String tempo) {
		
		Cliente.nome = nome;
		Cliente.cpf = cpf;
		Cliente.tempo = tempo;
		clientesBanco.add(new Cliente());
		
		
	}

	public contaPoupanca() {
		
		this.setDadosClientes("Eduardo", 123, "5 anos");
	}
	
	@Override
	public void imprimirExtrato() {
		
		
		for (Cliente c : clientesBanco) {
			
		System.out.println(" --- Extrato Conta Poupança --- ");
		System.out.println(c);
		super.imprimirInfosComuns();
		
		};
	}
	
}

class Cliente {
	
	protected static String nome;
	protected static Integer cpf;
	protected static String tempo;
	
	public Cliente() {

		this.nome = nome;
		this.cpf = cpf;
		this.tempo = tempo;
	}

	public String getNome() {
		return nome;
	}


	public Integer getCpf() {
		return cpf;
	}

	public String getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "Titular: " + nome + " \nCPF: " + cpf + " \nTempo no Banco: " + tempo ;
	}
	
	
}