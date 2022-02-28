package Application;

import java.text.DecimalFormat;
import java.util.Scanner;

import Entities.Banco;
import Entities.Cliente;
import Entities.ContaCorrente;
import Entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Banco banco = new Banco("Santander");
		DecimalFormat df = new DecimalFormat("R$ ##,##0.00");
		
		int op = 0;
		String nomeBanco = null;
		boolean rodando1 = true;
		boolean rodando2 = false;
		
		System.out.println("Banco desejado: ");
		while(rodando1) {
			System.out.println("\n1 - Santander");
			System.out.println("2 - Banco do Brasil");
			System.out.println("3 - Itaú");
			System.out.println("4 - Nubank");
			System.out.println("5 - Sair");
			
			System.out.print("\nDigite a opção desejada: ");
			op = sc.nextInt();
			
			switch (op) {
			
			case 1: 
					nomeBanco = "Santader";
					rodando1 = false;
					break;
			case 2: 
					nomeBanco = "Banco do Brasil";
					rodando1 = false;
					break;
			case 3: 
					nomeBanco = "Itaú";
					rodando1 = false;
					break;
			case 4: 
					nomeBanco = "Nubank";
					rodando1 = false;
					break;
			case 5: 
					System.out.println("\n*** Obrigado por utilizar os bancos DIO! ***");
					rodando1 = false;
					break;
			default: 
				System.out.println("Opção Inválida! Digite Novamente!");
				break;
			}
		}
		
		if(op == 5) {
			rodando1 = false;
			rodando2 = false;			
		} else {
			op = 0;
			rodando2 = true;
		}
		
		Banco banco = new Banco(nomeBanco);
		System.out.println("Bem vindo ao banco " + banco.getNomeBanco() + "!");
	
		while(rodando2) {
			System.out.println("\n1 - Criar Conta Corrente");
			System.out.println("2 - Criar Conta Poupança");
			System.out.println("3 - Sacar");
			System.out.println("4 - Depositar");
			System.out.println("5 - Transferir");
			System.out.println("6 - Listar Contas");
			System.out.println("7 - Sair");
			
			System.out.print("\nDigite a opção desejada: ");
			op = sc.nextInt();
			
			switch (op) {
				case 1:
						//CRAR CONTA CORRENTE
						System.out.println("\n*** Criar Conta Corrente ***");
						System.out.print("Nome: ");
						sc.nextLine();
						String nomeCCorrente = sc.nextLine();		
						
						System.out.print("CPF: ");
						int cpfCCorrente = sc.nextInt();
						
						System.out.print("Valor a ser depositado: ");
						double valorDepositoCCorrente = sc.nextDouble();
						System.out.println();
						
						Cliente clienteCorrente = new Cliente(nomeCCorrente, cpfCCorrente, new ContaCorrente(valorDepositoCCorrente), "Corrente");
						banco.addCliente(clienteCorrente);
						break;
	
				case 2:
						//CRAR CONTA POUPANÇA
						System.out.println("\n*** Criar Conta Poupança ***");
						System.out.print("Nome: ");
						sc.nextLine();
						String nomeCPoupanca = sc.nextLine();
						
						System.out.print("CPF: ");						
						int cpfCPoupanca = sc.nextInt();
						
						System.out.print("Valor a ser depositado: ");
						double valorDepositoCPoupanca = sc.nextDouble();
						System.out.println();
						
						Cliente clientePoupanca = new Cliente(nomeCPoupanca, cpfCPoupanca, new ContaPoupanca(valorDepositoCPoupanca), "Poupança");
						banco.addCliente(clientePoupanca);
						break;
				case 3:
						//SACAR
						System.out.println("\n*** Sacar ***");
						System.out.print("Número da Conta: ");
						int numContaSaque = sc.nextInt();
						
						System.out.print("Valor a ser sacado: ");
						double valorSaque = sc.nextDouble();
						
						numContaSaque -= 1;

						System.out.println("Saldo Anterior: " + df.format(banco.getClientes().get(numContaSaque).getConta().getSaldo()));
						banco.getClientes().get(numContaSaque).getConta().sacar(valorSaque);
						System.out.println("Saldo atualizado: " + df.format(banco.getClientes().get(numContaSaque).getConta().getSaldo()));
						System.out.println();
						
						break;
				case 4:
						//DEPOSITAR
						System.out.println("\n*** Depositar ***");
						System.out.print("Número da Conta: ");
						int numContaDeposito = sc.nextInt();
						
						System.out.print("Valor a ser depositado: ");
						double valorDeposito = sc.nextDouble();
						
						numContaDeposito -= 1;
						
						System.out.println("Saldo Anterior: " + df.format(banco.getClientes().get(numContaDeposito).getConta().getSaldo()));
						banco.getClientes().get(numContaDeposito).getConta().depositar(valorDeposito);
						System.out.println("Saldo atualizado: " + df.format(banco.getClientes().get(numContaDeposito).getConta().getSaldo()));
						System.out.println();
						
						break;
				case 5:
						//Transferir
						System.out.println("\n*** Transferir ***");
						System.out.print("Número da conta origem: ");
						int numContaOrigem = sc.nextInt();
						
						System.out.print("Número da conta Destino: ");
						int numContaDestino = sc.nextInt();
						
						System.out.print("Valor a ser transferido: ");
						double valorTransferencia = sc.nextDouble();
						
						numContaOrigem -= 1;
						numContaDestino -= 1;
						
						System.out.println("\nSaldo anterior da conta origem: " + df.format(banco.getClientes().get(numContaOrigem).getConta().getSaldo()));
						banco.getClientes().get(numContaOrigem).getConta().sacar(valorTransferencia);
						System.out.println("Saldo atualizado da conta origem: " + df.format(banco.getClientes().get(numContaOrigem).getConta().getSaldo()));
						
						System.out.println("Saldo anterior da conta destino: " + df.format(banco.getClientes().get(numContaDestino).getConta().getSaldo()));
						banco.getClientes().get(numContaDestino).getConta().depositar(valorTransferencia);
						System.out.println("Saldo atualizado da conta destino: " + df.format(banco.getClientes().get(numContaDestino).getConta().getSaldo()));
						System.out.println();
						break;				
				case 6:
						banco.listaContas();
						break;
				case 7:
						System.out.println("\n*** Obrigado por utilizar os bancos " + banco.getNomeBanco() + "! ***");
						rodando2 = false;
						break;
				default:
						System.out.println("Opção Inválida! Digite Novamente!");
						System.out.println();
						break;
			}
		}
		
		sc.close();		
	} //Chave main
}//Chave Classe Program

