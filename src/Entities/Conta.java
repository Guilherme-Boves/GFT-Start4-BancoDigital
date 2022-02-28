package Entities;

import Interface.IConta;

public abstract class Conta implements IConta {
	
	//private static final int AGENCIA_PADRAO = 1;
	//private static int SEQUENCIAL = 1;
		
	private double saldo;	
	private static int numConta = 1;
	
	/*
	 
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	public Conta(int agencia, int numero, Cliente cliente) {
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	
	*/
	
	public Conta() {
		
	}
	
	public static int newNumConta() {
		return numConta++;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumConta() {
		return numConta;
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
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor); 
	}
	
	/*
	protected void imprimirInfosComuns() {
		System.out.printf("Titular: %s", this.cliente.getNome());
		System.out.printf("\nAgencia: %d", this.agencia);
		System.out.printf("\nNúmero: %d", this.numero);
		System.out.printf("\nSaldo: %.2f\n\n", this.saldo);
	}*/
	
}