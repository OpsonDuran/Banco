package com.beeva.banco.BancoApp;

public class CuentaAhorro  extends Cuenta{
	CuentaAhorro(double balance) {
		super(balance);
	}
	
	public boolean Retiro(double dinero){
			balance=balance-dinero;
			return true;
		
	}
	
	
}
