package bancoDigital;

import java.util.Scanner;

import Entities.Banco;
import Entities.Cliente;
import Entities.ContaCorrente;
import Entities.ContaPoupanca;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Banco banco = new Banco("Santander");
		
		int op = 0;
		boolean running = true;
				
		while (running) {
			System.out.println("1 - Criar Conta Corrente");
			System.out.println("2 - Criar Conta Poupança");
			System.out.println("3 - Sacar");
			System.out.println("4 - Depositar");
			System.out.println("5 - Transferir");
			System.out.println("6 - Acessar Conta");
			System.out.println("7 - Listar Contas");
			System.out.println("8 - Sair");
			
			System.out.print("\nDigite a opção desejada: ");
			op = sc.nextInt();
			
			switch (op) {
				case 1:
						System.out.println("\n*** Criar Conta Corrente ***");
						System.out.print("Nome: ");
						String nome = sc.next();
						//String nome = sc.nextLine();		
						//sc.next();
						
						System.out.print("CPF: ");
						int cpf = sc.nextInt();
						
						System.out.print("Valor a ser depositado: ");
						double valorDeposito = sc.nextDouble();
						System.out.println();
						
						Cliente cliente = new Cliente(nome, cpf, new ContaCorrente(valorDeposito));
						banco.addCliente(cliente);
						break;
	
				case 2:
						System.out.println("\n*** Criar Conta Poupança ***");
						System.out.print("Nome: ");
						String nome1 = sc.next();
						//String nome = sc.nextLine();		
						//sc.next();
						
						System.out.print("CPF: ");
						int cpf1 = sc.nextInt();
						
						System.out.print("Valor a ser depositado: ");
						double valorDeposito1 = sc.nextDouble();
						System.out.println();
						
						Cliente cliente1 = new Cliente(nome1, cpf1, new ContaPoupanca(valorDeposito1));
						banco.addCliente(cliente1);
						break;
				case 3:
						//SACAR
						continue;
				case 4:
						//Depositar
						continue;
				case 5:
						//Transferir
						continue;
				case 6:
						//ACESSAR CONTA
						continue; // IMPLETAMENTAR MAIS TARDE
				case 7:
						banco.listaContas();
						break;
				case 8:
						System.out.println("Obrigado por utilizar os bancos DIO!");
						break;
				default:
						System.out.println("Opção Inválida!");
						break;
			}
		}
		
		sc.close();
		
	}
}

