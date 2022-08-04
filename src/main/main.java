package main;


import java.util.ArrayList;
import java.util.List;

import main.conta.conta;
import main.contaCorrente.contaCorrente;
import main.contaPoupança.contaPoupanca;
import main.banco.Banco;

public class main {

	public static void main(String[] args) {
		
		conta cc = new contaCorrente();
		conta cp = new contaPoupanca();
		
		cc.depositar(1000);
		
		cc.transferir(200, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		

	}
}

