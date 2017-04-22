package Windows;

import Principal.Persona;
import Windows.Autenticacion;
import Principal.Conectar;
import Principal.Insertar;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame 
{
    Persona personaje;
    public Home()
    {
        initComponents();
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/LogoHome.jpg"));
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblHome.getWidth(), lblHome.getHeight(), Image.SCALE_DEFAULT));
        lblHome.setIcon(icono);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnLocal = new javax.swing.JButton();
        btnLogIn = new javax.swing.JButton();
        btnSignIn = new javax.swing.JButton();
        lblHome = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnlHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 80, 0));

        btnLocal.setText("Local");
        btnLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalActionPerformed(evt);
            }
        });
        jPanel2.add(btnLocal);

        btnLogIn.setText("Log In");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogIn);

        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignIn);

        pnlHome.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 500, 40));

        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoHome.jpg"))); // NOI18N
        pnlHome.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 400));

        getContentPane().add(pnlHome);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        //CREAR CUENTA CON BASE DE DATOS
        this.dispose();
        Conectar c = new Conectar();
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalActionPerformed
        //JUEGO LOCAL, INICIALIZANDO TODO COMO DEFAULT
        cerrar();
        Perfil.ejecutar(1,new Persona());
     
    }//GEN-LAST:event_btnLocalActionPerformed

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        //INICIAR SESION CON ABSE DE DATOS
        /*
        //Recabar datos desde sql
        Persona personaje = new Persona(nickname, nivel, experiencia, batallasGanadas, batallasPerdidas);
        Perfil.ejecutar(2, personaje);
        */
        this.dispose();
        new Autenticacion().setVisible(true);
    }//GEN-LAST:event_btnLogInActionPerformed

    private void cerrar()
    {
        this.dispose();
    }
    public static void ejecutar()
    {
        Home home = new Home();
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                home.setVisible(true);
                home.setDefaultCloseOperation(EXIT_ON_CLOSE);
                home.setResizable(false);
                home.setLocationRelativeTo(null);
                try 
                {
                // Se obtiene un Clip de sonido
                Clip sonidoHome = AudioSystem.getClip();
                // Se carga con un fichero wav
                sonidoHome.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\Orlando\\Desktop\\ProtecoPrebe\\Jonathan\\Prebes\\Pokemon\\src\\Musica\\WelcomePokemon.wav")));
                // Comienza la reproducción
                sonidoHome.start();
                } catch (Exception e) 
                {
                    System.out.println("" + e);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLocal;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblHome;
    private javax.swing.JPanel pnlHome;
    // End of variables declaration//GEN-END:variables
}
