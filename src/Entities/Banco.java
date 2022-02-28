package Entities;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nomeBanco;
	private List<Cliente> clientes = new ArrayList<Cliente>();
	DecimalFormat df = new DecimalFormat("R$ ##,##0.00");
	
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
		
		if(clientes.isEmpty()) {
			System.out.println("Nenhuma conta foi cadastrada!");
		} else {
			System.out.println("\n**** Lista de Contas ****");
			for(int i = 0; i < clientes.size(); i++) {
				
				System.out.println("Banco: " + getNomeBanco());
				System.out.println("Conta: " + clientes.get(i).getConta().getNumConta());
				System.out.println("Titular: " + clientes.get(i).getNome());
				System.out.println("CPF: " + clientes.get(i).getCpf());
				System.out.println("Tipo da conta: " + clientes.get(i).getTipoConta());
				System.out.println("Saldo: " + df.format(clientes.get(i).getConta().getSaldo()));
				System.out.println();
			}
		}
	}
	
}