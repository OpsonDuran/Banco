package com.beeva.banco.BancoApp;

public class CuentaCheques extends Cuenta{
	public double limite=500;
	
	
	CuentaCheques(double balance) {
		super(balance);
	}
	
	
	public boolean Retiro( double dinero){
		if(balance < limite){
			balance=balance-dinero;
			return true;
		}else{
			return false;
		}
	}

}
