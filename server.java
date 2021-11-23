import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java .rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class server extends UnicastRemoteObject implements adder
{
    public server() throws  RemoteException{
    
}
    @Override
    public int add(int n1,int n2){
        return n1+n2;
    }
   public static void main(String[] args) throws RemoteException{
           try{
               Registry reg=LocateRegistry.createRegistry(9999);
                       reg.rebind("hi server",new server());
                       System.out.println("Server is ready");
       
       
   }
           catch(RemoteException e){
               System.out.println("exception"+e);
           }
}
}