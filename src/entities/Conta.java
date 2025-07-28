package entities;

import exceptions.DomainExceptions;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static Integer SEQUENCIAL = 1001;
	
	protected Integer agencia;
	protected Integer conta;
	protected double saldo;
	private Clientes cliente;

	public Conta(Clientes cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	
	public Integer getAgencia() {
		return agencia;
	}
	public Integer getConta() {
		return conta;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void sacar(double valor) throws DomainExceptions{
		if(valor > saldo) {
			throw new DomainExceptions(cliente.getNome() + " o Valor do seu saque excedeu o saldo da Conta. "
					+ "\nVerifique seu saldo e tente novamente. ");
		}
		else {
			saldo -= valor;
		}
		
		
	
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) throws DomainExceptions {
		this.sacar(valor);
		contaDestino.depositar(valor);
		System.out.println(contaDestino.cliente.getNome()
				+ " Você Recebeu uma tranferência no valor de: R$"
				+ String.format("%.2f", valor) 
				+ "\nDe: " + this.cliente.getNome()
				+ "\nAgencia: " + this.agencia 
				+ "\nConta: " + this.conta);		
	}
	
	protected void imprimirInfoContas() {
		System.out.print(String.format("Titular: %s ", cliente.getNome()));
		System.out.print("Agencia: " + agencia);
		System.out.print(" Conta: " + conta);
		System.out.println(String.format("\nSaldo: %.2f", this.saldo));
	}


	
	

}
