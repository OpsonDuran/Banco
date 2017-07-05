package com.beeva.banco.BancoApp;

public class Cuenta {
	protected double balance=0.0;
	public double dinero;
	
	Cuenta(double balance){
		this.balance=balance;
	}
	
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance(){
		return balance;
	}
	
	public void Deposito(double dinero){
		balance= balance +dinero;
	}
	public boolean Retiro(double dinero){
		balance= balance- dinero;
		return true;
	}
	
}
