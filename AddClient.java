package com.lwl.rmi.service;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class AddClient {

	/**
	 * @param args
	 * @throws NamingException 
	 */
	public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException, NamingException{
		
		Context namingContext=new InitialContext();
		
		AddService service1=(AddService)namingContext.lookup("rmi://127.0.0.1:8899/AddService");
		//����Զ�̶���ע��Զ�̶���Context�ӿڵ�Lookup()����ʱ����Ҫ�ṩԶ�̶������������֡�������URL
        int result = service1.AddNumbers(18,15);  
        System.out.println(result);
	}

}
