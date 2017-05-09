package Windows;


import java.awt.event.ActionEvent;
import Principal.Cliente;
import Principal.Conectar;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Orlando
 */
public class Autenticacion extends javax.swing.JFrame 
{
    String user;
    String password;
    private String IP;
    private int port;
    
    public String getIp(){
        return this.IP;
    }
    
    public void setIp(String IP){
    	this.IP = IP;
    }
    
     public int getPort()
    {
        return this.port;
    }
    
    public void setPort(int port){
    	 this.port = port;
    }
     
    public Autenticacion() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DIP = new javax.swing.JLabel();
        P = new javax.swing.JLabel();
        U = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        CDIP = new javax.swing.JTextField();
        CP = new javax.swing.JTextField();
        CU = new javax.swing.JTextField();
        CC = new javax.swing.JPasswordField();
        btnConectarse = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");

        DIP.setText("Dirección IP:");

        P.setText("Puerto:");

        U.setText("Usuario:");

        C.setText("Contraseña:");

        btnConectarse.setText("Conectarse");
        btnConectarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarseActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DIP)
                            .addComponent(P)
                            .addComponent(U)
                            .addComponent(C)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnConectarse)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CDIP)
                            .addComponent(CP)
                            .addComponent(CU)
                            .addComponent(CC, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DIP)
                    .addComponent(CDIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P)
                    .addComponent(CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(U)
                    .addComponent(CU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C)
                    .addComponent(CC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConectarse)
                    .addComponent(btnSalir))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
        
    private void btnConectarseActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_btnConectarseActionPerformed
        try 
        {
            String ip = CDIP.getText();
            this.IP = ip;
            this.port = Integer.parseInt(CP.getText());
            Cliente c = new Cliente();
            c.setHost(ip);
            c.setPort(port);
            Connection con = Conectar.getConnection();
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/users";
            Class.forName(myDriver);
            //Conectar conect = (Conectar) DriverManager.getConnection(myUrl, "root", "");
            String sqlQuery = "SELECT nom_user AND pwd FROM users";
            Statement st = con.createStatement();
            boolean resultado = st.execute(sqlQuery);
            if(resultado == true)
            {
                this.dispose();
                c.conectar();
                JOptionPane.showMessageDialog(null,"¡¡¡Conexion exitosa!!!",null ,JOptionPane.WARNING_MESSAGE);
                new Perfil().setVisible(true);
                c.cerrar();
            }else
            {
                this.dispose();
                new Autenticacion().setVisible(true);
            }
        } catch (IOException ex) 
        {
           Logger.getLogger(Autenticacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException | ClassNotFoundException sqlex){}
    this.dispose();
    }//GEN-LAST:event_btnConectarseActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new Autenticacion().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel C;
    private javax.swing.JPasswordField CC;
    private javax.swing.JTextField CDIP;
    private javax.swing.JTextField CP;
    private javax.swing.JTextField CU;
    private javax.swing.JLabel DIP;
    private javax.swing.JLabel P;
    private javax.swing.JLabel U;
    private javax.swing.JButton btnConectarse;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
