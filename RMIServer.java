package com.lwl.rmi.service;


import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;
  
public class RMIServer {       
   public static void main(String[] argv)      
   {      
      try     
      {       
    	  AddService service1 = new AddServiceImp();//创建对象
    	  Context namingContext=new InitialContext();
    	  LocateRegistry.createRegistry(8899);
    	  namingContext.rebind( "rmi://127.0.0.1:8899/AddService", service1 );//注册对象，把对象与一个名字绑定。如果该名字已经与其它对象绑定，不会抛出
      }      
      catch (Exception e)      
      {      
         System.out.println("Hello Server failed: " + e);      
      }      
       }     
}  