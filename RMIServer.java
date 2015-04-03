package com.lwl.rmi.service;


import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;
  
public class RMIServer {       
   public static void main(String[] argv)      
   {      
      try     
      {       
    	  AddService service1 = new AddServiceImp();//��������
    	  Context namingContext=new InitialContext();
    	  LocateRegistry.createRegistry(8899);
    	  namingContext.rebind( "rmi://127.0.0.1:8899/AddService", service1 );//ע����󣬰Ѷ�����һ�����ְ󶨡�����������Ѿ�����������󶨣������׳�
      }      
      catch (Exception e)      
      {      
         System.out.println("Hello Server failed: " + e);      
      }      
       }     
}  