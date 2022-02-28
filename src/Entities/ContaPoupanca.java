package Entities;

public class ContaPoupanca extends Conta {

	private int numConta;
	private double saldo;
	
	public ContaPoupanca(double saldo) {
		this.numConta = Conta.newNumConta();
		this.saldo = saldo;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public double getSaldoContaPoupanca() {
		return saldo;
	}
	
	public void setSaldoContaPoupanca(double saldo) {
		this.saldo = saldo;
	}
/*
	public void imprimirExtrato() {
		
		System.out.println("*** Extrato Conta Poupança ***");
		super.imprimirInfosComuns();		
	}	*/
}