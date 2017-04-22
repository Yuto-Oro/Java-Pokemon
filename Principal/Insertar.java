package Principal;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Insertar 
{
    public void datos(String name, String user_name, String pass,JFrame frame)
    {
        String query = "INSERT INTO users (nombre, nom_usuario, pwd) VALUES ('"+name+"','"+user_name+"','"+pass+"')";
        try (Connection con = Conectar.getConnection()) 
        {
            Statement s = con.createStatement();
            s.executeUpdate(query);
            JOptionPane.showMessageDialog(frame, "Exito en la inserción", "Bien",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {}
    }
}
