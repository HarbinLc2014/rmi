package com.lwl.rmi.service;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class AddServiceImp extends UnicastRemoteObject implements AddService
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AddServiceImp()  throws RemoteException{
		super();
	}
	public int AddNumbers(int firstNumber, int secondNumber)throws RemoteException 
	{
		return firstNumber+secondNumber;
	}

}
