package Entities;

//import java.util.ArrayList;

public class Cliente {

	
	private String nome;
	private int cpf;
	//private ArrayList<Conta> contas;
	Conta conta;
	
	
	public Cliente(String nome, int cpf, Conta conta) {
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
	//	contas = new ArrayList<Conta>();
	}
		
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public Conta getConta() {
		return conta;
	}

	
	/*
		public void addConta(Conta c){
			contas.add(c);
		    c.setCliente(this);
		}  
		    
		public void removeConta(Conta c){
			contas.remove(c);     
			c.setCliente(null);
		}
	
	/*
	public void listaContas() {
		
		for(int i = 0; i < contas.size(); i++) {
			System.out.println("Conta: " + contas.get(i).getNumero());
			System.out.println("Titular: " + contas.get(i).getCliente().getNome());
			System.out.println("Agencia: " + contas.get(i).getAgencia());
		}
	}
	*/
	
}