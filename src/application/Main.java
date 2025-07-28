package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Clientes;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;
import exceptions.DomainExceptions;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);	
		
		List<Clientes> cliente = new ArrayList<>();

		System.out.print("Nome tituar da conta corrente: ");
		String titularCC = sc.nextLine();
		cliente.add(0, new Clientes(titularCC));
		
		System.out.print("Nome tituar da conta poupança: ");
		String titularCP = sc.nextLine();
		cliente.add(1, new Clientes(titularCP));
		System.out.println();
		
		Conta contaC = new ContaCorrente(cliente.get(0));
		Conta poupanca = new ContaPoupanca(cliente.get(1));
		
		poupanca.depositar(1000.00);
		
		contaC.imprimirExtrato();
		poupanca.imprimirExtrato();
		System.out.println();
		
		
		System.out.print("Digite o valor do saque: ");
		double saque = sc.nextDouble();
		
		try {
			contaC.sacar(saque);
		}
		catch(DomainExceptions e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		try {
			poupanca.transferir(500.00, contaC);
			System.out.println();
		}
		catch(DomainExceptions f) {
			System.out.println(f.getMessage());
		}
		
		contaC.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		sc.close();

	}

}
