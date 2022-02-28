package Entities;

import Interface.IConta;

public class ContaPoupanca extends Conta implements IConta{

	private int numConta;
	private double saldo;
	
	public ContaPoupanca(double saldo) {
		this.numConta = Conta.newNumConta();
		this.saldo = saldo;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	
	@Override
	public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
		contaOrigem.sacar(valor);
		contaDestino.depositar(valor); 
	}
	
/*
	public void imprimirExtrato() {
		
		System.out.println("*** Extrato Conta Poupança ***");
		super.imprimirInfosComuns();		
	}	*/
}