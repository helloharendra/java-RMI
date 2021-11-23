import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
public class client{
   public static void main(String[] args)throws RemoteException{
           client c=new client();
           c.connectRemote();
   }

    private void connectRemote() throws RemoteException{
        try{
            Scanner sc =new Scanner(System.in);
            Registry reg=LocateRegistry.getRegistry("localhost",9999);
             adder ad;
            ad = (adder)reg.lookup("hi server");
             System.out.println("Enter two number");
             int a=sc.nextInt();
             int b=sc.nextInt();
             System.out.println("Addition is"+ad.add(a,b));
        }
       catch(NotBoundException|RemoteException e)
               {
                   System.out.println("exception"+e);
               }
    }
}