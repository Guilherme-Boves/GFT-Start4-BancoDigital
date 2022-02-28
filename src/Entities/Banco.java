package Entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nomeBanco;
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public Banco() {
		
	}

	public Banco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void listaContas() {
		System.out.println("\n**** Lista de Contas ****");
		for(int i = 0; i < clientes.size(); i++) {
			
			System.out.println("Agencia: " + getNomeBanco());
			System.out.println("Conta: " + clientes.get(i).getConta().getNumConta());
			System.out.println("Titular: " + clientes.get(i).getNome());
			System.out.println("CPF: " + clientes.get(i).getCpf());
			System.out.println();
		}
			
	}
	
}