package entities;

import exceptions.DomainExceptions;

public interface IConta {
	
	void sacar(double valor) throws DomainExceptions;
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDetino) throws DomainExceptions;
	
	void imprimirExtrato();

}
