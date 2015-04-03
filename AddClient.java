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
		//创建远程对象，注册远程对象Context接口的Lookup()方法时，需要提供远程对象完整的名字。即它的URL
        int result = service1.AddNumbers(18,15);  
        System.out.println(result);
	}

}
