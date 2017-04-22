package PP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends Thread
{
    private String nombreCliente;
    private BufferedReader entrada;
    
    public Servidor(Socket s) throws IOException
    {
        entrada = new BufferedReader(new InputStreamReader(s.getInputStream()));
        nombreCliente = s.getInetAddress().getCanonicalHostName();
        System.out.println("Conexion aceptada desde: "+s.getRemoteSocketAddress());    
    }
    
    public String recibir() throws IOException
    {
        String str = entrada.readLine();
            return str;
    }
    public void cerrar() throws IOException
    {
        entrada.close();
    }
    
    @Override
    public void run()
    {
        try {
            String str = "";
            do
            {
                str = recibir();
                System.out.println(nombreCliente+" dice: "+str);
            }while(!str.equals("salir"));
        } catch (Exception e) {}
        try 
        {
            cerrar();
        } catch (Exception e) {}
    }
    
    public static void main(String[] args) throws IOException 
    {
        ServerSocket ss = new ServerSocket(0);
        System.out.println("Servidor acepta conexiones en el puerto: "+ss.getLocalPort());
        System.out.println("Dirección ip del Server: "+Inet4Address.getLocalHost().getHostAddress());
        while(true)
        {
            Socket cliente = ss.accept();
            Servidor hilo = new Servidor(cliente);
            hilo.start();
        }
    }
}
