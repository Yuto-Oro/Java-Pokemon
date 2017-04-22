package Windows;

import Principal.Persona;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Perfil extends javax.swing.JFrame
{
    Persona personaje;
   
    public Perfil(){}
    public Perfil(String nickname, int nivel, double experiencia,int batallasGanadas, int batallasPerdidas)
    {
        super("Perfil");
        personaje = new Persona(nickname, nivel, experiencia, batallasGanadas, batallasPerdidas);
        inicializarComponentes();
        lblPerfilNombre.setText("Bienvenido    " + personaje.nickname);
        
    }

    private void inicializarComponentes()
    {
        initComponents();
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/Ash.gif"));
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblPerfil.getWidth(), lblPerfil.getHeight(), Image.SCALE_DEFAULT));
        lblPerfil.setIcon(icono);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/FondoPerfil.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(lblPerfilFondo.getWidth(), lblPerfilFondo.getHeight(), Image.SCALE_DEFAULT));
        lblPerfilFondo.setIcon(icono);
        
        tfBatallasPerdidas.setText(Integer.toString(personaje.batallasPerdidas));
        tfBatallasPerdidas.setEditable(false);
        tfBatallasGanadas.setText(Integer.toString(personaje.batallasGanadas));
        tfBatallasGanadas.setEditable(false);
        tfNivel.setText(Integer.toString(personaje.nivel));
        tfNivel.setEditable(false);
        tfExperiencia.setText(Double.toString(personaje.experiencia));
        tfExperiencia.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPerfil = new javax.swing.JPanel();
        lblPerfil = new javax.swing.JLabel();
        pnlFondoPerfil = new javax.swing.JPanel();
        pnlPerfilDatosInferior = new javax.swing.JPanel();
        lblNivel1 = new javax.swing.JLabel();
        tfNivel = new javax.swing.JTextField();
        tfBatallasGanadas = new javax.swing.JTextField();
        tfExperiencia = new javax.swing.JTextField();
        lblNivel2 = new javax.swing.JLabel();
        lblExperiencia = new javax.swing.JLabel();
        lblNivel3 = new javax.swing.JLabel();
        tfBatallasPerdidas = new javax.swing.JTextField();
        btnBatalla = new javax.swing.JButton();
        btnSalirPerfil = new javax.swing.JButton();
        pnlPerfilDatosSuperior = new javax.swing.JPanel();
        lblPerfilNombre = new javax.swing.JLabel();
        lblPerfilFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPerfil.setBackground(new java.awt.Color(255, 255, 255));
        pnlPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPerfil.setBackground(new java.awt.Color(0, 0, 0));
        lblPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ash.gif"))); // NOI18N
        pnlPerfil.add(lblPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 440));

        getContentPane().add(pnlPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 237, 430));

        pnlFondoPerfil.setBackground(new java.awt.Color(0, 0, 0));
        pnlFondoPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Perfil"));
        pnlFondoPerfil.setOpaque(false);
        pnlFondoPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPerfilDatosInferior.setOpaque(false);
        pnlPerfilDatosInferior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNivel1.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        lblNivel1.setForeground(new java.awt.Color(255, 255, 255));
        lblNivel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel1.setText("Batallas G");
        pnlPerfilDatosInferior.add(lblNivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 250, 32));

        tfNivel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNivelActionPerformed(evt);
            }
        });
        pnlPerfilDatosInferior.add(tfNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 120, 40));

        tfBatallasGanadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlPerfilDatosInferior.add(tfBatallasGanadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 120, 40));

        tfExperiencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlPerfilDatosInferior.add(tfExperiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 120, 40));

        lblNivel2.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        lblNivel2.setForeground(new java.awt.Color(255, 255, 255));
        lblNivel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel2.setText("Nivel");
        pnlPerfilDatosInferior.add(lblNivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 50));

        lblExperiencia.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        lblExperiencia.setForeground(new java.awt.Color(255, 255, 255));
        lblExperiencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExperiencia.setText("Exp");
        pnlPerfilDatosInferior.add(lblExperiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 130, 32));

        lblNivel3.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        lblNivel3.setForeground(new java.awt.Color(255, 255, 255));
        lblNivel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel3.setText("Batallas P");
        pnlPerfilDatosInferior.add(lblNivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 250, 32));

        tfBatallasPerdidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlPerfilDatosInferior.add(tfBatallasPerdidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 120, 40));

        btnBatalla.setText("Batalla!");
        btnBatalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatallaActionPerformed(evt);
            }
        });
        pnlPerfilDatosInferior.add(btnBatalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 120, 40));

        btnSalirPerfil.setText("Salir");
        btnSalirPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirPerfilActionPerformed(evt);
            }
        });
        pnlPerfilDatosInferior.add(btnSalirPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 120, 40));

        pnlFondoPerfil.add(pnlPerfilDatosInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 410, 350));

        pnlPerfilDatosSuperior.setOpaque(false);

        lblPerfilNombre.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblPerfilNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblPerfilNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerfilNombre.setText("Bienvenido invitado");

        javax.swing.GroupLayout pnlPerfilDatosSuperiorLayout = new javax.swing.GroupLayout(pnlPerfilDatosSuperior);
        pnlPerfilDatosSuperior.setLayout(pnlPerfilDatosSuperiorLayout);
        pnlPerfilDatosSuperiorLayout.setHorizontalGroup(
            pnlPerfilDatosSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPerfilDatosSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPerfilNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlPerfilDatosSuperiorLayout.setVerticalGroup(
            pnlPerfilDatosSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPerfilDatosSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPerfilNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
        );

        pnlFondoPerfil.add(pnlPerfilDatosSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 50));

        lblPerfilFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerfilFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPerfil.png"))); // NOI18N
        pnlFondoPerfil.add(lblPerfilFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 430));

        getContentPane().add(pnlFondoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 410, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNivelActionPerformed

    private void btnSalirPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirPerfilActionPerformed
       JOptionPane.showMessageDialog(null, "No te vayas D:");
       System.exit(0);
    }//GEN-LAST:event_btnSalirPerfilActionPerformed

    private void btnBatallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatallaActionPerformed
        this.dispose();
        Personajes.ejecutar(personaje);
    }//GEN-LAST:event_btnBatallaActionPerformed

    public static void ejecutar(int tipo, Persona personaje)
    {
        Perfil perfil;
        if (tipo == 1)
        {
            String nickname = JOptionPane.showInputDialog(null,"Bienvenido nuevo jugador, ingresa tu nombre:");
            if (nickname == null)
            {
                JOptionPane.showMessageDialog(null, "Gracias! Adios");
                System.exit(0);
            }
            perfil = new Perfil(nickname,1,0.0,0,0);
        }
        else
        {
            perfil = new Perfil(personaje.nickname, personaje.nivel, personaje.experiencia,personaje.batallasGanadas, personaje.batallasPerdidas);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                perfil.setVisible(true);
                perfil.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatalla;
    private javax.swing.JButton btnSalirPerfil;
    private javax.swing.JLabel lblExperiencia;
    private javax.swing.JLabel lblNivel1;
    private javax.swing.JLabel lblNivel2;
    private javax.swing.JLabel lblNivel3;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblPerfilFondo;
    private javax.swing.JLabel lblPerfilNombre;
    private javax.swing.JPanel pnlFondoPerfil;
    private javax.swing.JPanel pnlPerfil;
    private javax.swing.JPanel pnlPerfilDatosInferior;
    private javax.swing.JPanel pnlPerfilDatosSuperior;
    private javax.swing.JTextField tfBatallasGanadas;
    private javax.swing.JTextField tfBatallasPerdidas;
    private javax.swing.JTextField tfExperiencia;
    private javax.swing.JTextField tfNivel;
    // End of variables declaration//GEN-END:variables
}
