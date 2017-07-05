package com.beeva.banco.BancoApp;


import java.util.Scanner;

import com.beeva.app.calculator.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	    System.out.println("cambie desde remote");
    	double res;
       Main calc= new Main();
       res = calc.suma(1, 2);
       System.out.println("La suma es"+res);
       res = calc.resta(10, 2);
       System.out.println("La resta es"+res);
       res = calc.divicion(80, 2);
       System.out.println("La divicion es"+res);
       res = calc.multiplicacion(2, 2);
       System.out.println("La multiplicacion es"+res);
       
       
       
    
       int opcion,num;
		double dinero;
		String nombre,apellido;
		Scanner lectura = new Scanner(System.in);
			
	
		//Ingresar usuarios

				System.out.println("numero de usuarios a ingresar");
				System.out.println("---------------");
				num=lectura.nextInt();
				lectura.nextLine();
				Banco usuarios= new Banco();

				for(int i=0;i<num;i++){
					System.out.println("Ingresa usuario "+(i+1));
					System.out.println("---------------");
					System.out.print("Nombre:");
					nombre=lectura.nextLine();
					System.out.print("Apellido:");
					apellido=lectura.nextLine();
					System.out.print("Saldo inicial:");
					dinero=lectura.nextDouble();
				    usuarios.AddCliente(new Cliente(nombre, apellido,new Cuenta(dinero)));
				    lectura.nextLine();
				}

				System.out.println("Numero de clientes "+ usuarios.getnClientes());


				System.out.println("Informacion del cliente:");
				for(int i=0;i<usuarios.getnClientes();i++){
				System.out.println("Nombre del usuario:" +usuarios.getCliente(i).nombre+" "+usuarios.getCliente(i).apellido+" | Saldo: $"+usuarios.getCliente(i).getCuenta().getBalance());		
				}
		


/*
//Ingresar usuarios

		System.out.println("numero de usuarios a ingresar");
		System.out.println("---------------");
		num=lectura.nextInt();
		lectura.nextLine();
		Banco usuarios= new Banco();

		for(int i=0;i<num;i++){
			System.out.println("Ingresa usuario "+(i+1));
			System.out.println("---------------");
			System.out.println("Nombre:");
			nombre=lectura.nextLine();
			System.out.println("Apellido:");
			apellido=lectura.nextLine();
		    usuarios.AddCliente(new Cliente(nombre, apellido,new Cuenta()));
		}

		System.out.println("Numero de clientes "+ usuarios.getnClientes());


		System.out.println("Informacion del cliente:");
		for(int i=0;i<usuarios.getnClientes();i++){
		System.out.println("Nombre del usuario:" +usuarios.getCliente(i).nombre+" "+usuarios.getCliente(i).apellido);
		}
*/
		
		
/*		

		// Cajero
		System.out.println("---Cajero---");
		System.out.println("Ingresa usuario");
		System.out.println("---------------");
		System.out.println("Nombre:");
		nombre=lectura.next();
		System.out.println("Apellido:");
		apellido=lectura.next();
	    Cliente usuario=new Cliente(nombre, apellido, new Cuenta());
		while(true){
			System.out.println("Informacion del cliente:");
			System.out.println("Nombre del usuario:" +usuario.nombre+" "+usuario.apellido);
			System.out.println("Saldo "+usuario.getCuenta().getBalance());
			System.out.println("Opciones");
			System.out.println("1----Deposito");
			System.out.println("2----Retiro");
	        System.out.println("Seleccione una opcion");
	        opcion= lectura.nextInt();
	        System.out.println("----------");
	    	switch (opcion) {
			case 1:

				System.out.println("----------");
				System.out.println("Deposito");
				System.out.println("Catidad a depositar");
			    dinero= lectura.nextDouble();
			    usuario.getCuenta().Deposito(dinero);
				System.out.println("Saldo "+usuario.getCuenta().getBalance());
				System.out.println("----------");

				break;
			case 2:
				System.out.println("----------");
				System.out.println("Retiro");
				if(usuario.getCuenta().getBalance()>0){
					System.out.println("Catidad a retirar");
				    dinero= lectura.nextDouble();
					if(usuario.getCuenta().getBalance()>dinero){
					usuario.getCuenta().Retiro(dinero);
					System.out.println("Saldo "+usuario.getCuenta().getBalance());
					System.out.println("----------");
					}else{
						System.out.println("No cuentas con el suficiente saldo intenta con una cantidad menor");
					}

				}else{
					System.out.println("No cuentas con saldo");
				}

				break;

			default:
			    break;
	    	}}
*/
       
    }
}
