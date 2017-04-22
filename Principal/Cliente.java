package Principal;

import Windows.Autenticacion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Cliente 
{
    private PrintStream ps;
    private String host;
    private int port;
    //Donde y por donde
    public void setHost(String host)
    {
        this.host = host;
    }
    public void setPort(int port)
    {
        this.port = port;
    }
    //conexion por socket
    public void conectar() throws IOException
    {
        Socket s = new Socket(host, port);
        ps = new PrintStream(s.getOutputStream());
    }
    //Enviar Mensaje
    public void enviar(String mensaje) throws IOException
    {
        ps.println(mensaje);
    }
    //Cerrar conexion
    public void cerrar () throws IOException
    {
        ps.close();
    }
    public static void main(String[] args) {
        Autenticacion datos = new Autenticacion();
        try {
            new Autenticacion().setVisible(true);
        } catch (Exception e) {}
    }
}
