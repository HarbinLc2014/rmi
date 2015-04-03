package com.lwl.rmi.service;

import java.rmi.Remote;  

public interface AddService extends Remote{

	public int AddNumbers(int firstNumber,int secondNumber) throws java.rmi.RemoteException;
}
