package Entities;

public class ContaCorrente extends Conta {

	private int numConta;
	private double saldo;
	

	public ContaCorrente(double saldo) {
		this.numConta = Conta.newNumConta();
		this.saldo = saldo;
	}
	
	public int getNumConta() {
		return numConta;
	}

	public double getSaldoContaCorrente() {
		return saldo;
	}

	public void setSaldoContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	/*
	@Override
	public void imprimirExtrato() {

		System.out.println("*** Extrato Conta Corrente ***");
		super.imprimirInfosComuns();		
	} 	*/
	
}