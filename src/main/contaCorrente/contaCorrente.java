package main.contaCorrente;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import main.conta.conta;

public class contaCorrente extends conta {
	
	
	ArrayList <Cliente> clientesBanco = new ArrayList<>();
	
	public void setDadosClientes(String nome, Integer cpf, String tempo) {
		
		Cliente.nome = nome;
		Cliente.cpf = cpf;
		Cliente.tempo = tempo;
		clientesBanco.add(new Cliente());
		
		
	}

	public contaCorrente() {
		
		this.setDadosClientes("João", 123, "3 anos");
	}
	
	@Override
	public void imprimirExtrato() {
		
		
		for (Cliente c : clientesBanco) {
			
		System.out.println(" --- Extrato Conta Corrente --- ");
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
